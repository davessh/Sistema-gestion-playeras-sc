public class Cliente {
    private String nombreCompleto;
    private String talla;
    private String tipoPlayera;
    private float precioPaqueteCompleto;
    private float dineroAbonado;
    public boolean adeudo;

    public Cliente(String nombreCompleto,String talla, String tipoPlayera, float dineroAbonado ) {
        this.nombreCompleto = nombreCompleto;
        this.talla = talla;
        this.tipoPlayera = tipoPlayera;
        this.precioPaqueteCompleto = precioPaqueteCompleto;
        this.adeudo = true;
        this.dineroAbonado = dineroAbonado;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getTalla() {
        return talla;
    }
    public void setTalla(String talla) {
        this.talla = talla;
    }
    public String getTipoPlayera() {
        return tipoPlayera;
    }
    public void setTipoPlayera(String tipoPlayera) {
        this.tipoPlayera = tipoPlayera;
    }
    public float getPrecioPaqueteCompleto() {
        return precioPaqueteCompleto;
    }
    public void setPrecioPaqueteCompleto(float precioPaqueteCompleto) {
        this.precioPaqueteCompleto = precioPaqueteCompleto;
    }
    public float getDineroAbonado() {
        return dineroAbonado;
    }
    public void setDineroAbonado(float dineroAbonado) {
        this.dineroAbonado = dineroAbonado;
    }

    public String toString(){
        return "Nombre:" + getNombreCompleto() + " Talla:" + getTalla() + " Corte de playera:" + getTipoPlayera() + " Pago:" + getDineroAbonado();
    }
}
