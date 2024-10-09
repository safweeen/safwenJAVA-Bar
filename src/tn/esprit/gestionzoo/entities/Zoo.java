package tn.esprit.gestionzoo.entities;


public class Zoo {
  private  Animal[] animals;
    private String name;
    private String city;
    private final int NBR_CAGES=25;
    private int nbrAnimals = 0;



    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        animals = new Animal[NBR_CAGES];
    }
    public boolean addAnimal(Animal animal) {
        if (this.searchAnimal(animal.getName()) == -1 && !isZooFull()) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        } else if (isZooFull()) {
            System.out.println("tn.esprit.gestionzoo.entities.Zoo is full");
        }
        else {
            System.out.println("l'animal mawjoud");}




        return false;
    }
    public void displayZoo() {
        System.out.println("Nom du zoo: " + name + ", Ville: " + city + ", Nombre de cages: " + NBR_CAGES);
    }
    public int searchAnimal(String name) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(name)) {
                return i;

            }
        }
        return -1;
    }

   public  boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.getName());
        this.animals[index] = null;
        return true;
    }
    boolean isZooFull(){
        return nbrAnimals > NBR_CAGES;
    }



    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z2.nbrAnimals > z1.nbrAnimals) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return null;
        }
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()){


        this.name = name;}
        else{ System.out.println("le nom de zoo n'est pas vide");
    }}

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNBR_CAGES() {
        return NBR_CAGES;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }
}