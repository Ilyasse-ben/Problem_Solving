
/**
 * 
 * 
 * 
 * You are given an integer array nums,handle multiple queries of the following type:
 
 * Calculate the sum of the elements of nums between indices left and right
 * inclusive where left<=right.Implement the NumArray class:
 * 
 * NumArray(int[]nums)Initializes the object with the integer array nums.int
 * sumRange(int left,int right)Returns the sum of the elements of nums between
 * indices left and right
 * inclusive(i.e.nums[left]+nums[left+1]+...+nums[right]).
 */
public class RangSeum {
    int[] nums;

    public NumArray(int[] nums) {
        this.nums=nums;
        for (int i = 1; i < nums.length; i++) {
            this.nums[i] += this.nums[i-1];
        }
    }

    public int sumRange(int left, int right) {
        int leftsum = left > 0 ? this.nums[left - 1] : 0;
        return this.nums[right] - leftsum;
    }
    
}
