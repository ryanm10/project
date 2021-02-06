//My project - If the user themself is in middle or high school, it will give them a suggestion on what math class they should be in right now, and it will also determine if they are in grade school or not.

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
      //Confirmation that that is what grade school you are in
      String output = grade(userGrade);
      System.out.println(output);
      //Method 1 output
      System.out.println("How old are you?");
      //Asking the user for how old they are, just out of curiousity, and for the method to determine if they are in grade school or not.
      String yourAge = scan.next();
      //Checking it and scanning
      String output2 = checkAge(yourAge);
      //New output for method 2.
      System.out.println(output2);
      //This is printing their confirmation and the information that they gave. As the code is requesting the user for their name, age and grade,it will print that in which the user is pretty much confirming it.
      //
    }
      //Method 1:
      static String grade(String grade){
        System.out.println(grade);
        if (grade.equals("middle")){
          //If the user submits middle short for middle school, it will then give what math class they would be better of taking.
          return("You're better in Algebra");
          //States Algebra as Algebra is middle school level, or pre high-schoool work.
        }else if (grade.equals("high")){
          return("You are better off in Calc or Geometry as you're in high school");
          //If you're in high school, it will print calc or geometry as those are the most important math classes that one take's in high school.
        }else return("Incorrect, try again");
        //If you don't enter anything or something that's not "middle" or "high", you will get this.
} 
        //Method 2:
        static String checkAge(String yourAge){
          //String for yourAge
          System.out.println(yourAge);
          //Printing
          int age = Integer.parseInt(yourAge);
          //Converting to integer
          if (age <= 18){
            //If YOU ARE LESS THAN 18
            return("You're still in grade school");
            //When you're less than 18, you're 99% likely still in grade school.
          }else if (age > 18){
            //When you're over 18, you're about to graduate soon, or you're in college or graduated both and work a 9-5.
            return("You are more than likely in college or older");
            //Prints what is stated above
          }else return("What's wrong with you?");
          //Just something little funny in case they don't put a number.
        }
  }

    
    

