package org.example.Map.AgendaDeEventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate , Evento> eventos = new HashMap<>();

    public AgendaEventos() {
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventos.put(data,new Evento(nome, atracao));
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> mapEventos = new TreeMap<>(eventos); //ordena basicamente pela key
        if(!eventos.isEmpty()){
            System.out.println(mapEventos);
        }
        else {
            System.out.println("não há eventos marcados");
        }
    }
    public Evento obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> mapEventos = new TreeMap<>(eventos);
        for(Map.Entry<LocalDate, Evento> entry: eventos.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: "+proximoEvento+" acontecerá na data " +proximaData);
                break;
            }
        }

            return null;
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2010,Month.AUGUST,30), "aniversario", "Eu");
        agenda.adicionarEvento(LocalDate.of(2025,Month.OCTOBER,10), "aniversario", "Eu");
        agenda.adicionarEvento(LocalDate.of(2025, Month.SEPTEMBER,18), "aniversario", "Eu");
        agenda.adicionarEvento(LocalDate.of(2025,Month.MAY,20), "aniversario", "Eu");
        agenda.exibirAgenda();
        agenda.obterProximoEvento();
    }
}
