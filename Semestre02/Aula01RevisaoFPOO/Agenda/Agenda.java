package Semestre02.Aula01RevisaoFPOO.Agenda;

import javax.swing.JOptionPane;

public abstract class Agenda {
    double data; // dd/mm/aa
    double hora; // hh:mm
    String informaçoes;
    

    public Agenda(double data, double hora, String informaçoes) {
        this.data = data;
        this.hora = hora;
        this.informaçoes = informaçoes;
    }


    public double getData() {
        return data;
    }


    public void setData(double data) {
        this.data = data;
    }

    public double getHora() {
        return hora;
    }


    public void setHora(double hora) {
        this.hora = hora;
    }

    public String getInformaçoes() {
        return informaçoes;
    }


    public void setInformaçoes(String informaçoes) {
        this.informaçoes = informaçoes;
    }


    public void agendarConsulta() {
        double dataAgendar = Double.parseDouble(JOptionPane.showInputDialog("Informe a data a agendar"));
        double horaAgendar = Double.parseDouble(JOptionPane.showInputDialog("Informe a data a agendar"));
        if (dataAgendar == data && horaAgendar == hora) {
            JOptionPane.showMessageDialog(null, "Dia cheio, marque outro dia");
        } else {
            data = dataAgendar;
            hora = horaAgendar;
        }
    }
}
