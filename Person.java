public class Person {
 private String name;
 private int age;
 private String address;

public Person(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
}

 //Method to display the person's details
 public void displayDetails() {
   System.out.println("name: " + name);
   System.out.println("Age: " + age);
   System.out.println("Address: " + address);

}

// a method that accepts a person object and calls displayDetails 
 
  public void myDetails(Person person) {
   person.displayDetails();

 }
  
 //a method to print current instance
public void printCurrentInstance() {
   myDetails(this);
}

public static void main(String[] args) {
   //create an object of Person with your details 

  Person person = new Person("Joanne Nyokabi", 19, "662 Kenyatta Avenue");

 //we use the object to call the printCurrentInstance method 

   person.printCurrentInstance(); 
}
}

