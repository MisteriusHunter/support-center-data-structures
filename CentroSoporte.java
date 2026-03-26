import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CentroSoporte {
    private Queue<Ticket> colaClientes = new LinkedList<>();
    private Stack<Ticket> pilaInternos = new Stack<>();

    public void agregarTicketCliente(String descripcion) {
        colaClientes.add(new TicketCliente(descripcion));
    }

    public void agregarTicketInterno(String descripcion) {
        pilaInternos.push(new TicketInterno(descripcion));
    }

    public void atenderSiguienteTicketCliente() {
        if (!colaClientes.isEmpty()) {
            colaClientes.poll().procesar();
        } else {
            System.out.println("No hay tickets de clientes pendientes.");
        }
    }

    public void resolverUltimoTicketInterno() {
        if (!pilaInternos.isEmpty()) {
            pilaInternos.pop().procesar();
        } else {
            System.out.println("No hay tickets internos pendientes.");
        }
    }

    public void mostrarTicketsPendientes() {
        System.out.println("\n--- ESTADO ACTUAL DE TICKETS ---");
        System.out.println("Clientes en espera (FIFO): " + colaClientes.size());
        for (Ticket t : colaClientes) {
            System.out.println("  > ID: " + t.getId() + " - " + t.getDescripcion());
        }
        
        System.out.println("Pendientes internos (LIFO): " + pilaInternos.size());
        for (int i = pilaInternos.size() - 1; i >= 0; i--) {
            Ticket t = pilaInternos.get(i);
            System.out.println("  > ID: " + t.getId() + " - " + t.getDescripcion());
        }
    }

    public int contarTotalTicketsPendientes() {
        return colaClientes.size() + pilaInternos.size();
    }
}
