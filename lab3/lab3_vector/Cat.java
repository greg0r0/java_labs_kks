package lab3_vector;

import java.text.Format;

public class Cat{
    private String name;
    private int Age;

    public Cat(String Name,int Age){
        this.Age = Age;
        this.name = Name;
    }
    public Cat(Cat ct){
        this(ct.name, ct.Age);
    }

    @Override
    public String toString(){
        return String.format("Cat, Name: %s Age: %d;", this.name, this.Age);
    }
}
