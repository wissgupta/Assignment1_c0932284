Name: Tarun Gupta
Id: c0932284

# Assignment1_c0932284
assignment_1

**Description**

  1.Dog Class
--> Represents a dog with two attributes: name and age.
--> Contains a constructor for initialization and getter and setter methods for both attributes.

  2.Person Class
--> Represents a person who may or may not own a dog and uses Optional<Dog> to handle cases where the person has no dog.
--> hasOldDog(): Checks if the person has a dog that is at least 10 years old.
--> changeDogsName(): Attempts to change the dog's name, but throws an exception if the person has no dog.

  3.Main Class
--> Demonstrates handling a missing dog with an exception.
--> Creates a Person without a dog and tries to change the dog's name, which results in an exception.

  4.DogTest Class
--> Test Dog Creation.
--> Test Changing Dog's Name.

  5.PersonTest Class
--> Test Person Without Dog.
--> Test Person With Dog.
--> Checking for Old Dog
--> Changing Dog's Name
--> Exception when Changing Name Without Dog


**Instructions to run code**

Step 1: clone the repository

--> git clone git@github.com:wissgupta/Assignment1_c0932284.git

Step 2: Open cloned folder in intellijIdea

--> Ensure the JDK is correctly set up:
--> Go to File > Project Structure > Project.
--> Set Project SDK to JDK 17 (or your installed version).

Step 3: Run the Main Program

--> navigate to src/main/java/assignment/Main.java
--> run the main class

Step 4: Run Unit Tests

--> navigate to src/test/java/assignment/
--> Click Run 'DogTest' and Run 'PersonTest'
