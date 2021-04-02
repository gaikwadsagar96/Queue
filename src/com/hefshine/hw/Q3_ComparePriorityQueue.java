//Write a program to compare two priority queues.
package com.hefshine.hw;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Q3_ComparePriorityQueue 
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
		pq2.add(10);
		pq2.add(20);
		pq2.add(30);
		pq2.add(40);
		pq2.add(50);
		
		Iterator it1=pq1.iterator();
		Iterator it2=pq2.iterator();
		boolean y=false;
		while(it1.hasNext()&&it2.hasNext())
		{
			if(it1.next()==it2.next())
			{
				y=true;
			}
			else {
				y=false;
				break;
			}
		}
		if(y)
			System.out.println("same");
		else
			System.out.println("not same");

	}

}
