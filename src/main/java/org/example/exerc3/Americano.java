package org.example.exerc3;

public final class Americano extends Relogio {
    private String meridiem;

    public Americano(int horas, int minutos, int segundos, String meridiem) {
        super(horas, minutos, segundos);
        setMeridiem(meridiem);
    }

    public String getMeridiem() {
        return meridiem;
    }

    public void setMeridiem(String meridiem) {
        switch (meridiem) {
            case "AM", "PM" -> this.meridiem = meridiem;
            default -> throw new IllegalArgumentException("O formato de hora deve ser AM ou PM");
        }
    }

    @Override
    public void setHoras(int horas) {
        if (horas >= 13) {
            throw new IllegalArgumentException("Horas não pode ser igual ou maior que 13");
        } else {
            super.setHoras(horas);
        }
    }

    @Override
    public String getHorarioFormatado() {
        return String.format("%02d:%02d:%02d %s", getHoras(), getMinutos(), getSegundos(), getMeridiem());
    }

    @Override
    public void copiarRelogio(Relogio relogio) {
        int horas = relogio.getHoras();

        if (horas == 0) {
            this.setMeridiem("AM");
            this.setHoras(12);
        } else if (horas == 12) {
            this.setMeridiem("PM");
            this.setHoras(horas);
        } else if (horas > 12) {
            setMeridiem("PM");
            setHoras(horas - 12);
        } else {
            this.setMeridiem("AM");
            this.setHoras(horas);
        }

        this.setMinutos(relogio.getMinutos());
        this.setSegundos(relogio.getSegundos());
    }
}
