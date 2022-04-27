package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int TOTAL_INITIALIZER = -1;
	private static final int NUMBERS_SIZE = 12;
	private static final int CHECK_VALUE = -1;
	private static final int NUMBERS_FULL_SIZE = 11;
	private final int[] numbers = new int[NUMBERS_SIZE];
	private int total = TOTAL_INITIALIZER;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == CHECK_VALUE;
	}
		
	public boolean isFull() {
		return total == NUMBERS_FULL_SIZE;
	}

	protected int peekaboo() {
		if (callCheck())
			return CHECK_VALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return CHECK_VALUE;
		return numbers[total--];
	}
}
