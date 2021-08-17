package book_application;

import java.util.ArrayList;
import java.io.*;
import java.util.Collections;
import java.util.*;
import java.util.Scanner;
public class Book_Application {

    
    
    public static void main(String[] args) throws Exception {
        
        
         Scanner input = new Scanner(System.in);
        int num;
        BookList bookList = BookList.getList();
        Bookfactory Bookfactory = new Bookfactory();
        BookSet<WrittenBook> WBSet = new BookSet<>();
        BookSet<AudioBook> ABSet = new BookSet<>();
        File f = new File("WrittenBooksInfo.txt");
        File f2 = new File("AudioBookInfo.txt");
        
        do{
       
        System.out.println("+---------------------+");
        System.out.println("|        welcome       |");
        System.out.println("+---------------------+");
        
        System.out.println("");
        System.out.println(" please make a selection :");
       
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("| 1. display contents of Book List");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("| 2. add a new written book");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("| 3. add a new audio book");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("| 4. add a new pair book");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("| 5. store written book objects in a file");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("| 6. store audio book objects in a file");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("| 7. display written book statistics");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("| 8. display audio book statistics");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("| 9. Exit");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            num = input.nextInt();
            
        
        
        
        switch(num){

            case 1:
                
                System.out.println("Contents of Book List");

                 BookList.displayList();
                         
                break;
                
            case 2:
              
                    WrittenBook wb = (WrittenBook) Bookfactory.creatBook("written");
                   
                    System.out.println("Enter the title of the written book ");
                    String wbT = input.next();
                    System.out.println("Enter the author of the written book");
                    String wbA = input.next();
                    System.out.println("Enter the price of the written book :");
                    double wbp = input.nextInt();
                    System.out.println("Enter the number of pages of the written book");
                    int wbn = input.nextInt();
                    
                    wb.setTitle(wbT);
                    wb.setAuthor(wbA);
                    wb.setPrice(wbp);
                    wb.setnpages(wbn);
                    
                    WBSet.add(wb);
                    bookList.add(wb);
                    
                    break;
                    
            case 3 :
                
                    
                    AudioBook ab = (AudioBook) Bookfactory.creatBook("audio");
               
                    System.out.println("Enter the title of the audio book ");
                    String abT = input.next();
                    System.out.println("Enter the author of the audio book");
                    String abA = input.next();
                    System.out.println("Enter the price of the audio book :");
                    double abp = input.nextInt();
                    System.out.println("Enter the duration of the audio book");
                    double abd = input.nextInt();
                    System.out.println("Enter the narrator for the audio book");
                    String abn = input.next();
                    
                    
                    ab.setTitle(abT);
                    ab.setAuthor(abA);
                    ab.setPrice(abp);
                    ab.setduration(abd);
                    ab.setnarrator(abn);
                    
                    
                    ABSet.add(ab);
                    bookList.add(ab);
                   
                    break;
                    
            case 4:
                
                    BookPair BP = new BookPair();
                    System.out.println("Enter the title of the book ");
                    String BPT = input.next();
                    System.out.println("Enter the author of the book");
                    String BPA = input.next();
                    System.out.println("Enter the price of the book :");
                    double BPp = input.nextInt();
                    System.out.println("Enter the number of pages of the book");
                    int BPn = input.nextInt();
                    System.out.println("Enter the duration of the book");
                    double BPd = input.nextInt();
                    System.out.println("Enter the narrator for the book");
                    String BPN = input.next();
                    
                    
                    BP.setTitle(BPT);
                    BP.setAuthor(BPA);
                    BP.setPrice(BPp);
                    BP.setnpages(BPn);
                    BP.setduration(BPd);
                    BP.setnarrator(BPN);
                    
                    bookList.add(BP);
                   
                   break; 
                   
            case 5:
                
                   PrintWriter P=new PrintWriter(f);
                   P.print(WBSet);
                   P.close();
                   break; 
                   
            case 6:
                   PrintWriter P1=new PrintWriter(f2);
                   P1.print(ABSet);
                   P1.close();break;
                   
            case 7: 
                   System.out.println("Written book info that has Maximum price : " + WBSet.getMax());
                   System.out.println("Written book info that has Minimum price : " + WBSet.getMin());
                   System.out.println("Average prices for written books : " + WBSet.getAverage());
                     
                break;
                
            case 8: 
                
                    System.out.println("Audio book info that has Maximum price : " + ABSet.getMax());
                    System.out.println("Audio book info that has Minimum price : " + ABSet.getMin());
                    System.out.println("Average prices for Audio books : " + ABSet.getAverage());
                
                break;    
                
                
            case 9: 
                System.exit(0);
         }
        
        } while(0<num && num<10);
      }
    }

   
    