/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13ventasobjetoarraylist;

/**
 *
 * @author alumno
 */
public class Ventas {   
    private String mes;
    private int ventas;
    
    public Ventas(){
        this.mes = "";
        this.ventas = 0;
    }

    public Ventas(String mes, int ventas) {
        this.mes = mes;
        this.ventas = ventas;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "Las ventas de "+ mes +" son de "+ ventas +" euros";
    }
    
    
}
