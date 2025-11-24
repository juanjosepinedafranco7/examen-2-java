public class sala3D extends reservas {
    private double valorLentes;

    public sala3D(String codigo, String nombrePelicula, double costoBase, double valorLentes) {
        super(codigo, nombrePelicula, costoBase);
        this.valorLentes = valorLentes;
    }

    public double getValorLentes() {
        return valorLentes;
    }

    public void setValorLentes(double valorLentes) {
        this.valorLentes = valorLentes;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + " - Valor Lentes: " + valorLentes;
    }
}