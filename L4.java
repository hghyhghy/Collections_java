
import java.util.*;


public class L4 
{
       //iterating in the list

       public static void main(String[] args)
        {
              

              // creating an object a in class ArrayList

              ArrayList <String> a= new ArrayList<>();

              a.add("Subham");
                              a.add("Souren");

                                             a.add("Sourendra");

                                                            a.add("Saikat");

                                                        a.add("Sagnik");

                    // travesting the list through iterator 
                    
                    
                Iterator itr= a.iterator();
                
                while(itr.hasNext())
                {
                     System.out.println(itr.next());
                }


       }
}
