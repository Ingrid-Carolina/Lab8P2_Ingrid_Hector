/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ADMINISTRADOR1
 */
public class Picaro extends Personaje {
    String tipoInstrumento;
    int cantrobo;

    public Picaro() {
    }

    public Picaro(String tipoInstrumento, int cantrobo) {
        this.tipoInstrumento = tipoInstrumento;
        this.cantrobo = cantrobo;
    }

    public Picaro(String tipoInstrumento, int cantrobo, String nombre, String raza, double estaura, double peso, int edad, int Ac, int Cs, int Hp, String descripcion, String nacionalidad, String Tp) {
        super(nombre, raza, estaura, peso, edad, Ac, Cs, Hp, descripcion, nacionalidad, Tp);
        this.tipoInstrumento = tipoInstrumento;
        this.cantrobo = cantrobo;
    }

    public String getTipoInstrumento() {
        return tipoInstrumento;
    }

    public void setTipoInstrumento(String tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    public int getCantrobo() {
        return cantrobo;
    }

    public void setCantrobo(int cantrobo) {
        this.cantrobo = cantrobo;
    }

    @Override
    public String toString() {
        return super.toString() +"Picaro{" + "tipoInstrumento=" + tipoInstrumento + ", cantrobo=" + cantrobo + '}';
    }
    
}
