
import java.util.*;



class Student
{
       int roll;

       String name;

       int age;

       Student(int age, String name, int roll)
       {
              this.age= age;

              this.roll=roll;

              this.name=name;
       }
}





public class L8 
{
       /**
        * @param args
        */
       public static void main(String[] args) 
       {
            
              Student s1= new Student(20, "Subham", 3);

              Student s2= new Student(22, "Swarnodip", 6);

              Student s3= new Student(21, "Suraj", 10);



              // creating an arraylist 
              
              ArrayList <Student> al= new ArrayList<>();

              al.add(s1);

              al.add(s2);

              al.add(s3);

               Iterator itr=  al.iterator();

           while(itr.hasNext())
           {
              String st= (String)itr.next();

              System.out.println(st);

       



           }







            
       }
}
