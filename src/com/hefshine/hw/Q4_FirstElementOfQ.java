//Write a program to retrieve the first element of the priority queue.

package com.hefshine.hw;

import java.util.PriorityQueue;

public class Q4_FirstElementOfQ 
{

	public static void main(String[] args) 
	{
		PriorityQueue pq1=new PriorityQueue();
		pq1.add(10);
		pq1.add(20);
		pq1.add(30);
		pq1.add(40);
		pq1.add(50);
		System.out.println(pq1.element());

	}

}
