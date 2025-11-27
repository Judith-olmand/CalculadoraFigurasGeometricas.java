public class Triangulo extends Figura{
    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    /**
     * Creo un constructor para los tiangulos equilateros
     * @param lado1
     * @param altura --> para el area
     */
    public Triangulo(double lado1, double altura){
        base = lado1;
        this.lado1 = lado1;
        lado2 = lado1;
        this.altura = altura; // para el area
    }

    /**
     * Creo un constructor para los tiangulos isosceles
     * @param lado1
     * @param lado2
     * @param altura --> para el area
     */
    public Triangulo(double lado1, double lado2, double altura){ //constructor para triangulo isosceles
        base = lado1;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura; // para el area
    }

    /**
     * Creo un constructor para los tiangulos escalenos
     * @param base
     * @param lado1
     * @param lado2
     * @param altura --> para el area
     */
    public Triangulo(double base,double lado1, double lado2, double altura){
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
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

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public  void calcularPerimetro(){
        double perimetro = lado1+lado2+base;
        System.out.printf(" %.2f es el perimetro del triángulo %n", perimetro);
    }

    @Override
    public void calcularArea() {
        double area = (base*altura)/2;
        System.out.printf(" %.2f es el area del triángulo %n", area);
    }

}
