/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_application;
import java.util.*;


public  class BookList <T> {
    
    private static BookList BL = new BookList();
    
    private ArrayList<T> list;
    
    private BookList(){
        list = new ArrayList<T>();               
    }

    public static BookList getList() {
        return BL;
    }
    
    public void add(T t){
        list.add(t);
    }
    
    public void remove(T t){
        list.remove(t);
    }
    
    public static void displayList(){
        System.out.println(BL);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
