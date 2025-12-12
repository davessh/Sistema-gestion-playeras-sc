package gestionPlayeras;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PedidoPlayera {
    private int id;
    private Cliente cliente;
    private String talla;
    private CortePlayera corte;
    private double precioPlayera;
    private double pagado;
    private boolean entregada;
    private LocalDate fecha;
    private int edicionPlayera;
    private List<Pago> pagos;
    private String notas;

    public PedidoPlayera(int id, Cliente cliente, String talla, CortePlayera corte, double precioPlayera, int edicionPlayera, String notas) {
        this.id = id;
        this.cliente = cliente;
        this.talla = talla;
        this.corte = corte;
        this.precioPlayera = precioPlayera;
        this.edicionPlayera = edicionPlayera;
        this.notas = notas;

        this.pagado = 0;
        this.entregada = false;
        this.fecha = LocalDate.now();
        this.pagos = new ArrayList<>();
    }

    public PedidoPlayera(Cliente cliente, String talla, CortePlayera corte, double precioPlayera) {
        this(0, cliente, talla, corte, precioPlayera, LocalDate.now().getYear(), "");
    }

    public void registrarPago(Pago pago) {
        pagos.add(pago);
        pagado += pago.getMonto();
    }

    public double getDeuda(){
        return precioPlayera - pagado;
    }

    public boolean estaPagado() {
        return pagado > precioPlayera;
    }

    public void marcarEntregada() {
        this.entregada = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    public CortePlayera getCorte() {
        return corte;
    }
    public void setCorte(CortePlayera corte) {
        this.corte = corte;
    }
    public double getPrecioPlayera() {
        return precioPlayera;
    }
    public void setPrecioPlayera(double precioPlayera) {
     this.precioPlayera = precioPlayera;
    }

    public double getPagado() {
        return pagado;
    }
    public void setPagado(double pagado) {
        this.pagado = pagado;
    }
    public boolean fueEntregada() {
        return entregada;
    }

    public void setEntregada(boolean entregada) {
        this.entregada = entregada;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getEdicionPlayera() {
        return edicionPlayera;
    }

    public void setEdicionPlayera(int edicionPlayera) {
        this.edicionPlayera = edicionPlayera;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    @Override

    public String toString() {
        return cliente.getNombre() + "(" + talla + " - " + corte + ")";
    }



}
