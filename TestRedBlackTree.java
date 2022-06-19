// Name: Tom Rosen
// Email: trrosen @wisc.edu 


import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Stack;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestRedBlackTree {
	
    /**
     * Test to make sure the Red Black Tree rotates correctly when the parent node is the root of
     * the tree.
     * 
     */
    @Test
    public void testInsertRootBalance()
    {
            RedBlackTree<Integer> rbt = new RedBlackTree<>();
            rbt.insert(5);
            rbt.insert(3);

            rbt.insert(4);
           

            String expected = "[4, 3, 5]";
            
            assertEquals(rbt.root.toString(), expected);
    }
    
    /**
     * -- JUNIT TEST --
     * Test to ensure that the root node is black.
     * 
     */
    @Test
    public void testInsertRootColor()
    {
            RedBlackTree<Integer> rbt = new RedBlackTree<>();
            rbt.insert(4);
            boolean color = rbt.root.isBlack;
            
            assertTrue(color);
    }
    
    /**
     *-- JUNIT TEST --
     * Test to make sure the Red Black Tree rotates left correctly.
     * 
     */
    @Test
    public void testInsertCase1()
    {
            RedBlackTree<Integer> rbt = new RedBlackTree<>();
            rbt.insert(5);
            rbt.insert(4);
            rbt.insert(9);
            rbt.insert(3);
            rbt.insert(1);
            String expected = "[5, 3, 9, 1, 4]";
            assertEquals(rbt.root.toString(), expected);
    }
    
    /**
     * -- JUNIT TEST --
     * Test to ensure that the case two is properly followed on the left hand of the tree
     * 
     */
    @Test
    public void testInsertCase2()
    {
            RedBlackTree<Integer> rbt = new RedBlackTree<>();
            rbt.insert(8);
            rbt.insert(5);
            rbt.insert(10);
            rbt.insert(3);
            rbt.insert(4);
            String expected = "[8, 4, 10, 3, 5]";
            assertEquals(rbt.root.toString(), expected);
    }
    
    /**
     * -- JUNIT TEST --
     * Test to ensure that the case two is properly followed on the right hand of the tree
     * 
     */
    @Test
    public void testInsertCase2Right()
    {
            RedBlackTree<Integer> rbt = new RedBlackTree<>();
            rbt.insert(8);
            rbt.insert(5);
            rbt.insert(12);
            rbt.insert(10);
            rbt.insert(11);
            String expected = "[8, 5, 11, 10, 12]";
            assertEquals(rbt.root.toString(), expected);
    }
    
    /**
     * -- JUNIT TEST --
     * Test to ensure that the case three is properly followed in the tree
     * 
     */
    @Test
    public void testInsertCase3()
    {
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
        
        assertTrue(overall);
    }

}
