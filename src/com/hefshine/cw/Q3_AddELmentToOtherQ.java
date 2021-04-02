//Write a program to add all the elements of a priority queue to another priority queue
package com.hefshine.cw;
import java.util.PriorityQueue;
public class Q3_AddELmentToOtherQ 
{

	public static void main(String[] args) 
	{
		PriorityQueue pq1=new PriorityQueue();
		pq1.add(10);
		pq1.add(20);
		pq1.add(30);
		pq1.add(40);
		pq1.add(50);
		PriorityQueue pq2=new PriorityQueue();
		pq2.addAll(pq1);
		System.out.println(pq2);

	}

}
