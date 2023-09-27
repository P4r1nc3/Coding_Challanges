package LeetCode.TwoSum;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {
    @Test
    public void test() {
        TwoSum twoSum = new TwoSum();

        // Test Case 1
        int target1 = 9;
        int[] nums1 = {2, 7, 11, 15};
        int[] expected1 = {0, 1};
        assertArrayEquals(expected1, twoSum.twoSum(nums1, target1));

        // Test Case 2
        int target2 = 6;
        int[] nums2 = {3, 2, 4};
        int[] expected2 = {1, 2};
        assertArrayEquals(expected2, twoSum.twoSum(nums2, target2));

        // Test Case 3
        int target3 = 6;
        int[] nums3 = {3, 3};
        int[] expected3 = {0, 1};
        assertArrayEquals(expected3, twoSum.twoSum(nums3, target3));
    }
}
