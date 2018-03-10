package org.CustomCollection.LinkedList;

public class TestMain 
{
	public static void main(String[] args) 
	{
		MyLinkedList ll = new MyLinkedList();
		
		ll.add(40);
		ll.add(20);
		ll.add(30);
		ll.add(3, 100);
		
		System.out.println("Size of LinkedList is :- " + ll.size());
		
		for(int i = 0; i < ll.size(); i++)
		{
			int n = (Integer)ll.get(i);
			System.out.println(n);
		}
	}
}
