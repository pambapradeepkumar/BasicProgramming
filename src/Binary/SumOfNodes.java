package Binary;

import Binary.SumOfNodes.Node;

public  class SumOfNodes {
	
	public static class Node{
		
	
	 int data;  
     Node left;  
     Node right;  
     
     public Node(int data)
     {   
    	  this.data = data;  
          this.left = null;  
          this.right = null;  
     }
     
	}
	public Node root;  
    
    public SumOfNodes(){  
      root = null;  
    }  
    
    public void greater(int sumLeft1,int sumLeftRight1)
    {
    	if(sumLeft1>sumLeftRight1)
    	{
    		System.out.println("left node has more weight :"+sumLeft1);
    	}
    	else if(sumLeft1<sumLeftRight1)
    	{
    		System.out.println("Right node has more weight :"+sumLeftRight1);
    	}
    	else {
    		System.out.println("Both are equal");
    	}
		
    	
    }
    
    public int calculateSum(Node temp)
    {  
        int sum, sumLeft, sumRight;  
        sum = sumRight = sumLeft = 0;  
        if(root == null) 
        {  
            System.out.println("Tree is empty");  
            return 0;  
        }  
        else {  
        	
            if(temp.left != null)  
                sumLeft = calculateSum(temp.left);  
              
            
            if(temp.right != null)  
                sumRight = calculateSum(temp.right);  
              
             
            sum = temp.data + sumLeft + sumRight;   
            return sum;  
        }    
        
    }
}
