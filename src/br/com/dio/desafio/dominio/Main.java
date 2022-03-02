package br.com.dio.desafio.dominio;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição Curso Js");
        curso2.setCargaHoraria(4);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição de Mentoria Java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java developer");
        bootCamp.setDescricao("Descrição Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudoInscritos());
        System.out.println("=");
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos" + devCamila.getConteudoConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("-------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudoInscritos());
        System.out.println("-");
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos" + devJoao.getConteudoConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
