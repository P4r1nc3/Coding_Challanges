package LeetCode.BinarySearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test
    public void test() {
        BinarySearch binarySearch = new BinarySearch();

        // Test Case 1
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;
        int result1 = binarySearch.binarySearch(nums1, target1);
        assertEquals(4, result1);

        // Test Case 2
        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 2;
        int result2 = binarySearch.binarySearch(nums2, target2);
        assertEquals(-1, result2);
    }
}
