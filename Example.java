import java.util.Scanner;
class Student_Details{
 int id;
 String name;
 Student_Details(int i,String n){
    id=i;
    name=n;
 }
 void display(){
    System.out.println(id+" "+name);
 }
}

public class Example{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
       int id=sc.nextInt();
       String name=sc.nextLine();
       Student_Details obj=new Student_Details(id,name);
       obj.display();    
        obj.display();    
        obj.display();    
        obj.display();  
                                                                                                                               
}
}