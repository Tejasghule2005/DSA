class Solution {
    public static boolean isMonotonic(int[] nums) {
        boolean increasing=true;
        boolean decreasing=true;

        for(int i=0;i<nums.length-1;i++){
         if (nums[i] > nums[i+1]){
        increasing = false;
         }
        if (nums[i] < nums[i+1]){
            decreasing = false;
        }

    }
    if(increasing || decreasing){
            return true;
        }
    return false;
}
    public static void main(String args[]){
        int nums[]={5,2,1,1};
        System.out.println(isMonotonic(nums));
    }
}
