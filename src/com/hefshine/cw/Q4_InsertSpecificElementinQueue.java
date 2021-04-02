// Write a program to insert a given element into a priority queue.
package com.hefshine.cw;

import java.util.PriorityQueue;

public class Q4_InsertSpecificElementinQueue 
{

	public static void main(String[] args)
	{
		PriorityQueue pq1=new PriorityQueue();
		pq1.add(10);
		pq1.add(20);
		pq1.add(30);
		pq1.add(40);
		pq1.add(50);
		int e=60;
		pq1.add(e);
		System.out.println(pq1);
		

	}

}
