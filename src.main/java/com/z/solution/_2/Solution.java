package com.z.solution._2;

public class Solution {

    static ListNode listNode = new ListNode(0);
    static ListNode result = listNode;

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;

        if(null == l1 && null == l2){
            return listNode;
        }

        while(null != l1 || null !=l2){
            if(null == l1){
                flag = getFlag(l2.val + flag);
                l2 = l2.next;
                continue;
            }
            if(null == l2){
                flag = getFlag(l1.val + flag);
                l1 = l1.next;
                continue;
            }

            int i = l1.val + l2.val + flag;
            flag = getFlag(i);
            l1 = l1.next;
            l2 = l2.next;

        }
        if(flag > 0){
            setValue(flag);
        }
        return listNode.next;
    }

    private static int getFlag(int i) {
        int flag;
        if (i >= 10) {
            flag = 1;
            setValue(i - 10);
        } else {
            flag = 0;
            setValue(i);
        }
        return flag;
    }

    public static void setValue(int value){
        ListNode valueNode = new ListNode(value);
        result.next = valueNode;
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
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);
        l1.next = l2;
        ListNode l3 = new ListNode(1);
        System.out.println(addTwoNumbers(l1,l3).toString());
    }
}
