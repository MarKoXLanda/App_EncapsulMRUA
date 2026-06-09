/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pa_23130628_proyecto_01;

/**
 *
 * @author Fer Landa Santi
 */
public class PA_23130628_Proyecto_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehiculo carro = new Vehiculo();
        carro.setVehiculo("Mungstan");
        carro.setDistancia(113400);
        carro.setVelocidadI(45);
        carro.setAceleracion(15);
        carro.VelocidadFinal();

        System.out.println("El coche es " + carro.getVehiculo() + " y su tiempo es " + carro.calcTiempo()+ " s");
        
        Vehiculo carro2 = new Vehiculo();
        carro2.setVehiculo("Vocho");
        carro2.setDistancia(45825);
        carro2.setVelocidadI(55);
        carro2.setAceleracion(20);
        carro2.VelocidadFinal();

        System.out.println("El coche es " + carro2.getVehiculo() + " y su tiempo es " + carro2.calcTiempo()+ " s");
        
        System.out.println(carro.VelocidadFinal());
        System.out.println(carro2.VelocidadFinal());
        
        System.out.println(carro);
        
        
        
    }
    
}
