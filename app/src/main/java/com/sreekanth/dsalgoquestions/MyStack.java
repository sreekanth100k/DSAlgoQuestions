package com.sreekanth.dsalgoquestions;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.lang.String;

public class MyStack {
    public PriorityQueue<String> myQueue1;
    public PriorityQueue<String> myQueue2;

    MyStack(){

        myQueue1 = new PriorityQueue<String>();
        myQueue2 = new PriorityQueue<String>();
    }

    public java.lang.String pop(){
        //Own pop implementation
        java.lang.String removedItem = myQueue1.remove();
        return (String) removedItem;
    }

    //Own push implementation
    public void push(java.lang.String iInput){
            //push into Q2
            myQueue2.add(iInput);

            do {
                String removedString = myQueue1.remove();
                myQueue1.add(removedString);
            }while (myQueue2.size()!=0);

            //Swap the values in the 2 queues...

            PriorityQueue<String> temp = new PriorityQueue<>();
            temp.addAll(myQueue1);
            myQueue1.addAll(myQueue2);
            myQueue2.addAll(temp);


        System.out.println("After push --> Queue1"+myQueue1);
        System.out.println("After push --> Queue2"+myQueue2);



    }
}
