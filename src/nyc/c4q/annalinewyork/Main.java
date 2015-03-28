package nyc.c4q.annalinewyork;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Kennel happyDoggies = new Kennel();

        // creat a list to hold six dogs.

        Dog fido = new Dog("Fido", "German Shepherd", 3);
        Dog sport = new Dog("Sport", "Bulldog",1);
        Dog missy = new Dog("missy", "Poodle", 2);
        Dog max = new Dog("Max", "Bulldog", 4);
        Dog sleepy = new Dog("Sleepy", "Labrador Retriever",2);
        Dog sport2 = new Dog("Sport", "German shepherd", 3);


        happyDoggies.addDog(fido);
        happyDoggies.addDog(sport);
        happyDoggies.addDog(missy);
        happyDoggies.addDog(max);
        happyDoggies.addDog(sleepy);
        happyDoggies.addDog(sport2);




    }
}
