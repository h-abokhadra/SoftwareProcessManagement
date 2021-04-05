package makechange;

/**
 * A custom Exception that will tell you information
 * about unsupported SmartPhone versions
 * @author Liz Dancy, 2021
 *
 */
public class BadNumberException extends Exception {

 private static final long serialVersionUID = 1L;

 public BadNumberException() 
 {
  // TODO Auto-generated constructor stub
 }

 public BadNumberException(String arg0) 
 {
  super( "The following version number is unsupported at this time: " +arg0);
  
 }

}
