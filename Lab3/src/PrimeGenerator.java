import java.util.ArrayList;


public class PrimeGenerator {

	public  ArrayList<Integer> generate(int fInput) {
		ArrayList<Integer> primes = new  ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int prime: primes){
			if(prime>=fInput){
				break;
			}
			result.add(prime);
		}
		return result;
	}

}
