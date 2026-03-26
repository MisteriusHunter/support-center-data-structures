public class TicketInterno implements Ticket {
    private static int contadorId = 100;
    private int id;
    private String descripcion;

    public TicketInterno(String descripcion) {
        this.id = contadorId++;
        this.descripcion = descripcion;
    }

    @Override
    public void procesar() {
        System.out.println("[Resolviendo Interno] ID: " + id + " - " + descripcion);
    }

    public int getId() { return id; }
    public String getDescripcion() { return descripcion; }
}
