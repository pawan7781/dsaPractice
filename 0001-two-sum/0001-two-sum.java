class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> map =new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int num=nums[i];
            int more= target-num;
            if(map.containsKey(more))
            {
                return new int[] {map.get(more),i};
            }
              map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
//brute force-
 // for(int i=0; i<nums.length;i++)
        // {
        //     for(int j=i+1; j<nums.length; j++)
        //     {
        //         if(nums[i]+nums[j]==target)
        //         {
        //               return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[] {-1,-1};