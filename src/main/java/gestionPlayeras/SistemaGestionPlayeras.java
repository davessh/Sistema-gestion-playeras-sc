package gestionPlayeras;

import java.util.*;
import java.util.stream.Collectors;

public class SistemaGestionPlayeras {
    private List<Cliente> clientes;
    private List<PedidoPlayera> pedidos;

    private int idClienteSig = 1;
    private int idPedidoSig = 1;

    public SistemaGestionPlayeras() {
        clientes = new ArrayList<>();
        pedidos = new ArrayList<>();
    }

    public Cliente registrarCliente(String nombre, String telefono, String correo) {
        Cliente cliente = new Cliente(idClienteSig++, nombre, telefono, correo);
        clientes.add(cliente);
        return cliente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Optional<PedidoPlayera> buscarClienteId(int id) {
            return pedidos.stream()
                    .filter(cliente -> cliente.getId() == id)
                    .findFirst();
    }

    public Optional<PedidoPlayera> buscarPedidoPorId(int id) {
        return pedidos.stream()
                .filter(p -> p.getId() == id)
                .findFirst();
    }

    public List<PedidoPlayera> buscarPedidosPorCLiente(String nombreCliente){
        return pedidos.stream()
                .filter(p -> p.getCliente().getNombre().toLowerCase()
                        .contains(nombreCliente.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<PedidoPlayera> pedidosPendientesDePago(String nombreCliente){
        return pedidos.stream()
                .filter(p -> p.getCliente().getNombre().toLowerCase()
                        .contains(nombreCliente.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<PedidoPlayera> pedidosNoEntregados(){
        return pedidos.stream()
                .filter(p -> !p.fueEntregada())
                .collect(Collectors.toList());
    }

    public void registrarPago(int idPedido, Pago pago) {
        PedidoPlayera pedido = buscarPedidoPorId(idPedido)
                .orElseThrow(() -> new IllegalArgumentException("Pedido no encontrado"));
        pedido.registrarPago(pago);
    }

    public void marcarPedidoEntregado(int idPedido) {
        PedidoPlayera pedido = buscarPedidoPorId(idPedido)
                .orElseThrow(() -> new IllegalArgumentException("Pedido no encontrado"));
        pedido.marcarEntregada();
    }
}
