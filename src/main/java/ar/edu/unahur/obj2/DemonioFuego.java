package ar.edu.unahur.obj2;

public class DemonioFuego extends Demonio {


    public DemonioFuego(Caceria caceria) {
        super(caceria);

    }

    public DemonioFuego(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }

    @Override
    public void OrdenCazarAlma(Lugar lugar) {

    }

    @Override

    public boolean atormentarAlma(Alma alma){

        return alma.esFriolenta=false;
    }
}
