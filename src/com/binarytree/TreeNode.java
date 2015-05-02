// Fig. 22.17: Tree.java
// TreeNode and Tree class declarations for a binary search tree.
package com.binarytree;

// class TreeNode definition
class TreeNode< T extends Comparable< T > >
{
    // package access members
    TreeNode< T > leftNode; // left node
    T data; // node value
    TreeNode< T > rightNode; // right node

    // constructor initializes data and makes this a leaf node
    public TreeNode( T nodeData )
    {
        data = nodeData;
        leftNode = rightNode = null; // node has no children
    } // end TreeNode constructor

    // locate insertion point and insert new node; ignore duplicate values
    public void insert( T insertValue )
    {
        // insert in left subtree
        if ( insertValue.compareTo( data ) < 0 )
        {
            // insert new TreeNode
            if ( leftNode == null )
                leftNode = new TreeNode< T >( insertValue );
            else // continue traversing left subtree recursively
                leftNode.insert( insertValue );
        } // end if
        // insert in right subtree
        else if ( insertValue.compareTo( data ) > 0 )
        {
            // insert new TreeNode
            if ( rightNode == null )
                rightNode = new TreeNode< T >( insertValue );
            else // continue traversing right subtree recursively
                rightNode.insert( insertValue );
        } // end else if
    } // end method insert
} // end class TreeNode


