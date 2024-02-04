package org.testngframework;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class AnnotationExp {
	
	@BeforeGroups("sanity")

	void bg() {

		

		System.out.println("this is before group");

	}

	

	@AfterGroups("regression")

	void ag() {

		System.out.println("this is after group");

	}

	

	@Test(priority=1,  groups = {"sanity"})

	void tm1()

	{

		System.out.println("This is Test Method1...");

	}

	

	@Test(priority=2, groups = {"sanity"})

	void tm2()

	{

		System.out.println("This is Test Method2...");

	}

	

	@Test(priority = 3, groups = {"regression"})

	void tm3() {

		System.out.println("this is test method3...");

	}

	

	@Test(priority = 4,  groups = {"regression"})

	void tm4() {

		System.out.println("this is test method4...");

	}

}
