/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacenamiento;

import java.util.ArrayList;

/**
 *
 * @author Gerardo Salinas
 */
public class Cursor {
    private int raiz;//indice(del arreglo) donde se locacliza el nodo raiz del arbol
    private boolean[] Memoria;//creo que se usa como una especie de "reflejo" de arreglo_arbol
          //para mostrar que posicion de arreglo_arbol se encuentra vacia y cual no.
    private Nodo[] arreglo_arbol;//arreglo donde se almacenan los nodos del arbol (basicamente este es el arbol)
    
    //constructor
    public Cursor(){//listo
        //Nodo nodoVacio = new Nodo();
        this.Memoria = new boolean[10];
        this.arreglo_arbol = new Nodo[10];
        for (int j = 0; j<arreglo_arbol.length; j++){//se incializa el arreglo con nodos vacios 
            this.arreglo_arbol[j] = new Nodo();
        }
        this.raiz = -1;
    }
    public void setRaiz(int valor){
        this.raiz = valor;
    }
    
    public int get_Papa(int n){//listo 
        Nodo padreIterador;
        Nodo descendienteIterador;
        int indice;
        
        ArrayList<Integer> arreglo_Padres = new ArrayList<>();//usar un arreglo en lugar de una lista
        for (int i = 0; i< arreglo_arbol.length; i++){
            if (arreglo_arbol[i].getHijo_mas_izquierdo() != -1){//si el nodo tiene un hijo 
                arreglo_Padres.add(i);
            }
        }
        for (int j = 0; j<arreglo_Padres.size(); j++){//recorremos la lista de padres
            padreIterador = arreglo_arbol[arreglo_Padres.get(j)];
            if (padreIterador.getHijo_mas_izquierdo() == n){//si el nodo en el indice n es el hijo mas izq del padre
                return arreglo_Padres.get(j);
            }
            descendienteIterador = arreglo_arbol[padreIterador.getHijo_mas_izquierdo()];
            indice = descendienteIterador.getHermano_derecho();
            descendienteIterador = arreglo_arbol[descendienteIterador.getHermano_derecho()];
            while (descendienteIterador.getHermano_derecho() != -1){//nos movemos a traves de los hermanos del hijo mas izq
                if (indice == n){
                    return arreglo_Padres.get(j);
                }
                indice = descendienteIterador.getHermano_derecho();
                descendienteIterador = arreglo_arbol[descendienteIterador.getHermano_derecho()];
            }
        }
        //si el nodo no tiene padre regresa -1
        return -1;
    }
    
    public int getArreglo_arbol_izq(int n){//listo
        return this.arreglo_arbol[n].getHijo_mas_izquierdo();
    } 
    
    public int getArreglo_arbol_der(int n){//listo
        
        return this.arreglo_arbol[n].getHermano_derecho();
    }
    
    public Object getArreglo_arbol_dato(int n){//listo
        return this.arreglo_arbol[n].getDato();
    }
    
    public int getArreglo_arbol_raiz(){//falta implementar, hay que buscar una manera eficiente de 
        return this.raiz;
    }
    
    
    public void limpiarArbol(){//regresa todos los nodos de arreglo_arbol a valores nulos (este metodo el invocado por el metodo ANULA de la clase arbol)//listo
        for (int i = 0; i<arreglo_arbol.length; i++){
            arreglo_arbol[i].setDato(null);
            arreglo_arbol[i].setHijo_mas_izquierdo(-1);
            arreglo_arbol[i].setHermano_derecho(-1);
        }
    }
    
    public void listar(){//muestra el arbol (en forma de tabla)
        for (int i = 0;i<arreglo_arbol.length;i++){
            System.out.println( arreglo_arbol[i].toString());
        }
    }
    
    public int disponible(){//retorna el indice de la primera celda disponible de arreglo_arbol //listo
        Nodo nodoIterador;
        int j;
        for(j = 0; j<arreglo_arbol.length; j++){
            nodoIterador = arreglo_arbol[j];
            if (nodoIterador.getDato() == null && nodoIterador.getHijo_mas_izquierdo() == -1 && nodoIterador.getHermano_derecho() == -1){
                break; 
            }
        }
        return j;
    }
    
    public Nodo getNodo(int posicion){//devuelve el nodo en el indice "posicion" //listo
        return arreglo_arbol[posicion];
    }

    /* public void inicializar(String opcion){//este metodo solo le da valores al campo dato de cada nodo del arreglo
        if (opcion.equals("letras")){
            int numLetra = 65;
            for(int indice = 0; indice < arreglo_arbol.length; indice++){
                arreglo_arbol[indice].setDato((char)numLetra);
                numLetra++;
            }
        }else if (opcion.equals("numeros")){
            int numero = 20;
            for(int indice = 0; indice < arreglo_arbol.length; indice++){
                arreglo_arbol[indice].setDato(numero);
                numero++;
            }
        }else{//falta programar esta parte
            System.out.println("");
        }
    } */
}
