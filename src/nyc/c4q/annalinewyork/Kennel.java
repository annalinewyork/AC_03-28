package nyc.c4q.annalinewyork;

import java.util.ArrayList;

/**
 * Created by c4q-nali on 3/28/15.
 */
public class Kennel {

    private ArrayList<Dog> kennel;

    public Kennel() {
        this.kennel = new ArrayList<Dog>();

    }

    public void addDog(Dog myDog) {

        kennel.add(myDog);

    }

    public int numOfDogs() {

        return kennel.size();

    }

    public boolean hasDogs(){

        return ! kennel.isEmpty();
    }

    public void shutdownKennel (){

         kennel.clear();
    }


}
