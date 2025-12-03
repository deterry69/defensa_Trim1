package pokemon;

public class Pocion {
    //creamos los atributos
    private int puntosRestaurados;
    private int precio;
//generamos contructor
    public Pocion(int puntosRestaurados, int precio) {
        this.puntosRestaurados = puntosRestaurados;
        this.precio = precio;
    }
//generamos constructor vacío
    public Pocion() {
    }
//getter y setter
    public int puntosRestaurados() {
        return puntosRestaurados;
    }

    public void setPuntosRestaurados(int puntosRestaurados) {
        this.puntosRestaurados = puntosRestaurados;
    }
    public void getPuntosRestaurados(int puntosRestaurados) {
        this.puntosRestaurados = puntosRestaurados;
    }

    public int precio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void getPrecio(int precio) {
        this.precio = precio;
    }
    //suma al pokemon cuantos puntos de salud tiene el pokemon y cuanto cura la poción
    public void curar(Pokemon objetivo) {
        objetivo.puntosSalud += this.puntosRestaurados;
    }

//calculamos el precio con impuesto de las pociones
    public double getPrecioConImpuesto(double impuesto){
        return (int) (this.precio + (this.precio * (impuesto/100)));
        }
    //Devuelve una representación en texto.

    @Override
    public String toString() {
        return "Poción: " + precio + " Pokedolares";
}
    }

