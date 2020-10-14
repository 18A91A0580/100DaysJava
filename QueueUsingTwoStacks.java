package queue;

import java.io.*;
import java.util.*;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
       Stack<Integer> st1=new Stack<>();
       Stack<Integer> st2=new Stack<>();
       Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            switch(n){
                case 1:
                    int val=sc.nextInt();
                    enqueue(st1,val);
                    break;
                case 2:
                    dequeue(st1,st2);
                    break;
                case 3:
                    print(st1,st2);
                    break;
            }
        }
    }
    static void enqueue(Stack<Integer> st1,int val){
        st1.push(val);
    }
    static void dequeue(Stack<Integer> st1,Stack<Integer> st2){
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            st2.pop();
        }
        else{
            st2.pop();
        }
    }
    static void print(Stack<Integer> st1,Stack<Integer> st2){
       if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            
        }
        
            System.out.println(st2.peek());

    }
}
