public class Dog extends Animal  {
    public Dog() {
        System.out.println("Now I am a Dog!");
    }

    @Override
    public String sleep() {
        return super.sleep();
    }

    @Override
    public String eat() {
        return super.eat();
    }
    public String test() {
        return "testttt...";
    }

    @Override
    public String toString() {
        return "Dog{} " + super.toString();
    }
}
