package dynamicprogramming;

public class DynamicProgramming_ApproximateStringMatching {
	
	
	private static int Minimal(int a, int b, int c){
		return Math.min(Math.min(a, b),c);
	}
	
	
	//recursive version, very very slow.Why is the algorithm so slow? It takes exponential time because it recomputes
	//	values again and again and again. At every position in the string, the recursion
	//	branches three ways, meaning it grows at a rate of at least 3n—indeed, even faster
	//	since most of the calls reduce only one of the two indices, not both of them.
	public static int LevenshteinDistance(String s, int len_s, String t, int len_t){
		
		if(s ==null || t == null)throw new NullPointerException("String s and t could not be null!");
		
		try{
			if(len_s == 0)return len_t;
			if(len_t == 0)return len_s;
			int cost = 0;
			
			if(s.charAt(len_s - 1) == t.charAt(len_t - 1)) cost = 0;
			else cost = 1;
			
			
			return Minimal(
					LevenshteinDistance(s,len_s-1,t,len_t)+1,
					LevenshteinDistance(s,len_s,t,len_t-1)+1,
					LevenshteinDistance(s,len_s-1,t,len_t-1) + cost
					);
			
		}
		catch(IndexOutOfBoundsException ex){
			throw ex;
		}
	}
	
	
	//dynamic programming version
		public static int LevenshteinDistance(String s,  String t){
			
			if(s ==null || t == null)throw new NullPointerException("String s and t could not be null!");
			
			try{
				if(s.length() == 0)return t.length();
				if(t.length() == 0)return s.length();
				
				int len_s = s.length();
				int len_t = t.length();
				
				int[][] cost_ld = new int[len_s+1][len_t+1];
				
				for(int i = 0;i<=len_s;i++)cost_ld[i][0] = i;
				for(int j = 0;j<=len_t;j++)cost_ld[0][j] = j;
				
				for(int i = 1;i<=len_s;i++){
					for(int j = 1 ;j<=len_t;j++){
						
						int cost = 0;
						if(s.charAt(i-1) == t.charAt(j-1))cost = 0;
						else cost = 1;
						
						cost_ld[i][j] = Minimal(
								cost_ld[i-1][j] + 1,
								cost_ld[i][j-1] + 1,
								cost_ld[i-1][j-1] + cost
								);
						
						
						
					}
				}
				
				
				for(int i = 0;i<len_s;i++){
					for(int j = 0;j<len_t;j++){
						System.out.print(cost_ld[i][j]+"  ");
					}
					System.out.println();
				}
				
				return cost_ld[s.length()][t.length()];
	
				
			}
			catch(IndexOutOfBoundsException ex){
				throw ex;
			}
		}
		
		
		private enum CharOperation{
			KEEP,
			INSERTION ,
			DELETETION ,
			SUBSTITUTION
		}
		
		
		//dynamic programming version
				public static int LevenshteinDistanceConvertInstructions(String s,  String t){
					
					if(s ==null || t == null)throw new NullPointerException("String s and t could not be null!");
					
					try{
					
						
						int len_s = s.length();
						int len_t = t.length();
						
						int[][] cost_ld = new int[len_s+1][len_t+1];
						CharOperation[][] operation_ld = new CharOperation[len_s+1][len_t+1];
						for(int i = 0;i<=len_s;i++){cost_ld[i][0] = i;operation_ld[i][0]=CharOperation.KEEP;}
						for(int j = 0;j<=len_t;j++){cost_ld[0][j] = j;operation_ld[0][j]=CharOperation.KEEP;}
						
						for(int i = 1;i<=len_s;i++){
							for(int j = 1 ;j<=len_t;j++){
								
								int cost = 0;
								if(s.charAt(i-1) == t.charAt(j-1))cost = 0;
								else cost = 1;
								
								cost_ld[i][j] = Minimal(
										cost_ld[i-1][j] + 1,
										cost_ld[i][j-1] + 1,
										cost_ld[i-1][j-1] + cost
										);				
								
							}
						}
						
						
						for(int i = 0;i<len_s;i++){
							for(int j = 0;j<len_t;j++){
								System.out.print(cost_ld[i][j]+"  ");
							}
							System.out.println();
						}
						
						return cost_ld[s.length()][t.length()];
			
						
					}
					catch(IndexOutOfBoundsException ex){
						throw ex;
					}
				}
	
	
	public static void main(String[] args){
		String s = "you should not";
		String t = "thou shalt not";
		
		System.out.println(LevenshteinDistance(s,s.length(),t,t.length()));
		System.out.println(LevenshteinDistance(s,t));
	}

}
