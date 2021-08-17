/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_application;
import java.util.*;


public class BookSet <T extends Book>   {
    
    private TreeSet<T> set;
    
    
    public BookSet(){
        set = new TreeSet<>();
    
    }
    
   
    @Override
    public String toString(){
        return set.toString();
    
    }
    
    
    public void add(T t){
        set.add(t);
    }
    
    public void remove(T t){
        set.remove(t);
    }
    
    
    
     public T getMax(){ 
      return set.last();
     
     }
   
    
    public T getMin(){
      return set.first();
    
     }
    
    
    
    
    
   public Double getAverage(){
       double sum = 0;
       int count = 0;
       double average = 0;
     
      Iterator<T> itr = set.iterator();
        while (itr.hasNext()){
             sum += itr.next().getPrice();
            count++;
         }
        
       average = sum/count;
        
        return average;
    }

}


