//My project - If the user themself is in middle or high school, it will give them a suggestion on what math class they should be in right now.
//If they are in middle school, Algebra will be required, however if they are in high school it will say Calculus or Geometry will be required for them.
import java.util.Scanner;
//Imported scanner **MUST**

  class Main {
    public static void main(String[] args) 
    {
      Scanner scan = new Scanner(System.in);
      //Above line is apart of my scanner 
      System.out.println("Are you in middle or high school?");
      //Question asking the user what grade they are in based on USA grade scale, as some other countries could have different grades based on their age, like the UK for example.
      String userGrade = scan.next();
      System.out.println("Hello! Just to confirm you are " + userGrade);
      String output = grade(userGrade);
      System.out.println(output);
      String output2 = checkAge(yourAge);
      System.out.println(output2);
      //This is printing their confirmation and the information that they gave. As the code is requesting the user for their name, age and grade,it will print that in which the user is pretty much confirming it.
      //
    }
      //Method 1:
      static String grade(String grade){
        System.out.println(grade);
        if (grade.equals("middle")){
          return("You're better in Algebra");
        }else if (grade.equals("high")){
          return("You are better off in Calc or Geometry as you're in high school");
        }else return("Incorrect, try again");
} 
        //Method 2:
        static String checkAge(String yourAge){
          System.out.println(yourAge);
          if (yourAge.equals)
        }
  }

    
    

