/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

/**
 *
 * @author dam1
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos obxM = new Metodos();
        int aux [][];
        float auxm[];
        float auxma[];
        aux = obxM.crearMatriz();
        auxm = obxM.crearMediaAlumno(aux);
        auxma = obxM.crearMediaAsignatura(aux);
        obxM.verMatriz(aux, auxm,auxma);
        System.out.println("\n\n");
        obxM.ordenar(aux, auxm);
        obxM.verMatriz(aux, auxm, auxma);
    }
    
}
