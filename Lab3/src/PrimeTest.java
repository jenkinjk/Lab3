import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;


public class PrimeTest {
	
	
	@Test
	public void test1() {
		primeFactorization p = new primeFactorization();
		assertEquals(new ArrayList<Integer>(),p.factorization(1));
	}

}
