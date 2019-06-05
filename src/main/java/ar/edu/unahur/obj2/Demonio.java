package ar.edu.unahur.obj2;

public abstract class Demonio {

    private int nivelDeMaldad=0;

    public Demonio(int nivelDeMaldad) {
        this.nivelDeMaldad = nivelDeMaldad;
    }

    public int getNivelDeMaldad() {
        return nivelDeMaldad;
    }

    public Caceria getCaceria() {
        return caceria;
    }

    private Caceria caceria;

    public Demonio( Caceria caceria) {

        this.caceria = caceria;
    }





    public abstract void OrdenCazarAlma(Lugar lugar);



    public abstract boolean atormentarAlma(Alma alma);
}


