public class ClassHierarchy {
    public class Animal {
        // Поля и методы, общие для всех животных
    }

    public class Pets extends Animal {
        // Поля и методы, характерные для домашних животных
    }

    public class Dogs extends Pets {
        // Поля и методы, характерные для собак
    }

    public class Cats extends Pets {
        // Поля и методы, характерные для кошек
    }

    public class Hamsters extends Pets {
        // Поля и методы, характерные для хомяков
    }

    public class PackAnimals extends Animal {
        // Поля и методы, характерные для стадных животных
    }

    public class Horses extends PackAnimals {
        // Поля и методы, характерные для лошадей
    }

    public class Camels extends PackAnimals {
        // Поля и методы, характерные для верблюдов
    }

    public class Donkeys extends PackAnimals {
        // Поля и методы, характерные для ослов
    }
}
