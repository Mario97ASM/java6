package unam.fi.poo.abstractas;

public abstract class Figura {
    int posx;
    int posy;

    public abstract double calcularArea();

    public void mostrarCordenadas(){
        System.out.println("valor x" + this.posx);
        System.out.println("valor y" + this.posy);

    }

}
