import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PetRegistry registry = new PetRegistry();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить нового животного");
            System.out.println("2. Вывести список команд для животного");
            System.out.println("3. Обучить новой команде");
            System.out.println("4. Вывести список животных по дате рождения");
            System.out.println("5. Общее количество животных ");
            System.out.println("6. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            if (choice == 1) {
                System.out.println("Введите тип животного (домашнее - 1; вьючное - 2):");
                String animalType = scanner.nextLine();

                switch (animalType) {
                    case "1": {
                        System.out.println("Введите вид животного (собака - 1; кошка - 2; хомяк - 3):");
                        String typeOfAnimal = scanner.nextLine();

                        System.out.println("Введите имя животного:");
                        String animalName = scanner.nextLine();

                        System.out.println("Введите возраст животного:");
                        int age = scanner.nextInt();

                        Pets pet;
                        if (typeOfAnimal.equalsIgnoreCase("1")) {
                            pet = new Dog(animalName, age);
                        } else if (typeOfAnimal.equalsIgnoreCase("2")) {
                            pet = new Cat(animalName, age);
                        } else if (typeOfAnimal.equalsIgnoreCase("3")) {
                            pet = new Hamster(animalName, age);
                        } else {
                            System.out.println("Неверный вид животного.");
                            continue;
                        }
                        registry.addAnimal(pet);
                        break;
                    }

                    case "2": {
                        System.out.println("Введите вид животного (лошадь - 1; верблюд - 2; осел - 3):");
                        String typeOfAnimal = scanner.nextLine();

                        System.out.println("Введите имя животного:");
                        String animalName = scanner.nextLine();

                        System.out.println("Введите возраст животного:");
                        int age = scanner.nextInt();

                        PackAnimals packAnimal;
                        if (typeOfAnimal.equalsIgnoreCase("1")) {
                            packAnimal = new Horse(animalName, age);
                        } else if (typeOfAnimal.equalsIgnoreCase("2")) {
                            packAnimal = new Camel(animalName, age);
                        } else if (typeOfAnimal.equalsIgnoreCase("3")) {
                            packAnimal = new Donkey(animalName, age);
                        } else {
                            System.out.println("Неверный вид животного.");
                            continue;
                        }
                        registry.addAnimal(packAnimal);
                        break;
                    }

                    default:
                        System.out.println("Неверный тип животного.");
                        break;
                }
            } else if (choice == 2) {
                System.out.println("Введите имя животного:");
                String animalName = scanner.nextLine();

                Animal selectedAnimal = null;
                for (Animal animal : registry.getAnimalList()) {
                    if (animal.getName().equalsIgnoreCase(animalName)) {
                        selectedAnimal = animal;
                        break;
                    }
                }

                if (selectedAnimal != null) {
                    selectedAnimal.showCommands();
                } else {
                    System.out.println("Животное с таким именем не найдено в реестре.");
                }
            } else if (choice == 3) {
                System.out.println("Введите имя животного:");
                String animalName = scanner.nextLine();

                Animal selectedAnimal = null;
                for (Animal animal : registry.getAnimalList()) {
                    if (animal.getName().equalsIgnoreCase(animalName)) {
                        selectedAnimal = animal;
                        break;
                    }
                }

                if (selectedAnimal != null) {
                    selectedAnimal.trainNewCommand();
                } else {
                    System.out.println("Животное с таким именем не найдено в реестре.");
                }
            } else if (choice == 4) {
                registry.listAnimalsByBirthdate();
            } else if (choice == 5) {
                System.out.println("Общее количество животных: " + Animal.getTotalCount());
            } else if (choice == 6) {
                System.out.println("Программа завершена.");
                break;
            } else {
                System.out.println("Неверный выбор. Пожалуйста, введите правильный выбор.");
            }
        }
        scanner.close();
    }
}