/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOExercises.Cartas;

/**
 *
 * @author gusta
 */
public class ClasseCarta {

    private int face, naipe;
    private boolean visivel;

    //constructor
    public ClasseCarta() {
        face = (int) (Math.random() * 13 + 1);
        naipe = (int) (Math.random() * 4);
        visivel = true;
    }

    public ClasseCarta(int face, int naipe) {
        if (face >= 1 && face <= 13) {
            this.face = face;
        } else {
            this.face = -1; // valor padrao
        }
        if (naipe >= 0 && naipe <= 3) {
            this.naipe = naipe;
        } else {
            naipe = -1;
        }
        visivel = true;
    }

    //Métodos
    public int getNaipe() {
        return naipe;
    }

    public int getFace() {
        return face;
    }

    public void VirarCarta() {
        visivel = !visivel;
    }

    public void imprimir() {
        String carta = "";

        if (face == 1) {
            carta = "A";
        } else if (face == 2) {
            carta = "J";
        } else if (face == 3) {
            carta = "Q";
        } else if (face == 4) {
            carta = "K";
        } else {
            carta += face;
        }
        
        if(naipe == 0) carta += " Ouro";
        else if(naipe == 1) carta += " Espadas";
        else if(naipe == 2) carta += " Copas";
        else carta += " Paus";
        
        
        if(visivel) System.out.println(carta);
        else System.out.println("ERRO");
    }

}
