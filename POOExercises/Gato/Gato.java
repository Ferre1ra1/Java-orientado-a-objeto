/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOExercises.Gato;

/**
 *
 * @author gusta
 */
public class Gato {

    String name, color;
    Float x, y;

    Gato(String name, String color, float x, float y) {
        this.name = name;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    void desenha() {
        System.out.println(
                "Name: " + name + "\n"
                + "Color: " + color + "\n"
                + "Position x = " + x + "\n"
                + "Position y = " + y + "\n"
        );

    }

    void miar() {
        System.out.println(this.name + " miou!");
    }

    void correr() {
        float soma = this.x + this.y;
        System.out.println(this.name + " correu " + soma + " metros");
    }
}
