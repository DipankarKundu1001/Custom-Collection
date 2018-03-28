package org.CustomCollection.ArrayListIterator;

import java.util.Iterator;

public class TestMain 
{
	public static void main(String[] args) 
	{
		MyArrayList al = new MyArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println("Size of arraylist is :- " + al.size());
		
		Iterator<?> itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
