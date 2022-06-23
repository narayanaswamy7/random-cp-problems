package com.ns.dscoding.leetcode.add_two_numbers;

import com.ns.dscoding.generic.ListNode;

public class AddTwoNumbersMain {
	
	public static void main(String[] args) {
		
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
		
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		System.out.println(l1);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		System.out.println(l2);
		
		System.out.println(addTwoNumbers.addTwoNumbers1(l1, l2));
		
	}

}
