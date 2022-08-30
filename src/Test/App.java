package Test;


import TdaLista.Lista;
import TdaLista.SList;

public class App {
    public static void main(String[] args) {
        Lista<Integer> listaNumeros= new Lista<>();
        SList listaNumerosE = new SList();
        SList lista2 = new SList();



        int dato = 0;

        for(int i = 0; i < 20; i++){
            listaNumerosE.append(dato);
            dato ++;
        }


        System.out.println(listaNumerosE);


        System.out.println(listaNumerosE);
        System.out.println(listaNumerosE.buscarDato(19));





    }
}
