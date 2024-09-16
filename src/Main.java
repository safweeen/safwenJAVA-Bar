//1111111 construction 5
class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;


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


    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }


    public void addAnimal(Animal animal, int index) {
        if (index >= 0 && index < animals.length) {
            animals[index] = animal;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("Felidae", "Lion", 5, true);


        Zoo myZoo = new Zoo("My Zoo", "Tunis", 10);


        myZoo.addAnimal(lion, 0);


        System.out.println("Zoo Name: " + myZoo.name);
        System.out.println("City: " + myZoo.city);
        System.out.println("Number of Cages: " + myZoo.nbrCages);
        System.out.println("Animal in the Zoo: " + myZoo.animals[0].name + " (" + myZoo.animals[0].family + ")");
    }
}
//2222222222 construction6
