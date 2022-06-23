package com.ns.dscoding.leetcode.add_two_numbers;

import com.ns.dscoding.generic.ListNode;

public class AddTwoNumbers {

	public ListNode resList = new ListNode(0);
	public ListNode head = resList;
	public int carry = 0;

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int sum = l1.val + l2.val + carry;
		carry = sum / 10;
		resList.next = new ListNode(sum % 10);
		resList = resList.next;

		if (l1.next != null && l2.next != null) {
			addTwoNumbers(l1.next, l2.next);
		} else if (l1.next != null) {
			addTwoNumbers(l1.next, new ListNode(0));
		} else if (l2.next != null) {
			addTwoNumbers(new ListNode(0), l2.next);
		} else if (carry > 0) {
			resList.next = new ListNode(1);
			resList = resList.next;
		}
		return head.next;
	}

	public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}

}
