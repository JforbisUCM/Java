package classwork;
//InvalidDataException.java
@SuppressWarnings("serial")
public class InvalidDataException extends Exception {
 public String getMessage() {
     return "Name must be provided.";    }}