package Binary;

import Binary.SumOfNodes.Node;

public class Main {
	public static void main(String[] args) {  
        
        SumOfNodes bt = new SumOfNodes();  
        
       bt.root=new Node(1); 
       bt.root.left=new Node(2);
       bt.root.left.left=new Node(4);
       bt.root.left.right=new Node(5);
       bt.root.left.left.left=new Node(6);
       bt.root.left.left.right=new Node(9);
       bt.root.left.right.left=new Node(7);
       bt.root.left.right.right=new Node(7);
       bt.root.right=new Node(3);
       bt.root.right.right=new Node(11);
       bt.root.right.left=new Node(8);
       int sumLeft1 = bt.calculateSum(bt.root.left);
       int sumLeftRight1 = bt.calculateSum(bt.root.right);
       bt.greater(sumLeft1, sumLeftRight1);
       int root = bt.root.data;
        System.out.println("Sum of all left nodes of binary tree: " + (bt.calculateSum(bt.root.left)+bt.root.data));  
     
	   }  
	
   }  


