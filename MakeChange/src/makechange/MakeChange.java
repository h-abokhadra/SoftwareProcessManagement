package makechange;

//Author: Hoda Abokhadra, Feb. 2021
//ICE3 
public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int getNumQuarters(int cents) throws BadNumberException {

		if ((cents == 0) || (cents == 100)) {
			System.out.println("We cannot calculate change ");
		}

		else if ((cents > 100) || (cents < 0)) {
			throw new BadNumberException("The amount you entered is not applicable. ");
		}

		return cents / 25;
	}
	
	public static int getNumDimes(int cents) throws BadNumberException {

		if ((cents == 0) || (cents == 100)) {
			System.out.println("We cannot calculate change ");
		}

		else if ((cents > 100) || (cents < 0)) {
			throw new BadNumberException("The amount you entered is not applicable. ");
		}

		return cents / 10;
	}

	public static int getNumNickles(int cents) throws BadNumberException {

		if ((cents == 0) || (cents == 100)) {
			System.out.println("We cannot calculate change ");
		}

		else if ((cents > 100) || (cents < 0)) {
			throw new BadNumberException("The amount you entered is not applicable. ");
		}

		return cents / 5;
	}
}
