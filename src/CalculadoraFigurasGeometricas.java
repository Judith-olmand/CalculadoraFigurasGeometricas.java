import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraFigurasGeometricas {
    /**
     * Creo una constante que uso para el tamaño del array
     */
    public static final int figurasMaximas = 3;
    /**
     * Creo un array de objetos Figura
     */
    public static Figura[] listaFiguras = new Figura[figurasMaximas];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        boolean medidaValida = false; //┓
                                     // ╋━━━━━ Variables boolean usadas para la captura de errores de los menús
        boolean opcionValida = false;// ┛

        double radio;    //┓
        double base;    // ┫
        double altura;  // ╋━━━━━━ Variables para las dimensiones de las figuras geométricas
        double lado1;   // ┫
        double lado2;   // ┛

        int primeraOpcion = 0; //┓
                              // ╋━━━━━ Variables para las opciones de los menús
        int segundaOpcion = 0;// ┛

        do {
            /**
             * Creo un do dentro de otro para poder capturar el error de meter una opción que sea texto
             * de esta manera, si introduzco algún tipo de caracter me muestra un error personalizado
             * y vuelve a darme la opción de elegir que quiero hacer sin cortar el programa
             * la variable de opción tiene que estar inicializada, no vale con estar solo declarada.
             */
            do{
                try {
                    System.out.println("╔════════════════════════════════════╗");
                    System.out.println("║           MENÚ PRINCIPAL           ║");
                    System.out.println("╠════════════════════════════════════╣");
                    System.out.println(" ¿Que deseas hacer? ");
                    System.out.println(" 1. Crear una nueva figura. ");
                    System.out.println(" 2. Saber cuantas figuras he creado. ");
                    System.out.println(" 3. Mostrar el perimetro de las figuras creadas. ");
                    System.out.println(" 4. Mostrar el área de las figuras. ");
                    System.out.println(" 5. Mostrar un dibujo de las figuras.");
                    System.out.println(" 0. Salir del programa. ");
                    primeraOpcion = sc.nextInt();
                    opcionValida = true;
                } catch (InputMismatchException e){ //captura el erro de meter texto en lugar de números
                    System.out.println("✘✘✘ Error, la opción no puede ser texto");
                    System.out.println();
                    sc.nextLine();
                    opcionValida = false;
                }
            } while (!opcionValida);

            switch (primeraOpcion) {
                case 1:
                    /**
                     *Compruebo que si he llegado al límite de figuras, si es así muestro un mensaje
                     * sino ejecuto el siguiente menú
                     */
                    if (contador == figurasMaximas) {
                        System.out.println("✘✘✘ Lo siento, has llegado al límite de figuras permitidas");
                        System.out.println();
                        break;
                    } else {
                        do {
                            /**
                             * Creo un do dentro de otro para poder capturar el error de meter una opción que sea texto
                             * de esta manera, si introduzco algún tipo de caracter me muestra un error personalizado
                             * y vuelve a darme la opción de elegir que quiero hacer sin cortar el programa
                             * la variable de opción tiene que estar inicializada, no vale con estar solo declarada.
                             */
                            do {
                                try {
                                    System.out.println("╔════════════════════════════════════╗");
                                    System.out.println("║     MENÚ CREACIÓN DE FIGURAS       ║");
                                    System.out.println("╠════════════════════════════════════╣");
                                    System.out.println("¿Qué figura desea crear?");
                                    System.out.println("1. Circulo. \u25CB");
                                    System.out.println("2. Rectángulo. \u25AD");
                                    System.out.println("3. Triángulo. \u25B3");
                                    System.out.println("0. Salir.");
                                    segundaOpcion = sc.nextInt();
                                    opcionValida = true;
                                } catch (InputMismatchException e){ //captura el erro de meter texto en lugar de números
                                    System.out.println("✘✘✘ Error, la opción no puede ser texto");
                                    sc.nextLine();
                                    opcionValida = false;
                                }
                            }while (!opcionValida);

                            switch (segundaOpcion) {
                                case 1:
                                    medidaValida = false;
                                    while (!medidaValida) {
                                        System.out.println("Indica su rádio:");
                                        try {
                                            radio = sc.nextDouble();
                                            listaFiguras[contador] = new Circulo(radio);
                                            contador++;
                                            System.out.println(" ✔✔ Acabas de crear un círculo con éxito.");
                                            System.out.println(" ● ");
                                            medidaValida = true;
                                        } catch (NumeroNegativo e){ //captura el error de número negativo
                                            System.out.println(e.getMessage());
                                            System.out.println();
                                        /**
                                         * Esta escepción salta automática si introduzco texto en vez de números.
                                         * De esta manera la capturo, para que muestre el mensaje que yo quiera
                                         * y no corte el programa de forma inesperada.
                                         * 🠋🠋🠋
                                         */
                                        } catch (InputMismatchException e) {
                                            System.out.println("✘✘✘ El radio no puede ser texto.");
                                            sc.next();
                                        }
                                    }
                                    break;

                                case 2:
                                    medidaValida = false;
                                    while (!medidaValida) {
                                        System.out.println("Indica su base:");
                                        try {
                                            base = sc.nextDouble();
                                            System.out.println("Indica la altura:");
                                            altura = sc.nextDouble();
                                            listaFiguras[contador] = new Rectangulo(base, altura);
                                            contador++;
                                            System.out.println(" ✔✔ Acabas de crear un rectángulo con éxito.");
                                            System.out.println(" ▭ ");
                                            medidaValida = true;
                                        } catch (NumeroNegativo e){ //captura el error de número negativo
                                            System.out.println(e.getMessage());
                                            System.out.println();
                                        /**
                                         * Esta escepción salta automática si introduzco texto en vez de números.
                                         * De esta manera la capturo, para que muestre el mensaje que yo quiera
                                         * y no corte el programa de forma inesperada.
                                         * 🠋🠋🠋
                                         */
                                        } catch (InputMismatchException e){
                                            System.out.println("✘✘✘ Las medidas no pueden ser texto.");
                                            sc.next(); // limpia el bufer
                                        }
                                    }
                                    break;

                                case 3:
                                    int tipoTriangulo =0;
                                    do {
                                        /**
                                         * Creo un do dentro de otro para poder capturar el error de meter una opción que sea texto
                                         * de esta manera, si introduzco algún tipo de caracter me muestra un error personalizado
                                         * y vuelve a darme la opción de elegir que quiero hacer sin cortar el programa
                                         * la variable de opción tiene que estar inicializada, no vale con estar solo declarada.
                                         */
                                        do {
                                            try {
                                                System.out.println("╔════════════════════════════════════╗");
                                                System.out.println("║        MENÚ DE TRIÁNGULOS          ║");
                                                System.out.println("╠════════════════════════════════════╣");
                                                System.out.println("Indica que tipo de triángulo es:");
                                                System.out.println("1. Equilatero.");
                                                System.out.println("2. Isósceles.");
                                                System.out.println("3. Escaleno.");
                                                System.out.println("0. Salir.");
                                                tipoTriangulo = sc.nextInt();
                                                opcionValida = true;
                                            }catch (InputMismatchException e){ //captura el erro de meter texto en lugar de números
                                                System.out.println("✘✘✘ Error, la opción no puede ser texto");
                                                sc.nextLine();
                                                opcionValida = false;
                                            }
                                        }while (!opcionValida);

                                        switch (tipoTriangulo) {
                                            case 1:
                                                medidaValida = false;
                                                while (!medidaValida) {
                                                    System.out.println("Indica su lado:");
                                                    try {
                                                        lado1 = sc.nextDouble();
                                                        System.out.println("Indica su la altura:");
                                                        altura = sc.nextDouble();
                                                        listaFiguras[contador] = new Triangulo(lado1, altura);
                                                        contador++;
                                                        System.out.println(" ✔✔ Acabas de crear un triángulo con éxito.");
                                                        System.out.println(" △ ");
                                                        medidaValida = true;
                                                    } catch (NumeroNegativo e){ //captura el error de número negativo
                                                        System.out.println(e.getMessage());
                                                        System.out.println();
                                                    /**
                                                     * Esta escepción salta automática si introduzco texto en vez de números.
                                                     * De esta manera la capturo, para que muestre el mensaje que yo quiera
                                                     * y no corte el programa de forma inesperada.
                                                     * 🠋🠋🠋
                                                     */
                                                    } catch (InputMismatchException e) {
                                                        System.out.println("✘✘✘ El radio no puede ser texto.");
                                                        sc.next();
                                                    }

                                                }
                                                break;

                                            case 2:
                                                medidaValida = false;
                                                while (!medidaValida) {
                                                    System.out.println("Indica su lado 1:");
                                                    try {
                                                        lado1 = sc.nextDouble();
                                                        System.out.println("Indica su lado 2:");
                                                        lado2 = sc.nextDouble();
                                                        System.out.println("Indica su la altura:");
                                                        altura = sc.nextDouble();
                                                        listaFiguras[contador] = new Triangulo(lado1, lado2, altura);
                                                        contador++;
                                                        System.out.println(" ✔✔ Acabas de crear un triángulo con éxito.");
                                                        System.out.println(" △ ");
                                                        medidaValida = true;
                                                    } catch (NumeroNegativo e){
                                                        System.out.println(e.getMessage());
                                                        System.out.println();
                                                        /**
                                                         * Esta escepción salta automática si introduzco texto en vez de números.
                                                         * De esta manera la capturo, para que muestre el mensaje que yo quiera
                                                         * y no corte el programa de forma inesperada.
                                                         * 🠋🠋🠋
                                                         */
                                                    } catch (InputMismatchException e) {
                                                        System.out.println("✘✘✘ El radio no puede ser texto.");
                                                        sc.next();
                                                    }
                                                }
                                                break;

                                            case 3:
                                                medidaValida = false;
                                                while (!medidaValida) {
                                                    System.out.println("Indica su base:");
                                                    try {
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
                                                        medidaValida = true;
                                                    }  catch (NumeroNegativo e){
                                                        System.out.println(e.getMessage());
                                                        System.out.println();
                                                        /**
                                                         * Esta escepción salta automática si introduzco texto en vez de números.
                                                         * De esta manera la capturo, para que muestre el mensaje que yo quiera
                                                         * y no corte el programa de forma inesperada.
                                                         * 🠋🠋🠋
                                                         */
                                                    } catch (InputMismatchException e) {
                                                        System.out.println("✘✘✘ El radio no puede ser texto.");
                                                        sc.next();
                                                    }
                                                }
                                                break;

                                            case 4:
                                                System.out.println("Saliendo del menú Triángulo");
                                                break;

                                            default:
                                                System.out.println(" ✘✘✘ Error. Elige una opción válida. ✘✘✘");
                                                break;
                                        }
                                        /**
                                         * se repite mientras la opción sea menor que 0 o mayor que 3
                                         * así, cada vez que se crea una figua vuelve al menú de figuras
                                         */
                                    } while (tipoTriangulo < 0 || tipoTriangulo > 3);
                                    break;

                                case 0:
                                    System.out.println("Volviendo al menú principal.");
                                    break;

                                default:
                                    System.out.println(" ✘✘✘ Error. Elige una opción válida. ✘✘✘");
                                    break;
                            }
                            /**
                             * se repite mientras la opción sea menor que 0 o mayor que 3
                             * así, cada vez que se crea una figua vuelve al menú principal
                             */
                        } while (segundaOpcion < 0 || segundaOpcion > 3);
                        break;
                    }
                case 2:
                    /**
                     * Compruebo si el contador está a 0, lo que indica que no hay fiuras y muestro
                     * mensajes dependiendo de las que haya
                     */
                    if (contador == 0){
                        System.out.println("✘✘✘ Actualmente no tienes ninguna figura creada. ☹ ");
                    }else if (contador == 1){
                        System.out.println("Tienes " + contador + " figura creada. ☺");
                    }else {
                        System.out.println("Tienes " + contador + " figuras creadas. ☺");
                    }
                    break;

                case 3:
                    /**
                     * Compruebo si el contador está a 0, lo que indica que no hay fiuras.
                     * Si no es 0, invoco al metodo del array
                     */
                    if (contador == 0) {
                        System.out.println("✘✘✘ Actualmente no tienes ninguna figura creada. ☹ ");
                    } else {
                        for (int i = 0; i < contador; i++) {
                            listaFiguras[i].calcularPerimetro();
                        }
                    }
                    break;

                case 4:
                    /**
                     * Compruebo si el contador está a 0, lo que indica que no hay fiuras.
                     * Si no es 0, invoco al metodo del array
                     */
                    if (contador == 0) {
                        System.out.println("✘✘✘ Actualmente no tienes ninguna figura creada. ☹ ");
                    } else {
                        for (int i = 0; i < contador; i++) {
                            listaFiguras[i].calcularArea();
                        }
                    }
                    break;

                case 5:
                    /**
                     * Compruebo si el contador está a 0, lo que indica que no hay fiuras.
                     * Si no es 0, invoco al metodo del array
                     */
                    if (contador == 0) {
                        System.out.println("✘✘✘ Actualmente no tienes ninguna figura creada. ☹ ");
                    } else {
                        for (int i = 0; i < contador; i++) {
                            listaFiguras[i].dibujar();
                        }
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