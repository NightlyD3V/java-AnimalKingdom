package animals;

import java.util.*;

public class Main 
{
    public static void main(String[] args)
    {
        //Intantiate objects 
        Mamal Panda = new Mamal("Panda", 1869);
        Mamal Zebra = new Mamal("Zebra", 1778);
        Mamal Koala = new Mamal("Koala", 1816);
        Mamal Sloth = new Mamal("Sloth", 1804);
        Mamal Armadillo = new Mamal("Armadillo", 1758);
        Mamal Raccoon = new Mamal("Raccoon", 1758);
        Mamal BigFoot = new Mamal("BigFoot", 2021);

        Bird Pigeon = new Bird("Pigeon", 1873);
        Bird Peacock = new Bird("Peacock", 1821);
        Bird Toucan = new Bird("Toucan", 1758);
        Bird Parrot = new Bird("Parrot", 1824);
        Bird Swan = new Bird("Swan", 1758);

        Fish Salmon = new Fish("Salmon", 1758);
        Fish Catfish = new Fish("Catfish", 1817);
        Fish Perch = new Fish("Perch", 1758);

        //ArrayList 
        ArrayList<AbstractAnimal> animalList = new ArrayList<AbstractAnimal>();
        animalList.add(Panda);
        animalList.add(Zebra);
        animalList.add(Koala);
        animalList.add(Sloth);
        animalList.add(Armadillo);
        animalList.add(Raccoon);
        animalList.add(BigFoot);
        animalList.add(Pigeon);
        animalList.add(Peacock);
        animalList.add(Toucan);
        animalList.add(Parrot);
        animalList.add(Swan);
        animalList.add(Salmon);
        animalList.add(Catfish);
        animalList.add(Perch); 

        //Sorting 
        System.out.println("*** Descending order of year ***");
        animalList.sort((a1, a2) -> a1.getYear() - a2.getYear());
        animalList.forEach((a) -> System.out.print(a));

        System.out.println("*** Animals alphabetically ***");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalList.forEach((a) -> System.out.print(a));

        System.out.println("*** Order of Movement ***");
        animalList.sort((a1, a2) -> a1.move().compareTo(a2.move()));
        animalList.forEach((a) -> System.out.print(a));

        System.out.println("*** Breaths with lungs ***");
        animalList.forEach((a) -> {
            if(a.breath().equals("lungs")) {
                 System.out.print(a);
            }
        });

        System.out.println("*** Breaths with lungs && 1758 ***");
        animalList.forEach((a) -> {
            if(a.breath().equals("lungs") && a.getYear() == 1758) {
                System.out.print(a);
            }
        });

        System.out.println("*** Animals that lays eggs and breaths with lungs ***");
        animalList.forEach((a) -> {
            if(a.breath().equals("lungs") && a.reproduce().equals("eggs")) {
                System.out.print(a);
            }
        });

        System.out.println("*** Animals that were named in 1758 ***");
        animalList.forEach((a) -> {
            if(a.getYear() == 1758) {
                System.out.print(a);
            }
        });
    }
}