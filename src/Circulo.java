public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularPerimetro(){
        double perimetro = Math.PI*radio*2;
        System.out.printf(" %.2f es el perimetro del circulo %n", perimetro);
    }

    @Override
    public void calcularArea() {
        double area = Math.PI*Math.pow(radio,2);
        System.out.printf(" %.2f es el area del circulo %n", area);
    }

}
