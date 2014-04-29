package graph;

public class Edge {
	
	private Object  _source;
	private Object  _destination;
	private double _weight;
	
	public Edge(Object source,Object destination){
		_source = source;
		_destination = destination;
	}
	
	public Object GetSource(){
		return _source;
	}
	
	public Object GetDestination(){
		return _destination;
	}
	
	public void SetWeight(double weight){
		this._weight = weight;
	}
	
	public Edge GetReverseEdge(){
		return new Edge(_destination,_source);
	}

}
