/*  TJ Ross
    1/24/23
    Comp 167 Section: 004
    Description: The program reads from a CSV file and and stores it in book database. It demonstrates search methods
                    to receive specific sets of books
                
                
 */



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class clientProgram {
    public static void main(String[] args){
    
        String firstName;
        String lastName;
        String title1;
        int year1;
        String genre1;                  // Declaring variables
        String publisher1;
        double rating1;
        double price1;
        String path = "c:/Users/taylo/Desktop/dataset.csv";  // Where the file is located
        String line = "";
        BookDatabase bkDatabase = new BookDatabase();


        

        







        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            br.readLine();
            String line1 = null;
        
           

            while((line = br.readLine()) != null) { // Read data from CSV file
                String[] vals = line.split(",");
                
                    
                firstName = vals[0];
                lastName = vals[1];
                title1 = vals[2];
                year1 = Integer.parseInt(vals[3]);      //Extracting values from CSV file
                genre1 = vals[4];
                publisher1 = vals[5];
                rating1 = Double.parseDouble(vals[6]);
                price1 = Double.parseDouble(vals[7].substring(1));
                
                
               
                
                 // Searching for books by author, genre, and publication year
                Author author1 = new Author(firstName, lastName);
                Book book = new Book(author1, title1, year1, genre1, publisher1, rating1, price1);
                bkDatabase.addBook(book);
                

            }

                
                ArrayList<Book> author_search = bkDatabase.search(new Author("John", "Stewart"));
                ArrayList<Book> genre_search = bkDatabase.search("Anthologies");
                ArrayList<Book> year_search = bkDatabase.search(2009,2010);



                for (Book name : author_search) {
                    System.out.println(name.toString());        //Searches for the author a user is looking for
                }


                for(Book genre : genre_search) {
                    System.out.println(genre.toString());   // Searches for genre the user wants
                }


                for (Book year : year_search) {
                    System.out.println(year.toString());  //Searches for year the book was published depending on the user's input range
                }

              

                
                
                
                
               


            

           
                



                
                

            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }




        
    
    
    
    
    
    
  
    }
}



