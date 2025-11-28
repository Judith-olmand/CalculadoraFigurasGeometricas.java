public class Circulo extends Figura{
    private double radio;

    /**
     * Creo el constructor para esta figura pasando un parámetro
     * @param radio
     * @throws NumeroNegativo lanza la excepción que habiamos creado antes con un mensaje personalizado.
     * La pongo aquí porque es el constructor el que puede lanzar la excepción cuando al intentar pasar los parámetros
     * estos sean negativos.
     */
    public Circulo(double radio) throws NumeroNegativo{
        if (radio<0){
            throw new NumeroNegativo("✘✘✘ El radio debe ser positivo.");
        }
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("          * * * * * *     ");
        System.out.println("      * *             * *   ");
        System.out.println("    *                     * ");
        System.out.println("  *                         *  ");
        System.out.println("*                             * ");
        System.out.println("*                             * ");
        System.out.println("*                             * ");
        System.out.println("*                             * ");
        System.out.println("*                             * ");
        System.out.println("  *                         *  ");
        System.out.println("    *                     * ");
        System.out.println("      * *             * *   ");
        System.out.println("          * * * * * *     ");
        System.out.println("");
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
