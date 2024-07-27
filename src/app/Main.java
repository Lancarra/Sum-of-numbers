package app;

public class Main {

    static  int value = 1;  // Initial value
    static  int sum = 0;    // Variable for storing the amount

    public static void main(String[] args) {

        // Loop for calculating the incremental amount from value to 6
        for (int i = value; i <= 6; i++) {
            sum +=i;    // Add the current value of i to the sum
            // Print the current value and the incremental sum
            System.out.println(i + ") Number is " + i + ". Incremental sum: " + sum);
        }
        // Print the total amount after the end of the loop
        System.out.println("\n****************************************");
        System.out.println("\t\t\tTotal Sum: " + sum);
        System.out.println("****************************************");

    }
}