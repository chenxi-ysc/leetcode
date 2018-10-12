package top.chenxi.leetcode;

import java.util.HashSet;

public class Solution {
    //1.
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target) return new int[] {i,j};
            }
        }
        throw new IllegalArgumentException("not found");
    }
    //2.
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int x;
        int y;
        int carry = 0;
        int sum;
        ListNode rs = new ListNode(0);
        ListNode current = rs;
        while(l1!=null||l2!=null) {
            if (l1 != null) {
                x = l1.val;
            } else {
                x = 0;
            }
            if (l2 != null) {
                y = l2.val;
            } else {
                y = 0;
            }
            sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if(carry>0){
            current.next = new ListNode(1);
        }
        return rs.next;
    }
    //3.
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0, max = 0;
        while(i<s.length()&&j<s.length()){
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                max = Math.max(max,j-i+1);
                j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
    //4.
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int midLeft = (m+n+1)/2, midRight = (m+n+2)/2;
        int mid1 = findK(nums1,0,nums2,0,midLeft);
        int mid2 = findK(nums1,0,nums2,0,midRight);
        double mid = (mid1+mid2)/2.0;
        return mid;
    }
    int findK(int[] nums1, int i, int[] nums2, int j, int k){
        int mid1=0, mid2=0;
        if(i>=nums1.length) return nums2[j+k-1];
        if(j>=nums2.length) return nums1[i+k-1];
        if(k==1) return Math.min(nums1[i], nums2[j]);
        if(i+k/2-1<nums1.length){
            mid1 = nums1[i+k/2-1];
        }
        else
            return findK(nums1,i,nums2,j+k/2,k-k/2);
        if(j+k/2-1<nums2.length){
            mid2 = nums2[j+k/2-1];
        }
        else
            return findK(nums1,i+k/2,nums2,j,k-k/2);
        if(mid1<mid2){
            return findK(nums1,i+k/2,nums2,j,k-k/2);
        }
        else{
            return findK(nums1,i,nums2,j+k/2,k-k/2);
        }
    }
}
