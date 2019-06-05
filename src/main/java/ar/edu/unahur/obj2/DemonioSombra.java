package ar.edu.unahur.obj2;

public class DemonioSombra extends Demonio {


    public DemonioSombra(Caceria caceria) {
        super(caceria);
    }

    public DemonioSombra(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }

    @Override
    public void OrdenCazarAlma(Lugar lugar) {



    }

    @Override

    public int atormentarAlma(Alma alma){

        return alma.getNivelValor()/2;
    }


}
