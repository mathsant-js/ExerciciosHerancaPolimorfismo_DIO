package org.example.exerc3;

public sealed abstract class Relogio permits Americano, Brasileiro {
    private int horas;
    private int minutos;
    private int segundos;

    public Relogio(int horas, int minutos, int segundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public String getHorarioFormatado() {
        return String.format("%02d:%02d:%02dH", horas, minutos, segundos);
    }

    public abstract void copiarRelogio(Relogio relogio);

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas > 23) {
            throw new IllegalArgumentException("Horas não pode ser igual ou maior que 24");
        } else if (horas < 0) {
            throw new IllegalArgumentException("Horas não pode ser negativa!");
        } else {
            this.horas = horas;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos > 59) {
            throw new IllegalArgumentException("Os minutos não podem ser maiores que 60!");
        } else if (minutos < 0) {
            throw new IllegalArgumentException("Os minutos não podem ser negativos!");
        } else {
            this.minutos = minutos;
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos > 59) {
            throw new IllegalArgumentException("Os segundos não podem ser maiores que 60!");
        } else if (segundos < 0) {
            throw new IllegalArgumentException("Os segundos não podem ser negativos!");
        } else {
            this.segundos = segundos;
        }
    }
}
