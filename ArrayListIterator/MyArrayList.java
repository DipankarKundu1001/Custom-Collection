package org.CustomCollection.ArrayListIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

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
	
/*	//Custom Iterator
	public class ALI implements Iterator<Object>
	{
		int r = -1;
		@Override
		public boolean hasNext() 
		{
			if(r>=size()-1)
				return false;
			
			return true;
		}

		@Override
		public Object next() 
		{
			if(r >= size()-1)
				throw new NoSuchElementException();
			return arr[++r];
		}
	}*/
	
	public Iterator<Object> iterator()
	{
		return new Iterator<Object>() 
		{
			int r = -1;
			public boolean hasNext() 
			{
				if(r>=size()-1)
					return false;
				return true;
			}
			public Object next() 
			{
				if(r >= size()-1)
					throw new NoSuchElementException();
				return arr[++r];
			}
		};
		
	}
}
