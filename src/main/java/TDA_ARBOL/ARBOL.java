/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package TDA_ARBOL;

import Almacenamiento.*;
/**
 *
 * @author Gerardo Salinas
 */
public class ARBOL {
    Cursor arbol = new Cursor();
    
    public int PADRE(int n){// Lista pero falta Probar
        return arbol.get_Papa(n);
    }
    
    public int HIJO_MAS_IZQ(int n){
        return arbol.getNodo(n).getHijo_mas_izquierdo();
    }
    
    public int HERMANO_DER(int n){
        return arbol.getNodo(n).getHermano_derecho();
    }
    
    public Object ETIQUETA(int n){//listo
        return arbol.getNodo(n).getDato();
    }
    
    public int RAIZ(){
        return arbol.getArreglo_arbol_raiz();
    }
    
    public void ANULA(){
        this.arbol.limpiarArbol();
    }
    
    
    public void ORD_PRE(int n){//listo
        int c; 

        System.out.print(arbol.getArreglo_arbol_dato(n) + " , ");
        c = arbol.getArreglo_arbol_izq(n);
        while (c != -1) {
            ORD_PRE(c);
            c = arbol.getArreglo_arbol_der(c);
        }
    }
    
    public void ORD_POS(int n){//listo
        int c;

        c=arbol.getArreglo_arbol_izq(n);
        while (c != -1){
            ORD_PRE(c);
            c = arbol.getArreglo_arbol_der(c);
        }
        System.out.print(arbol.getArreglo_arbol_dato(n) + " , ");
        
        
    }
    
    public void ORD_SIM(int n) {//listo
        int c;

        if (arbol.getArreglo_arbol_izq(n) == -1 ){
            System.out.println(arbol.getArreglo_arbol_dato(n) + " , ");
        } else {
            ORD_SIM(arbol.getArreglo_arbol_izq(n));
            System.out.println(arbol.getArreglo_arbol_dato(n) + " , ");
            c = arbol.getArreglo_arbol_der(arbol.getArreglo_arbol_izq(n));
            while(c != -1) {
                ORD_SIM(c);
                c = arbol.getArreglo_arbol_der(c);
            }
        }
        
    }

    public void listar(){
        arbol.listar();
    }
    
    public void CREA2(Object v, int A1, int A2){//listo
        int temp = arbol.disponible();//almacena el indice de una posicion vacia en el arreglo, en esa posicion se ubicará la raiz del nuevo arbol
        //int hermano_de_temp = arbol.getNodo(temp).getHermano_derecho();
        arbol.getNodo(temp).setDato(v);
        arbol.getNodo(temp).setHijo_mas_izquierdo(A1);
        arbol.getNodo(temp).setHermano_derecho(-1);
        arbol.getNodo(A1).setHermano_derecho(A2);
        arbol.setRaiz(temp);
        System.out.println("El Arbol con raiz " + v + " ha sido creado correctamente!");
        
    }

    public void CREA3(Object v, int A1, int A2, int A3){//listo
        int temp = arbol.disponible();
        arbol.getNodo(temp).setDato(v);
        arbol.getNodo(temp).setHijo_mas_izquierdo(A1);
        arbol.getNodo(temp).setHermano_derecho(-1);
        arbol.getNodo(A1).setHermano_derecho(A2);
        arbol.getNodo(A2).setHermano_derecho(A3);
        arbol.getNodo(A3).setHermano_derecho(-1);
        arbol.setRaiz(temp);
    }

    public void CREA4 (Object v, int A1, int A2, int A3, int A4){//listo
        int temp = arbol.disponible();
        arbol.getNodo(temp).setDato(v);
        arbol.getNodo(temp).setHermano_derecho(-1);
        arbol.getNodo(temp).setHijo_mas_izquierdo(A1);
        arbol.getNodo(A1).setHermano_derecho(A2);
        arbol.getNodo(A2).setHermano_derecho(A3);
        arbol.getNodo(A3).setHermano_derecho(A4);
        arbol.getNodo(A4).setHermano_derecho(-1);
        arbol.setRaiz(temp);
    }
    
    public void CREA(Object v, int ... A){//puede ser recursiva o no.  //listo
        //establece la raiz del arbol
        int temp = arbol.disponible();
        arbol.getNodo(temp).setDato(v);
        arbol.getNodo(temp).setHermano_derecho(-1);
        for(int indice  = 0; indice < (A.length-1); indice++){//iteramos hasta el penultimo elemento del arreglo A
            if (indice == 0){
                arbol.getNodo(temp).setHijo_mas_izquierdo(A[indice]);
            }
            arbol.getNodo(A[indice]).setHermano_derecho(A[indice+1]);
        }
        arbol.setRaiz(temp);
    }
    
    public void CREA(Object v){//este se usa para crear un sub-arbol de un solo nodo, es decir un arbol de un solo nodo  //listo
        int temp = arbol.disponible();
        arbol.getNodo(temp).setDato(v);
        arbol.setRaiz(temp);
    }

   
}
