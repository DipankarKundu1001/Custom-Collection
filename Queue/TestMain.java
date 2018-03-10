package org.CustomCollection.Queue;

public class TestMain 
{
	public static void main(String[] args) 
	{
		MyQueue qu = new MyQueue();
		
		qu.add(100);
		qu.add(200);
		qu.add(300);
		
		System.out.println("Size of Queue is :- " + qu.size());
		
		qu.poll();
		for(int i = 0; i < qu.size(); i++)
		{
			System.out.println((Integer)qu.peek());
		}
	}
}
