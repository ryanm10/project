//Ryan Milton
//Feburary 1st 2021 
//Period 3 Programming Gaber

//Purpose of this program: You will be entering your current weight, and finding out your weight on the moon. This is so in case we someday travel to the moon you would have a rough estimate of what your weight would be. 

import java.util.Scanner;

class Main {

  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("What's your current weight on Earth?");
    int earthWeight = scan.nextInt();
    int moonWeight = scan.nextInt();

    int weight = getWeight(earthWeight, currentYear);
    System.out.println("your current weight is " + weight);

     //This is a method to calculate and identify your current weight

  static int getAge(int weight);
  {
    int weight = currentWeight;
    return weight;
  }
//The way this works is by returning the weight of your current weight so that you will then calculate your weight on the moon

  }
}
