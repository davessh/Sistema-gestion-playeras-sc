import java.util.ArrayList;

public class gestionPlayeras {
    private ArrayList<Cliente> Clientes;
    private float precioPlayera;
    public gestionPlayeras() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        precioPlayera = 350;
    }

    public void agregarCliente(Cliente cliente){
        Clientes.add(cliente);
    }

    public void verClientes(){
        for(Cliente cliente : Clientes){
            System.out.println(cliente);
        }
    }

}
