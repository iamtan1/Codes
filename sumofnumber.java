//1.WAP to find the sum of the odd numbers between 7 to 21 using for loop.Display the odd numbers and print the sum as an output.

public class sumofnumber {
    public static void main(String[] args)
    {
        int sum =0 ; //initializing the value 0 in sum
        System.out.println("odd numbers between 7 and 21 are: ");
        for(int i=7;i<=21;i++){
            if(i%2!=0){       // it will check if the numbur id odd
                System.out.println(i);  //it will display the odd numbers
                sum=sum+i;  // will be adding the odd number to the sum
            }
        }
    }
}
