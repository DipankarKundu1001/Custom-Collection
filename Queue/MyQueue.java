package org.CustomCollection.Queue;

public class MyQueue 
{
	private class Node
	{
		Object data;
		Node next;
		Node(Object e)
		{
			data = e;
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
	
	public Object peek()
	{
		if(size() == 0)
			return null;
		return first.data;
	}
	
	public Object poll()
	{
		if(size() == 0)
			return null;
		Object d = first.data;
		first = first.next;
		count--;
		return d;
	}
}
