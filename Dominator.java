package com.jspiders.assignment;


public class Dominator 
{
	 public int solution(int a[])
	 {
		        int temp = 0; 
		        int element = 0;
		        
		        //Finding value which is present more than one.
		        
		        for (int i = 0; i < a.length; i++) 
		        {
		            if(temp == 0) 
		            { 
		            	temp++;
		            	element = a[i];
		               } 
					else 
					{
						if (element != a[i])
						{ 
							temp -=1;  
						} 
			      		else 
			      		{ 
			      			temp++; 
			      		}
		             }
		        }
		        int value = -1;
		        if(temp > 0) 
		        {
		            value = element;
		        }
		        int index = -1;
		        int count = 0;
		        // Counting the value present in array
		        for (int i = 0; i < a.length; i++) {
		            if (a[i] == value) 
		            { 
					count++; 
					index = i;
		            }
		        }
		        
		        //Checking value is Dominator or not
		        
		        if(count > (a.length/2)) 
		        {
		            return index;
		        } else 
		        {
		            return -1;  
		        }
		    }

}
