
import java.util.*;


public class L6 
{
       public static void main(String[] args) 
       
       {
              //creating a array list of foods

 ArrayList <String> b= new ArrayList<>();

              b.add("Mango Juice");
              
              b.add("Pulau");

               b.add("Fried Rice");

               b.add("Biryani");

              b.add("Paratha");

                    
   //  sorting the arraylist with collection framework 

                Collections.sort(b);

                //  traversing through the list by using for each loop

                for (String Food : b) 
                {
                   System.out.println(Food);     
                }



                System.out.println("Sorting numbers are ");


                //creating a list of numbers 

                 ArrayList <Integer> a= new ArrayList<>();

              a.add(9);
                              a.add(12);

                                             a.add(45);

                                                            a.add(3);

                                                        a.add(1);


              // sorting the elements using collections.sort


              Collections.sort(a);

              for (Integer Number : a) 
              {
                  System.out.println(Number);       
              }
                
                
       }
}
