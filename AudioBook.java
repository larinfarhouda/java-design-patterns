
package book_application;

public class AudioBook extends Book {
    private double duration;
    private String narrator;
    
    public AudioBook(){}
    public AudioBook(String title,String author,double price,int Duration,String Narrator){
        super(title,author,price);
        duration=Duration;
        narrator=Narrator;
    }
    public void setduration(double Duration){
        duration=Duration;
    }
    public double getduration(){
        return duration;
    }
    public void setnarrator(String Narrator){
        narrator=Narrator;
    }
    public String getnarrator(){
        return narrator;
    }
    
   
    public String toString(){
        return String.format("%s, Format: Audio, Duration: %f, Narrator: %s’\n", super.toString(),duration,narrator);
    } 
    
    
  
}
