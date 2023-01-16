package boundGeneric;

import java.util.*;

public class BoundGenericsMain {
    public static void main(String[] args) {
        Set<Animal> input = new LinkedHashSet<>();
        Animal caine1 = new Caine(true,"rasa1","curte1");
        Animal caine2 = new Caine(true,"rasa2","curte2");
        Animal pisica1 = new Pisica("curte3", true, 9);
        Animal animal1 = new Animal("habitat1",true);
        input.add(caine1);
        input.add(caine2);
        input.add(pisica1);
        input.add(animal1);
        //display(input);
        //displayAnimal(input);

        Set<FiintaParent> fiinte = new HashSet<>();
        fiinte.add(new FiintaParent());
        fiinte.add(new Fiinta("habitat100"));
        displayAnimalParent(fiinte);

    }
    // <? extends Animal>
    private static void display(Collection<? extends Object> animals){
        for(Object animal : animals){
            if(animal instanceof Animal){
                Animal a1 = (Animal)animal;
                System.out.println(a1.getHabitat());
            }
        }
    }

    private static void displayAnimal(Collection<? extends Animal> animals){
        for(Animal animal : animals){
                System.out.println(animal);
        }
    }

    private static void displayAnimalParent(Collection<? super Animal> input){
        for(Object animalParent : input){
            System.out.println(animalParent);
        }
    }
}
