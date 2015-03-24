import java.util.ArrayList;


public class PrimeFactorization {
	public ArrayList<Integer> factorization(int val){
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(val!=1){
			if(val%2==0){
				result.add(2);
				result.addAll(this.factorization(val/2));
			}else if(val%3==0){
				result.add(3);
				result.addAll(this.factorization(val/3));
			}else{
			result.add(val);
			}
		}
		return result;
	}
}
