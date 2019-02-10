package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.RedBlueDoubleStack;

public class RedBlueDoubleStackImpl<E> implements RedBlueDoubleStack<E> {
    
    LinkedStack<E> Red = new LinkedStack<>();
    LinkedStack<E> Blue = new LinkedStack<>();
    
    
    @Override
    public void pushRed(Object element) {
        Red.push((E)element);
    }

    @Override
    public void pushBlue(Object element) {
        Blue.push((E) element);

    }

    @Override
    public E popRed() {
        return Red.pop();
    }

    @Override
    public E popBlue() {
        return Blue.pop();
    }

    @Override
    public E peekRed() {
        return Red.peek();
    }

    @Override
    public E peekBlue() {
        return Blue.peek();
    }

    @Override
    public int sizeBlue() {
        return Blue.size();
    }

    @Override
    public int sizeRed() {
        return Red.size();
    }

    @Override
    public boolean isBlueEmpty() {
        return Blue.isEmpty();
    }

    @Override
    public boolean isRedEmpty() {
        return Red.isEmpty();
    }
}
