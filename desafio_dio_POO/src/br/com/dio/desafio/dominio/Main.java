package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso javascript");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Dev");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devMarcia = new Dev();
		devMarcia.setNome("Marcia");
		devMarcia.inscreverBootCamp(bootcamp);
		System.out.println("Conteúdos Inscritos Márcia " + devMarcia
				.getConteudosInscritos());
		devMarcia.progredir();
		System.out.println("Conteúdos Inscritos Márcia " + devMarcia
				.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Márcia " + devMarcia
				.getConteudosConcluidos());
		Dev devDaiane = new Dev();
		devDaiane.setNome("Daiane");
		devDaiane.inscreverBootCamp(bootcamp);
		System.out.println("Conteúdos Inscritos Daiane " + devDaiane
				.getConteudosInscritos());
		devDaiane.progredir();
		System.out.println("Conteúdos Inscritos Daiane " + devDaiane
				.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Daiane " + devDaiane
				.getConteudosConcluidos());
		
		
	}

}
