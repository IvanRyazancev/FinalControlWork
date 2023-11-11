import java.util.*;
abstract class Animal {
    private int id;
    private String name;
    private String type;
    private int birthDay;
    protected List<String> commands;

    private static int totalCount = 0;

    public static int getTotalCount() {
        return totalCount;
    }

    public Animal(String name, String type, int birthDay) {
        this.id = totalCount++;
        this.name = name;
        this.type = type;
        this.birthDay = birthDay;
        this.commands = new ArrayList<>();
        // totalCount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = 0;

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
        System.out.println(animal.getType() + " " + animal.getName() + " добавлен(а) в реестр под номером" + " " +
                "ID:" + " " + animal.getId());
    }

    public void listAnimalsByBirthdate() {
        if (animalList.isEmpty()) {
            System.out.println("Реестр домашних животных пуст.");
        } else {
            System.out.println("Список животных по дате рождения:");

            Collections.sort(animalList, new Comparator<Animal>() {
                @Override
                public int compare(Animal o1, Animal o2) {
                    return o1.getBirthDay() - o2.getBirthDay();
                }
            });


            for (Animal animal : animalList) {
                System.out.println("ID: " + animal.getId() + " " + "Животное: " + animal.getType() + " По имени: "
                        + animal.getName() + " Возрастом " + animal.getBirthDay());
            }
        }
    }

    public List<Animal> getAnimalList() {

        return animalList;
    }
}


