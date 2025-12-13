package gestionPlayeras;
import java.time.LocalDate;

public class Pago {

    private double monto;
    private LocalDate fecha;
    private MetodoPago metodo;

    public Pago(double monto, MetodoPago metodo) {
        this.monto = monto;
        this.metodo = metodo;
        this.fecha = LocalDate.now();
    }

    public double getMonto() {
        return monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public MetodoPago getMetodo() {
        return metodo;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setMetodo(MetodoPago metodo){
        this.metodo = metodo;
    }
}
