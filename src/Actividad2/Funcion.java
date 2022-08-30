package Actividad2;
import TdaLista.Lista;
import TdaLista.SList;
import Actividad2.Estudiante;


public class Funcion {

    Lista<Estudiante> lista;
    SList<Estudiante> arreglo;

    public void agregarEst(String nombre, int edad, String genero){
        lista.append(new Estudiante(nombre, edad, genero));
    }

    public void agregarEstS(String nombre, int edad, String genero){
        arreglo.append(new Estudiante(nombre, edad, genero));
    }

    public void borrarEst(String nombre){
        lista.borrar(new Estudiante(nombre));
    }

}
