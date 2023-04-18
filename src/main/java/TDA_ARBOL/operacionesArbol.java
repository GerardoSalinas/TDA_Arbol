/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TDA_ARBOL;

/**
 *
 * @author dell
 */
public interface operacionesArbol {
    public int PADRE(int n);
    public int HIJO_MAS_IZQ(int n);
    public int HERMANO_DER(int n);
    public Object ETIQUETA(int n);
    public int RAIZ();
    public void ANULA();
    public int CREA(Object v);
    public int CREA(Object v, int ...A);
    
    public void ORD_PREVIO(int n);
    public void ORD_POSTERIOR(int n);
    public void ORD_SIMETRICO(int n);
    
}
