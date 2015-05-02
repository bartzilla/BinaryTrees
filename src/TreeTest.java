// Binary tree test program.
import com.binarytree.Tree;

import java.util.Random;

public class TreeTest
{
    public static void main( String[] args )
    {
        Tree<Integer> tree = new Tree<>();
        int value;
        Random randomNumber = new Random();

        System.out.println( "Inserting the following values: " );

        // insert 10 random integers from 0-99 in tree
        for ( int i = 1; i <= 10; i++ )
        {
            value = randomNumber.nextInt( 100 );
            System.out.printf( "%d ", value );
            tree.insertNode( value );
        } // end for

        System.out.println ( "\n\nPreorder traversal" );
        tree.preorderTraversal(); // perform preorder traversal of tree

        System.out.println ( "\n\nInorder traversal" );
        tree.inorderTraversal(); // perform inorder traversal of tree

        System.out.println ( "\n\nPostorder traversal" );
        tree.postorderTraversal(); // perform postorder traversal of tree
        System.out.println();
    } // end main
} // end class TreeTest

