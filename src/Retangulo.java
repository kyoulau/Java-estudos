public class Retangulo {
        public double width;
        public double height;

        public double calcularArea(){
            return width * height;
        }

        public double calcularPerimetro(){
            return 2 * (width + height);
        }

        public double calcularDiagonal(){
            return Math.sqrt(width * width + height * height);
        }

    }

