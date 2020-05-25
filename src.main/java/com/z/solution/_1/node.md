1. Two Sum 
 
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].


没什么好说的，直接遍历一遍就出来了;
Discuss有用HashMap能在O(n)内得到解答，是种取巧的解法。