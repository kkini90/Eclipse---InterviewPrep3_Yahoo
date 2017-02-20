package Yahoo;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//http://www.makeinjava.com/print-nodes-k-distance-leaf-node-binary-tree-dfs-example/

//http://www.geeksforgeeks.org/a-linked-list-with-next-and-arbit-pointer/
// read synchronisation, singleton class, synchronised block and method, producer consumer model

// seralise and deserialise binary tree
//how to make the application scalable
//https://www.hiredintech.com/classrooms/system-design/lesson/72
//read scalability CTCL
/*
 * class Data{
 * int id,
 * int grpid,
 * string name
 * }
 * 
 * group id by grpid, and sort the data
 * use hashmap<Integer, ArrayList<Data>>
 */


/*
 * LinkedIn
 * Given a list of child->parent relationships, build a binary tree out of it. All the element Ids inside the tree are unique. 

Example: 

Given the following relationships: 

Child Parent IsLeft 
15 20 true 
19 80 true 
17 20 false 
16 80 false 
80 50 false 
50 null false 
20 50 true 


You should return the following tree: 
50 
/ \ 
20 80 
/ \ / \ 
15 17 19 16 


Function Signature 


/** 
* Represents a pair relation between one parent node and one child node inside a binary tree 
* If the _parent is null, it represents the ROOT node 
*/ 
public class Relation { 
public Integer _parent; 
public Integer _child; 
public boolean _isLeft; 
} 


/** 
* Represents a single Node inside a binary tree 
*/ 
public class Node { 
public Integer _id; 
public Node _left; 
public Node _right; 
} 

/** 
* Implement a method to build a tree from a list of parent-child relationships 
* And return the root Node of the tree 
*/ 
public Node buildTree (List<Relation> data) 
{ 
}
 */
*/
//SOLUTION:
/*
 * Another way to approach this problem for a better running time could be by using a HashMap. 
 * We can hash the list with key as the parent and value as a list of its children. 
 * And then iteratively generating the tree. This solution would be O(n) time complexity and O(n) space complexity.
 * 
 * public static Node buildTree(List<Relation> data){
		if(data==null) return new Node();
		Node root=new Node();
		HashMap<Integer,ArrayList<Relation>> tree = new HashMap<Integer,ArrayList<Relation>>();
		for(Relation d:data){
			if(d.parent==null)
				root=new Node(d.child,null,null);
			else{
				if(tree.containsKey(d.parent)){
					ArrayList<Relation> value=tree.get(d.parent);
					value.add(d);
				} else {
					ArrayList<Relation> value = new ArrayList<Relation>();
					value.add(d);
					tree.put(d.parent,value);
				}
			}
		}
		if(root==null) return root;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			Node x = q.poll();
			if(tree.containsKey(x.id)){
				ArrayList<Relation> value=tree.get(x.id);
				for(Relation v:value){
					Node child = new Node(v.child,null,null);
					q.add(child);
					if(v.isLeft)	
						x.left=child;
					else x.right=child;
				}
			}
		}
		return root;
	}
 */
*/