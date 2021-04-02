package com.hefshine.cw;
import java.util.PriorityQueue;
import java.util.Queue;

//Write a program to create a new priority queue and print out the elements of the priority queue.

public class Q1_PriorityQueue 
{

	public static void main(String[] args) 
	{
		PriorityQueue pq=new PriorityQueue<>();
		pq.add(10);
		pq.add(11);
		pq.add(13);
		pq.add(14);
		pq.add(12);
		pq.add(15);
		pq.add(16);
		System.out.println(pq);
		

	}

}
