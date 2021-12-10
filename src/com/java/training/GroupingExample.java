package com.java.training;

import org.testng.annotations.Test;

public class GroupingExample {
@Test(groups = "regression")
public void myTestA() {
	
	System.out.println("running regression test cases");
	
}

@Test(groups = "sanity")
public void myTestB() {
	
	System.out.println("running sanity test cases");
	
}

@Test(groups = "smoke")
public void myTestC() {
	
	System.out.println("running smoke test cases");
	
}

@Test(groups = "smoke")
public void myTestD() {
	
	System.out.println("running smoke test cases");
	
}

@Test(groups = "functional")
public void myTestE() {
	
	System.out.println("running functional test cases");
	
}

@Test(groups = "functional")
public void myTestF() {
	
	System.out.println("running functional test cases");
	
}

}
