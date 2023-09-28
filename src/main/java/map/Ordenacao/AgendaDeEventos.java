package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaDeEventos {
    //atributo
    private Map<LocalDate, Evento> eventosMap;

    public AgendaDeEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        //Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
    }

    public void obterProximoEvento() {
        //metodo 1
        //Set<LocalDate> dateSet = eventosMap.keySet();
        //Collection<Evento> values = eventosMap.values();

        //metodo 2
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento " + proximoEvento + "Acontecerá no dia " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaDeEventos agendaDeEventos = new AgendaDeEventos();
        agendaDeEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 18), "Rec n´ Play", "Atração 1");
        agendaDeEventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER, 24),"Natal", "Atração 2");
        agendaDeEventos.adicionarEvento(LocalDate.of(2021, Month.DECEMBER, 24),"Evento 1", "Atração 2");
        agendaDeEventos.adicionarEvento(LocalDate.of(2022, Month.DECEMBER, 24),"Evento 2", "Atração 1");

        agendaDeEventos.exibirAgenda();
        agendaDeEventos.obterProximoEvento();
    }
}
