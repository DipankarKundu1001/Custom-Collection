package org.CustomCollection.ArrayList;

public class MyArrayList 
{
	private Object[] arr;
	private int p = 0;
	
	public MyArrayList()
	{
		this(10);
	}
	public MyArrayList(int size)
	{
		arr = new Object[size];
	}
	
	public void add(Object ele)
	{
		if(p >= arr.length)
			increase();
		arr[p++] = ele;
	}
	
	public int size()
	{
		return p;
	}
	
	public Object get(int index)
	{
		if(index >= size())
			throw new IndexOutOfBoundsException();
		return arr[index];
	}
	
	private void increase()
	{
		Object[] temp = new Object[arr.length + 10];
		for(int i = 0; i < arr.length; i++)
			temp[i] = arr[i];
		arr = temp;
	}
}
