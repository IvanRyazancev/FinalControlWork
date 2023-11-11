import java.util.Scanner;

public class PackAnimals extends Animal {

    public PackAnimals(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    public void trainNewCommand() {

    }
}

class Horse extends PackAnimals {

    public Horse(String name, int age) {
        super(name, "Лошадь", age);
    }

    @Override
    public void trainNewCommand() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите новую команду для лошади " + getName() + ":");
        String newCommand = scanner.nextLine();

        addCommand(newCommand);
        System.out.println("Новая команда успешно добавлена.");
    }
}

class Camel extends PackAnimals {

    public Camel(String name, int age) {
        super(name,  "Верблюд", age);
    }

    @Override
    public void trainNewCommand() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите новую команду для верблюда " + getName() + ":");
        String newCommand = scanner.nextLine();

        addCommand(newCommand);
        System.out.println("Новая команда успешно добавлена.");
    }
}

class Donkey extends PackAnimals {
    public Donkey(String name, int age) {
        super(name,  "Осел", age);
    }

    @Override
    public void trainNewCommand() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите новую команду для осла " + getName() + ":");
        String newCommand = scanner.nextLine();

        addCommand(newCommand);
        System.out.println("Новая команда успешно добавлена.");
    }
}

