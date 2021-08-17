
package book_application;


public class BookPair {
    
    private WrittenBook written;
    private AudioBook audio;
    
    
    
    
    public BookPair(){
     
        written = new WrittenBook();
        audio = new AudioBook();
    }
    
    
    
    
     public void setTitle(String title){
      written.setTitle(title);
      audio.setTitle(title);
    }
  
    
    public void setAuthor(String author){
      written.setAuthor(author);
      audio.setAuthor(author);
    }
    
    
    public void setPrice(double price){
        written.setPrice(price);
        audio.setPrice(price);
    }
    
     public void setnpages(int np){
        written.setnpages(np);
    }
    
      public void setduration(double Duration){
        audio.setduration(Duration);
    }
      
      public void setnarrator(String Narrator){
        audio.setnarrator(Narrator);
    }
   
   
    
   
    
   
    public String toString(){
    
    return String.format("BOOK PAIR : \n ‘Title: %s, Author: %s, Price: %f $, number of pages: %d, Duration: %f, Narrator: %s’\n",
            written.getTitle(),written.getAuthor(),written.getPrice(),written.getnpages(),audio.getduration(),audio.getnarrator());
 }           
   
}
