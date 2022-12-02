/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ADMINISTRADOR1
 */
public class Clerigo extends Personaje {
    private String dios;
    private String invocacion;

    public Clerigo() {
    }

    public Clerigo(String dios, String invocacion) {
        this.dios = dios;
        this.invocacion = invocacion;
    }

    public Clerigo(String dios, String invocacion, String nombre, String raza, double estaura, double peso, int edad, int Ac, int Cs, int Hp, String descripcion, String nacionalidad, String Tp) {
        super(nombre, raza, estaura, peso, edad, Ac, Cs, Hp, descripcion, nacionalidad, Tp);
        this.dios = dios;
        this.invocacion = invocacion;
    }

    public String getDios() {
        return dios;
    }

    public void setDios(String dios) {
        this.dios = dios;
    }

    public String getInvocacion() {
        return invocacion;
    }

    public void setInvocacion(String invocacion) {
        this.invocacion = invocacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Clerigo{" + "dios=" + dios + ", invocacion=" + invocacion + '}';
    }
    
}
