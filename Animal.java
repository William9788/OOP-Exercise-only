class Animal {
void makeSound() {
System.out.println("Some generic animal sound");
}
}
class Dog extends Animal {
void makeSound() {
System.out.println("Woof");
}
void fetch() {
System.out.println("Dog fetches the ball!");
}
public static void main(String[] args) {
Dog dog = new Dog();
Animal animalReference = dog;//Upcast it to animal
animalReference.makeSound();
//animalReference.fetch(); 
// Output Undefine value!
if(animalReference instanceof Dog){
    Dog dogReference = (Dog) animalReference;
    dogReference.fetch();
}
else{
System.err.println("Not a Dog,Cant downcast!");
}
//Not Safe Casting Example
animalReference = new Animal();
Dog wrongReference = (Dog) animalReference;
wrongReference.fetch();//Not Executed
}
/*
 * • Create an Animal reference that points to a Puppy object.
• Then downcast that Animal reference back to a Dog, and then again to a
Puppy.
• Call one method from each level and see the output:
• From Animal - call the makeSound() method.
• From Dog - call the fetch() method.
• From Puppy - call the play() method.
 */
class Puppy extends Dog{
void play() {
System.out.println ("Puppy is playing!");
}
}
}
