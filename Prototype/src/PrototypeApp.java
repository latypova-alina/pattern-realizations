/**
 * Created by alina on 10.06.17.
 */
public class PrototypeApp {
    public static void main(String[] args) {
        Human original = new Human("Vasya", 18);
        Human copy = (Human)original.copy();

        HumanFactory humanFactory = new HumanFactory(copy); //через фабрику, чтоб красиво было
        Human h1 = humanFactory.makeCopy();

        humanFactory.setPrototype(new Human("Alina", 20));
        Human h2 = humanFactory.makeCopy();

    }
}
interface Copyble{
    Object copy();
}

class Human implements Copyble{
    String name;
    int age;
    public Human(String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public Object copy() {
        Human human = new Human(name, age);
        return copy();
    }
}

class HumanFactory{ //сохраняем human а потом шлёпаем его
    Human human;

    public HumanFactory(Human human){
        setPrototype(human);
    }
    public void setPrototype(Human human){
        this.human = human;
    }
    Human makeCopy(){
        return (Human)human.copy();
    }
}
