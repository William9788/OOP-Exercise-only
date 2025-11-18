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
}