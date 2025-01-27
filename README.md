Name: Tarun Gupta
Id: c0932284

# Assignment1_c0932284
assignment_1

**Description**

[1pts] Create a class Dog that has the following members (attributes)
–
String name
Integer age
And only the following constructors
public Dog(String name, Integer age)
[2pts] Create a class Person that has the following members
String name
Integer age
Optional<Dog> dog
And has only the following constructors
public Person (String name, Integer age) //should call the below constructor
public Person (String name, Integer age, Dog dog)
and implements the following methods
[3pts]
public bool hasOldDog() {
//should return true IF Person has a Dog AND Dog.age >=10
//lose 1 point if you use an If statement
}
[3pts]
public void changeDogsName(String newName) {
//should change the Persons Dog’s name to the newName If the person has a Dog
//Or it should throw a RuntimeException(this.name + “ does not own a dog!”)
// if the person does not own a dog
//lose 1 point if you use an If statement
}
[3pts]
Create a Java application class (class with a main method) that
- Initializes a Person class without a dog
- Tries to change the person’s dogs name, catches the exception throw by changeDogsName()
and outputs “Unable to change dogs name“ + exception message
[8pts]
Write Unit tests for
Dog and Person Class
-Each unit tests must have at least assert
-Some method may require more than one test, e.x you would want to test changeDogsName on a person that has a dog, as well as a person that does not have a dog
*note Dog and Person should implement the standard Setters/Getters/Equals method

**Instructions to run code**

