package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.Assign2.MergeSortImplementation;

public class DriverClass {
	 
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Getting the number of companies N, that the user wants to store records of
		System.out.println("Enter the no of companies");
		int N= sc.nextInt();
	
		// allocate an array for share price(double format) of N companies
        double[] price = new double[N];
        int countP=0,countN=0;
          
        //get the share prices in the loop
      	for(int i=0; i<N; i++) {
      			System.out.println("Enter current stock price of the company " + (i+1));
      			price[i] = sc.nextDouble();
      			System.out.println("Whether company's stock price rose today compare to yesterday?(True/False)");
      		   //create local variable track(boolean format) to compare rise in company's stock price
      			boolean track=sc.nextBoolean();
      			if(track==true) countP++;
      			else countN++;
      	}
      	// declare variable of user choice to select options in application
    int option;
    do {
      	System.out.println("\n Enter the operation that you want to perform");
      	System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. press 0 to exit");
		
	    option = sc.nextInt();
		switch (option) {
		
		case 0:
		option = 0;
		break;
		
		case 1: {
			MergeSortImplementation ms= new MergeSortImplementation();
			ms.sort(price, 0, price.length-1);
			System.out.println("Stock prices in ascending order are :");
			for(int j=price.length-1 ;j>=0; j--) {
				System.out.println(price[j]);
			}
		}
		break;
		
		case 2: {
			MergeSortImplementation ms= new MergeSortImplementation();
			ms.sort(price, 0, price.length-1);
			System.out.println("Stock prices in descending order are :");
			for(int j=0 ;j<price.length; j++) {
				System.out.println(price[j]);
			}
		}
		break;
			
		case 3: {
			System.out.println("Total no of companies whose stock prices rose today:" +countP);
		}
		break;
		
		case 4:  {
			System.out.println("Total no of companies whose stock prices declined today:" +countN);
		}
		break;
		
		case 5: {
			System.out.println("Enter the key value");
			double temp = sc.nextDouble();
			int count=0;
			for(int i=0;i<N;i++) {
				if (temp==price[i]) {
					System.out.println("Stock of value "+temp+" is present");
					count++;
					break;
				}
			}
			if(count==0)
			 System.out.println("Value not found");		
		}
		break;
		}
    }while(option != 0);
     System.out.println("Exited Successfully!!!");
     sc.close();	
     }
   }

    
