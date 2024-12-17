package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;


    public Penguin() {
        super();
    }


    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public String toString() {
        return super.toString() + ", Profondeur de nage: " + swimmingDepth + " mètres";
    }
    @Override
    public void swim(){

        System.out.println("This pinguin is swimming");
    }

}
