public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDeAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    // CRIAÇÃO DO METODO
    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDeAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDeAvaliacoes / totalDeAvaliacoes;
    }
}
