package main.java.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    //atributo
    private List<Livro> livroList;

    public Catalogo() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    //pesquisa por autor
    public List<Livro>pesquisarPorAutor(String autor) {
        List<Livro>livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    //pesquisa por intervalo de anos
    public List<Livro>pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro>livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }
    //pesquisa por titulo
    public Livro pesquisaPorTitulo(String titulo) {
        Livro livrosPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        Catalogo catalogoLivros = new Catalogo();
        catalogoLivros.adicionarLivro("Crônicas da Pitú", "Zé da Bodega", 1983);
        catalogoLivros.adicionarLivro("O bagre de dois metros", "Pescador parrudo", 2007);
        catalogoLivros.adicionarLivro("O flutter vai morrer!", "Lucas Montano", 2023);
        catalogoLivros.adicionarLivro("Roubo, cachaça, mentiras e mais corrupção", "Lula", 2023);
        catalogoLivros.adicionarLivro("A farsa da Covid-19", "Acredita quem quer", 2020);

        System.out.println(catalogoLivros.pesquisarPorAutor("Zé da bodega"));
        System.out.println(catalogoLivros.pesquisaPorTitulo("O bagre de dois metros"));
        System.out.println(catalogoLivros.pesquisarPorAutor("lula"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020, 2020));
    }

}
