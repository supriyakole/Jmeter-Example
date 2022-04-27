package test;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	
	@Test
	public void EvenNumCheck() {
	
		int num = 10;
		Assert.assertTrue(num%2==0);
		System.out.println("number is even number");
}
}