package assignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Optional;

public class PersonTest {
    @Test
    public void testPersonWithoutDog() {
        Person person = new Person("Tarun", 30);
        assertEquals("Tarun", person.getName());
        assertEquals(30, person.getAge());
        assertTrue(person.getDog().isEmpty());
    }

    @Test
    public void testPersonWithDog() {
        Dog dog = new Dog("Ramu", 5);
        Person person = new Person("Tarun", 30, dog);
        assertEquals("Tarun", person.getName());
        assertEquals(30, person.getAge());
        assertEquals(Optional.of(dog), person.getDog());
    }

    @Test
    public void testHasOldDog() {
        Dog oldDog = new Dog("Mamu", 12);
        Person person = new Person("Ganga", 40, oldDog);
        assertTrue(person.hasOldDog());
    }

    @Test
    public void testChangeDogsName() {
        Dog dog = new Dog("Ramu", 5);
        Person person = new Person("Tarun", 30, dog);
        person.changeDogsName("Prem");
        assertEquals("Prem", person.getDog().get().getName());
    }

    @Test
    public void testChangeDogsNameThrowsException() {
        Person person = new Person("Tarun", 30);
        Exception exception = assertThrows(RuntimeException.class, () -> person.changeDogsName("Prem"));
        assertEquals("Tarun does not own a dog!", exception.getMessage());
    }
}
