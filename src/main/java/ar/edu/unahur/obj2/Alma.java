package ar.edu.unahur.obj2;

public class Alma {

    public boolean esFriolenta;
    private int nivelBondad;
    private int nivelValor;
    private boolean esJodida;

    public Alma(int nivelBondad, int nivelValor, boolean esFriolenta, boolean esJodida) {
        this.nivelBondad = nivelBondad;
        this.nivelValor = nivelValor;
        this.esFriolenta = esFriolenta;
        this.esJodida = esJodida;
    }

    public int getNivelBondad() {
        return nivelBondad;
    }

    public int getNivelValor() {
        return nivelValor;
    }

    public boolean isEsFriolenta() {
        return esFriolenta=true;
    }


    public int almasNocazadas(){
        return nivelBondad-5;
    }

    public int luchaMarcial(Alma alma){

        return nivelValor *2;
    }

    public boolean supervivenciaExtrema(Alma alma){

        return esFriolenta;
    }

    public int cruzRoja(Alma alma){

        return nivelValor +=100;

    }
}
