package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.entities.Zoo;


public class Main {
    public static void main(String[] args) {

     /*   Animal lion = new Animal("safwen", "Lion", 6, true);
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
            System.out.println("tn.esprit.gestionzoo.entities.Animal trouvé à l'index: " + index);
        }
        myZoo.removeAnimal(tiger);


        Zoo biggerZoo = Zoo.comparerZoo(myZoo, myZoo2);
        if (biggerZoo != null) {
            System.out.println("Le zoo avec le plus d'animaux est: " + biggerZoo.getName());
        }
        System.out.println(myZoo);*/



                            Animal animal = new Animal("Mammifère", "Lion", 5, true);
                            Aquatic aquatic = new Aquatic("Poisson", "Requin", 8, false, "Océan");
                            Terrestrial terrestrial = new Terrestrial("Mammifère", "Éléphant", 10, true, 4);
                            Dolphin dolphin = new Dolphin("Mammifère", "Dauphin", 6, true, "Mer", 25.5f);
                            Penguin penguin = new Penguin("Oiseau", "Pingouin", 3, false, "Antarctique", 100.0f);


                            System.out.println(animal);
                            System.out.println(aquatic);
                            System.out.println(terrestrial);
                            System.out.println(dolphin);
                            System.out.println(penguin);

                            aquatic.swim();
                            dolphin.swim();
                            penguin.swim();
                    }
            }










