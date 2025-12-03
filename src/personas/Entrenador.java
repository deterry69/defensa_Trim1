package personas;

import pokemon.Pokemon;

public class Entrenador extends Persona {
    //creamos los atributos
    private int medallas;
    public enum Clase{DOMINGUERO, CAZABICHOS, MONTANYERO, PESCADOR, ORNITOLOGO}
    private Clase clase;

    public Entrenador(String nombre, int edad, Pokemon pokemonFavorito, int numPokemon, int medallas, Clase clase) {
        super(nombre, edad, pokemonFavorito, numPokemon);
        this.medallas = medallas;
        this.clase = clase;
    }

    public Entrenador() {
    }

    public Entrenador(int medallas, Clase clase) {
        this.medallas = 0;
        this.clase = clase;
    }

    public int medallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public Clase clase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }
    public int ganarMedallas(int numMedallas){
        return numMedallas + medallas;
    }
    public boolean ligaDisponible(){
        return medallas >= 8;
    }
    //Devuelve una representación en texto.
    @Override
    public String toString() {
        return clase + " " + this.nombre() + " (" + edad() + " años" + ")";
    }
}
