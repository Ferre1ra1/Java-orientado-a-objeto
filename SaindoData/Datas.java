/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SaindoData;
import java.util.Scanner;
public class Datas {

    Scanner lendo = new Scanner(System.in);
    int dia, mes, ano;

    Datas(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    void EntraDados() {
        System.out.println("Diga o dia");
        this.dia = lendo.nextInt();
        System.out.println("Diga o mês");
        this.mes = lendo.nextInt();
        System.out.println("Diga o ano");
        this.ano = lendo.nextInt();
    }
    void ImprimeData()
    {
    System.out.println("Data completa: "+this.dia+ "/" +this.mes+ "/" + this.ano);
    }
}
