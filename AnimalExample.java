abstract class Animal{
    String kind;
    void breathe(){
        System.out.println("숨을 쉽니다.");
    }
    abstract void sound();
}

class Dog extends Animal{
    Dog(){
        this.kind = "포유류";
    }

    @Override
    void sound(){
        System.out.println("멍멍");
    }
}
class Cat extends Animal{
    Cat(){
        this.kind = "포유류";
    }

    @Override
    void sound(){
        System.out.println("야옹");
    }
}
public class AnimalExample {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.print(dog.getClass().getName()+"이 ");
        dog.breathe();
         System.out.print("울음소리 ");
        dog.sound();

        System.out.print(cat.getClass().getName()+"이 ");
        cat.breathe();
        System.out.print("울음소리 ");
        cat.sound();
    }
}