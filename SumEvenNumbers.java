public class SumEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;

        // While loop to calculate the sum of even numbers
        while (number <= 100) {
            if (number % 2 == 0) {
                sum += number;
            }
            number++; // Intentional error: Increment is missing
        }

        // Display the result
        System.out.println("The sum of all even numbers between 1 and 100 is: " + sum);
    }
}

