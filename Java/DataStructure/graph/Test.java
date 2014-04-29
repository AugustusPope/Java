package graph;


import java.util.ArrayList;
import java.util.HashSet;
public class Test {
	
	public static <T> ArrayList<ArrayList<T>> FindAllSubsets(T[] set,int endIndex){
		
		ArrayList<ArrayList<T>> result  = new ArrayList<ArrayList<T>>();
		if(set == null) return null;
		else if(endIndex < 0)return result;
		else if(endIndex == 0) {
			ArrayList<T> one_set = new ArrayList<T>();
			one_set.add(set[0]);
			result.add(one_set);
			result.add(new ArrayList<T> ());	
			return result;
		}
		else {
			ArrayList<ArrayList<T>> subSets = FindAllSubsets(set,endIndex - 1);
			for(ArrayList<T> s: subSets){
				ArrayList<T> newSet = new ArrayList<T>(s);
				newSet.add(set[endIndex]);
				result.add(newSet);
				result.add(s);
			}
			
			
			return result;
		}
		
		
	}
	
	public static void main(String[] args){
		
		String[] set = new String[]{"1","2","3","4","5"};

		ArrayList<ArrayList<String>> r = FindAllSubsets(set,4);
		for(ArrayList<String> list : r){
			System.out.print("[");
			for(String s: list){
				if(s!=list.get(list.size()-1)){
					System.out.print(s+",");
				}
				else System.out.print(s);
			}
			System.out.println("]");
		}
	}

}
