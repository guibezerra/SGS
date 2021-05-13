package Classes;

public class Professor {
    private String nome, especialidade, matricula;
    private Seminario[] semi;

    public Professor (String nome, String especialidade, String matricula) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.matricula = matricula;
    }
    public String[] getProfessor(){
        String[] dados =
                        {"Nome do Professor(a): "+this.nome,
                        "Especialidade: "+this.especialidade,
                        "Matricula: "+this.matricula};
        return dados;
    }
    public void setSemi(Seminario[] semi) {
        this.semi = semi;
    }

    public void getSemi() {
        if (this.semi != null && this.semi.length != 0) {
            for(Seminario seminario:this.semi) {
                System.out.println(seminario.getTitulo());
            }
            System.out.println();
        } else {
            System.out.println("Professor(a) ainda sem seminarios cadastrados");
            System.out.println();
        }

    }

    public void imprimeProfessor() {
        System.out.println("Nome do Professor(a): "+this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Seminarios: ");
        if (this.semi != null && this.semi.length != 0) {
            for(Seminario seminario:this.semi) {
                System.out.println(seminario.getTitulo());
            }
        } else {
            System.out.println("Professor(a) ainda sem seminarios cadastrados");
        }
    }
}
