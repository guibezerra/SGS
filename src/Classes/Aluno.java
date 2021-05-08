package Classes;

public class Aluno {
    private String nome, matricula, curso;
    private Seminario semi;

    public Aluno (String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    public void setSemi(Seminario semi) {
        this.semi = semi;
    }

    public void getSemiAluno() {
        System.out.println(this.semi.getTitulo());
        System.out.println();
    }

    public String[] getDadosAluno () {
        String[] dados =
                {"Nome do Aluno(a): "+this.nome,
                "Matricula: "+this.matricula,
                "Curso: "+this.curso};
        return dados;
    }
    public void imprimeDadosAluno() {
        System.out.println("Nome do Aluno(a): "+this.nome);
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Curso: "+this.curso);
        System.out.println("Seminario: "+this.semi.getTitulo());
        System.out.println( );
    }

}
