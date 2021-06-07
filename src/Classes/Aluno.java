package Classes;

public class Aluno {
    private String nome, matricula, curso;
    private Seminario semi;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void setSemi(Seminario semi) {
        this.semi = semi;
    }

    public void getSemiAluno() {
        if (this.semi != null) {
            System.out.println(this.semi.getTitulo());
            System.out.println();
        } else {
            System.out.println("Tema não inserido");
            System.out.println();
        }
    }

    public String[] getDadosAluno() {
        String[] dados =
                {"Nome do Aluno(a): " + this.nome,
                        "Matricula: " + this.matricula,
                        "Curso: " + this.curso};
        return dados;
    }

    public void imprimeDadosAluno() {
        System.out.println("Nome do Aluno(a): " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
        if (this.semi != null) {
            System.out.println("Seminario: " + this.semi.getTitulo());
            System.out.println("Info local:");
            this.semi.getLocalizacao();
        } else {
            System.out.println("Seminario: Tema não inserido");
        }


        System.out.println();
    }

}
