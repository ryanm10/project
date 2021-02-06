import java.util.Scanner;

  class Main {
    public static void main(String[] args) 
    {
      Scanner scan = new Scanner(System.in);
      //Above line is apart of my scanner 
      System.out.println("What grade are you in (USA)");
      //Question asking the user what grade they are in based on USA grade scale, as some other countries could have different grades based on their age, like the UK for example.
      String grade = scan.next();
      //Getting the user input 
      System.out.println("Cool, now what is your age?");
      //Asking for their age, just asking for basic information 
      String age = scan.next();
      System.out.println("Last question, what's your name?");
      String name = scan.next(); 
      System.out.println("Hello! Just to confirm you are " + name + age + grade);



    }
  }

