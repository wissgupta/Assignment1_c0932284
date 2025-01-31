package assignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Optional;

public class DogTest {
    @Test
    public void testDogCreation() {
        Dog dog = new Dog("Ramu", 5);
        assertEquals("Ramu", dog.getName());
        assertEquals(5, dog.getAge());
    }

    @Test
    public void testSetDogName() {
        Dog dog = new Dog("Ramu", 5);
        dog.setName("Prem");
        assertEquals("Prem", dog.getName());
    }
}
