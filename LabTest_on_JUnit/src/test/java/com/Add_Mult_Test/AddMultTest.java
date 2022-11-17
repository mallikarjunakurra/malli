package com.Add_Mult_Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.add_mult.AddMult;

public class AddMultTest {
	
	private static AddMult am;
	
@BeforeAll
public static void beforeAllTests()
{
	am=new AddMult();
	System.out.println("Once Before All Tests...");
}

@BeforeEach
public void beforeEach()
{
   System.out.println("Before Each Test...");
}

@Test
public void testAdd()
{
	assertEquals(30,am.add(10,20));
}

@Test
public void testMultiply()
{
	assertEquals(200,am.multily(10,20));
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
