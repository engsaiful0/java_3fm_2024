public class MainMehtod {
    public static void main(String[] args) {
        // Create an instance of the Method class
        Method method = new Method();

        // Calling the displayMessage method
        method.displayMessage();

        // Calling the add method and storing the return value
        int sum = method.add(5, 10);
        System.out.println("Sum: " + sum);
    }
}
