/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadeCarta;

/**
 *
 * @author gusta
 */
public class ClassCarta {

    int naipe, face;
    boolean visivel;

    ClassCarta() {
        naipe = (int) (Math.random() * 13 + 1);
        face = (int) (Math.random() * 4);
        visivel = true;
    }

    ClassCarta(int face, int naipe) {
        if (face >= 1 && face <= 13) {
            this.face = face;
        } else {
            this.face = 1;
        }
        if (naipe >= 0 && naipe <= 3) {
           this.naipe = naipe;
        }
        else{
        this.naipe = 0;
        }
        this.visivel = true;
    }
    //Métodos

    public int GetNaipe() {
        return naipe;
    }

    public int GetFace() {
        return face;
    }

    void VirarCarta() {
        visivel = !visivel;
    }

    void imprimir() {
        String carta = "";
        if (face == 1) {
            carta = "A";
        } else if (face == 11) {
            carta = "J";
        } else if (face == 12) {
            carta = "Q";
        } else if (face == 13) {
            carta = "K";
        } else {
            carta += face;
        }

        if (naipe == 0) {
            carta += " ouros";
        }
        if (naipe == 1) {
            carta += " espadas";
        }
        if (naipe == 2) {
            carta += " copas";
        } else {
            carta += " paus";
        }

        if (visivel) {
            System.out.println(carta);
        } else {
            System.out.println("##");
        }
    }
}
