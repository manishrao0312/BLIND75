import java.util.HashMap;
class TwoSum{
    public int[] twoSum(int[]nums,int target){
        HashMap<Integer,Integer>hi=new HashMap<>();
	for(int i=0;i<nums.length;i++){
		int needed=target-nums[i];
		if(hi.containsKey(needed))
        {
			return new int[]{hi.get(needed),i};

		}
		hi.put(nums[i],i);
    }
return new int[]{};
}
}
