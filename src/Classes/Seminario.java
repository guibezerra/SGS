package Classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local localizacao;
    private Professor prof;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void getAlunos() {
        if (this.alunos != null && this.alunos.length != 0) {
            for (Aluno aluno : this.alunos) {
                for (String result : aluno.getDadosAluno()) {
                    System.out.println(result);
                }
                System.out.println();
            }
        } else {
            System.out.println("Alunos não cadastrados no tema");
        }
    }

    public void setLocalizacao(Local localizacao) {
        this.localizacao = localizacao;
    }

    public void getLocalizacao() {
        if (this.localizacao != null) {
            for (String localizacao : this.localizacao.getLocal()) {
                System.out.println(localizacao);
            }
        } else {
            System.out.println("Local não cadastrado");
        }

    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    public void getProf() {
        if (this.prof != null) {
            for (String prof : this.prof.getProfessor()) {
                System.out.println(prof);
            }
        } else {
            System.out.println("Professor(a) não cadastrado");
        }
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void imprimeDadosSeminario() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Componentes: ");
        if (this.alunos != null && this.alunos.length != 0) {
            for (Aluno aluno : this.alunos) {
                for (String result : aluno.getDadosAluno()) {
                    System.out.println(result);
                }
                System.out.println();
            }
        } else {
            System.out.println("Alunos não cadastrados");
        }
        if (this.prof != null) {
            for (String prof : this.prof.getProfessor()) {
                System.out.println(prof);
            }
        } else {
            System.out.println("Professor(a) não cadastrado");
        }
        System.out.println("Local: ");
        if (this.localizacao != null) {
            for (String localizacao : this.localizacao.getLocal()) {
                System.out.println(localizacao);
            }
        } else {
            System.out.println("Local não cadastrado");
        }
        System.out.println();
    }
}
