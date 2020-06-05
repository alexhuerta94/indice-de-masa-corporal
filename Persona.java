
package imc;

import java.util.Scanner;

public class Persona{
  Scanner entrada=new Scanner (System.in);    

  public String nom;
  public int edad;
  public String sex;
  public float peso;
  public float altura;

public String getNombre() {
        return nom;
    }

    public void setNombre(String nombre) {
        this.nom = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sex;
    }

    public void setSexo(String sexo) {
        this.sex = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    
    public void operaciones(){
        }

}