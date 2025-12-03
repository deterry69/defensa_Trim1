package personas;


import pokemon.Pokemon;


public class LiderGimnasio extends Persona {
    //creamos los atributos
    private String region;
    private String ciudad;
    public boolean sinDerrotar;

    public LiderGimnasio(String nombre, int edad, Pokemon pokemonFavorito, int numPokemon, String region, String ciudad, boolean sinDerrotar) {
        super(nombre, edad, pokemonFavorito, numPokemon);
        this.region = region;
        this.ciudad = ciudad;
        this.sinDerrotar = sinDerrotar;
    }

    public LiderGimnasio(String region, String ciudad, boolean sinDerrotar) {
        this.region = region;
        this.ciudad = ciudad;
        this.sinDerrotar = sinDerrotar;
    }

    public String region() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String ciudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public boolean sinDerrotar() {
        return sinDerrotar;
    }

    public void setSinDerrotar(boolean sinDerrotar) {
        this.sinDerrotar = sinDerrotar;
    }
    @Override
    public String toString() {
        return "LIDER " + this.nombre() + ", de ciudad " +  this.ciudad + " (" + this.edad() + " años)";
    }
}


