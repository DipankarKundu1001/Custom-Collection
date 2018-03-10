package org.CustomCollection.ArrayList;

public class TestMain 
{
	public static void main(String[] args) 
	{
		MyArrayList al = new MyArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println("Size of arraylist is :- " + al.size());
		
		for(int i = 0; i < al.size(); i++)
		{
			int n = (Integer) al.get(i);
			System.out.println(n);
		}
	}

}
