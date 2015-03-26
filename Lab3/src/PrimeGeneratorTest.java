import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

@RunWith(org.junit.runners.Parameterized.class)
public class PrimeGeneratorTest {
	private int fInput;
	private ArrayList<Integer> fExpected;

	@Parameters
	public static Iterable<Object[]> data(){
		ArrayList<Integer> one =new ArrayList<Integer>();
		ArrayList<Integer> two =new ArrayList<Integer>();
		return Arrays.asList(new Object[][]{
				{1, one},
				{2, two}
				});
	}

	public PrimeGeneratorTest(int input, ArrayList<Integer> expected) {
		fInput = input;
		fExpected = expected;
	}

	@Test
	public void testPrimeGenerator() {
		PrimeGenerator primegenerator = new PrimeGenerator();

		assertEquals(fExpected, primegenerator.generate(fInput));
	}

}
