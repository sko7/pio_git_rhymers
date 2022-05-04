package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListJUnitTest {

    private static final int ERR_EMPTY = -1;

    @Test
    public void testIsEmpty() {
        IntLinkedList intLinkedList = new IntLinkedList();
        boolean result = intLinkedList.isEmpty();
        Assert.assertTrue(result);
    }

    @Test
    public void testIsFull() {
        IntLinkedList intLinkedList = new IntLinkedList();
        boolean result = intLinkedList.isFull();
        Assert.assertFalse(result);
    }

    @Test
    public void testPush() {
        IntLinkedList intLinkedList = new IntLinkedList();
        int testValue = 3;

        intLinkedList.push(testValue);
        int result = intLinkedList.pop();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testPop() {
        IntLinkedList intLinkedList = new IntLinkedList();
        int testValue = 3;

        intLinkedList.push(testValue);
        int result = intLinkedList.pop();
        Assert.assertEquals(testValue, result);
        result = intLinkedList.pop();
        Assert.assertEquals(ERR_EMPTY, result);
    }

    @Test
    public void testTop() {
        IntLinkedList intLinkedList = new IntLinkedList();
        int result = intLinkedList.top();
        Assert.assertEquals(ERR_EMPTY, result);

        int testValue = 3;
        intLinkedList.push(testValue);
        result = intLinkedList.top();
        Assert.assertEquals(testValue, result);

        testValue = 1;
        intLinkedList.push(testValue);
        result = intLinkedList.top();
        Assert.assertEquals(testValue, result);
    }

}
