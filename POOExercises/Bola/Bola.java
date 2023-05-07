/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOExercises.Bola;

/**
 *
 * @author gusta
 */
public class Bola {
    protected double x, y, diametro;
    protected String color;

    public Bola(double x, double y, double diametro, String color) {
        this.x = x;
        this.y = y;
        this.diametro = diametro;
        this.color = color;
    }

    //@Override
    public String toString() {
        return "Especificações da Bola [Posição x = " + this.x + "\n"
                + "Posição y = " + this.y + "\n" + "Diametro = " + (this.x + this.y)
                + "\n" + "color = " + this.color + " ]";
    }
 
}
