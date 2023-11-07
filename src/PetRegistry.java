import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


abstract class Animal {
    private int id;
    private String name;
    private String type;
    private int birthDay;
    private List<String> commands;

    private static int totalCount = 0;

    public Animal(String name, int age) {
        // ...
        totalCount++;
    }

    public static int getTotalCount() {
        return totalCount;
    }
    public Animal(String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.birthDay = birthDay;
        this.commands = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public void showCommands() {
        if (commands.isEmpty()) {
            System.out.println("Животное не знает никаких команд.");
        } else {
            System.out.println("Список команд для животного " + getName() + ":");
            for (String command : commands) {
                System.out.println("- " + command);
            }
        }
    }

    public abstract void trainNewCommand();
}






public class PetRegistry {
    private List<Animal> animalList;

    public PetRegistry() {
        animalList = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
        System.out.println(animal.getType() + " " + animal.getName() + " добавлен(а) в реестр под номером" + "ID" +
                animal.getId());
    }

    public void listAnimalsByBirthdate() {
        if (animalList.isEmpty()) {
            System.out.println("Реестр домашних животных пуст.");
        } else {
            System.out.println("Список животных по дате рождения:");

            // Сортировка животных по имени
            animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));

            for (Animal animal : animalList) {
                System.out.println(animal.getId() + " "+ animal.getType() + " " + animal.getName() + " " +
                        animal.getBirthDay());
            }
        }
    }

    public Animal[] getAnimalList() {
        return new Animal[0];
    }
}


