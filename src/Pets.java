import java.util.ArrayList;
import java.util.Scanner;

public class Pets extends Animal {

    public Pets(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    public void trainNewCommand() {

    }

}

class Dog extends Pets {

    public Dog(String name, int age) {
        super(name, "Собака", age);

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
    public Cat(String name, int age) {
        super(name, "Кошка", age);

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
    public Hamster(String name, int age) {
        super(name, "Хомяк", age);

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