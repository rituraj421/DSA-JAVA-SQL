package PRACTICE.oReilly;

public class ch1 {

    // creating a dog class
    public class Dog{
        String breed;
        boolean hasOwner;
        int age;

        // creating a constrictor for the dog class
        public Dog(String dogBreed, boolean dogOwned, int dogYears){
            breed = dogBreed;
            hasOwner = dogOwned;
            age = dogYears;
        }
    }

    // creating methods for the dog class
    public void bark(){
        System.out.println("Woof!");
    }
    
    
}
