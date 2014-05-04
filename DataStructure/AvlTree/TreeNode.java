package AvlTree;

public class TreeNode<T extends Comparable<? super T>> {
	
	protected T _value;
	protected TreeNode<T> _parent = null;
	protected TreeNode<T> _leftChild = null;
	protected TreeNode<T> _rightChild = null;
	
	public TreeNode(T val){
		_value = val;
	}
	
	public T getValue(){
		return _value;
	}
	
	public TreeNode<T> getParent(){
		return _parent;
	}
	
	public void setParent(TreeNode<T> parent){
		_parent = parent;
	}
	
	public TreeNode<T> getLeftChild(){
		return _leftChild;
	}
	public void setLeftChild(TreeNode<T> left){
		_leftChild = left;
	}
	
	public TreeNode<T> getRightChild(){
		return _rightChild;
	}
	public void setRightChild(TreeNode<T> right){
		 _rightChild = right;
	}

}
