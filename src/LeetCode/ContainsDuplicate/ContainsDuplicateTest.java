package LeetCode.ContainsDuplicate;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.Arrays;

public class ContainsDuplicateTest {
    @Test
    public void test() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        // Test Case 1
        int[] nums1 = {1, 2, 3, 1};
        boolean result1 = containsDuplicate.containsDuplicate(nums1);
        assertEquals(true, result1);

        // Test Case 2
        int[] nums2 = {1, 2, 3, 4};
        boolean result2 = containsDuplicate.containsDuplicate(nums2);
        assertEquals(false, result2);

        // Test Case 3
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean result3 = containsDuplicate.containsDuplicate(nums3);
        assertEquals(true, result3);
    }
}
