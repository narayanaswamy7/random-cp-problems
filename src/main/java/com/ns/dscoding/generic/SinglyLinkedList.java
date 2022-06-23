package com.ns.dscoding.generic;

public class SinglyLinkedList {

	public SinglyLinkedList next;
	public int data;

	public SinglyLinkedList() {
		next = null;
		data = Integer.MIN_VALUE;
	}

	public SinglyLinkedList(int data) {
		next = null;
		this.data = data;
	}

	public SinglyLinkedList getNext() {
		return next;
	}

	public void setNext(SinglyLinkedList next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return Integer.toString(data);
	}
	
	

}
