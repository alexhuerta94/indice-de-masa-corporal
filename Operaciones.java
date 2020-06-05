
package imc;

public class Operaciones extends Persona {
    
    
    @Override
    public void operaciones(){
       
        altura = altura*altura;
        peso = peso/altura;
        
        System.out.println("Hola\n"+nom); 
        System.out.println("tu Indice de Masa Corporal es de: "+ peso);
        if (peso<=18){
            System.out.println("Tu peso es bajo, Consulta a tu medico.");}
        else if (peso>=18 && peso<=24.9){
            System.out.println("Felicidades!!! tu peso es Normal.");}
        else if (peso>=25 && peso<=26.9){   
             System.out.println("Padeces sobrepeso, consulta a tu medico.");}
        else if (peso>=27 && peso<=29.9){
             System.out.println("Padeces obesidad Nivel 1, consulta a tu medico.");}
        else if (peso>=30 && peso<=39.9){
             System.out.println("Padeces obesidad Nivel 2, Consulta a tu medico.");}
        else if (peso>=40){
             System.out.println("Padeces obesidad Nivel 3, Consulta a tu medico.");}
        }
        
    }
