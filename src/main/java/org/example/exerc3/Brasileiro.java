package org.example.exerc3;

public final class Brasileiro extends Relogio {
    public Brasileiro(int horas, int minutos, int segundos) {
        super(horas, minutos, segundos);
    }

    // Americano: 03:20:00 PM
    @Override
    public void copiarRelogio(Relogio relogio) {
        if (relogio instanceof Americano americano) {
            if (!isAM(americano) && !isMeioDia(americano.getHoras())) {
                setHoras(americano.getHoras() + 12);
            } else if (isAM(americano) && isMeioDia(americano.getHoras())) {
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
