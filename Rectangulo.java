/**
 * Clase rectangulo
 * Herencia de FiguraGeometrica
 */
class Rectangulo extends FiguraGeometrica {
        private double lado1;
        private double lado2;

    /**
     * Constructor de la clase.
     * @param lado1 lado1 de la clase rectangulo
     * @param lado2 lado2 de la clase rectangulo
     * Complejidad temporal: O(1) Tiempo constante.
     */

        public Rectangulo(String nombre, String color, double lado1, double lado2) {
            super(nombre, color);
            this.lado1 = lado1;
            this.lado2 = lado2;
        }

    /**
     * Metodo para obtener el área del rectangulo
     * Complejidad temporal: O(1) Tiempo constante.
     */

        @Override
        public double obtenerArea() {
            return lado1 * lado2;
        }

    /**
     * Metodo para obtener el área del rectangulo
     * Complejidad temporal: O(1) Tiempo constante.
     */

        @Override
        public double obtenerPerimetro() {
            return 2 * (lado1 + lado2);
        }
    }

