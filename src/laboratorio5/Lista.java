
package laboratorio5;

import javax.swing.JOptionPane;


public class Lista {
 private Nodo  primero;
 private Nodo  ultimo; 
 
 public Lista(){
     this.primero=null;
     this.ultimo=null;
 }
 public void anexarInicioLista(int dato){
     Nodo nuevo;
     nuevo= new Nodo(dato);
     if(primero==null){
         primero=nuevo;
         ultimo=nuevo;   
     }
     else{
         nuevo.setEnlace(primero);
         primero=nuevo;
     }
 }
 public void anexarFinalLista(int dato){
    Nodo nuevo;
     nuevo= new Nodo(dato);  
    if(primero==null){
         primero=nuevo;
         ultimo=nuevo;   
     }
    else{
        ultimo.setEnlace(nuevo);
        ultimo=nuevo;
         ultimo.setEnlace(null);
    }
 }
 
 public boolean esVacia(){
     return (primero==null);
 }
  public boolean buscarNodo(int dato){
      boolean encontre=false;
      Nodo p= primero;
      while(p.getEnlace()!=null&& encontre==false){
         if(p.getDato()==dato)
            encontre=true;
         p.getEnlace();
      }
      return encontre;
  }
  
  public boolean borrarNodoInicio(){
      if(esVacia())
          return false;
      if(primero.getEnlace()==null){
          primero=null;
          ultimo=null;
          return false;
      }
      else{
          Nodo temp= primero;
          primero=primero.getEnlace();
          temp.setEnlace(null);
          return true;
      }
  }
    public boolean borrarNodoFinal(){
     if(esVacia())
          return false;
      if(primero.getEnlace()==null){
          primero=null;
          ultimo=null;
          return false;
    }
      else{
      Nodo temp=primero;
      Nodo aux=primero;
      while(temp.getEnlace()!=null){
          aux=temp;
          temp=temp.getEnlace();
      }
      ultimo=aux;
      ultimo.setEnlace(null);
      return true;             
      }
    }
    public void imprimir() {
        if(enlace != 0) {
            Nodo temp = aux;
            String str = "";
            for(int i = 0; i < this.temp; i++) {
                str = str + temp.getEnlace + "\n";
                temp = temp.getDato;
            }
             JOptionPane.showMessageDialog(null, str);
        }
    }
}

