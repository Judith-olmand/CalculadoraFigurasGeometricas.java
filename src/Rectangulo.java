public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public  void calcularPerimetro(){
        double perimetro = 2*(base+altura);
        System.out.printf(" %.2f es el perimetro del rectángulo %n", perimetro);
    }

    @Override
    public void calcularArea() {
        double area = base*altura;
        System.out.printf(" %.2f es el area del rectángulo %n", area);
    }

}
