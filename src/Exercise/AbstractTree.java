/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

import java.util.Iterator;

/**
 *
 * @author BLANK
 */
public abstract class AbstractTree<E extends Comparable<E>> implements Tree<E>{
    @Override
    public void inorder(){}
    @Override
    public void postorder(){}
    @Override
    public void preorder(){}
    @Override
    public boolean isEmpty(){
        return getSize() == 0;
    }
    @Override
    public Iterator<E> iterator(){
        return null;
    }
}
