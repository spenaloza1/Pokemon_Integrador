package Logica;

public class Charmander extends Pokemon implements IFuego{
    public Charmander() {
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque puño de fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Hola soy Charmander y este es mi ataque lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque ascuas");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi ataque lanza arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque lanza mordisco");
    }
}
