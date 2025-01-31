package assignment;

public class Main {
    public static void main(String[] args) {
        Person personWithoutDog = new Person("Tarun", 30);

        try {
            personWithoutDog.changeDogsName("Ramu");
        } catch (RuntimeException e) {
            System.out.println("Not able to change dog's name: " + e.getMessage());
        }
    }
}
