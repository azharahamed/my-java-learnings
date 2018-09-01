/* This program is to learn the execution flow and scope */
public class Egg {
  {System.out.println("outside the main 1 - Value of a : " + a);}
  static int a = 1;
  
  public Egg(){
    a = 4;
    System.out.println("Constructor without param! " + a);
  }
  
  public Egg(String name){
    System.out.println("Constructor with Param as "+ name +" | "+ a);
  }

  public static void main(String[] args){
    System.out.println("Inside Main - Value of a : "+ a);
    a = 2;
    Egg egg = new Egg();
    System.out.println("Inside Main - After the instance - Before instance withour Param  - Value of a : "+ a);
    Egg egg1 = new Egg("Azhar");
  }

  {a=3;System.out.println("outside the main 2 - Value of a : "+a);}

}