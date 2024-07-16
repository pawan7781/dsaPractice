class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int element=0;
        for(int i=0; i<nums.length; i++)
        {
            if(count==0)
            {
                count++;
                element=nums[i];
            }
            else if(nums[i]==element)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        int count1=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==element)
            {
                count1++;
            }
        }
        if(count1>nums.length/2)
        {
            return element;
        }
        return -1;
   
    }
}

 //     HashMap<Integer, Integer>hm =new HashMap<>();
    //     for(int i=0; i<nums.length; i++)
    //     {
    //         if(hm.containsKey(nums[i]))
    //         {
    //             hm.put(nums[i], hm.get(nums[i])+1);
    //         }
    //         else
    //         {
    //             hm.put(nums[i], 1);
    //         }
    //     }
    //   for (Map.Entry<Integer, Integer> it : hm.entrySet()) {
    //         if (it.getValue() > (nums.length / 2)) {
    //             return it.getKey();
    //         }
    //     }
    //     return -1;