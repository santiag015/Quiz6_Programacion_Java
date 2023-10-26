/**
 * Clase Triangulo
 * Herencia de la clase FiguraGeometrica
 */
class Triangulo extends FiguraGeometrica {
    /**
     * Atributos
     */
        private double base;   // La base del triángulo
        private double altura; // La altura del triángulo

    /**
     * Constructor de la clase.
     * @param base base de la clase triangulo
     * @param altura base de la clase triangulo
     * Complejidad temporal: O(1) Tiempo constante.
     */
        public Triangulo(String nombre, String color, double base, double altura) {
            super(nombre, color);
            this.base = base;
            this.altura = altura;
        }

    /**
     * Método para obtener el área del triangulo
     * Complejidad temporal: O(1) Tiempo constante.
     */

    @Override
        public double obtenerArea() {
            return (base * altura)/2;
        }

    /**
     *Método para obtener el perimetro del triangulo
     *Método para obtener el área del triangulo
     */

        @Override
        public double obtenerPerimetro() {
            return base + altura + Math.sqrt(base * base + altura * altura);
        }
    }
