package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.Deque;

public class LinkedDeque<E> extends LinkedQueue<E> implements Deque<E>{


    @Override
    public E peekLast() {
       return data.last();
    }

    @Override
    public void offerFirst(E element) {

        if(element == null){return;}

        this.data.addFirst(element);


    }

    @Override
    public E pollLast() {
        if(isEmpty()){return null;}

        return this.data.removeLast();
    }
}
