/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajerodevaleria;

/**
 *
 * @author Usuario
 */

public class Cuenta implements Imprimible{
    
    String nombre;
    String numCuenta;
    double saldo;

    public Cuenta(String nombre, String numCuenta, int saldo) {
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }
    
    public String devolverInfoString(){
    
        return "La cuenta: " + this.numCuenta + " a nombre de: " + this.nombre + " tiene un saldo de : " + this.saldo + "€";
    }
    
    
    
}
