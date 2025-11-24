public class GestorReservas {
    private reservas[] reservas;
    private int numeroActual;
    private int capacidad;

    public GestorReservas(int capacidad) {
        this.capacidad = capacidad;
        reservas = new reservas[capacidad];
        numeroActual = 0;
    }

    public void agregarReserva(reservas r) {
        if (numeroActual < capacidad) {
            reservas[numeroActual] = r;
            numeroActual++;
        }
    }

    public reservas[] getReservas() {
        return reservas;
    }
}