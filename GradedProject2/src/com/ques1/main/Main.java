package com.ques1.main;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.ques1.service.ConstructSkyscraper;

public class Main {
	
	
	public static void main(String[] args) 
	{
		
		// declaring input variable
		List<Integer> floors = new LinkedList<>();
		
		ConstructSkyscraper skyscraper = new ConstructSkyscraper();
		Scanner sc = new Scanner(System.in);
		
		
		// getting floor inputs from user
		System.out.println("enter the total no of floors in the building");
		int floorCount = sc.nextInt();
		
		for (int i = 0; i < floorCount; i++) 
		{
			System.out.println("enter the floor size given on day : " + (i+1) );
			floors.add(sc.nextInt());
		}
		
		
		// retrieving day-wise building floor assemble order
		skyscraper.AssembleFloor(floors);

		
		// closing scanner
		sc.close();
	}
	
}
