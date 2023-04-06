package Logica;

public abstract class Pokemon {
    protected int  numPokedex;
    protected String nombre;
    protected int peso;
    protected String sexo;
    protected int temporada;
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
}
