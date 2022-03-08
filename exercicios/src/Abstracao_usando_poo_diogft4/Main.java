package Abstracao_usando_poo_diogft4;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCarolina = new Dev();
        devCarolina.setNome("Carolina");
        devCarolina.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos da Carolina " + devCarolina.getConteudosInscritos());
        devCarolina.progredir();
        devCarolina.progredir();
        devCarolina.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos da Carolina " + devCarolina.getConteudosInscritos());
        System.out.println("Conteúdos concluídos da Carolina " + devCarolina.getConteudosConcluidos());
        System.out.println("XP: " + devCarolina.calcularTotalXp());

        System.out.println("------------------------");

        Dev devJoaquim = new Dev();
        devJoaquim.setNome("Joaquim");
        devJoaquim.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos do Joaquim " + devJoaquim.getConteudosInscritos());
        devJoaquim.progredir();
        devJoaquim.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos do Joaquim " + devJoaquim.getConteudosInscritos());
        System.out.println("Conteúdos concluídos do Joaquim " + devJoaquim.getConteudosConcluidos());
        System.out.println("XP: " + devJoaquim.calcularTotalXp());


    }
}
