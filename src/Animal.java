abstract public class Animal {
    private String name;

    public Animal(String name){
        this.name=name;
    }
    public abstract void sound();

    public String getName() {
        return name;
    }
}

interface Domestic {
    public abstract void run();

}

class Dog extends Animal implements Domestic {

    public Dog(String name){
        super(name);

    }

    public void sound(){
        System.out.println(getName()+" "+ "says:Woof!");

    }
    public void run(){
        System.out.println(getName()+ " "+ "run slow");
    }
    void eat(){
        System.out.println(getName()+ " "+ "eating biscuits");
    }
}
class Cat extends Animal implements Domestic{
    public Cat(String name) {
        super(name);
    }

    public void sound(){
        System.out.println(getName()+ " "+ "says: meow!");
    }
    public void run(){
        System.out.println(getName()+ " "+ "run fast");
    }
    void eat(){
        System.out.println(getName()+ " "+ "drinking milk");
    }

    public static void main(String[] args) {
        Cat c1  = new Cat("Bokya");
        c1.sound();
        c1.eat();
        c1.run();

        Dog d1 = new Dog("Duggu");
        d1.eat();
        d1.sound();
        d1.run();

    }
}
