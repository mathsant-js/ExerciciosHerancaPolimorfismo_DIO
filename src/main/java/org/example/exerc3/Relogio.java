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

    private boolean isNegativo(int tempo) {
        return tempo < 0;
    }

    private boolean acimaTempoPermitido(int tempo) {
        return tempo > 59;
    }

    private boolean acimaHorasDoDia(int horas) {
        return horas > 23;
    }

    protected boolean isMeiaNoite(int horas) {
        return horas == 0;
    }

    protected boolean isMeioDia(int horas) {
        return horas == 12;
    }

    protected boolean isTarde(int horas) {
        return horas > 12;
    }

    protected boolean isAM(Americano americano) {
        return americano.getMeridiem().equals("AM");
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (acimaHorasDoDia(horas)) {
            throw new IllegalArgumentException("Horas não pode ser igual ou maior que 24");
        } else if (isNegativo(horas)) {
            throw new IllegalArgumentException("Horas não pode ser negativa!");
        } else {
            this.horas = horas;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (acimaTempoPermitido(minutos)) {
            throw new IllegalArgumentException("Os minutos não podem ser maiores que 60!");
        } else if (isNegativo(minutos)) {
            throw new IllegalArgumentException("Os minutos não podem ser negativos!");
        } else {
            this.minutos = minutos;
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (acimaTempoPermitido(segundos)) {
            throw new IllegalArgumentException("Os segundos não podem ser maiores que 60!");
        } else if (isNegativo(segundos)) {
            throw new IllegalArgumentException("Os segundos não podem ser negativos!");
        } else {
            this.segundos = segundos;
        }
    }
}
