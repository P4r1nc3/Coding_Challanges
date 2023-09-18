package LeetCode.PlusOne;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PlusOneTest {
    @Test
    public void test() {
        PlusOne plusOne = new PlusOne();

        // Test Case 1
        int[] nums1 = {3, 2, 2, 3};
        int[] expected1 = {3, 2, 2, 4};
        assertArrayEquals(expected1, plusOne.plusOne(nums1));

        // Test Case 2
        int[] nums2 = {9};
        int[] expected2 = {1, 0};
        assertArrayEquals(expected2, plusOne.plusOne(nums2));

        // Test Case 3
        int[] nums3 = {9, 9};
        int[] expected3 = {1, 0, 0};
        assertArrayEquals(expected3, plusOne.plusOne(nums3));
    }
}
