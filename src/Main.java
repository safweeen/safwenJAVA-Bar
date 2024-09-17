//construction 5


class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructeur
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
}

class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    // Constructeur
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25]; // Le zoo peut contenir jusqu'à 25 animaux
    }

    // Méthode pour ajouter un animal au zoo
    public void addAnimal(Animal animal, int index) {
        if (index >= 0 && index < animals.length) {
            animals[index] = animal;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Animal (lion)
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        // Création d'un objet Zoo (myZoo)
        Zoo myZoo = new Zoo("My Zoo", "Tunis", 10);

        // Ajout du lion au zoo
        myZoo.addAnimal(lion, 0);

        // Affichage des informations du zoo et de l'animal
        System.out.println("Zoo Name: " + myZoo.name);
        System.out.println("City: " + myZoo.city);
        System.out.println("Number of Cages: " + myZoo.nbrCages);
        System.out.println("Animal in the Zoo: " + myZoo.animals[0].name + " (" + myZoo.animals[0].family + ")");
    }
}
