import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;


public class PrimeFactorTest {
	
	
	@Test
	public void test1() {
		PrimeFactorization p = new PrimeFactorization();
		assertEquals(new ArrayList<Integer>(),p.factorization(1));
	}
	
	@Test
	public void test2() {
		PrimeFactorization p = new PrimeFactorization();
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(2);
		assertEquals(test,p.factorization(2));
	}
	
	@Test
	public void test3() {
		PrimeFactorization p = new PrimeFactorization();
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(3);
		assertEquals(test,p.factorization(3));
	}
	
	@Test
	public void test4() {
		PrimeFactorization p = new PrimeFactorization();
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(2);
		test.add(2);
		assertEquals(test,p.factorization(4));
	}
	
	@Test
	public void test6() {
		PrimeFactorization p = new PrimeFactorization();
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(2);
		test.add(3);
		assertEquals(test,p.factorization(6));
	}

}
