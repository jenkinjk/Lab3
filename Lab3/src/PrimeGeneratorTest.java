import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runners.Parameterized.*;


public class PrimeGeneratorTest {

	@Parameters
	public static Iterable<Object[]> data(){
		ArrayList<Integer> one =new ArrayList<Integer>();
		return Arrays.asList(new Object[][]{
				{1, one}
		});
	}
	private int fInput;
	 
    private ArrayList<Integer> fExpected;

    public PrimeGeneratorTest(int input, ArrayList<Integer> expected) {
            fInput= input;
            fExpected= expected;
    }
	@Test
	public void test() {
		assertEquals(fExpected,PrimeGenerator.generate(fInput));
	}

}
