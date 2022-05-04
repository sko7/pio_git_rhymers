package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	private static final int COUNT_IN_VALUE = 888;
	private static final int STACK_CAPACITY = 12;
	private static final int EMPTY_STACK_VALUE = -1;

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertTrue(result);

		rhymer.countIn(COUNT_IN_VALUE);

		result = rhymer.callCheck();
		Assert.assertFalse(result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertFalse(result);
			rhymer.countIn(COUNT_IN_VALUE);
		}

		boolean result = rhymer.isFull();
		Assert.assertTrue(result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testFIFOCountOut() {
		FIFORhymer rhymer = new FIFORhymer();

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 7;
		rhymer.countIn(testValue);
		rhymer.countIn(testValue + 2);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals((testValue + 2), result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testHanoiCountIn() {
		HanoiRhymer rhymer = new HanoiRhymer();

		int testValue = 4;
		rhymer.countIn(testValue);
		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
		int rejectedResult = rhymer.reportRejected();
		Assert.assertEquals(0, rejectedResult);

		rhymer.countIn(testValue);
		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
		rejectedResult = rhymer.reportRejected();
		Assert.assertEquals(0, rejectedResult);

		testValue = 6;
		rhymer.countIn(testValue);
		result = rhymer.peekaboo();
		Assert.assertNotEquals(testValue, result);
		rejectedResult = rhymer.reportRejected();
		Assert.assertEquals(1, rejectedResult);

		testValue = 2;
		rhymer.countIn(testValue);
		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
		rejectedResult = rhymer.reportRejected();
		Assert.assertEquals(1, rejectedResult);
	}
}
