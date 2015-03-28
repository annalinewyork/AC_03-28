package nyc.c4q.annalinewyork;

/**
 * Created by c4q-nali on 3/28/15.
 */
public class Dog {

    private String name;
    private String typeOfDog;
    private int dogAge;


    public Dog(String name, String typeOfDog, int dogAge){
        this.name = name;
        this.typeOfDog = typeOfDog;
        this.dogAge = dogAge;

    }

    public String getName() {
        return this.name;
    }

    public String getTypeOfDog(){
        return  this.typeOfDog;
    }

    public int getDogAge(){
        return  this.dogAge;
    }



}
