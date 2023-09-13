import java.util.*;


public class L9
{
       public static void main(String[] args) 
       
       {
              
             // creating a object al in class ArrayList

             ArrayList <String> al= new ArrayList<>();


             al.add("Pen");

             al.add("Pencil");

             al.add("Paper");

             al.add("Papaya");

             al.add("Pulse");


             System.out.println("The Elements are " + al);


             // removing an element from list using simple method


             al.remove("Pulse");


             System.out.println("The Elements are " + al);


             // removing elemrnt on basis of a position


             al.remove(0);

             System.out.println("The Elements are " + al);


             // removing element using lambda expressions 


             al.removeIf(str->str.contains("Papaya"));
             
             System.out.println("The Elements are " + al);


             //cheacking wheather a list is empty or not 


             System.out.println("Is the list Empty"+" " + al.isEmpty());


       }
}
