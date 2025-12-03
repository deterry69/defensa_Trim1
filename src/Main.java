import pokemon.Pokemon;
import personas.Entrenador;
import personas.LiderGimnasio;
import pokemon.Pocion;

public class Main {
    public static void main(String[] args) {
        //Creamos 4 pokémon
        Pokemon Snivy = new Pokemon("Snivy", 5, 50, 70, Pokemon.Tipo.PLANTA);
        Pokemon Tepig = new Pokemon("Tepig", 5, 70, 50, Pokemon.Tipo.FUEGO);
        Pokemon Oshawott = new Pokemon("Oshawott", 5, 60, 60, Pokemon.Tipo.AGUA);
        Pokemon Pidove = new Pokemon("Pidove", 3, 35, 45, Pokemon.Tipo.NORMAL);
        //Ataque 1: Snivy ataca a Oshawott.
        System.out.println("Snivy ataca a Oshawott");
        Snivy.atacar(Oshawott);
        //Imprimimos el estado actual de salud accediendo al atributo mediante el getter.
        System.out.println("Salud restante de Oshawott: " + Oshawott.getPuntosSalud());

        //Ataque 2: Oshawott ataca a Tepig.
        System.out.println("Oshawott ataca a Tepig");
        Oshawott.atacar(Tepig);
        System.out.println("Salud restante de Tepig: " + Tepig.getPuntosSalud());
        //Cuanto cura una poción
        Pocion pocion1 = new Pocion(30, 300);
        pocion1.curar(Tepig);
        System.out.println(Tepig.getPuntosSalud());
        //Creamos 2 entrenadores
        Entrenador entrenador1 = new Entrenador("Misty", 21, Oshawott, 4, 2, Entrenador.Clase.PESCADOR);
        System.out.println(entrenador1.toString());
        Entrenador entrenador2 = new Entrenador("Millo", 25, Snivy, 3, 1, Entrenador.Clase.DOMINGUERO);
        System.out.println(entrenador2.toString());
        //Creamos un líder de gimnasio
        LiderGimnasio liderGimnasio1 = new LiderGimnasio("Lem", 24, Pidove, 5, "Kalos", "Luminalia", false);
        System.out.println(liderGimnasio1.toString());
    }
}