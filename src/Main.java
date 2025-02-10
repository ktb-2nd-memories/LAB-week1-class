public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Human human = new Human("Alice", 25);

        dog.makeSound();
        dog.move();
        dog.fetch();

        cat.makeSound();
        cat.move();
        cat.scratch();

        human.makeSound();
        human.move();
        human.think();
    }
}
