package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.Queue;


public class LinkedQueue<E> implements Queue<E> {

    DLL<E> data = new DLL<E>();

    public LinkedQueue(){

    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {if(data.Size == 0){return true;} else {return false;}
    }

    @Override
    public void offer(E element) { if(element==null) return; this.data.addLast(element); }

    @Override
    public E peek() { return data.first(); }

    @Override
    public E poll() {
        return this.data.removeFirst();
    }

    @Override
    public void printQueue() {
        this.data.printList();
    }

    /*
    Transfers contents of stack into another stack
     */
    @Override
    public void transfer(Queue<E> into) {


        if(into == null){return;}

        into.reverse();

        while (isEmpty() != true){
            into.offer(poll());
        }

        into.reverse();

    }




    /*
    Reverses the contents of the stack
     */
    public void reverse() {

       LinkedStack<E> temp = new LinkedStack<>();

       while(isEmpty()!= true){
           temp.push(this.poll());
       }

       while(temp.isEmpty() != true){
           this.offer(temp.pop());
       }

    }


    /*
    Merges stacks taking from one stack and merging it into this stack
     */
    public void merge(Queue from) {

        if(from == null) {
            return;
        }

        while(from.isEmpty() != true){
            this.offer((E) from.poll());
        }

    }
}
