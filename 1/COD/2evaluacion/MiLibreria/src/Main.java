public class Main {
    public static void main(String[] args) {
        /*
        boolean isOK_ventana = false;
        boolean isOK_consola = false;

        isOK_consola = com.nico.io.EntradaSalida.salida("Hola", com.nico.io.EntradaSalida.SALIDA_CONSOLA);
        if (!isOK_consola) System.out.println("ERROR CONSOLA");

        isOK_ventana = com.nico.io.EntradaSalida.salida("Hello world", com.nico.io.EntradaSalida.SALIDA_WINDOW);
        if (!isOK_ventana) System.out.println("ERROR VENTANA");
        */
        String dato;
        dato = EntradaSalida.entradaString("Teclee tu nombre");

        Integer numero = EntradaSalida.entradaInt("Teclee tu edad");
        if(numero!=null){
            EntradaSalida.salida(dato + numero + " años", EntradaSalida.SALIDA_WINDOW);
        }else{
            EntradaSalida.salida("Error en entero", EntradaSalida.SALIDA_CONSOLA);
        }

    }
}
