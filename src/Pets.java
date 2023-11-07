import java.util.Scanner;

public class Pets extends Animal{
    public Pets(String name, String type) {
        super(name, type);
    }

    public Pets(String name, int age, String breed)
    {
        super(name, age);
    }

    @Override
    public void trainNewCommand() {

    }

}
class Dog extends Pets {
    public Dog(String name) {
        super(name, "Собака");
    }

    public Dog(String name, int age, String breed) {
        super(name, age, breed);

    }

    @Override
    public void trainNewCommand() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите новую команду для собаки " + getName() + ":");
        String newCommand = scanner.nextLine();

        addCommand(newCommand);
        System.out.println("Новая команда успешно добавлена.");
    }
}

class Cat extends Pets {
    public Cat(String name) {
        super(name, "Кошка");
    }

    public Cat(String name, int age, String breed) {
        super(name, age, breed);

    }
    @Override
    public void trainNewCommand() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите новую команду для собаки " + getName() + ":");
        String newCommand = scanner.nextLine();

        addCommand(newCommand);
        System.out.println("Новая команда успешно добавлена.");
    }
}

class Hamster extends Pets {
    public Hamster(String name) {
        super(name, "Хомяк");
    }


    @Override
    public void trainNewCommand() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите новую команду для собаки " + getName() + ":");
        String newCommand = scanner.nextLine();

        addCommand(newCommand);
        System.out.println("Новая команда успешно добавлена.");
    }
}