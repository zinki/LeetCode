package com.z.solution._21;

public class Solution {

    static ListNode rootNode = new ListNode(0);
    static ListNode result = rootNode;

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(null == l1 && null == l2){
            return rootNode.next;
        }
        while (null != l1 || null != l2){
            if(null == l1){
                setValue(l2.val);
                l2 = l2.next;
                continue;
            }
            if(null == l2){
                setValue(l1.val);
                l1 = l1.next;
                continue;
            }
            if(l1.val>l2.val) {
                setValue(l2.val);
                l2 = l2.next;
            }else {
                setValue(l1.val);
                l1 = l1.next;
            }
        }
        return rootNode.next;
    }

    public static void setValue(int value){
        if(value < result.val && result != rootNode){
            result.next = new ListNode(result.val);
            result.val = value;
        }else {
            result.next = new ListNode(value);
        }
        result = result.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(-2);
        ListNode l2 = new ListNode(5);
        l1.next = l2;

        ListNode l3 = new ListNode(-9);
        ListNode l4 = new ListNode(-6);
        l3.next = l4;
        ListNode l5 = new ListNode(-3);
        l4.next = l5;
        System.out.println(mergeTwoLists(l1,l3).toString());
    }
}
