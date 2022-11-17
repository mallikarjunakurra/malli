package com.ArrayTest;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arraylist.Arraylist;

public class Emptylist {
	
	private static Arraylist al;
	
@BeforeAll
public static void beforeAllTests()
{
	al=new Arraylist();
	System.out.println("Once Before All Tests...");
}

@BeforeEach
public void beforeEach()
{
	System.out.println("Before Each Test...");
}


@Test
public void testEmpty()
{
	assertFalse(al.arrayList().isEmpty());
}


@AfterEach
public void afterEach()
{
	System.out.println("After Each Test...");
}

@AfterAll
public static void afterAll()
{
	System.out.println("Once After All Tests...");
}
	
}