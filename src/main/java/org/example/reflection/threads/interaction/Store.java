package org.example.reflection.threads.interaction;

import java.util.Stack;

public class Store {
    private Stack <Product> products=new Stack<>();

    public synchronized void put (Product product){
        if (products.size()>3){
            try {
                wait();
            } catch (InterruptedException e){
                e.getStackTrace();
            }
        }
        products.push(product);
        notifyAll();
    }
    public synchronized Product get(){
        if (products.isEmpty()){
            try {
                wait();
            }catch (InterruptedException e){
                e.getStackTrace();
            }
        }
        notifyAll();
        return products.pop();
    }
    public synchronized boolean hasNext (){
        return !products.isEmpty();
    }
}
