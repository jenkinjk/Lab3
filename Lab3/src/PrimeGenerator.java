import java.util.ArrayList;


public class PrimeGenerator {

	public  ArrayList<Integer> generate(int fInput) {
		ArrayList<Integer> primes = new  ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
		primes.add(11);
		primes.add(13);
		primes.add(17);
		primes.add(19);
		primes.add(23);
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
