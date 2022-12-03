package Prin;

import java.io.Serializable;

public class Mago extends Personaje implements Serializable{

    private String tipodeMagia;
    private static final long SerializableVersion = 777L;

    public Mago() {
    }

    public Mago(String tipodeMagia) {
        this.tipodeMagia = tipodeMagia;
    }

    public Mago(String tipodeMagia, String nombre, String raza, double estaura, double peso, int edad, int Ac, int Cs, int Hp, String descripcion, String nacionalidad, String Tp) {
        super(nombre, raza, estaura, peso, edad, Ac, Cs, Hp, descripcion, nacionalidad, Tp);
        this.tipodeMagia = tipodeMagia;
    }

    public String getTipodeMagia() {
        return tipodeMagia;
    }

    public void setTipodeMagia(String tipodeMagia) {
        this.tipodeMagia = tipodeMagia;
    }

    @Override
    public String toString() {
        return super.toString() + "Mago{" + "tipodeMagia=" + tipodeMagia + '}';
    }

}
