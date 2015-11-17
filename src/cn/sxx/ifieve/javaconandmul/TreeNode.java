package cn.sxx.ifieve.javaconandmul;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	TreeNode parent = null;
	List<TreeNode> children = new ArrayList<TreeNode>();
	
	public synchronized void addChild(TreeNode child){
		if (!this.children.contains(child)) {
			this.children.add(child);
			child.setParentOnly(this);
		}		
	}
	
	public synchronized void addChildOnly(TreeNode child){
		if (!this.children.contains(child)) {
			this.children.add(child);
		}				
	}

	public synchronized void setParent(TreeNode parent) {
		this.parent = parent;
		parent.addChildOnly(this);
	}
	
	public synchronized void setParentOnly(TreeNode parent) {
		this.parent = parent;
	}

}
