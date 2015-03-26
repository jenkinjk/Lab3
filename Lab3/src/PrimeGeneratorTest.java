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
		ArrayList<Integer> three =new ArrayList<Integer>();
		three.add(2);
		ArrayList<Integer> seven =new ArrayList<Integer>();
		seven.add(2);
		seven.add(3);
		seven.add(5);
		ArrayList<Integer> fifteen =new ArrayList<Integer>();
		fifteen.addAll(seven);
		fifteen.add(7);
		fifteen.add(11);
		fifteen.add(13);
		ArrayList<Integer> twentyFour =new ArrayList<Integer>();
		twentyFour.addAll(fifteen);
		twentyFour.add(17);
		twentyFour.add(19);
		twentyFour.add(23);
		return Arrays.asList(new Object[][]{
				{1, one},
				{2, two},
				{3, three},
				{7, seven},
				{15, fifteen},
				{24, twentyFour}
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
