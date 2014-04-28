package graph;

import java.util.HashMap;
import java.util.LinkedList;

public class DirectedGraph<V,E extends Edge> extends AbstractGraph<V, E> {
	
//	
//	protected HashMap<V,LinkedList<E>> _VertexEdgeMapper = new HashMap<V,LinkedList<E>>();
//	
//	
//
//	// add vertex
//	public void AddVertex(V vertex){
//		if(vertex==null)throw new NullPointerException ("vertex could not be null!");
//		else if(this._vertexes.contains(vertex)) throw new java.lang.IllegalArgumentException("vertex already existed in the graph!");
//		else {
//			this._vertexes.add(vertex);	// add vertex
//			this._VertexEdgeMapper.put(vertex, new LinkedList<E>()); // add an edge list entry on vertex---edges mapper
//		
//		}
//		
//	}
//	
//	// remove vertex
//	public void RemoveVertex(V vertex){		
//		if(vertex==null)throw new NullPointerException ("vertex could not be null!");
//		else if(!this._vertexes.contains(vertex)) {
//			throw new java.lang.IllegalArgumentException("vertex not existed in the graph!");		
//		}
//		else {	
//			this._vertexes.remove(vertex);
//			this._VertexEdgeMapper.remove(vertex);	
//		}
//	}
//	
//
//	//add edge
//	public void AddEdge(E edge){
//		if(edge == null)throw new NullPointerException ("edge could not be null!");
//		else if(this._edges.contains(edge)) throw new java.lang.IllegalArgumentException("edge already existed in the graph!");
//		else {
//			this._edges.add(edge);	
//			this._VertexEdgeMapper.get(edge.GetSource()).add(edge);	//		
//		}		
//	}
//	
//
//	// remove edge
//	public void RemoveEdge(E edge){
//		
//		if(edge == null)throw new NullPointerException ("edge could not be null!");
//		else if(! this._edges.contains(edge)) throw new java.lang.IllegalArgumentException("edge not existed in the graph!");
//		else {
//			this._edges.remove(edge);
//			this._VertexEdgeMapper.get(edge.GetSource()).remove(edge);		
//		}	
//		
//	}
	
	

}
