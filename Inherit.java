public class Inherit {
    public static void  main(String ar[]){
        child obj=new child();
        obj.method1();
        obj.method2();
        obj.method3();
         obj.method4();
    }
    
}
class grantgrantparent{
    void method4(){
        System.out.println("Grantgrantparent");
    }
}
class grantparent extends grantgrantparent{
    void method3(){
    System.out.println("Grantparent");
}}
class parent extends grantparent{
   void  method2(){
    System.out.println("parent");
   }
}
class child extends parent{
    void method1(){
        System.out.println("child");
    }
}
