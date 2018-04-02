package com.vamsi.junitin5steps;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	@Before
	public void before() {
		System.out.println("Before");
	}

	@After
	public void After() {
		System.out.println("After");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}

	MyMath math = new MyMath();

	@Test
	public void test() {
		System.out.println("Test1");
		assertEquals(6, math.sum(new int[] { 1, 2, 3 }));
	}

	@Test
	public void test1() {
		System.out.println("Test2");
		assertEquals(3, math.sum(new int[] { 3 }));
	}

}
