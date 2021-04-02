package com.hefshine.cw;
//Write a program to iterate through all elements in priority queue.
import java.util.PriorityQueue;
import java.util.Iterator;
public class IteratePriorityQueue 
{

	public static void main(String[] args) 
	{
		PriorityQueue pq=new PriorityQueue();
		pq.add(10);
		pq.add(11);
		pq.add(13);
		pq.add(13);
		pq.add(14);
		pq.add(15);
		pq.add(16);
		pq.add(17);
		pq.add(18);
		Iterator it=pq.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
