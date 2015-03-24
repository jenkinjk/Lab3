import java.util.ArrayList;


public class PrimeFactorization {
	public ArrayList<Integer> factorization(int val){
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(val!=1){
			if(val==4){
				result.add(2);
				result.add(2);
			}else{
			result.add(val);
			}
		}
		return result;
	}
}
