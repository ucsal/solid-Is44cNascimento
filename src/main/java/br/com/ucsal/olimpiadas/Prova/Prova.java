package br.com.ucsal.olimpiadas.Prova;

import br.com.ucsal.olimpiadas.Config.Config;

import static br.com.ucsal.olimpiadas.Config.Config.provas;
import static br.com.ucsal.olimpiadas.Config.Config.proximaProvaId;
import static br.com.ucsal.olimpiadas.Config.Config.in;

public class Prova  {

	private long id;
	private String titulo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public static void cadastrarProva() {



        System.out.print("Título da prova: ");
        var titulo = in.nextLine();

        if (titulo == null || titulo.isBlank()) {
            System.out.println("título inválido");
            return;
        }

        var prova = new Prova();
        prova.setId(proximaProvaId++);
        prova.setTitulo(titulo);

        provas.add(prova);
        System.out.println("Prova criada: " + prova.getId());
    }


}
