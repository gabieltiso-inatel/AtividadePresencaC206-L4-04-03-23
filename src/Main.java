import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // A classe Scanner será utilizada em todos os exercicios.
        Scanner s = new Scanner(System.in);

        // EXERCÍCIO 1: Utilização da classe Calculadora
        Calculadora c = new Calculadora();

        System.out.print("Operação: ");
        String operacao = s.next();

        System.out.print("Primeiro número: ");
        double numero1 = s.nextDouble();

        System.out.print("Segundo número: ");
        double numero2 = s.nextDouble();

        double resultado1 = c.calcular(numero1, numero2, operacao);
        System.out.printf("O resultado da operação %.2f %s %.2f é %.2f\n", numero1, operacao, numero2, resultado1);

        // EXERCÍCIO 2: Utilização da classe Media
        Media m = new Media();

        System.out.print("NP1: ");
        int np1 = s.nextInt();

        System.out.print("NP2: ");
        int np2 = s.nextInt();

        int resultado2 = m.calculaMedia(np1, np2);
        System.out.printf("A média final do aluno é %d\n", resultado2);

        // EXERCÍCIO 3: Utilização da classe Posto
        Posto p = new Posto();
        
        System.out.print("Tipo de combustível (A- Álcool, G - Gasolina): ");
        String tipoCombustivel = s.next();

        System.out.print("Litros vendidos: ");
        double litrosVendidos = s.nextDouble();

        double valorTotal = p.calculaPrecoPago(tipoCombustivel, litrosVendidos);
        System.out.printf("O valor a pagar é %f\n", valorTotal);
    }
}
