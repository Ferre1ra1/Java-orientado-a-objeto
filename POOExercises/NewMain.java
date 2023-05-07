/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOExercises;

import java.util.*;

/**
 *
 * @author gusta
 */
public class NewMain {

    double base, altura;

    void ImprimeDados() {
        System.out.println(
                "Base: " + base + "\n"
                + "Altura: " + altura
        );

        System.out.println("Área do triângulo " + CalculaArea());
    }

    double CalculaArea() {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NewMain s1;

        s1 = new NewMain();
        System.out.println("Digite o valor da base");
        s1.base = scan.nextDouble();
        System.out.println("Digite o valor da altura");
        s1.altura = scan.nextDouble();
        
        s1.ImprimeDados();
    }

}
