package Actividad2;
import TdaLista.Lista;
import TdaLista.SList;
import Actividad2.Estudiante;


public class Funcion {

    Lista<Estudiante> lista;
    SList<Estudiante> arreglo;

    public Funcion() {
        this.lista = new Lista<>();
        this.arreglo = new SList<>();
    }

    public void agregarEst(String nombre, int edad, String genero){
        lista.append(new Estudiante(nombre, edad, genero));
    }

    public  void agregarEstS(String nombre, int edad, String genero){
        arreglo.append(new Estudiante(nombre, edad, genero));
    }

    public void borrarEst(Estudiante estudiante){
        lista.borrar(estudiante);
    }

    public void borrarEstS( Estudiante estudiante){
        arreglo.borrar(estudiante);
    }

    public Estudiante buscarEst(int indice){
        return (Estudiante) lista.buscarPorDato(indice);
    }

    public Estudiante buscarEstS(int indice){
        return (Estudiante) arreglo.buscar(indice);
    }

    public int obtenerIndiceEsts(Estudiante estudiante){
        return arreglo.obtenerIndice(estudiante);
    }

    public void transformarListaMasculino(Estudiante estudiante, Estudiante estSiguiente, int i){
        if(i >= lista.size()){

        }else{
            estudiante = (Estudiante) lista.buscarPorDato(i);
            if(estudiante.getGenero() == "F" ){
                estSiguiente = (Estudiante) lista.buscarPorDato(i + 1);
                if(estSiguiente.getGenero() == "M"){
                    lista.set(estSiguiente,i);
                    lista.set(estudiante, i + 1);
                }
            }
            transformarListaMasculino(estudiante,estSiguiente,i + 1);
        }
    }

    public void transformarListaFemenino(Estudiante estudiante, Estudiante estSiguiente, int i){
        if(i >= lista.size()){

        }else{
            estudiante = (Estudiante) lista.buscarPorDato(i);
            if(estudiante.getGenero() == "M"){
                estSiguiente = (Estudiante) lista.buscarPorDato(i + 1);
                if(estSiguiente.getGenero() == "F"){
                    lista.set(estSiguiente,i);
                    lista.set(estudiante, i + 1);
                }
            }
            transformarListaFemenino(estudiante,estSiguiente,i + 1);
        }
    }



    public int size(){
        return lista.size();
    }

    public String mostrarEst(){
        return lista.toString();
    }
    public String mostrarEstS(){
        return arreglo.toString();
    }

}
