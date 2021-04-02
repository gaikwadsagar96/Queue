//Write a program to count the number of elements in a priority queue.
package com.hefshine.hw;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Q2_CountNoOfELementQ 
{

	public static void main(String[] args) 
	{
		PriorityQueue pq1=new PriorityQueue();
		pq1.add(10);
		pq1.add(20);
		pq1.add(30);
		pq1.add(40);
		pq1.add(50);
		System.out.println(pq1.size());
		Iterator it=pq1.iterator();
		int count=0;
		while(it.hasNext())
		{
			count++;
		}
		System.out.println("Total no of element in queue: "+count);
		

	}

}
