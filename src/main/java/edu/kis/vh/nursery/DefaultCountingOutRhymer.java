package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int TAB_SIZE = 12;
	public static final int FULL_VALUE = 11;
	public static final int CHECK_VALUE = -1;
	private final int[] numbers = new int[TAB_SIZE];
	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == CHECK_VALUE;
	}
		
	public boolean isFull() {
		return total == FULL_VALUE;
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
