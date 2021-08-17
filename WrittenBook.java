
package book_application;

public class WrittenBook extends Book {
    private int npages;
    
    public WrittenBook(){}
    public WrittenBook(String title,String author,double price,int np){
        super(title,author,price);
        setnpages(np);
    }
    public void setnpages(int np){
        if (np>0)
            npages=np;
    }
    public int getnpages(){
        return npages;
    }
    
    
    
    
    public String toString(){
        return String.format("%s,Format: Written, number of pages: %d’\n", super.toString(),npages);
    }
    
 
}

