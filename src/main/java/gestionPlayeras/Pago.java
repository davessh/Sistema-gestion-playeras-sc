package gestionPlayeras;
import java.time.LocalDate;

public class Pago {

    private double monto;
    private LocalDate fecha;
    private String metodo;

    public Pago(double monto, String metodo) {
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

    public String getMetodo() {
        return metodo;
    }
}
