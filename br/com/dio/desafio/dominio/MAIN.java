package br.com.dio.desafio.dominio;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso curso1 = new Curso();
		
		curso1.setTitulo("Java");
		curso1.setDescricao("Curso de Java");
		curso1.setCargaHoraria(10);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("Js");
		curso2.setDescricao("Curso de Js");
		curso2.setCargaHoraria(5);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("metoria Java");
		mentoria.setDescricao("mentoria sobre java");
		mentoria.setData(null);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.getNome();
		bootcamp.getDescricao();
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		
		Dev devAdson = new Dev();
		
		devAdson.setNome("Adson");
		devAdson.increverBootcamp(bootcamp);
		
		System.out.println("Conteudos Inscritos de Adson: " + devAdson.getConteudosInscritos());
		
		devAdson.progredir();
		devAdson.progredir();
		devAdson.progredir();
		
		System.out.println("Conteudos Concluidos de Adson: " + devAdson.getConteudosConcluidos());
		
		System.out.println("XP: " + devAdson.calculaXp());
		
		
		
		System.out.println("----------------------------------------------------------");
		
		Dev devJulieta = new Dev();
		devJulieta.setNome("Julieta");
		devJulieta.increverBootcamp(bootcamp);
		
		System.out.println("Conteudos Inscritos de Julieta: " + devJulieta.getConteudosInscritos());
		
		devJulieta.progredir();
		devJulieta.progredir();
		
		System.out.println("Conteudos concluidos de Julieta: " + devJulieta.getConteudosConcluidos());
		
		System.out.println("XP: " + devJulieta.calculaXp());
		
		
		System.out.println("---------------------------------------------------------------");
	}

}
