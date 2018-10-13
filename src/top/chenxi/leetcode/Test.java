package top.chenxi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    Solution solution = new Solution();
    //1.两数之和
    public void test1(){
        int[] sums = {2,7,11,15};
        System.out.println(Arrays.toString(solution.twoSum(sums,9)));
    }
    //2.两数相加
    public void test2(){
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(0);
        l1.next.next = new ListNode(8);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(8);
        l2.next.next = new ListNode(7);
        ListNode rs = solution.addTwoNumbers(l1,l2);
        ArrayList array = new ArrayList();
        while (rs!=null){
            array.add(rs.val);
            rs = rs.next;
        }
        Integer[] a = (Integer[])array.toArray(new Integer[array.size()]);
        System.out.println(Arrays.toString(a));
    }
    //3.无重复字符的最长字串
    public void test3(){
        int rs3 = solution.lengthOfLongestSubstring("pwwkew");
        System.out.println(rs3);
    }
    //4.两个排序数组的中位数
    public void test4(){
        int[] nums1 = {1,2};
        int[] nums2 = {4,5,7};
        double rs4 = solution.findMedianSortedArrays(nums1,nums2);
        System.out.print(rs4);
    }
    //5.最长回文子串
    public void test5(){
        String s = "babadajfdfdf";
        System.out.print(solution.longestPalindrome(s));
    }
}
