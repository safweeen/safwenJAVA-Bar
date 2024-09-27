
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
