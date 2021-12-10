package com.java.training;
import org.testng.annotations.Test;

public class TestNg_First {
  @Test(priority=4,description="firstRun")
  public void MyFirstPgm() {
	  System.out.println("Hello Rahul");
  }
  @Test(priority=2,description="SecondRun")
  public void MyTwoPgm() {
	  System.out.println("Hello Rahul");
  }  @Test(priority=3,description="firRun")
  public void MyThreePgm() {
	  System.out.println("Hello Rahul");
  }  @Test(priority=1,description="first")
  public void MyFourPgm() {
	  System.out.println("Hello Rahul sh");
  }
}
