package TdaLista;

import java.io.ObjectStreamException;

public class SList<E> {
    private Object[] sLista= new Object[200];
    private int size = 0;


    public boolean isEmpty(){
        return sLista == null;
    }

    public void append(E dato) {
        if (isEmpty()) {
            sLista[0] = dato;
            size++;
        } else {
            sLista[size] = dato;
            size++;
        }
    }

    public void appendComienzo(E dato) {
        if (isEmpty()) {
            sLista[0] = dato;
            size++;
        } else {
            int i = size;
             while(i >= 1){
                 sLista[i--] = sLista[i];

             }
             sLista[0] = dato;
             size++;
        }

    }

    public void appendEntreDato(E dato, E next){
        if (isEmpty()) {
            sLista[0] = dato;
            size++;
        }else{
            int i;
            for(i = size; i >= 0; i-- ){
                if(sLista[i] == next){
                    break;
                }
            }
            int objetoSeparar = i;
            int aux = size;

            while (aux > objetoSeparar) {
                sLista[aux --] = sLista[aux];
            }
            sLista[objetoSeparar] = dato;
            size++;

        }
    }

    public void appendEntre(E dato, int indice){
        if (isEmpty()) {
            sLista[size] = dato;
            size ++;
        }else{
            int i = size;
            while(i >= indice){
                sLista[i--] = sLista[i];
            }
            sLista[indice] = dato;
            size ++;
        }
    }

    public int obtenerIndice(Object dato){
        int i = 0;
        while(sLista[i] != null){
            if(sLista[i] == dato){
                break;
            }
            i++;
        }
        return i;
    }

    public Object buscar(int indice){
        return sLista[indice];
    }

    public E buscarDato(Object dato){

        int i = 0;
        while(sLista[i] != null){
            if(sLista[i] == dato){
                break;
            }
            i++;
        }
        return (E) sLista[i];
    }


    public boolean esta(E dato){
        boolean estado = false;
        int i = 0;
        while(sLista[i] != null){
            if(sLista[i] == dato){
                estado = true;
                break;
            }
            i++;
        }
        return estado;
    }

    public void borrar(E dato){
        int i = 0;
        while(sLista[i] != null){
            if(sLista[i] == dato){
                sLista[i] = null;
                break;
            }
            i++;
        }
        for(int aux = i ; aux <= size; aux++ ){
            sLista[aux] = sLista[aux + 1];
        }
        size --;
    }

    public void borrarIndice(int indice){
        sLista[indice] = null;

        for(int aux = indice ; aux <= size; aux++ ){
            sLista[aux] = sLista[aux + 1];
        }
        size --;
    }

    public String toString(){
        String lista = "";
        for(int i = 0; sLista[i] != null; i++){
            lista = lista + " " + sLista[i];
        }

        return lista;
    }


    public int size(){
        return size;
    }

}
