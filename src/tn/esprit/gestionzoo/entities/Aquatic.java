package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
   protected String habitat;


    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
public Aquatic() {
            super ();
        }
    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }
    public void swim(){
        System.out.println("this aquatic animal is swimming");
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aquatic other = (Aquatic) obj;
        return this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.habitat.equals(other.habitat);
    }
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println(getName() + " mange de la viande.");
        } else {
            System.out.println(getName() + " ne mange pas cet aliment.");
        }
    }
}