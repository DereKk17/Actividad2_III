package Actividad2;


import java.util.Scanner;

public class App {
    private static Scanner leer = new Scanner(System.in);

    private static Funcion misEstudiantes = (new Funcion());
    private static Funcion misEstudiantesS = (new Funcion());
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++){
            agregarEstudiante();
        }

        mostrarEstudiantes();
        transformarLista();
        mostrarEstudiantes();


    }







    public static void agregarEstudiante(){

        String nombre = "estudiante" + String.valueOf((int)Math.floor(Math.random()*(1000 - 1 + 1) + (1)));

        int edad = (int) Math.floor(Math.random()*(20 - 3 + 1) + (3));
        int opcionGenero = (int) Math.floor(Math.random()*(2 - 1 + 1) + (1));

        String genero;
        if(opcionGenero == 2) {
            genero = "M";
        }else{
            genero = "F";
        }

        misEstudiantes.agregarEst(nombre, edad, genero);
    }

    public static void agregarEstudianteS(){
        String nombre = "estudiante" + String.valueOf((int)Math.floor(Math.random()*(1000 - 1 + 1) + (1)));

        int edad = (int) Math.floor(Math.random()*(20 - 3 + 1) + (3));
        int opcionGenero = (int) Math.floor(Math.random()*(2 - 1 + 1) + (1));

        String genero;
        if(opcionGenero == 2) {
            genero = "M";
        }else{
            genero = "F";
        }

        misEstudiantesS.agregarEstS(nombre, edad, genero);
    }


    public static void borrarEstudiante(){
        System.out.println("Nombre del estudiante a borrar");
        String nombre = leer.next();
        //misEstudiantes.borrarEst(misEstudiantes.buscarEst(nombre));
    }

    public static void borrarEstudianteS(){
        System.out.println("Nombre del estudiante a borrar");
        String nombre = leer.next();

        for(int i = 0; i < misEstudiantesS.size(); i++){
            Estudiante estudiante = misEstudiantes.buscarEstS(i);
            if(estudiante.getNombre() == nombre){
                misEstudiantesS.borrarEstS(estudiante);
                break;
            }
        }
    }

    public static void transformarLista(){
        Estudiante estudiante;
        Estudiante siguiente;
        int i = 0;
        estudiante =  misEstudiantes.buscarEst(misEstudiantes.size() - 1);
        siguiente =  misEstudiantes.buscarEst(misEstudiantes.size());

        if(estudiante.getGenero() == "M"){
            misEstudiantes.transformarListaMasculino(estudiante,siguiente,0);
        }else{
            misEstudiantes.transformarListaFemenino(estudiante,siguiente,0);
        }
    }

    public static void mostrarEstudiantes(){
        System.out.println(misEstudiantes.mostrarEst());
    }
    public static void mostrarEstudiantesS(){
        System.out.println(misEstudiantesS.mostrarEstS());
    }
}
