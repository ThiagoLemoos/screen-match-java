import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args){
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");;
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(5);

        System.out.println(meuFilme.exibeTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("La casa de Papel");
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(40);
        serie.setTemporadas(5);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(102);
        filtro.filtra(episodio);

    }
}