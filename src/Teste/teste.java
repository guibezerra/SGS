package Teste;

import Classes.Aluno;
import Classes.Local;
import Classes.Professor;
import Classes.Seminario;

public class teste {
    public static void main(String[] args)  {
        //Tema Engenharia da Computação
        Local local1 = new Local("IV", "A", "A3","14:15","16/12/2021");
        Seminario seminario1 = new Seminario("Engenharia da Computação e suas aplicações");
        Professor professor1 = new Professor("Tiago Barros", "Ciências da Computação", "201311CT");
        Aluno aluno1 = new Aluno ("Guilherme Bezerra ", "20160158307", "CET");

        aluno1.setSemi(seminario1);

        Aluno[] componentes1 = {aluno1};
        seminario1.setAlunos(componentes1);
        seminario1.setProf(professor1);
        seminario1.setLocalizacao(local1);

        Seminario[] temas1 = {seminario1};
        professor1.setSemi(temas1);
//        // Consulta do local
//        System.out.println("---  Info localização 01---");
//        for(String result : local1.getLocal())
//        System.out.println(result);

//        //Consultas aluno
//        System.out.println("------- cadastro aluno --------");
//        for (String result : aluno1.getDadosAluno()) {
//            System.out.println(result);
//        }
//        System.out.println();
//        System.out.println("------- Info aluno -------");
//        aluno1.imprimeDadosAluno();
//        System.out.println("------- Seminario apresentado pelo aluno ------");
//        aluno1.getSemiAluno();


        // Tema Engenharia de Software
        Local local2 = new Local ("IV", "G", "I4", "15:00", "14/12/2021");
        Seminario seminario2 = new Seminario("Engenharia de Software e suas aplicações");
        Professor professor2 = new Professor("Agostinho Brito", "Engenharia da Computação", "201312EC");
        Aluno aluno2 = new Aluno("Eduarda Monteiro", "20210131051","Engenharia de Software");
        Aluno aluno3 = new Aluno("Josimara dos Santos", "20180558307","Engenharia de Software");
        Aluno aluno4 = new Aluno("Tony dantas", "20160168309","Engenharia de Software");

        aluno2.setSemi(seminario2);
        aluno3.setSemi(seminario2);
        aluno4.setSemi(seminario2);

        Aluno[] componetes2 = {aluno2,aluno3,aluno4};
        seminario2.setAlunos(componetes2);
        seminario2.setProf(professor2);
        seminario2.setLocalizacao(local2);

//        // Consultas aluno
//        System.out.println("------- Info aluno --------");
//        for (String result : aluno2.getDadosAluno()) {
//            System.out.println(result);
//        }
//        System.out.println();
//        System.out.println("------- Info cadastro aluno -------");
//        aluno2.imprimeDadosAluno();
//        System.out.println("------- Seminario apresentado pelo aluno ------");
//        aluno2.getSemiAluno();
//
//        System.out.println("Info aluno");
//        for (String result : aluno3.getDadosAluno()) {
//            System.out.println(result);
//        }
//        System.out.println();
//        System.out.println("Info cadastro aluno");
//        aluno3.imprimeDadosAluno();
//        System.out.println("Seminario apresentado pelo aluno");
//        aluno3.getSemiAluno();
//
//        System.out.println("Info aluno");
//        for (String result : aluno4.getDadosAluno()) {
//            System.out.println(result);
//        }
//        System.out.println();
//        System.out.println("Info cadastro aluno");
//        aluno4.imprimeDadosAluno();
//        System.out.println("Seminario apresentado pelo aluno");
//        aluno4.getSemiAluno();
//
        // Tema Ciencia da Computacao
        Seminario seminario3 = new Seminario("Ciencia da Computacao e suas aplicações");

        Seminario[] temas2 = {seminario2,seminario3};
        professor2.setSemi(temas2);
//
//        // Consulta Professor
//        System.out.println("------Info professor 01-------");
//        professor1.imprimeProfessor();
//        System.out.println();
//        System.out.println("------Cadastro professor 01-------");
//        for(String result : professor1.getProfessor()) {
//            System.out.println(result);
//        }
//        System.out.println();
//        System.out.println("---------Temas do professor 01--------");
//        professor1.getSemi();
//


//        System.out.println("------Info professor 02 ------");
//        professor2.imprimeProfessor();
//        System.out.println();
//        System.out.println("------Cadastro do professor 02------");
//        for(String result : professor2.getProfessor()) {
//            System.out.println(result);
//        }
//        System.out.println();
//        System.out.println("---------Temas do professor 02---------");
//        professor2.getSemi();
//
        // Consulta dos seminarios
        System.out.println("-------- Info do tema do seminario ------");
        seminario2.imprimeDadosSeminario();


    }
}
