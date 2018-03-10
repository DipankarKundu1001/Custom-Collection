package org.CustomCollection.LinkedList;

public class MyLinkedList 
{
	private class Node
	{
		Object data;
		Node next;
		Node(Object e)
		{
			data = e;
		}
		Node(Object e, Node n)
		{
			data = e;
			next = n;
		}
	}
	
	private Node first;
	private Node last;
	private int count = 0;
	
	public int size()
	{
		return count;
	}
	
	public void add(Object ele)
	{
		if(first == null)
		{
			first = new Node(ele);
			last = first;
			count++;
			return;
		}
		last.next = new Node(ele);
		last = last.next;
		count++;
	}
	
	public Object get(int index)
	{
		if(index >= size())
			throw new IndexOutOfBoundsException();
		
		Node p = first;
		for(int i = 0; i < index; i++)
			p = p.next;
		return p.data;
	}
	
	public void add(int index, Object ele)
	{
		if(index >= size())
			throw new IndexOutOfBoundsException();
		if(index == 0)
		{
			first = new Node(ele,first);
			count++;
			return;
		}
		Node p = first;
		for(int i = 1; i <= index; i++)
			p = p.next;
		p.next = new  Node(ele, p.next);
		count++;
	}
}
