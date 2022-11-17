package com.Palindrome_Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.Palindrome.Palindrome;


public class PalindromeTest {
	private static Palindrome pm;
	
@BeforeAll
public static void beforeAllTests()
{
	pm=new Palindrome();
	System.out.println("Once Before All Tests...");
}

@BeforeEach
public void beforeEach()
{
	System.out.println("Before Each Test...");
}


@ParameterizedTest
@ValueSource(strings = {"mom","dad","rod","pen"})
public void isPalindrome(String s)
{
	assertTrue(pm.palindrome(s));
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

