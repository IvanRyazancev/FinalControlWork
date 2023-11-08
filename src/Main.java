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
            System.out.println("5. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            if (choice == 1) {
                System.out.println("Введите тип животного (домашнее - 1; дикое - 2):");
                String animalType = scanner.nextLine();

                if (animalType == "1") {
                    System.out.println("Введите вид животного (собака - 1; кошка - 2; хомяк - 3):");
                    String typeOfAnimal = scanner.nextLine();

                    System.out.println("Введите имя животного:");
                    String animalName = scanner.nextLine();

                    Pets pet;
                    if (typeOfAnimal == "1") {
                        pet = new Dog(animalName);
                    } else if (typeOfAnimal == "2") {
                        pet = new Cat(animalName);
                    } else if (typeOfAnimal == "3") {
                        pet = new Hamster(animalName);
                    } else {
                        System.out.println("Неверный вид животного.");
                        continue;
                    }
                    registry.addAnimal(pet);
                } else {
                    System.out.println("Введите вид животного (лошадь - 1; верблюд - 2; осел - 3):");
                    String typeOfAnimal = scanner.nextLine();

                    System.out.println("Введите имя животного:");
                    String animalName = scanner.nextLine();

                    PackAnimals packAnimal;
                    if (typeOfAnimal == "1") {
                        packAnimal = new Horse(animalName);
                    } else if (typeOfAnimal == "2") {
                        packAnimal = new Camel(animalName);
                    } else if (typeOfAnimal == "3") {
                        packAnimal = new Donkey(animalName);
                    } else {
                        System.out.println("Неверный тип животного.");
                        continue;
                    }
                    registry.addAnimal(packAnimal);
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
                System.out.println("Программа завершена.");
                break;
            } else {
                System.out.println("Неверный выбор. Пожалуйста, введите правильный выбор.");
            }
        }
        System.out.println("Общее количество животных: " + Animal.getTotalCount());
        scanner.close();
    }
}