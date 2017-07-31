package kr.pku.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/31.
 */
public class Lt1 {

    public static int[] twoSum1(int[] nums,int target)
    {
        if(nums == null || nums.length < 2) return null;
        for(int i=0;i<nums.length -1;i++)
        {
            for(int j = i+1;j< nums.length;j++)
            {
                if(nums[i] > target) continue;
                if(nums[i] + nums[j] == target)
                {
                    if(nums[j] > target) continue;
                    int[] tem = {i,j};
                    return tem;
                }
            }
        }
        return null;
    }

    public static int[] twoSum2(int[] nums,int target)
    {
        if(nums == null || nums.length < 2)
            throw new IllegalArgumentException("no two num solution");
        Map<Integer,Integer> map = new HashMap<>();
        int[] twoNum = new int[2];
        for(int i=0;i< nums.length;i++)
        {
            if(map.containsKey(target - nums[i]))
            {
                twoNum[0] = map.get(target - nums[i]);
                twoNum[1] = i;
                return twoNum;
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no two num solution");
    }
}
