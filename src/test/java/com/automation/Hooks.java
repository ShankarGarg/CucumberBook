package com.automation;

import cucumber.api.java.Before;

public class Hooks {

	/*@Before("@sanity,@regression")
	public void taggedHookMethod1() {
	System.out.println("tagged hook - sanity OR regression");
	}
	
	@Before({"@sanity","@regression"})
	public void taggedHookMethod2() {
	System.out.println("tagged hook - Sanity AND Regression");
	}
	*/
	/*
	@Before({"@important","~@regression"})
	public void taggedHookMethod3() {
	System.out.println("Tagged hook- important but NOT regression");
	}*/
	/*
	@Before({"@important","@regression,@wip"})
	public void taggedHookMethod4() {
	System.out.println("Tagged hook - (important+Rgression) OR (important AND wip)");
	}
*/
	
	/*@After
	public void tearDown() {

		System.out.println("Inside After");
		//driver.quit();
	}*/

}
