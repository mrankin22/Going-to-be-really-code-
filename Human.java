public class Human{ 
//  attributes

String name;
int age;
int height;

// Constructor

public Human (String name, int age, int height){
this.name = name;
this.age = age;
this.height = height;
}//end of Constructor
// Methods
public void speak(){
 System.out.println("Hi I am a new human");
 System.out.println("My name is " + name);
 System.out.println("I am " + age + " years old");
}//end of speak method
public void height(){
  System.out.println("I am " + height + " feet tall");
}



} //end of class