import java.util.*;


public class Col 

{
       public static void main(String[] args)
       
       {
          HashSet<String> h1= new HashSet<>();
          
          h1.add("One");
                    h1.add("two");
          h1.add("five");
          h1.add("six");
          h1.add("seven");
          h1.add("five");



          // using hashset we iterate 

          Iterator<String> i= h1.iterator();

          //iterator in hashset remove the duplicate string 

          while (i.hasNext())
           {
              
System.out.println(i.next());          }

       }
}
