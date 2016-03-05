// ThreadedServer.java
// This is a concurrent echo server.

import java.io.*;
import java.net.*;

public class ThreadedServer extends Thread {
	private static int count;
	private static ThreadGroup sockets;
	private Socket client;
	public static void main(String[] args) {
		Socket s = null;
		sockets = new ThreadGroup("Sockets");

		try {
			ServerSocket ss = new ServerSocket( 7777 );

			while( true ) {
				// wait for the connection
				s = ss.accept();
				// create a threaded object to handle the client
				new ThreadedServer(s);
			}
		}
		catch (IOException e) {System.err.println(e);}
	}
	public void run(){
		BufferedReader sockin = null; PrintWriter sockout = null;
		try {
			// build sockin and sockout from the socket's
			// InputStream and Output Stream
			sockin = new BufferedReader( new InputStreamReader(client.getInputStream()) );
			sockout = new PrintWriter( client.getOutputStream() );

			// loop, reading input from the socket and writing
			// the data to the screen and socket
			String linein = null;
			while( (linein = sockin.readLine()) != null ){
				System.out.println( linein );
				sockout.println( linein );
			}
		}
		catch (IOException e) {System.err.println(e);}
		// Always be sure to close the socket to release resources
		finally {
			try {if (client != null) client.close();}
			catch (IOException e){}
		}
	}
	public ThreadedServer(Socket s){
	    super(sockets, "Socket"+count);  // Thread constructor
		client = s;
		// Tell the user that we've connected
		System.out.println("Connected to Server " + count + " at " +
				client.getInetAddress() +
				":"+ client.getPort());
		start();
		count++;
	}
}
