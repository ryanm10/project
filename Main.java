import java.util.Scanner;
//Imported scanner **MUST**

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
      //Getting the user input again
      System.out.println("Last question, what's your name?");
      //Asking for the user's name so that when they are in the "confirmation" screen, they will get a quick review of the information they had submitted.
      String name = scan.next();
      //User input 
      System.out.println("Hello! Just to confirm you are " + name + age + grade);
      //This is printing their confirmation and the information that they gave. As the code is requesting the user for their name, age and grade,it will print that in which the user is pretty much confirming it.



    }
  }

