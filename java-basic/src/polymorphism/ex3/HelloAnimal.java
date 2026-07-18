package polymorphism.ex3;

public class HelloAnimal extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("hello");
    }

    @Override
    public void move() {
        System.out.println("hello 이동");
    }
}
