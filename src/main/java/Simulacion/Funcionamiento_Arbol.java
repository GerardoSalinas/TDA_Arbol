/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Simulacion;
import TDA_ARBOL.ARBOL;
/**
 *
 * @author Gerardo Salinas
 */
public class Funcionamiento_Arbol {
    public static void main(String[] args){
        ARBOL arbol1 = new ARBOL();
        ARBOL arbol2 = new ARBOL();
        ARBOL arbol3 = new ARBOL();
        ARBOL arbol4 = new ARBOL();

        /* arbol1.CREA2(100, 3, 5);

        arbol2.CREA4(10,2,3,4,5);

        arbol3.CREA3(15, 4, 6, 8); */

        //arbol4.CREA(20, 2,4,3,5,6);
        arbol4.CREA(arbol4);

        /* arbol1.ORD_POS(arbol1.RAIZ());
        arbol2.ORD_SIM(arbol2.RAIZ());
        arbol3.ORD_SIM(arbol3.RAIZ());
        arbol4.ORD_PRE(arbol4.RAIZ());
        System.out.println(arbol1.RAIZ());
        System.out.println(arbol3.PADRE(6)); */

        System.out.println(arbol4.PADRE(5));

        arbol4.listar();


        
    }
    //test de todos los metodos de la clase arbol
    //recorridos en orden previo,simetrico,posterior
    //TEST INTENSIVO DEL METODO CREA
   
   //System.out.println(cursor);
}
