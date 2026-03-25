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

    private boolean acimaHorasPermitidoAmericano(int horas) {
        return horas > 12;
    }

    @Override
    public void setHoras(int horas) {
        if (acimaHorasPermitidoAmericano(horas)) {
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

        if (isMeiaNoite(horas)) {
            this.setMeridiem("AM");
            this.setHoras(12);
        } else if (isMeioDia(horas)) {
            this.setMeridiem("PM");
            this.setHoras(horas);
        } else if (isTarde(horas)) {
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
