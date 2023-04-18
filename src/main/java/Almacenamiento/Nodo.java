/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacenamiento;

/**
 *
 * @author Gerardo Salinas
 */
public class Nodo {
    private int hijo_mas_izquierdo;//indice(en el arreglo) del hijo mas izquierdo del Nodo
    private Object dato;
    private int hermano_derecho;//indice(en el arreglo) del hermano adyacente a la derecha del Nodo
    
    //constructor
    public Nodo(){//predeterminado (sin parametros) crea un nodo vacío
       this.hijo_mas_izquierdo = -1;
       this.hermano_derecho = -1;
       this.dato = null;
    }
    
    public Nodo(Object valor, int hijo_izquierdo, int hermano_derecho){
       this.hijo_mas_izquierdo = hijo_izquierdo;
       this.hermano_derecho = hermano_derecho;
       this.dato = valor;
    }
    
    
    //setters
    public void setHijo_mas_izquierdo(int indice){
        this.hijo_mas_izquierdo = indice;
    }
    
    public void setHermano_derecho(int indice){
        this.hermano_derecho = indice;
    }
    
    public void setDato(Object valor){
        this.dato = valor;
    }
    
    //getters
    public int getHijo_mas_izquierdo(){
        return this.hijo_mas_izquierdo;
    }
    public int getHermano_derecho(){
        return this.hermano_derecho;
    }
    
    public Object getDato(){
        return this.dato;
    }
    
    
    @Override
    public String toString(){//falta implementar correctamente
        String descripcion;
        descripcion =  "| "+hijo_mas_izquierdo+ "| " +dato+ " | " + hermano_derecho+" | ";
        return descripcion;
    }
    //la idea es que lo muestre de la siguiente forma:  "|Hijo_mas_izquierdo| |Dato| |Hermano Derecho|"
}
