public class MathOperationMain {

        public static void main(String[] args) {
            MathOperations math = new MathOperations();

            // Calls the method that adds two integers
            System.out.println("Sum of 2 and 3: " + math.add(2, 3));

            // Calls the method that adds three integers
            System.out.println("Sum of 1, 2, and 3: " + math.add(1, 2, 3));

            // Calls the method that adds two doubles
            System.out.println("Sum of 2.5 and 3.5: " + math.add(2.5, 3.5));

            // Calls the method that adds an array of integers
            int[] nums = {1, 2, 3, 4, 5};
            System.out.println("Sum of array: " + math.add(nums));
    }

}
