public class Rectangulo extends Figura{
    private double base;
    private double altura;

    /**
     * Creo el constructor para esta figura pasando unos parámetros
     * @param base
     * @param altura
     * @throws NumeroNegativo lanza la excepción que habiamos creado antes con un mensaje personalizado.
     * La pongo aquí porque es el constructor el que puede lanzar la excepción cuando al intentar pasar los parámetros
     * estos sean negativos.
     */
    public Rectangulo(double base, double altura) throws NumeroNegativo{
        if (base < 0 || altura < 0){
            throw new NumeroNegativo("✘✘✘ Las medidas deben ser números positivos.");
        }
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
    public void dibujar() {
        System.out.println("  * * * * * * * * * * * * ");
        System.out.println("  *                     * ");
        System.out.println("  *                     * ");
        System.out.println("  *                     * ");
        System.out.println("  *                     * ");
        System.out.println("  * * * * * * * * * * * * ");
        System.out.println("");
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
