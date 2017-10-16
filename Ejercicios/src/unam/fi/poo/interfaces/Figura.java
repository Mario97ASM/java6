package unam.fi.interfaces;

public interface  Figura{
  int posx;
  int posy;

  public interface double calcularArea();

  public void mostrarCordenadas(){
      System.out.println("valor x" + this.posx);
      System.out.println("valor y" + this.posy);

  }
}
