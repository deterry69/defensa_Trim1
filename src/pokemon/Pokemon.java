package pokemon;

public class Pokemon {
//creamos los atributos
    private String nombre;
    private int nivel;
    protected int puntosSalud;
    private int ataque;
    public enum Tipo {NORMAL, FUEGO, AGUA, PLANTA, SINIESTRO, PSIQUICO}
    private Tipo tipo;
//constructor
public Pokemon(String nombre, int nivel, int puntosSalud, int ataque, Tipo tipo) {
    this.nombre = nombre;
    this.nivel = nivel;
    this.puntosSalud = puntosSalud;
    this.ataque = ataque;
    this.tipo = tipo;
}

    //Constructor vacío: permite crear un objeto sin inicializar atributos.
    public Pokemon() {
    }

    //Constructor con parámetros parcial: inicializa atributos excepto tipo (por defecto NORMAL).
    public Pokemon(String nombre, int nivel, int puntosSalud, int ataque) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosSalud = puntosSalud;
        this.ataque = ataque;
        this.tipo = Tipo.NORMAL;
    }

    //Sirven para acceder y modificar los atributos privados de una clase, respectivamente, lo que permite un control y una encapsulación adecuados de los datos.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public int setPuntosSalud(int puntosSalud) {
        this.puntosSalud = puntosSalud;
        return puntosSalud;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    //Devuelve true si puntosSalud es menor o igual que 0.
    public boolean debilitado() {
        return this.puntosSalud <= 0;
    }

    //Resta al Pokémon que se pasa como parámetro tantos puntos de salud como ataque tiene el atacante.
    public void atacar(Pokemon pokemonAtacante) {
        int nuevaSalud = pokemonAtacante.getPuntosSalud() - this.ataque;
    }

    //Devuelve una representación en texto.
    @Override
    public String toString() {
        return nombre + " (nivel " + nivel + ")";
    }
}

