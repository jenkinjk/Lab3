import java.util.ArrayList;


public class PrimeFactorization {
	private ArrayList<Integer> primes;
	
	public  PrimeFactorization(){
		this.primes = new ArrayList<Integer>();
		this.primes.add(2);
		this.primes.add(3);
		this.primes.add(5);
		this.primes.add(7);
	}
	public ArrayList<Integer> factorization(int val){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int prime: primes){
			if(val%prime==0){
				result.add(prime);
				result.addAll(this.factorization(val/prime));
				return result;
			}
		}
		if(val!=1)
		result.add(val);
		return result;
	}
}
