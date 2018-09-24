package top.chenxi.leetcode;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target) return new int[] {i,j};
            }
        }
        throw new IllegalArgumentException("not found");
    }

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
}
