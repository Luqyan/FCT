/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dam1
 */
public class pruebaCubos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cubos cubo1= new Cubos(2);  /*creamos cubo1 y definimos capacidad */
        System.out.println(cubo1.getCap());
        
        Cubos cubo2= new Cubos(4);  /*creamos cubo2 y definimos capacidad */
        System.out.println(cubo2.getCap());
        
        Cubos cubo3= new Cubos(6);  /*creamos cubo2 y definimos capacidad */
        System.out.println(cubo3.getCap());
        
        
        
        cubo3.llena();
        System.out.println("Los litros actuales del cubo 3 son " +cubo3.getActuales());
        cubo3.pinta();
        cubo2.vacia();
        System.out.println("Los litros actuales del cubo 2 son " +cubo2.getActuales());
        cubo3.vuelcaEn(cubo2);
        
         
        System.out.println("Despues de volcar el contenido del cubo 3 en el cubo 2 ....");
        System.out.println("Los litros actuales del cubo 2 son " +cubo2.getActuales());
        System.out.println("Los litros actuales del cubo 3 son " +cubo3.getActuales());
        
        cubo1.vuelcaEn(cubo3);
        cubo2.vuelcaEn(cubo3);
        
        System.out.println("Los litros actuales del cubo 1 son " +cubo1.getActuales());
        System.out.println("Los litros actuales del cubo 1 son " +cubo2.getActuales());
        System.out.println("Los litros actuales del cubo 1 son " +cubo3.getActuales());
        
        
        
        cubo2.pinta();
        cubo3.pinta();
    }
    
}
