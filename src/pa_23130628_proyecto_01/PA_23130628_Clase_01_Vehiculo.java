/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa_23130628_proyecto_01;

/**
 *
 * @author Fer Landa Santi
 */
class Vehiculo{
    
    //atributos
    private String vehiculo;
    private double distancia;
    private double velocidadI;
    private double aceleracion;
    private double tiempo;
    
    //Constructores
    
    public Vehiculo(){
        vehiculo = "No-Model";
        distancia = 0;
        velocidadI = 0;
        aceleracion = 0;
        tiempo = 0;
               
               
    }


    
// Metodos
    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getVelocidadI() {
        return velocidadI;
    }

    public void setVelocidadI(double velocidadI) {
        this.velocidadI = velocidadI;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double VelocidadFinal(){
        return Math.sqrt((velocidadI * velocidadI) + (2.0 * aceleracion) * distancia);
        
    }
    @Override
    public String toString(){
        return "Tu coche es: " + vehiculo + "y la distancia que recorre es: " + distancia + " ,su velocidad es: " + velocidadI + " , su aceleracion: " + aceleracion
                + " y su tiempo: " + tiempo;
    }
    
    public double calcTiempo()
    {
        return tiempo = (VelocidadFinal() - velocidadI) / aceleracion;
    }
}
