package Test;


import TdaLista.Lista;
import TdaLista.SList;

public class App {
    public static void main(String[] args) {
        Lista<Integer> listaNumeros= new Lista<>();
        SList listaNumerosE = new SList();
        SList lista2 = new SList();

        lista2.append(77);
        System.out.println(lista2);

        int dato = 0;

        for(int i = 0; i < 20; i++){
            listaNumerosE.append(dato);
            dato ++;
        }




        System.out.println(listaNumerosE.buscar(19));
        System.out.println(listaNumerosE);







    }
}
