/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lmdeleijap.t02;
import java.util.Scanner;
/**
 *
 * @author luixm_000
 */
public class SPPLmDeleijaPT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int V1 = solicitaEntero ("Un número entero");
        double V2 = solicitaDouble ("Un número decimal");
        String V3 = solicitaString ("Una frase");
        
        System.out.println("V1");
        System.out.println("V2");
        System.out.println("V3");
        
        
    }
    
    public static int solicitaEntero(String mensaje){
        Scanner kb = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
            System.out.println("Introduzca" + mensaje);
            try{
                varEntera = kb.nextInt(); 
                flag = false;
                }catch (Exception ex){
                    System.out.println("Introdujo una variable incorrecta" + ex);
                    flag = true;
                    kb.nextLine();
                    }
            } while (flag);
        return varEntera;
        }
    public static double solicitaDouble (String mensaje){
        Scanner kb = new Scanner (System.in);
        double varDouble = 0;
        boolean flag;
        
        do{
            System.out.println("Introduzca" + mensaje);
            try{
                varDouble = kb.nextDouble();
                flag = false;
                }catch (Exception ex){
                    System.out.println("Introdujo una variable incorrecta" + ex);
                    flag = true;
                    kb.nextLine();
                    }
            } while (flag);
        return varDouble;
        }
    public static String solicitaString (String mensaje){
        Scanner kb = new Scanner (System.in);
        String varString = null;
        boolean flag; 
        
        do{
            System.out.println("Introduzca" + mensaje);
            try{
                varString = kb.nextLine();
                flag = false;
                }catch (Exception ex){
                    System.out.println("Introdujo una variable incorecta" + ex);
                    flag = true;
                    kb.nextLine();
                    
                    }
            }while (flag);
        return varString;
                
            }
        }
    

