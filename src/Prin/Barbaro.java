package Prin;

import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMINISTRADOR1
 */
public class Barbaro extends Personaje implements Serializable{

    private String arma;
    private int px;

    public Barbaro() {
    }

    public Barbaro(String arma, int px) {
        this.arma = arma;
        this.px = px;
    }

    public Barbaro(String arma, int px, String nombre, String raza, double estaura, double peso, int edad, int Ac, int Cs, int Hp, String descripcion, String nacionalidad, String Tp) {
        super(nombre, raza, estaura, peso, edad, Ac, Cs, Hp, descripcion, nacionalidad, Tp);
        this.arma = arma;
        this.px = px;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getPx() {
        return px;
    }

    public void setPx(int px) {
        this.px = px;
    }

    @Override
    public String toString() {
        return super.toString() + "Barbaro{" + "arma=" + arma + ", px=" + px + '}';
    }

}
