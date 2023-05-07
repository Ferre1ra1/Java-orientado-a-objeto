/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstudandoRedefinicaoDeMetodos;

/**
 *
 * @author gusta
 */
public class ClasseRedefinicaoDeMetodos {

    String placa, marca;
    int ano;
    double preco;

    public ClasseRedefinicaoDeMetodos() {
        placa = "";
        marca = "";
        ano = 0;
        preco = 0;
    }

    public ClasseRedefinicaoDeMetodos(String placa, String marca, int ano, double preco) {
    this.placa = placa;
    this.marca = marca;
    this.ano = ano;
    this.preco = preco;

    }

    public void setPlaca(String placa) {
        if (placa != null) {
            this.placa = placa;
        }
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setMarca(String marca) {
        if (marca != null) {
            this.marca = marca;
        }
    }

    public String getMarca() {
        return this.marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return "Placa: " + getPlaca() + "\n"
                + "Marca: " + getMarca()+ "\n"
                + "Ano: " + getAno() + "\n"
                + "Preço: " + getPreco() + "R$";

    }

}
