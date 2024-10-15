package org.example.Solutions;

import java.util.*;

public class twoSum {
/*1.
     Two Sum
     Solved
     Easy
     Topics
     Companies
     Hint
     Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

     You may assume that each input would have exactly one solution, and you may not use the same element twice.

     You can return the answer in any order.



     Example 1:

     Input: nums = [2,7,11,15], target = 9
     Output: [0,1]
     Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     Example 2:

     Input: nums = [3,2,4], target = 6
     Output: [1,2]
     Example 3:

     Input: nums = [3,3], target = 6
     Output: [0,1]


     Constraints:

     2 <= nums.length <= 104
     -109 <= nums[i] <= 109
     -109 <= target <= 109
     Only one valid answer exists.


     Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
*/
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        int jIndex = 0;

        for(int i = 0; i<nums.length;i++){
            map.put(nums[i],i);
            if(nums[map[target-nums[i]]] + nums[i] == target){
                return new int[]{i, map[target-nums[i]]};
            }
        }
        return new int[]{index, jIndex};

    }
}
