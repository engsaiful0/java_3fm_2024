public class OverriddingMain {
    public static void main(String[] args) {
        // Creating instances of Animal, Dog, and Cat
        AnimalOverridding animal = new AnimalOverridding();
        DogOverridding dog = new DogOverridding(); // Polymorphism: Dog is treated as Animal
        CatOverridding cat = new CatOverridding(); // Polymorphism: Cat is treated as Animal

        // Calling the overridden methods
        animal.sound();  // Output: The animal makes a sound
        dog.sound();     // Output: The dog barks
        cat.sound();     // Output: The cat meows
    }
}
