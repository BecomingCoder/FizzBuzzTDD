import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTester {

	@Test
	public void test1() {
		assertEquals("1", FizzBuzzClass.FizzBuzzMethod(1));
	}
	
	@Test
	public void test2() {
		assertEquals("2", FizzBuzzClass.FizzBuzzMethod(2));
	}
	
	@Test
	public void test3() {
		assertEquals("Fizz", FizzBuzzClass.FizzBuzzMethod(3));
	}
	
	@Test
	public void test4() {
		assertEquals("4", FizzBuzzClass.FizzBuzzMethod(4));
	}
	
	@Test
	public void test5() {
		assertEquals("Buzz", FizzBuzzClass.FizzBuzzMethod(5));
	}
	
	@Test
	public void test6() {
		assertEquals("Fizz", FizzBuzzClass.FizzBuzzMethod(6));
	}
	
	@Test
	public void test9() {
		assertEquals("Fizz", FizzBuzzClass.FizzBuzzMethod(9));
	}
	
	@Test
	public void test10() {
		assertEquals("Buzz", FizzBuzzClass.FizzBuzzMethod(10));
	}
	
	@Test
	public void test12() {
		assertEquals("Fizz", FizzBuzzClass.FizzBuzzMethod(12));
	}
	
	@Test
	public void test15() {
		assertEquals("FizzBuzz", FizzBuzzClass.FizzBuzzMethod(15));
	}
	
	@Test
	public void test30() {
		assertEquals("FizzBuzz", FizzBuzzClass.FizzBuzzMethod(30));
	}
	

}
