/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

    
    int n = mountainArr.length();
        int peakIdx = findPeak(mountainArr, 0, n - 1);
        
        // Search in ascending part
        int result = orderAgnosticBSearch(mountainArr, target, 0, peakIdx, true);
        if (result != -1) {
            return result;
        }
        
        // Search in descending part
        return orderAgnosticBSearch(mountainArr, target, peakIdx + 1, n - 1, false);
    }

    private static int findPeak(MountainArray mountainArr, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    
    private static int orderAgnosticBSearch(MountainArray mountainArr, int target, int start, int end, boolean isAscending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = mountainArr.get(mid);
            
            if (midVal == target) {
                return mid;
            }
            
            if (isAscending) {
                if (target < midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}