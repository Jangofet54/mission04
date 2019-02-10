package edu.isu.cs.cs3308.structures.impl;


import edu.isu.cs.cs3308.structures.Stack;

public class LinkedStack<E> {

    DLL<E> data = new DLL<>();


    
    public void push(E element) {
        if(element == null)return;
        data.addFirst(element);
    }

    public E peek() {
        if(isEmpty()){return null;}
        return data.first();
    }

    
    public E pop() {
        if(isEmpty()){return null;}
        return data.removeFirst();
    }

    
    public int size() {
        return data.size();
    }

    
    public boolean isEmpty() {
        return data.isEmpty();
    }



    /*
    Transfers the stack into another stack by pushing off the top of this stack onto the top of the next stack thus
    reversing the order of this stack at the top of the other
     */
    public void transfer(LinkedStack<E> to) {

        if(to == null){return;}

        while(isEmpty() != true){
            to.push(this.pop());
        }

    }

    /*
    Reverses Contents of this stack by transfering into a temp stack and then reversing the order of the temp stack
    and than setting the data of this stack equal to that other stack thus reversing the original order
     */
    public void reverse() {

        LinkedStack<E> temp = new LinkedStack<>();

        while(isEmpty() != true){

            this.transfer(temp);
        }

        this.data = temp.data;

    }

    /*
    Merges this stack and another stack by transfering into a temp than transfering the other into a temp and then
    reversing the temporary stack and setting the data of this stack equal to that temporary one.
     */
    public void merge(LinkedStack other) {

        LinkedStack<E> temp = new LinkedStack<>();
        this.transfer(temp);
        other.transfer(temp);
        other.reverse();
        this.data = temp.data;
    }

    
    public void printStack() {
        data.printList();
    }
}
