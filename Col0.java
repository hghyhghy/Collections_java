import java.util.*;

// java hashset from another collection 

public class Col0 

{
       public static void main(String[] args)
       
       {
             
                            // creating an object in ArrayList class



              ArrayList<String> s= new ArrayList<>();


              s.add("Sun");
              s.add("Earth");
              s.add("Venus");
              s.add("Jupiter");
              s.add("Mars");


              System.out.println("The New ArrayList is " + " " + s);


              // creating an object in hashset class

              HashSet<String> h1= new HashSet<>(s);


              //adding new element to hashset as  well as arraylist 


              h1.add("Moon");
                            h1.add("Saturn");
                            

                            //creating iterator object in class iterator


                            Iterator<String> i= h1.iterator();


                            while (i.hasNext())
                             {
                                 System.out.println(i.next());       
                            }



       }
}
