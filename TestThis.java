import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Stack;


public class TestThis {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
		test5();
	}
	
	public static void test1()
    {
            RedBlackTree<Integer> rbt = new RedBlackTree<>();
            rbt.insert(5);
            rbt.insert(4);
            rbt.insert(9);
            rbt.insert(3);
            rbt.insert(1);
            String expected = "[5, 3, 9, 1, 4]";
            
            if(rbt.root.isBlack && rbt.root.leftChild.data == 3 && rbt.root.leftChild.isBlack
            		&& rbt.root.rightChild.isBlack && rbt.root.rightChild.data == 9)
            {
            	System.out.println("true");
            	
            }
            
            if(rbt.root.leftChild.leftChild.data == 1 && !rbt.root.leftChild.leftChild.isBlack
            		&& !rbt.root.leftChild.rightChild.isBlack && rbt.root.leftChild.rightChild.data == 4)
            {
            	System.out.println("true");
            	
            }
            
    
            
            if(rbt.root.toString().equals(expected))
            {
            	System.out.println("true");
            	return;
            }
            System.out.println(false);
    }
	
	 public static void test2()
	    {
		 System.out.println();
	            RedBlackTree<Integer> rbt = new RedBlackTree<>();
	            rbt.insert(8);
	            rbt.insert(5);
	            rbt.insert(10);
	            rbt.insert(3);
	            rbt.insert(4);
	            String expected = "[8, 4, 10, 3, 5]";
	            
	            if(rbt.root.isBlack && rbt.root.leftChild.data == 4 && rbt.root.leftChild.isBlack
	            		&& rbt.root.rightChild.isBlack && rbt.root.rightChild.data == 10)
	            {
	            	System.out.println("true");   	
	            }
	            
	            if(rbt.root.leftChild.leftChild.data == 3 && !rbt.root.leftChild.leftChild.isBlack
	            		&& !rbt.root.leftChild.rightChild.isBlack && rbt.root.leftChild.rightChild.data == 5)
	            {
	            	System.out.println("true");
	            	
	            }
	            
	            if(rbt.root.toString().equals(expected))
	            {
	            	System.out.println("true");
	            	return;
	            }
	            System.out.println(false);
	    }
	 
	 public static void test3()
	    {
		 System.out.println();
	            RedBlackTree<Integer> rbt = new RedBlackTree<>();
	            rbt.insert(8);
	            rbt.insert(5);
	            rbt.insert(10);
	            rbt.insert(11);
	            rbt.insert(12);
	            String expected = "[8, 5, 11, 10, 12]";
	            
	            if(rbt.root.isBlack && rbt.root.leftChild.data == 5 && rbt.root.leftChild.isBlack
	            		&& rbt.root.rightChild.isBlack && rbt.root.rightChild.data == 11)
	            {
	            	System.out.println("true");   	
	            }
	            	            
	            if(rbt.root.rightChild.leftChild.data == 10 && !rbt.root.rightChild.leftChild.isBlack
	            		&& !rbt.root.rightChild.rightChild.isBlack && rbt.root.rightChild.rightChild.data == 12)
	            {
	            	System.out.println("true");
	            	
	            }
	            
	            if(rbt.root.toString().equals(expected))
	            {
	            	System.out.println("true");
	            	return;
	            }
	            System.out.println(false);
	    }
	 
	 public static void test4()
	    {
		 	System.out.println();
	    	RedBlackTree<Integer> rbt = new RedBlackTree<>();
	        rbt.insert(8);
	        rbt.insert(5);
	        rbt.insert(10);
	        rbt.insert(3);
	        boolean color = false;
	        boolean shape = false;
	        boolean overall = false;
	        if(rbt.root.isBlack && rbt.root.rightChild.isBlack && rbt.root.leftChild.isBlack &&
	        		!rbt.root.leftChild.leftChild.isBlack)
	        {
	        	color = true;
	        }
	        
	        String expected = "[8, 5, 10, 3]";
	        if(expected.equals(rbt.root.toString()))
	        {
	        	shape = true;
	        }
	        
	        if(shape == true && color == true)
	        {
	        	overall = true;
	        }
	        
	        System.out.println(overall);
	    }
	 
	 public static void test5()
	    {
		 	System.out.println();
	            RedBlackTree<Integer> rbt = new RedBlackTree<>();
	            rbt.insert(5);
	            rbt.insert(3);

	            rbt.insert(4);
	           

	            String expected = "[4, 3, 5]";
	            
	            if(rbt.root.toString().equals(expected))
	            {
	            	System.out.println(true);
	            	return;
	            }
	            System.out.println(false);
	    }

}
