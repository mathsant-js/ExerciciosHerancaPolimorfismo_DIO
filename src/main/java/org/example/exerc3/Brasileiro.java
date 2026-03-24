package org.example.exerc3;

public final class Brasileiro extends Relogio {
    public Brasileiro(int horas, int minutos, int segundos) {
        super(horas, minutos, segundos);
    }

    @Override
    public void setHoras(int horas) {
        if (horas > 23) {
            throw new IllegalArgumentException("Horas não pode ser igual ou maior que 24");
        } else {
            super.setHoras(horas);
        }
    }

    // Americano: 03:20:00 PM
    @Override
    public void copiarRelogio(Relogio relogio) {
        if (relogio instanceof Americano americano) {
            if (americano.getMeridiem().equals("PM") && americano.getHoras() != 12) {
                setHoras(americano.getHoras() + 12);
            } else if (americano.getMeridiem().equals("AM") && americano.getHoras() == 12) {
                setHoras(0);
            } else {
                setHoras(americano.getHoras());
            }
        } else {
            setHoras(relogio.getHoras());
        }

        setMinutos(relogio.getMinutos());
        setSegundos(relogio.getSegundos());
    }
}
