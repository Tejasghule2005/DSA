class Solution {
    public int maxProduct(int[] nums) {

        int currMax = nums[0];
        int currMin = nums[0];
        int maxProduct = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int tempMax = Math.max(
                nums[i],
                Math.max(currMax * nums[i], currMin * nums[i])
            );

            currMin = Math.min(
                nums[i],
                Math.min(currMax * nums[i], currMin * nums[i])
            );

            currMax = tempMax;

            maxProduct = Math.max(maxProduct, currMax);
        }

        return maxProduct;
    }
}