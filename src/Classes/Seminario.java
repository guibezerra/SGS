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
        for (Aluno aluno: this.alunos) {
            for (String result : aluno.getDadosAluno()) {
                System.out.println(result);
            }
            System.out.println();
        }
    }

    public void setLocalizacao(Local localizacao) {
        this.localizacao = localizacao;
    }

    public void getLocalizacao() {
        for (String localizacao : this.localizacao.getLocal()) {
            System.out.println(localizacao);
        }
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    public void getProf() {
        for (String prof : this.prof.getProfessor()) {
            System.out.println(prof);
        }
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void imprimeDadosSeminario() {
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Componentes: ");
        for (Aluno aluno : this.alunos) {
            for (String result : aluno.getDadosAluno()) {
                System.out.println(result);
            }
            System.out.println();
        }
        for (String prof : this.prof.getProfessor()) {
            System.out.println(prof);
        }
        System.out.println("Local: ");
        for (String localizacao : this.localizacao.getLocal()) {
            System.out.println(localizacao);
        }
        System.out.println( );
    }
}
