/**
 * Clase Circulo
 * Hereda de FiguraGeometrica
 */
class Circulo extends FiguraGeometrica{
    /**
     * Atributo
     */
        private double radio;

    /**
     * Constructor de la clase.
     * @param radio radio de la clase circulo
     * Complejidad temporal: O(1) Tiempo constante.
     */

        public Circulo(String nombre, String color, double radio) {
            super(nombre, color);
            this.radio = radio;
        }

    /**
     * Metodo para obtener el área del circulo
     * Complejidad temporal: O(1) Tiempo constante.
     */
        @Override
        public double obtenerArea() {
            return Math.PI * Math.pow(radio, 2);
        }

    /**
     * Metodo para obtener el perimetro del circulo
     * Complejidad temporal: O(1) Tiempo constante.
     */
        @Override
        public double obtenerPerimetro() {
            return 2 * Math.PI * radio;
        }
    }

