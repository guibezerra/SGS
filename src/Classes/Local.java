package Classes;

import javax.lang.model.element.NestingKind;

public class Local {
    private String setor, bloco, sala, horario, data;

    public Local (String setor, String bloco, String sala, String horario, String data) {
        this.setor = setor;
        this.bloco = bloco;
        this.sala = sala;
        this.horario = horario;
        this.data = data;
    }

    public String[] getLocal() {
        String[] dados = {"Setor: "+this.setor,
        "Bloco: "+this.bloco,
        "Sala: "+this.sala,
        "Horario: "+this.horario,
        "Data: "+this.data};
        return dados;
    }
}
