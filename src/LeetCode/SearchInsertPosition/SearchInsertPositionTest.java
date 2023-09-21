package LeetCode.SearchInsertPosition;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SearchInsertPositionTest {
    @Test
    public void test() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        // Test Case 1
        int[] nums1 = {1, 3, 5, 6};
        assertEquals(2, searchInsertPosition.searchInsert(nums1, 5));

        // Test Case 2
        int[] nums2 = {1, 3, 5, 6};
        assertEquals(1, searchInsertPosition.searchInsert(nums2, 2));

        // Test Case 3
        int[] nums3 = {1, 3, 5, 6};
        assertEquals(4, searchInsertPosition.searchInsert(nums3, 7));
    }
}
