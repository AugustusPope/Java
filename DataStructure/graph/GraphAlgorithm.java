package graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class GraphAlgorithm {
	
	
	private static enum VERTEX_STATE{
		DISCOVERED,
		PROCESSED,
		UNDISCOVERED
	}
		
	
	// Breadth First Search Algorithm
	public static class BreadthFirstSearch{
		

		private static HashMap<Object,VERTEX_STATE> vertexesState = new HashMap<Object,VERTEX_STATE>();
		
		
		protected static <V> void ProcessVertex(V vertex){
			System.out.println(vertex);
		}
		
		public static <V,E extends Edge,Graph extends AbstractGraph<V,E>>  void BreadthFirstSearch(Graph graph,V begin_vertex){
			
			HashSet<V> vertexes = graph.GetAllVertexes();
			for(V vertex : vertexes){
				vertexesState.put(vertex, VERTEX_STATE.UNDISCOVERED);
			}
			
			
			vertexesState.put(begin_vertex, VERTEX_STATE.DISCOVERED);// overwrite the begin vertex
			
			
			LinkedList<V> queue = new LinkedList<V>();
			queue.addLast(begin_vertex);
			
			
			while(!queue.isEmpty()){
				V vertex = queue.removeFirst();
			    LinkedList<E> edges = graph.GetAllEdgesForVertex(vertex);
			    
			    for(E edge: edges){
			        
			    	V adjecent_vertex = (V)edge.GetDestination();
			    	if(vertexesState.get(adjecent_vertex) ==VERTEX_STATE.UNDISCOVERED){
				    	queue.addLast(adjecent_vertex);
				    	vertexesState.put(adjecent_vertex, VERTEX_STATE.DISCOVERED);
			    	}
			    }
			    
			    ProcessVertex(vertex);
				vertexesState.put(vertex, VERTEX_STATE.PROCESSED);
				
			}
		}
		
	}
	
	
	
	public static class DepthFirstSearch{
		
	}
	
	
	

}
