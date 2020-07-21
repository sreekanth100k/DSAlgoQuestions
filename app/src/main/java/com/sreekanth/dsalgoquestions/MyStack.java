package com.sreekanth.dsalgoquestions;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyStack<String> {
    public PriorityQueue<String> myQueue1;
    public PriorityQueue<String> myQueue2;

    MyStack(){

        myQueue1 = new PriorityQueue<String>();
        myQueue2 = new PriorityQueue<String>();
    }

    public java.lang.String pop(){
        //Own pop implementation
        if(!myQueue1.isEmpty()){
            //move n-1 elements to q2.. dequeue nth element..
            do{
                String removedElement = myQueue1.remove();
                myQueue2.add(removedElement);
            }while (myQueue1.size() == 1);
        }

        if(!myQueue2.isEmpty()){
            do{
                String removedElement = myQueue2.remove();
                myQueue1.add(removedElement);
            }while(myQueue2.size() == 1);
        }

        System.out.println("After pop --> Queue1"+myQueue1);
        System.out.println("After pop --> Queue2"+myQueue2);

        return "";
    }

    //Own push implementation
    public void push(String iInput){
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
