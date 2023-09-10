import java.util.*;





public class Collection 

{
       

       public static void main(String[] args)
       
       
       {
              
          // creating hashset  using java collection framework

          HashSet<String>  h=new HashSet();

          h.add("Subham");
                    h.add("Suraj");
          h.add("Sukumar");
          h.add("Sunonda");
          h.add("Sunoyonita");

          Iterator<String> i= h.iterator();

          while (i.hasNext())
           {
                System.out.println(i.next());
          }





       }
}
