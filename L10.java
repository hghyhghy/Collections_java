
import java.util.*;


class Book
{

       int id;

       String name, author, publisher;

       int quantity;

       public Book(int id, String name, String author, String publisher, int quantity)
       {
              this.id=id;

              this.name=name;

              this.author=author;

              this.publisher=publisher;

              this.quantity=quantity;
       }
}



public class L10 
{
       
    public static void main(String[] args) 
    
    {
       
       List<Book> list= new ArrayList<Book>();

       Book b1= new Book(234, "X-cursion", "Subham", "Subham pvt.ltd", 1);

              Book b2= new Book(239, "X-cursion-Part1", "Subham", "Subham pvt.ltd", 1);

                     Book b3= new Book(284, "X-cursion_Part2", "Subham", "Subham pvt.ltd", 1);


                     list.add(b1);

                                          list.add(b2);

                                                               list.add(b3);


                                                               // traversing the list

                               for(Book b:list)
                               {

                                   System.out.println(b.id +" " + b.name+" " + b.author + " "+ b.publisher+ " " +b.quantity );
                               }                                



    }

}
