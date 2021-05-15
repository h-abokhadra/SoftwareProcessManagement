package makechangetemp;
/**
 * Custom Exception class for SYST 38634 midterm exam
 * @author dancye, 2021
 *
 */
@SuppressWarnings("serial")
public class InvalidNumberException extends Exception 
{
public InvalidNumberException()
{
super("Must start in September or January");
}
}