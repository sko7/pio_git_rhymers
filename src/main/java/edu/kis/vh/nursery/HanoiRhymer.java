package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public static final int REJECTED_INITIALIZER = 0;
	int totalRejected = REJECTED_INITIALIZER;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}

// źle sformatowane wiersze: 5 (tab za mało), 12 (tab za mało),
// 14-15 (tab za dużo)

// kombinacje klawiszy alt + <- oraz alt + -> powodują przełączanie
// między aktualnie otwartymi w IDE plikami (IntelliJ)