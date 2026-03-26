public class TicketCliente implements Ticket {
    private static int contadorId = 1;
    private int id;
    private String descripcion;

    public TicketCliente(String descripcion) {
        this.id = contadorId++;
        this.descripcion = descripcion;
    }

    @Override
    public void procesar() {
        System.out.println("[Atendiendo Cliente] ID: " + id + " - " + descripcion);
    }

    public int getId() { return id; }
    public String getDescripcion() { return descripcion; }
}
