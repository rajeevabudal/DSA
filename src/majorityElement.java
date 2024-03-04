class Solution {
    public int majorityElement(int[] nums) {
        Integer ans = null;
        int count = 0;

        for(final int i : nums){
            if(count == 0){
                ans = i;
            }
            count += i == ans ? 1:-1;
        }
        return ans;
    }
}