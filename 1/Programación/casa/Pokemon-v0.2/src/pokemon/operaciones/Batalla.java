/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon.operaciones;

import Enumeraciones.Ataque;
import Enumeraciones.Pokemons;
import javax.swing.JOptionPane;
import com.nicosteuerberg.datos.PedirDatos;

/**
 *
 * @author nicol
 */
public class Batalla {
    public Batalla(){}
    
    Pokemon player1 = new Pokemon();
    Pokemon player2 = new Pokemon();
    
    Ataque aux1[] = new Ataque[4];
    Pokemons auxiliar1[];
    Ataque aux2[] = new Ataque[4];
    Pokemons auxiliar2[];
    
    public void generarPokemon1(){
        Pokemon poke = new Pokemon();
        auxiliar1 = poke.crearPokemons();
        poke.verPokemons(auxiliar1);
        player1.generarPokemon(auxiliar1, PedirDatos.getInt("Jugador 1 teclea o pokemon a usar"));
        System.out.println("\nPlayer 1 tu pokemon es " + player1.getNombre() + " y sus ataques son:");
        player1.generarAtaques(aux1);
        System.out.println("\n");
    }
    
    public void generarPokemon2(){
        Pokemon poke = new Pokemon();
        auxiliar2 = poke.crearPokemons();
        player2.generarPokemon(auxiliar2,PedirDatos.getInt("Jugador 2 teclea o pokemon a usar"));
        System.out.println("\nPlayer 2 tu pokemon es " + player2.getNombre() + " y sus ataques son:");
        player2.generarAtaques(aux2);
        System.out.println("\n");
    }
       
