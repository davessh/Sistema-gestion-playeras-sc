package InterfazGrafica;
import gestionPlayeras.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ControladorInterfaz {

    @FXML private TableView<PedidoPlayera> tablaPedidos;

    @FXML private TableColumn<PedidoPlayera, Number> colId;
    @FXML private TableColumn<PedidoPlayera, String> colCliente;
    @FXML private TableColumn<PedidoPlayera, String> colTalla;
    @FXML private TableColumn<PedidoPlayera, String> colCorte;
    @FXML private TableColumn<PedidoPlayera, Number> colPagado;
    @FXML private TableColumn<PedidoPlayera, Number> colDeuda;
    @FXML private TableColumn<PedidoPlayera, Boolean> colEntregada;

    private ObservableList<PedidoPlayera> pedidos;

    @FXML
    public void initialize() {
        configurarColumnas();
        cargarDatosDummy();
    }

    private void configurarColumnas() {

        colId.setCellValueFactory(
                data -> new SimpleIntegerProperty(data.getValue().getId())
        );

        colCliente.setCellValueFactory(
                data -> new SimpleStringProperty(
                        data.getValue().getCliente().getNombre()
                )
        );

        colTalla.setCellValueFactory(
                data -> new SimpleStringProperty(
                        data.getValue().getTalla().name()
                )
        );

        colCorte.setCellValueFactory(
                data -> new SimpleStringProperty(
                        data.getValue().getCorte().name()
                )
        );

        colPagado.setCellValueFactory(
                data -> new SimpleDoubleProperty(
                        data.getValue().getPagado()
                )
        );

        colDeuda.setCellValueFactory(
                data -> new SimpleDoubleProperty(
                        data.getValue().getDeuda()
                )
        );

        colEntregada.setCellValueFactory(
                data -> new SimpleBooleanProperty(
                        data.getValue().fueEntregada()
                )
        );
    }

    private void cargarDatosDummy() {
        pedidos = FXCollections.observableArrayList();

        pedidos.add(new PedidoPlayera(
                1,
                new Cliente(1, "David Escárcega", "6861234567", "descarcegasc@gmail.com"),
                Tallas.XS,
                CortePlayera.CABALLERO,
                350,
                2024,
                "Anticipo"
        ));

        pedidos.add(new PedidoPlayera(
                2,
                new Cliente(2, "Daniel Valdez", null, null),
                Tallas.S,
                CortePlayera.CABALLERO,
                350,
                2024,
                "Pendiente"
        ));

        tablaPedidos.setItems(pedidos);
    }
}
