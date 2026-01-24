import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Boolean> hello =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hello.containsKey(nums[i])){
                return true;
            }
            hello.put(nums[i],true);
        }
        return false;
    }
}