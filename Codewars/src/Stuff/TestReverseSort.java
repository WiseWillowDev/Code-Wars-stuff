package Stuff;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestReverseSort {

	@Test
	void test0caseRevereSortLongInput() {
		assertTrue(ReverseSort.longInput(54321) != 0);
		assertTrue(ReverseSort.longInput(0) == 0);

	}
	
	@Test
	void testRightAnswerReverseSortLongInput() {
		assertTrue(ReverseSort.longInput(12345) == 54321);
		assertTrue(ReverseSort.longInput(1234565) == 6554321);
		assertTrue(ReverseSort.longInput(1245) == 5421);
		assertTrue(ReverseSort.longInput(15) == 51);

	}
	
	@Test
	void test0caseReverseSortlongArray() {
		long[] longArray = {1,2,3,4,5};
		long[] answer = {0};
		assertTrue(ReverseSort.longArrayInput(longArray) != answer);
		long[] lArray = {0};
		Assert.assertArrayEquals(ReverseSort.longArrayInput(lArray), answer);

	}
	
	
	@Test
	void testRightAnswerReverseSortLongArrayInput() {
		
		long[] lArray = {1,2,3,4,5};
		long[] answer = {5,4,3,2,1};
		Assert.assertArrayEquals(ReverseSort.longArrayInput(lArray), answer);
		long[] lArray2 = {1,2,3,4,5,6,5};
		long[] answer2 = {6,5,5,4,3,2,1};
		Assert.assertArrayEquals(ReverseSort.longArrayInput(lArray2), answer2);
		long[] lArray3 = {1,2,4,5};
		long[] answer3 = {5,4,2,1};
		Assert.assertArrayEquals(ReverseSort.longArrayInput(lArray3), answer3);
		long[] lArray4 = {1,5};
		long[] answer4 = {5,1};
		Assert.assertArrayEquals(ReverseSort.longArrayInput(lArray4), answer4);

	}

}
