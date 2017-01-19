/**
 * This is a class that tests the Card class.
 */
public class CardTester {
	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Two", "heart", 2);
		Card card2 = new Card("Three", "club", 3);
		Card card3 = new Card("Four", "spade", 4);
		System.out.println(card1.suit());
	}
}
