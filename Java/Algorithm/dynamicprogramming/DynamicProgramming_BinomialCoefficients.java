package dynamicprogramming;

public class DynamicProgramming_BinomialCoefficients {
	
	public static long BinomialCoefficients(int m, int n){
		if(n<m) throw new IllegalArgumentException("n must not be smaller than m!");
		
		long bc[][] = new long[m+1][n+1];
		
		
		for(int i=0;i<=m;i++){
			for(int j=i;j<=n;j++){
				if(i == 0 || i == j)bc[i][j]=1;
				else bc[i][j] = bc[i-1][j-1]+ bc[i][j-1];
			}
		}
		
		return bc[m][n];
		
	}
	
	
	public static void main(String[] args){
		System.out.println(BinomialCoefficients(7,15));
	}
	

}
