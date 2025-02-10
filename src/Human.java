class Human extends Animal {
    public Human(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Hello!");
    }

    public void think() {
        System.out.println(name + " is thinking deeply.");
    }
}
