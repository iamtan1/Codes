//2.Write a Java switch case program to take the students names and attendance % of 10 students as input and display their grades according to the below conditions:
//  * If attendance above 90 then “A” 
//  * If attendance between 90-80 then “B” 
//  * If attendance between 80-70 then “C” 
//  * If attendance between 70-60 then “D” 
//  * If attendance between 45-60 then “E”
// Anju Prakash Prajapati3:26 PM
// 1.WAP to find the sum of the odd numbers between 7 to 21 using for loop.Display the odd numbers and print the sum as an output.
// 2.Write a Java switch case program to take the students names and attendance % of 10 students as input and display their grades according to the below conditions:
//  * If attendance above 90 then “A” 
//  * If attendance between 90-80 then “B” 
//  * If attendance between 80-70 then “C” 
//  * If attendance between 70-60 then “D” 
//  * If attendance between 45-60 then “E”


public class studentgrades {
   
   public static String Gradefind(int score) {
      // check score is within 0-100 or not
      if(score < 0 || score > 100)
         return "iThis is an invalid score"; // exception
      
      // switch-case
      switch(score/10) {
        // for >= 90
        case 10:
        case 9:
           return "A";
        // for >= 80 and <90
        case 8:
           return "B";
        // for >= 70 and <80
        case 7:
           return "C";
        // for >= 60 and <70
        case 6:
           return "D";
        // for >= 50 and <60
        case 5:
           return "E";
        // for < 50
        default:
           return "F";
      }
   }

   public static void main(String[] args) {
    //   // Creating  Scanner class object to get input value
      // Scanner sc = new Scanner(System.in);
      
      // taking input for score
      System.out.print("Enter score value: ");
       int score = 70;
      
      // finding the grade and displaying the result
      System.out.println("Grade = " + Gradefind(score));
      
      // closeing the Scanner 
    //   sc.close();
   }

}