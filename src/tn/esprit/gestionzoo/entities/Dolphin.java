package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    public Dolphin (){
        super();
    }
    @Override
    public String toString() {
        return super.toString() + ", Vitesse de nage: " + swimmingSpeed + " km/h";
    }
    public void swim(){
        System.out.println("this dolphin is swimming");
    }

}