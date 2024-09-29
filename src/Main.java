public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("safwen", "Lion", 6, true);
        Animal tiger = new Animal("smile", "Tigre", 5, true);
        Animal elephant = new Animal("khalil", "Éléphant", 10, false);
        Animal lion2 = new Animal("Safwen", "Lion", 6, true);


        Zoo myZoo = new Zoo("amazon", "Tunis", 25);
        Zoo myZoo2 = new Zoo("echkel", "bizerte", 19);



        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(lion2);

        myZoo.displayZoo();
        lion.displayAnimal();

        myZoo.displayZoo();


        int index = myZoo.searchAnimal("safwen");
        if (index != -1) {
            System.out.println("Animal trouvé à l'index: " + index);
        }
        myZoo.removeAnimal(tiger);


        Zoo biggerZoo = Zoo.comparerZoo(myZoo, myZoo2);
        if (biggerZoo != null) {
            System.out.println("Le zoo avec le plus d'animaux est: " + biggerZoo.name);
        }
        System.out.println(myZoo);
    }
}
