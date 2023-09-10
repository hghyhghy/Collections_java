import java.util.*;

public class Col1 

{
      public static void main(String[] args)
      
      {
         HashSet <String> h1= new HashSet<>();

          h1.add("One");
          h1.add("two");
          h1.add("five");
          h1.add("six");
          h1.add("seven");
          h1.add("nine");

          System.out.println("An initial list of the element is " + " " + h1);

          h1.add("zero");

        System.out.println("After adding a  list  this becomes  " + " " + h1);

          h1.remove("seven");



      System.out.println("An deleting a list it becomes  " + " " + h1);



      h1.removeAll(h1);

  System.out.println("An rmoving the list  it becomes  " + " " + h1);


  h1.retainAll(h1);


        System.out.println("An retain  all  in  a list it becomes  " + " " + h1);



        h1.clear();

              System.out.println("An invoking clear method  list  becomes  " + " " + h1);

      }       
}
