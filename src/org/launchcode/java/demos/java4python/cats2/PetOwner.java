package org.launchcode.java.demos.java4python.cats2;

public class PetOwner {

    private Feedable pet;

    public PetOwner(Feedable pet) {
        this.pet = pet;
    }

    public void feedThePet() {

        // code to prepare the pet's meal

        pet.eat();
    }

}
