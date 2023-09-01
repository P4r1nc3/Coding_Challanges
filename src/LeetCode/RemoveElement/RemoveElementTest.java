package LeetCode.RemoveElement;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.Arrays;

public class RemoveElementTest {
    @Test
    public void test() {
        RemoveElement removeElement = new RemoveElement();

        // Test Case 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int result1 = removeElement.removeElement(nums1, val1);
        int[] expected1 = {2, 2};
        assertArrayEquals(expected1, Arrays.copyOf(nums1, result1));
        assertEquals(2, result1);

        // Test Case 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int result2 = removeElement.removeElement(nums2, val2);
        int[] expected2 = {0, 1, 3, 0, 4};
        assertArrayEquals(expected2, Arrays.copyOf(nums2, result2));
        assertEquals(5, result2);
    }
}