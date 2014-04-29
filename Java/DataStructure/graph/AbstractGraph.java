package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public abstract class AbstractGraph<V,E extends Edge> {
	
	public AbstractGraph(){
	}
	protected HashSet<V> _vertexes = new HashSet<V>();
	protected HashSet<E> _edges = new HashSet<E>();
	protected HashMap<V,LinkedList<E>> _VertexEdgeMapper = new HashMap<V,LinkedList<E>>();
	//private boolean _allowLoop;
	//private boolean _allowMultiEdge;
	
	
	public HashSet<V> GetAllVertexes(){
		return this._vertexes;
	}
	
	public HashSet<E> GetAllEdges(){
		return this._edges;
	}
	
	public LinkedList<E> GetAllEdgesForVertex(V vertex){
		return this._VertexEdgeMapper.get(vertex);
		
	}
	
	
	
	
	
	// add vertex
		public void AddVertex(V vertex){
			if(vertex==null)throw new NullPointerException ("vertex could not be null!");
			else if(this._vertexes.contains(vertex)) throw new java.lang.IllegalArgumentException("vertex already existed in the graph!");
			else {
				this._vertexes.add(vertex);	// add vertex
				this._VertexEdgeMapper.put(vertex, new LinkedList<E>()); // add an edge list entry on vertex---edges mapper
			
			}
			
		}
		
		// remove vertex
		public void RemoveVertex(V vertex){		
			if(vertex==null)throw new NullPointerException ("vertex could not be null!");
			else if(!this._vertexes.contains(vertex)) {
				throw new java.lang.IllegalArgumentException("vertex not existed in the graph!");		
			}
			else {	
				this._vertexes.remove(vertex);
				this._VertexEdgeMapper.remove(vertex);	
			}
		}
		

		//add edge
		public void AddEdge(E edge){
			if(edge == null)throw new NullPointerException ("edge could not be null!");
			else if(this._edges.contains(edge)) throw new java.lang.IllegalArgumentException("edge already existed in the graph!");
			else {
				this._edges.add(edge);	
				this._VertexEdgeMapper.get(edge.GetSource()).add(edge);	//		
			}		
		}
		

		// remove edge
		public void RemoveEdge(E edge){
			
			if(edge == null)throw new NullPointerException ("edge could not be null!");
			else if(! this._edges.contains(edge)) throw new java.lang.IllegalArgumentException("edge not existed in the graph!");
			else {
				this._edges.remove(edge);
				this._VertexEdgeMapper.get(edge.GetSource()).remove(edge);		
			}	
			
		}
		
	

}
