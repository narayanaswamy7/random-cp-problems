package com.ns.dscoding.generic;

public class TestMain {
	
	public static void main(String[] args) {
		
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList(1);
		singlyLinkedList.next = new SinglyLinkedList(5);
		
		System.out.println(singlyLinkedList.data);
		
		ListNode listNode = new ListNode(0);
		
		System.out.println(listNode);
	}

}
