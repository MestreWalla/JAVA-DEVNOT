package Semestre02.Aula01RevisaoFPOO.Agenda;

import javax.swing.JOptionPane;

public abstract class Agenda {
    double data; // dd/mm/aa
    String informaçoes;
    

    public Agenda(double data, String informaçoes) {
        this.data = data;
        this.informaçoes = informaçoes;
    }


    public double getData() {
        return data;
    }


    public void setData(double data) {
        this.data = data;
    }


    public String getInformaçoes() {
        return informaçoes;
    }


    public void setInformaçoes(String informaçoes) {
        this.informaçoes = informaçoes;
    }


    public void agendarConsulta() {
        double dataAgendar = Double.parseDouble(JOptionPane.showInputDialog("Informe a data a agendar"));
        if (dataAgendar == data) {
            JOptionPane.showMessageDialog(null, "Dia cheio, marque outro dia");
        } else {
            data = dataAgendar;
        }
    }
}
