public class Main {

    public static void main(String[] args) {
        int toplam = 0; // I need to store the sum of the cubes of the even numbers

        // Let it go through the numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            // Let it select the even numbers.
            if (i % 2 == 0) {
                // If the number is even, cube it and add it to the sum
                toplam += i * i * i; 
            }
        }

        // Print the result to the screen
        System.out.println("The sum of the cubes of the even numbers from 1 to 20: " + toplam);
    }
}