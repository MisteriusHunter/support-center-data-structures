public class Main {
    public static void main(String[] args) {
        CentroSoporte centro = new CentroSoporte();

        // Agregar 3 tickets de cliente
        centro.agregarTicketCliente("Error en login");
        centro.agregarTicketCliente("Pago duplicado");
        centro.agregarTicketCliente("Consulta de saldo");

        // Agregar 2 tickets internos
        centro.agregarTicketInterno("Actualizar servidor");
        centro.agregarTicketInterno("Backup de base de datos");

        // Atender tickets
        System.out.println("Iniciando atención...");
        centro.atenderSiguienteTicketCliente(); // Atiende ID 1
        centro.atenderSiguienteTicketCliente(); // Atiende ID 2
        centro.resolverUltimoTicketInterno();    // Atiende ID 101

        // Mostrar resultados finales
        centro.mostrarTicketsPendientes();
        System.out.println("\nTotal pendientes: " + centro.contarTotalTicketsPendientes());
    }
}
