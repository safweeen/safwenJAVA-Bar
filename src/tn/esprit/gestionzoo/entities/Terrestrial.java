package tn.esprit.gestionzoo.entities;


public class Terrestrial extends Animal {
    private int nbrLegs;


    public Terrestrial() {
        super ();
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nombre de pattes: " + nbrLegs;
    }
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getName() + " mange de la viande.");
        } else {
            System.out.println(getName() + " ne mange pas de viande.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(getName() + " mange des plantes.");
        } else {
            System.out.println(getName() + " ne mange pas de plantes.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(getName() + " mange des plantes et de la viande.");
        } else {
            System.out.println(getName() + " ne mange pas cet aliment.");
        }
    }


}
