public class Main {
public static void main(String[]args){
    GestorReservas gestor = new GestorReservas(4);

    reservas reserva1 = new salaTradicional("Sala 1", "Avatar", 5000, 120);
    reservas reserva2 = new salaTradicional("Sala 2", "Chainsaw Man - Reze Arc", 4500, 100);
    reservas reserva3 = new sala3D("Sala 3D #1", "Spiderman Into the Spiderverse", 5500, 150);
    reservas reserva4 new sala3D("Sala 3D #2", "Depredador Tierras Salvajes", 5500, 150);


    gestor.agregarReserva(reserva1);
    gestor.agregarReserva(reserva2);
    gestor.agregarReserva(reserva3);
    gestor.agregarReserva(reserva4);

    double total = 0;

    for (int i = 0; i < gestor.getReservas().length; i++){
        reservas r = gestor.getReservas()[i];
        System.out.println(r.obtenerDetalles());

        if (r instanceof sala3D) {
            total += r.getCostoBase() + ((sala3D)r).getValorLentes();
            
        } else {
            total += r.getCostoBase();
        }
    }

    System.out.println("Costo total:" + total);

 }    
 
}
