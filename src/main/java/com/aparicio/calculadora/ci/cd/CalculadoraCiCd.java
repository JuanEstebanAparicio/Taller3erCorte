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
        CalculadoraCiCd calc = new CalculadoraCiCd();
        
        System.out.println("CACULADORA CI/CD");
        System.out.println("5 + 3 = " + calc.sumar(5,3));
        System.out.println("10 - 4 = " + calc.restar(10, 4));
        System.out.println("6 * 7 = " + calc.multiplicar(6, 7));
        System.out.println("20 / 4 = " + calc.dividir(20, 4));
        System.out.println("2^3 = " + calc.potencia(2, 3));
        System.out.println("YYY ESO ES TODO :)");
        
        
    }
}
