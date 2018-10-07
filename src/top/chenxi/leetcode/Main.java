package top.chenxi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        /*//1.两数之和
        int[] sums = {2,7,11,15};
        System.out.println("1. "+Arrays.toString(solution.twoSum(sums,9)));
        //2.两数相加
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
        System.out.println("2. "+Arrays.toString(a));*/
        //3.无重复字符的最长字串
        int rs3 = solution.lengthOfLongestSubstring("pwwkew");
        System.out.println("3. "+rs3);
    }
}
