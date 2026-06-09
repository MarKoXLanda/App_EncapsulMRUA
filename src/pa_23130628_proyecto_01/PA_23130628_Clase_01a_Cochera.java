/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa_23130628_proyecto_01;

import java.text.DecimalFormat;
import javax.swing.JTable;

/**
 *
 * @author Fer Landa Santi
 */
class Cochera {
    //Atributos
    private Vehiculo [] lista = null;   
            
    //constructores
    public Cochera(){
        lista = new Vehiculo[5];
    }
    public Cochera(int n){
        lista = new Vehiculo[n];
    }
    
    public Cochera(JTable tabla)
    {
        DecimalFormat formato = new DecimalFormat("#,###,##0.00");
        lista = new Vehiculo[tabla.getRowCount()];
        for(int r = 0; r < tabla.getRowCount(); r++)
        {
            Vehiculo carr = new Vehiculo(); 
            
            carr.setVehiculo(tabla.getValueAt(r, 0) + "");
            carr.setDistancia(Double.parseDouble(tabla.getValueAt(r, 1) + ""));
            carr.setVelocidadI(Double.parseDouble(tabla.getValueAt(r, 2) + ""));
            carr.setAceleracion(Double.parseDouble(tabla.getValueAt(r, 3) + ""));            
            tabla.setValueAt(formato.format(carr.calcTiempo()), r, 4);
            
            lista[r] = carr;
    }
        
    }
    public Vehiculo getVehiculo(int posicion){
        if(posicion >= 0 && posicion < lista.length)
            return lista[posicion];
        else
            return null;
    }
    
    public void setVehiculo(Vehiculo v, int posicion)
    {
         if(posicion >= 0 && posicion < lista.length)
             lista[posicion] = v;
    }
    
    public void ordenar()
    {
        // primero alfabetico para que los ordenes segun letra y despues valor numerico
        for(int i=0; i < lista.length - 1; i++)
            for(int j= i+1; j < lista.length; j++)
                if(lista[i].getVehiculo().compareTo(lista[j].getVehiculo()) > 0){ // < = descendente   > = ascendente
                    Vehiculo veh = lista[i];
                    lista[i] = lista[j];
                    lista[j] = veh;
                }
        
        // ordenamiento
        for(int i=0; i < lista.length - 1; i++)
            for(int j= i+1; j < lista.length; j++)
                if(lista[i].calcTiempo()< lista[j].calcTiempo()){ // < = descendente   > = ascendente
                    Vehiculo veh = lista[i];
                    lista[i] = lista[j];
                    lista[j] = veh;
                }
    }
    
    public void alfabetico()
    {
        for(int i=0; i < lista.length - 1; i++)
            for(int j= i+1; j < lista.length; j++)
                if(lista[i].getVehiculo().compareTo(lista[j].getVehiculo()) > 0){ // < = descendente   > = ascendente
                    Vehiculo veh = lista[i];
                    lista[i] = lista[j];
                    lista[j] = veh;
                }
    }
    
    public Vehiculo mayor()
    {
        Vehiculo may = lista[0];
        for(int i=1; i < lista.length;i++)
            if(lista[i].calcTiempo() > may.calcTiempo())
                may = lista[i];
        
        return may;
    }
    
     public Vehiculo menor()
    {
        Vehiculo men = lista[0];
        for(int i=1; i < lista.length;i++)
            if(lista[i].calcTiempo() < men.calcTiempo())
                men = lista[i];
        
        return men;
    }
     
     public void mostrar(JTable tabla1, JTable tabla2)
     {
          double sumaTiempo = 0;
       double sumaDistancia = 0;        
       double sumaVelocidadI = 0;
       double sumaAceleracion = 0;       
       double veloProm = 0;
       double acelProm = 0; 
       DecimalFormat formato = new DecimalFormat("#,###,##0.00");
         for(int r = 0; r < tabla1.getRowCount(); r++)
        {
            tabla1.setValueAt(lista[r].getVehiculo(), r, 0);
            tabla1.setValueAt(lista[r].getDistancia(), r, 1);
            tabla1.setValueAt(lista[r].getVelocidadI(), r, 2);
            tabla1.setValueAt(lista[r].getAceleracion(), r, 3);
            tabla1.setValueAt(formato.format(lista[r].calcTiempo()), r, 4);
            
            sumaDistancia += lista[r].getDistancia();
            sumaVelocidadI += lista[r].getVelocidadI();
            sumaAceleracion += lista[r].getAceleracion();
            sumaTiempo += lista[r].calcTiempo();
           
            veloProm = sumaVelocidadI / tabla1.getRowCount();
            acelProm = sumaAceleracion / tabla1.getRowCount();
        }
         
       tabla2.setValueAt(formato.format(sumaDistancia), 0, 1);
       tabla2.setValueAt(formato.format(veloProm), 0, 2);
       tabla2.setValueAt(formato.format(acelProm), 0, 3);
       tabla2.setValueAt(formato.format(sumaTiempo), 0, 4);
     }

     
    
}
