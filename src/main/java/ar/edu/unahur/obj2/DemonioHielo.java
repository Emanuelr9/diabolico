package ar.edu.unahur.obj2;

public class DemonioHielo extends Demonio {


    public DemonioHielo(Caceria caceria) {
        super(caceria);
    }

    public DemonioHielo(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }

    @Override
    public void OrdenCazarAlma(Lugar lugar){

    }

    @Override
    public boolean atormentarAlma(Alma alma) {

        return alma.esFriolenta=true;
    }


}
