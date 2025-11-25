/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.aparicio.calculadora.ci.cd;

/**
 *
 * @author Juanest15
 */
public class CalculadoraCiCd {

  public int sumar(int a, int b){
      return a + b;
  }  
  
  public int restar(int a, int b){
      return a - b;
  }
  
  public int multiplicar(int a, int b){
      return a * b;
  }
  
  public double dividir (int a, int b){
     if(b==0){
         throw new IllegalArgumentException("No se puede dividir por 0");
     } 
     return (double) a / b;
  }
  
  public int potencia(int base, int exponente){
      if(exponente < 0){
          throw new IllegalArgumentException("Exponente debe ser positivo");
      }
      int resultado = 1;
      for(int i = 0; i< exponente; i++){
          resultado *=base;
      }
       return resultado;
  }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
