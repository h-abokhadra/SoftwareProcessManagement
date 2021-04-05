/**
 * Custom Exception class for SYST 38634 midterm exam
 * @author dancye, 2021
 *
 */
@SuppressWarnings("serial")
public class InvalidStartingMonthException extends Exception 
{
public InvalidStartingMonthException()
{
super("Must start in September or January");
}
}