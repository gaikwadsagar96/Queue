//Write a program to convert a priority queue to an array containing all of the elements of the queue.
package com.hefshine.hw;

import java.util.PriorityQueue;

public class Q5_priorityQueueToArray 
{

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();
		pq1.add(10);
		pq1.add(20);
		pq1.add(30);
		pq1.add(40);
		pq1.add(50);
		
		
		Object[] a=pq1.toArray();
		for (int i = 0; i<a.length; i++) 
		{
			System.out.println(a[i]);
		}
		
	}

}
