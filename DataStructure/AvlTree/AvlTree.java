package AvlTree;

public class AvlTree<T extends Comparable<? super T>> {
	
	private TreeNode<T> _root = null;
	
	public AvlTree(TreeNode<T> root){
		if(root == null) throw new NullPointerException("root node could not be null!");
		_root = root;
	}
	
	public void Insert(TreeNode<T> node){
		if(node == null) throw new NullPointerException("node could not be null!");
		
		TreeNode<T> parentNode = null, curNode;
		curNode = this._root;
		
		while(curNode!=null){
			parentNode = curNode;
			
			if(curNode.getValue().compareTo(node.getValue())>0)curNode = curNode.getLeftChild();
			else curNode = curNode.getRightChild();
		}
		
		node.setParent(parentNode);
		if(parentNode.getValue().compareTo(node.getValue())>0)node= parentNode.getLeftChild();
		else node= parentNode.getRightChild();
	}
	
	public int GetHeight(TreeNode<T> node){
		if(node == null) return 0;
		return Math.max(GetHeight( node.getLeftChild() ),
				GetHeight( node.getRightChild()) ) +1;
	}
	
	
	protected int GetBalanceFactor(TreeNode<T> node){
		return GetHeight(node.getLeftChild()) - GetHeight(node.getRightChild());	
	}
	
	protected BalanceStatus GetBalanceStatus(TreeNode<T> node){
		int bf = GetBalanceFactor(node);
		if(bf == -2){//might be RR or RL
			int bf_rightChild = GetBalanceFactor(node.getRightChild());
			if (bf_rightChild == -1) return BalanceStatus.RR;
			else if(bf_rightChild == 1) return BalanceStatus.RL;
			else return null;
			
		}
		else if (bf == 2){//might be LL or LR
			int bf_leftChild = GetBalanceFactor(node.getLeftChild());
			if (bf_leftChild == -1) return BalanceStatus.LR;
			else if(bf_leftChild == 1) return BalanceStatus.LL;
			else return null;
		}
		else return null;
	}
	
	protected void LeftRotation(TreeNode<T> node){
		if(node == null) throw new NullPointerException("node could not be null!");
		
		// turn rightChild’s left subtree into node’s right subtree
		TreeNode<T> rightChild = node.getRightChild();
		node.setRightChild(rightChild.getLeftChild()); 
		if(rightChild.getLeftChild()!=null) rightChild.getLeftChild().setParent(node);
		
		// link node’s parent to rightChild
		rightChild.setParent(node.getParent());
		
		if(node.getParent() == this._root) this._root = rightChild;
		else if(node == node.getParent().getLeftChild()) node.getParent().setLeftChild(rightChild);
		else node.getParent().setRightChild(rightChild);
		
		// put node at the left child of rightChild
		rightChild.setLeftChild(node);
		node.setParent(rightChild);
	
	}
	
	
//	protected void RightRotation(TreeNode<T> node){
//		if(node == null) throw new NullPointerException("node could not be null!");
//		
//		// turn rightChild’s left subtree into node’s right subtree
//		TreeNode<T> rightChild = node.getRightChild();
//		node.setRightChild(rightChild.getLeftChild()); 
//		if(rightChild.getLeftChild()!=null) rightChild.getLeftChild().setParent(node);
//		
//		// link node’s parent to rightChild
//		rightChild.setParent(node.getParent());
//		
//		if(node.getParent() == this._root) this._root = rightChild;
//		else if(node == node.getParent().getLeftChild()) node.getParent().setLeftChild(rightChild);
//		else node.getParent().setRightChild(rightChild);
//		
//		// put node at the left child of rightChild
//		rightChild.setLeftChild(node);
//		node.setParent(rightChild);
//	
//	}
	
	protected static enum BalanceStatus{
		LL,
		LR,
		RR,
		RL
	}
	
	
	public static void main(String[] args){
		TreeNode<Integer> node = new TreeNode<Integer>(123);
		Integer haha = node.getValue();
		haha +=1; 
		System.out.println(node.getValue());
		System.out.println(haha);
	}
	

}
