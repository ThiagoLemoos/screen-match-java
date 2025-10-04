import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args){
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");;
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        System.out.println(meuFilme.exibeTotalDeAvaliacoes());

        System.out.println(meuFilme.pegaMedia());
    }
}