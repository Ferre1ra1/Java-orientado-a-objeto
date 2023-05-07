package AtvHeranCa;

public class Animal {
    // Atributes 
    protected String name;
    protected String age;

    //Constructors
    public Animal() {
        name = "";
        age = "";
    }

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }


    //Methods
    public void fazer_som() {
        System.out.println("Animal está fazendo som");
    }
}
