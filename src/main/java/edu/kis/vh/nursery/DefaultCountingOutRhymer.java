package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int NUMBERS_SIZE = 12;
	public static final int FULL_VALUE = 11;
	public static final int CHECK_VALUE = -1;
	public static final int TOTAL_INIT_VALUE = -1;
	private final int[] numbers = new int[NUMBERS_SIZE];
	public int total = TOTAL_INIT_VALUE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}
		
	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}
}
