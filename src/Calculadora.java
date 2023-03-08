public class Calculadora {
    public double calcular(double numero1, double numero2, String operacao) {
        switch(operacao) {
            case "+":
                return numero1 + numero2;

            case "-":
                return numero1 - numero2;
            
            case "*":
                return numero1 * numero2;

            case "/":
                return numero1 / numero2;

            case "^":
                return Math.pow(numero1, numero2);

            default:
                throw new UnsupportedOperationException("Essa operação não está disponível");
        }
    }
}
