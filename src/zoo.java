class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;


    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25]; // Le zoo peut contenir jusqu'à 25 animaux
    }


    public void addAnimal(Animal animal, int index) {
        if (index >= 0 && index < animals.length) {
            animals[index] = animal;
        }
    }
}