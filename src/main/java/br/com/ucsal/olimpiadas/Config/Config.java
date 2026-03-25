package br.com.ucsal.olimpiadas.Config;

import br.com.ucsal.olimpiadas.Prova.Prova;
import br.com.ucsal.olimpiadas.Prova.Questao;
import br.com.ucsal.olimpiadas.Prova.Tentativa;
import br.com.ucsal.olimpiadas.User.Participante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Config {


    public static long proximoParticipanteId = 1;
    public static long proximaProvaId = 1;
    public static long proximaQuestaoId = 1;
    public static long proximaTentativaId = 1;

    public static final List<Participante> participantes = new ArrayList<>();
    public static final List<Prova> provas = new ArrayList<>();
    public static final List<Questao> questoes = new ArrayList<>();
    public static final List<Tentativa> tentativas = new ArrayList<>();

    public static final Scanner in = new Scanner(System.in);
}
