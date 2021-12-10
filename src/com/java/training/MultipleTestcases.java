package com.java.training;

import org.testng.annotations.Test;

public class MultipleTestcases {
	
  @Test(priority=1, description = "This is to test login functionality")
  public void Login() {
	  
	  System.out.println("Hi,Thanks! I am able to login! ");
  }
  
  @Test(priority=2, description = "This is to test payment functionality")
  public void Payment() {
	  
	  System.out.println("Hi,Thanks! I am able to do payment!");
  }
  
  @Test(priority=3, description = "This is to test logout functionality")
  public void Logout() {
	  
	  System.out.println("Hi,Thanks! I am able to logout! will login again");
  }
}
   {
  }

   
   }
