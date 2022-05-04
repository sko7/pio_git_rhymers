package edu.kis.vh.nursery;

/**
 * Klasa FIFORhymer dziedzicząca z DefaultCountingOutRhymer
 * nadpisująca metodę countOut
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	/**
	 * Metoda usuwa pierwszy element z tablicy numbers i zwraca jego wartość
	 * @return pierwszy element z tablicy numbers
	 */
	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.callCheck())
			countIn(temp.countOut());
		
		return ret;
	}
}
