
package book_application;



public class Bookfactory {
    
    
    
    public Book creatBook (String book){
        
        if(book == null){
         return null;
      }
        
         if(book.equalsIgnoreCase("written")){
         return new WrittenBook();}
         
       else if(book.equalsIgnoreCase("audio")){
         return new AudioBook();}
         
    return null;
}
    
}
