package tn.esprit.gestionzoo.entities;

public class Animal {
   private String family;
    private String name;
   private int age;
    private boolean isMammal;


    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void displayAnimal() {
        System.out.println("Famille: " + family + ", Nom: " + name + ", Âge: " + age + ", est un mammifère: " + isMammal);
    }
    @Override
    public String toString() {
        return "Famille: " + family + ", Nom: " + name + ", Âge: " + age + ", est un mammifère: " + isMammal;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;

        }else System.out.println("l'age de l'animal ne peut pas etre negatif");
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}