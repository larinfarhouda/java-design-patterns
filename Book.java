
package book_application;

    public abstract class Book implements  Comparable<Book>{
     private String title;
    private String author;
    private double price;
    
    public Book(){
        
    }
    
    public Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        setPrice(price);  
    }
    
    public void setTitle(String title){
      this.title = title;  
    }
    public String getTitle(){ 
      return title;  
    }
    
    public void setAuthor(String author){
      this.author = author;  
    }
    public String getAuthor(){ 
      return author;  
    }
    
    public void setPrice(double price){
      if (price>=0.0)
        this.price = price;
      else throw new IllegalArgumentException ("Price is invalid");
    }
    
    public double getPrice(){ 
      return price;  
    }

    @Override
    public String toString() {
        return String.format("‘Title: %s, Author: %s, Price: %f $'",title,author,price);
    }
    
        
  
     
     
          @Override
     public int compareTo(Book bpr){
         return (int)(this.price - bpr.price);
     }

    
}
