
package Questao02;

public class IdadeCalculator {
    public static int calcularIdade(int anoNascimento, boolean fezAniversarioEsteAno) {
        // Obtem o ano atual
        int anoAtual = java.time.Year.now().getValue();

        // Se ainda não fez aniversário este ano, decrementa 1 da idade
        int idade = anoAtual - anoNascimento;
        if (!fezAniversarioEsteAno) {
            idade--;
        }

        return idade;
    }
}