    public void batalla(){
        int num1, num2;
        String estado1 = "vivo";
        String estado2 = "vivo";
        float daño1, daño2;
        int recDaño1, recDaño2;        
        JOptionPane.showMessageDialog(null, "Que empiece la batalla");
        do{
            System.out.println("Jugador 1 elige su ataque");
            player1.verAtaques(aux1);
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 teclee su ataque"));
            System.out.println("\n\nJugador 2 elige su ataque");
            player2.verAtaques(aux2);
            System.out.println("\n");
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Jugador 2 teclee su ataque"));
            
            if(player1.getVelocidad() > player2.getVelocidad()){
                //ataque del jugador 1 por ser más rapido
                
                System.out.println("\n" + player1.getNombre() + " ha usado " + aux1[(num1-1)].name());
                if(player1.getTipo1().equals(player2.getDebilidad1()) || player1.getTipo1().equals(player2.getDebilidad2())){
                    daño1 = 1.5f * 0.01f * 85 * 2 * (((0.2f * 25 + 1)* aux1[(num1-1)].getDanoBase() * player1.getOfensiva()) / (25 * player2.getDefensa()) + 2 );
                    System.out.println("Ha sido supereficaz");
                }
                else if(player1.getDebilidad1().equals(player2.getTipo1()) || player1.getDebilidad2().equals(player2.getTipo1())){
                    daño1 = 1.5f * 0.01f * 85 * 0.5f * (((0.2f * 25 + 1)* aux1[(num1-1)].getDanoBase() * player1.getOfensiva()) / (player2.getDefensa() * 25) + 2);
                    System.out.println("Ha sido débil");
                }
                else{
                    daño1 = 1.5f * 0.01f * 85 * (((0.2f * 25 + 1) * aux1[(num1-1)].getDanoBase() * player1.getOfensiva()) / (player2.getDefensa() * 25) + 2);
                }
                recDaño2 = (int) (player2.getVida() - daño1);
                player2.setVida(recDaño2);
                
                //si la vida baja o llega a 0 que diga que se murio, si no a cuanta vida quedó
                if(player2.getVida() <= 0){
                    System.out.println(player2.getNombre() + " ha sido debilitado");
                    estado2 = "muelto";
                    break;
                }
                else{
                    System.out.println(player2.getNombre() + " se ha quedado ha: " + player2.getVida() + "\n");
                }
                
                //turno del ataque de jugador 2 por ser más lento
                System.out.println("\n" + player2.getNombre() + " ha usado " + aux2[(num2-1)].name());
                if(player2.getTipo1().equals(player1.getDebilidad1()) || player2.getTipo1().equals(player1.getDebilidad2())){
                    daño2 =  1.5f * 0.01f * 2 * 85 * (((0.2f * 25 + 1 )* aux2[(num2-1)].getDanoBase() * player2.getOfensiva()) / (player1.getDefensa() * 25) + 2);
                    System.out.println("Ha sido supereficaz");
                }
                else if(player2.getDebilidad1().equals(player1.getTipo1()) || player2.getDebilidad2().equals(player1.getTipo1())){
                    daño2 = 1.5f * 0.01f * 0.5f * 85 *(((0.20f * 25 + 1)* aux2[(num2-1)].getDanoBase() * player2.getOfensiva()) / (player1.getDefensa() * 25) + 2);
                    System.out.println("Ha sido débil");
                    System.out.println(daño2);
                }
                else{
                    daño2 = 1.5f * 0.01f * 85 * (((0.20f * 25 + 1)* aux2[(num2-1)].getDanoBase() * player2.getOfensiva()) / (player1.getDefensa() * 25) + 2);
                }
                recDaño1 = (int) (player1.getVida() - daño2);
                player1.setVida(recDaño1);

                //si la vida baja o llega a 0 que diga que se murio, si no a cuanta vida quedó
                if(player1.getVida() <= 0){
                    System.out.println(player1.getNombre() + " ha sido debilitado");
                    estado1 = "muelto";
                    break;
                }
                else{
                    System.out.println(player1.getNombre() + " se ha quedado ha: " + player1.getVida() + "\n");
                }
                
                
                
            }else{
                //jugador 2 ataca antes por ser mas veloz
                
                System.out.println("\n" + player2.getNombre() + " ha usado " + aux2[(num2-1)].name());
                if(player2.getTipo1().equals(player1.getDebilidad1()) || player2.getTipo1().equals(player1.getDebilidad2())){
                    daño2 = 1.5f * 0.01f * 2 * 85 * (((0.20f * 25 + 1)* aux2[(num2-1)].getDanoBase() * player2.getOfensiva()) / (player1.getDefensa() * 25) + 2);
                    System.out.println("Ha sido supereficaz");
                }
                else if(player2.getDebilidad1().equals(player1.getTipo1()) || player2.getDebilidad2().equals(player1.getTipo1())){
                    daño2 = 1.5f * 0.01f * 0.5f * 85 * (((0.20f * 25 + 1)* aux2[(num2-1)].getDanoBase() * player2.getOfensiva()) / (player1.getDefensa() * 25) + 2);
                    System.out.println("Ha sido débil");
                }
                else{
                    daño2 = 1.5f * 0.01f * 85 * (((0.20f * 25 + 1) * aux2[(num2-1)].getDanoBase() * player2.getOfensiva()) / (player1.getDefensa() * 25) + 2);
                }
                recDaño1 = (int) (player1.getVida() - daño2);
                player1.setVida(recDaño1);
                
                //si la vida baja o llega a 0 que diga que se murio, si no a cuanta vida quedó
                if(player1.getVida() <= 0){
                    System.out.println(player1.getNombre() + " ha sido debilitado");
                    estado1 = "muelto";
                    break;
                }
                else{
                    System.out.println(player1.getNombre() + " se ha quedado ha: " + player1.getVida() + "\n");
                }
                
                //turno del ataque de jugador 1 por ser más lento
                System.out.println("\n" + player1.getNombre() + " ha usado " + aux1[(num1-1)].name());
                if(player1.getTipo1().equals(player2.getDebilidad1()) || player1.getTipo1().equals(player2.getDebilidad2())){
                    daño1 = 1.5f * 0.01f * 2 * 85 *(((0.20f * 25 + 1) * aux1[(num1-1)].getDanoBase() * player1.getOfensiva()) / (player2.getDefensa() * 25) + 2);
                    System.out.println("Ha sido supereficaz");
                }
                else if(player1.getDebilidad1().equals(player2.getTipo1()) || player1.getDebilidad2().equals(player2.getTipo1())){
                    daño1 = 1.5f * 0.01f * 85 * 0.5f * (((0.20f * 25 + 1) * aux1[(num1-1)].getDanoBase() * player1.getOfensiva()) / (player2.getDefensa()* 25) + 2);
                    System.out.println("Ha sido débil");
                }
                else{
                    daño1 = 1.5f * 0.01f * 85 * (((0.20f * 25 + 1 ) * aux1[(num1-1)].getDanoBase() * player1.getOfensiva()) / (player2.getDefensa() * 25) + 2);
                }
                recDaño2 = (int) (player2.getVida() - daño1);
                player2.setVida(recDaño2);

                //si la vida baja o llega a 0 que diga que se murio, si no a cuanta vida quedó
                if(player2.getVida() <= 0){
                    System.out.println(player2.getNombre() + " ha sido debilitado");
                    estado2 = "muelto";
                    break;
                }
                else{
                    System.out.println(player2.getNombre() + " se ha quedado ha: " + player2.getVida() + "\n");
                }
            }
            
        }while(estado1.equals("vivo") && estado2.equals("vivo"));
        if(estado1.equals("muelto")){
            System.out.println("Jugador 2 ha ganado a Jugador 1:\nPor lo que: " + player2.getNombre() + " ha ganado a " + player1.getNombre());
        }
        else{
            System.out.println("Jugador 1 ha ganado a Jugador 2:\nPor lo que: " + player1.getNombre() + " ha ganado a " + player2.getNombre());
        }
    }
}
