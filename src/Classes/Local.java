package Classes;



public class Local {
    private String setor, bloco, sala, horario, data;

    public Local(String setor, String bloco, String sala, String horario, String data) {
        this.setor = setor;
        this.bloco = bloco;
        this.sala = sala;
        if (horario.length() == 5 && horario.charAt(2) == ':') {
            String[] aux = horario.split(":");
            int a = Integer.parseInt(aux[0]), b = Integer.parseInt(aux[1]);
            if ((a >= 0 && a < 24) && (b >= 0 && b < 60)) {
                this.horario = horario;
            } else {
                this.horario = "Formato de hora invalido";
            }

        } else {
            this.horario = "Formato de hora invalido";
        }
        try {
            if (data.length() == 10 && data.charAt(2) == '/' && data.charAt(5) == '/') {
                String[] aux = data.split("/");
                int dia, mes, ano;
                dia = Integer.parseInt(aux[0]);
                mes = Integer.parseInt(aux[1]);
                ano = Integer.parseInt(aux[2]);
                if (ano >= 2021) {
                    if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0 && ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) || (mes == 2 && (dia <= 29 && ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) || dia <= 28))) {
                        this.data = data;
                    } else {
                        this.data = "dia, mes ou ano incorretos";
                    }
                }
            } else {
                this.data = "Formato de data invalido";
            }
        } catch (NumberFormatException ex) {
            this.data = "caracter invalido";
        }
    }
    public String[] getLocal() {
        String[] dados = {"Setor: " + this.setor,
                "Bloco: " + this.bloco,
                "Sala: " + this.sala,
                "Horario: " + this.horario,
                "Data: " + this.data};
        return dados;
    }
}
