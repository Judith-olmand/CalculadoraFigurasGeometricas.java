public abstract class Figura implements Dibujable{
    /**
     * Implemento la interface Dibujable aquí para que la hereden las clases que extienden a esta,
     * si solo quisiera que Dibujable fuera de una clase se la aplicaría unicamente a ella.
     */
    public abstract void calcularArea();
    /**
     * Creo 2 metodos abstractos (sin implementación) para que sean sobrescritos por las clases que extiendena esta.
     */
    public abstract void calcularPerimetro();


}
