public class Main {
    public static void main(String[] args){
        System.out.println("Esse é o Screen Match");
        String nomeDoFilme = "Top Gun: Maverick";
        int anoDeLancamento = 2022;
        double nota = 8.1;
        boolean incluidoNoPlano = false;
        System.out.println(String.format("""
                Filme: %s
                Ano de lançamento: %d
                Nota do filme: %.2f
                Incluído no plano: %s
                """, nomeDoFilme, anoDeLancamento, nota, incluidoNoPlano));


    }
}