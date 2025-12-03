package personas;

import pokemon.Pokemon;
//creamos los atributos
public class Persona {
    private String nombre;
    private int edad;
    private Pokemon pokemonFavorito;
    private int numPokemon;
//generamos contructor
    public Persona(String nombre, int edad, Pokemon pokemonFavorito, int numPokemon) {
        this.nombre = nombre;
        this.edad = edad;
        this.pokemonFavorito = pokemonFavorito;
        this.numPokemon = numPokemon;
    }
//y constructor vacio
    public Persona() {
    }
//getter and setter
    public String nombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int edad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Pokemon pokemonFavorito() {
        return pokemonFavorito;
    }

    public void setPokemonFavorito(Pokemon pokemonFavorito) {
        this.pokemonFavorito = pokemonFavorito;
    }

    public int numPokemon() {
        return numPokemon;
    }

    public void setNumPokemon(int numPokemon) {
        this.numPokemon = numPokemon;
    }
    //este método sirve para ver el saludo y pokemon favorito de alguien
    public String saludo(){
        return "Hola, soy " + nombre + " y mi Pokémon favorito es " + pokemonFavorito;
    }
    //Devuelve una representación en texto.
    @Override
    public String toString() {
        return nombre + " (" + edad + " años" + ")";
    }
}
