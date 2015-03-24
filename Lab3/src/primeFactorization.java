import java.util.ArrayList;


public class PrimeFactorization {
	public ArrayList<Integer> factorization(int val){
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(val!=1){
			result.add(val);
		}
		return result;
	}
}
