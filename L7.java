

import java.util.*;


public class L7 
{
    public static void main(String[] args)
    
    {
    
       // creating an object 0of b in   class  arratlist 


        ArrayList <String> b= new ArrayList<>();

              b.add("Mango Juice");
              
              b.add("Pulau");

               b.add("Fried Rice");

               b.add("Biryani");

              b.add("Paratha");

              // iterating through the loop using while loop

              ListIterator <String> list= b.listIterator(b.size());

              while(list.hasPrevious())
              {
                     String str= list.previous();

                     System.out.println(str);
              }

              // iterating through the loop using for loop

              for(int i=0;i<b.size();i++)
              {
                     System.out.println(b.get(i));
              }




    }       
}
