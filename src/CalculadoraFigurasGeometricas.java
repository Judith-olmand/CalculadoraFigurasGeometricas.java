import java.util.Scanner;

public class CalculadoraFigurasGeometricas {

    public static final int figurasMaximas = 3;
    /**
     * Creo un array de objetos Figura
     */
    public static Figura[] listaFiguras = new Figura[figurasMaximas];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        double radio;
        double base;
        double altura;
        double lado1;
        double lado2;
        int primeraOpcion;
        int segundaOpcion;


        do {
            System.out.println("╔════════════════════════════════════╗");
            System.out.println("║           MENÚ PRINCIPAL           ║");
            System.out.println("╠════════════════════════════════════╣");
            System.out.println(" ¿Que deseas hacer? ");
            System.out.println(" 1. Crear una nueva figura. ");
            System.out.println(" 2. Saber cuantas figuras he creado. ");
            System.out.println(" 3. Mostrar el perimetro de las figuras creadas. ");
            System.out.println(" 4. Mostrar el área de las figuras. ");
            System.out.println(" 0. Salir del programa. ");
            primeraOpcion = sc.nextInt();
            switch (primeraOpcion) {
                case 1:
                    if (contador == figurasMaximas-1) {
                        System.out.println(" Lo siento, has llegado al límite de figuras permitidas");
                        break;
                    } else {
                        /**
                         * Creo un menú con diferentes opciones
                         */
                        do {
                            System.out.println("╔════════════════════════════════════╗");
                            System.out.println("║     MENÚ CREACIÓN DE FIGURAS       ║");
                            System.out.println("╠════════════════════════════════════╣");
                            System.out.println(" \u16CA ¿Qué figura desea crear?");
                            System.out.println("1. Circulo. \u25CB");
                            System.out.println("2. Rectángulo. \u25AD");
                            System.out.println("3. Triángulo. \u25B3");
                            System.out.println("0. Salir.");
                            segundaOpcion = sc.nextInt();
                            int tipoTriangulo;

                            switch (segundaOpcion) {
                                case 1:
                                    System.out.println("Indica su rádio:");
                                    radio = sc.nextDouble();
                                    listaFiguras[contador] = new Circulo(radio);
                                    contador++;
                                    System.out.println(" ✔✔ Acabas de crear un círculo con éxito.");
                                    System.out.println(" ● ");
                                    break;

                                case 2:
                                    System.out.println("Indica su base:");
                                    base = sc.nextDouble();
                                    System.out.println("Indica la altura:");
                                    altura = sc.nextDouble();
                                    listaFiguras[contador] = new Rectangulo(base, altura);
                                    contador++;
                                    System.out.println(" ✔✔ Acabas de crear un rectángulo con éxito.");
                                    System.out.println(" ▭ ");
                                    break;

                                case 3:
                                    do {
                                        System.out.println("╔════════════════════════════════════╗");
                                        System.out.println("║        MENÚ DE TRIÁNGULOS          ║");
                                        System.out.println("╠════════════════════════════════════╣");
                                        System.out.println("Indica que tipo de triángulo es:");
                                        System.out.println("1. Equilatero.");
                                        System.out.println("2. Isósceles.");
                                        System.out.println("3. Escaleno.");
                                        System.out.println("0. Salir.");
                                        tipoTriangulo = sc.nextInt();

                                        switch (tipoTriangulo) {
                                            case 1:
                                                System.out.println("Indica su lado:");
                                                lado1 = sc.nextDouble();
                                                System.out.println("Indica su la altura:");
                                                altura = sc.nextDouble();
                                                listaFiguras[contador] = new Triangulo(lado1, altura);
                                                contador++;
                                                System.out.println(" ✔✔ Acabas de crear un triángulo con éxito.");
                                                System.out.println(" △ ");
                                                break;

                                            case 2:
                                                System.out.println("Indica su lado 1:");
                                                lado1 = sc.nextDouble();
                                                System.out.println("Indica su lado 2:");
                                                lado2 = sc.nextDouble();
                                                System.out.println("Indica su la altura:");
                                                altura = sc.nextDouble();
                                                listaFiguras[contador] = new Triangulo(lado1, lado2, altura);
                                                contador++;
                                                System.out.println(" ✔✔ Acabas de crear un triángulo con éxito.");
                                                System.out.println(" △ ");
                                                break;

                                            case 3:
                                                System.out.println("Indica su base:");
                                                base = sc.nextDouble();
                                                System.out.println("Indica su lado 1:");
                                                lado1 = sc.nextDouble();
                                                System.out.println("Indica su lado 2:");
                                                lado2 = sc.nextDouble();
                                                System.out.println("Indica su la altura:");
                                                altura = sc.nextDouble();
                                                listaFiguras[contador] = new Triangulo(base, lado1, lado2, altura);
                                                contador++;
                                                System.out.println(" ✔✔ Acabas de crear un triángulo con éxito.");
                                                System.out.println(" △ ");
                                                break;

                                            case 4:
                                                System.out.println("Saliendo del menú Triángulo");
                                                break;

                                            default:
                                                System.out.println(" ✘✘✘ Error. Elige una opción válida. ✘✘✘");
                                                break;
                                        }
                                    } while (tipoTriangulo < 0 || tipoTriangulo > 3); // Sale cuando se elige una opción válida
                                    break;

                                case 0:
                                    System.out.println("Volviendo al menú principal.");
                                    break;

                                default:
                                    System.out.println(" ✘✘✘ Error. Elige una opción válida. ✘✘✘");
                                    break;
                            }
                        } while (segundaOpcion != 0);
                        break;
                    }
                case 2:
                    if (contador == 0){
                        System.out.println("Actualmente no tienes ninguna figura creada. ☹ ");
                    }else if (contador == 1){
                        System.out.println("Tienes " + contador + " figura creada. ☺");
                    }else {
                        System.out.println("Tienes " + contador + " figuras creadas. ☺");
                    }
                    break;

                case 3:
                    for (int i = 0; i < listaFiguras.length; i++) {
                        listaFiguras[i].calcularPerimetro();
                    }
                    break;

                case 4:
                    for (int i = 0; i < listaFiguras.length; i++) {
                        listaFiguras[i].calcularArea();
                    }
                    break;

                case 0:
                    System.out.println("Hasta pronto!! \u270C");
                    break;

                default:
                    System.out.println(" ✘✘✘ Error. Elige una opción válida. ✘✘✘");
                    break;
            }
        }while (primeraOpcion != 0);
    }
}