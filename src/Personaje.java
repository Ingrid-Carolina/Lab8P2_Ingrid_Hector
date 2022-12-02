

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMINISTRADOR1
 */
public class Personaje {
    protected String nombre;
    protected String raza;
    protected double estaura;
   protected double peso;
   protected int edad;
    protected int Ac;
    protected int Cs;
    protected int Hp;
    protected String descripcion;
   protected String nacionalidad;
    protected String Tp;
    

    public Personaje() {
    }

    public Personaje(String nombre, String raza, double estaura, double peso, int edad, int Ac, int Cs, int Hp, String descripcion, String nacionalidad, String Tp) {
        this.nombre = nombre;
        this.raza = raza;
        this.estaura = estaura;
        this.peso = peso;
        this.edad = edad;
        this.Ac = Ac;
        this.Cs = Cs;
        this.Hp = Hp;
        this.descripcion = descripcion;
        this.nacionalidad = nacionalidad;
        this.Tp = Tp;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getEstaura() {
        return estaura;
    }

    public void setEstaura(double estaura) {
        this.estaura = estaura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTp() {
        return Tp;
    }

    public void setTp(String Tp) {
        this.Tp = Tp;
    }

    public int getAc() {
        return Ac;
    }

    public void setAc(int Ac) {
        this.Ac = Ac;
    }

    public int getCs() {
        return Cs;
    }

    public void setCs(int Cs) {
        this.Cs = Cs;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int Hp) {
        this.Hp = Hp;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", raza=" + raza + ", estaura=" + estaura + ", peso=" + peso + ", edad=" + edad + ", Ac=" + Ac + ", Cs=" + Cs + ", Hp=" + Hp + ", descripcion=" + descripcion + ", nacionalidad=" + nacionalidad + ", Tp=" + Tp + '}';
    }

    
    
    
}
