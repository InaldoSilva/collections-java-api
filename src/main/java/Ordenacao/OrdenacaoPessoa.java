package main.java.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo
    private List<Pessoa>pessoaList;

    public OrdenacaoPessoa() {
        pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa>ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa>ordenarPorAltura() {
        List<Pessoa>pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Zé da bodega", 40, 1.80);
        ordenacaoPessoa.adicionarPessoa("Zefinha", 46, 1.67);
        ordenacaoPessoa.adicionarPessoa("Cara de coruja", 34, 1.56);
        ordenacaoPessoa.adicionarPessoa("Canela cinzenta", 41, 1.78);
        ordenacaoPessoa.adicionarPessoa("Papa Figo", 199, 2.20);

        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
    }

}
