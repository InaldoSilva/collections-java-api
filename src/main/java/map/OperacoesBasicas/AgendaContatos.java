package main.java.map.OperacoesBasicas;
import java.util.HashMap;
import java.util.Map;
public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Daniel San", 12345678);
        agendaContatos.adicionarContato("Sr. Miaggi", 98765432);
        agendaContatos.adicionarContato("Johnny Lawrence", 13572468);
        agendaContatos.adicionarContato("Terry Silver", 28461735);
        agendaContatos.adicionarContato("John Kreese", 93572684);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Terry Silver");

        agendaContatos.exibirContatos();

        System.out.println("Resultado da pesquisa:" + "O número é: " + agendaContatos.pesquisarPorNome("Johnny Lawrence"));
    }
}
