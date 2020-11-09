package com.qa.peer_exercise;

import java.util.Scanner;

public class DogPlace {
	    
		 static final int limit = 100;
	        public static void main(String[]args)
	        {
		        Scanner in = new Scanner(System.in);
		         System.out.println("Where did your dog place?");
		         int x = in.nextInt();
		       
		        for(int i = 1; i <=limit;i++)
		        {
			        if(i == x)
				        continue;
			        System.out.print(i);
			        if(i%100>=10 && i%100<=20)
				        System.out.print("th");
			        else if(i%10 == 1)
				        System.out.print("st");
			        else if(i%10 == 2)
				        System.out.print("nd");
			        else if(i%10 == 3)
				        System.out.print("rd");
			        else
				        System.out.print("th");
			        if(i!=limit)
				        System.out.print(", ");
		        }
		        in.close();
	        }
	    }


