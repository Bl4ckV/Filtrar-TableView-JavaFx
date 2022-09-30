@FXML
private ObservableList<Pedido> pedidos = FXCollections.observableArrayList();
private ObservableList<Pedido> pedidos1 = FXCollections.observableArrayList();

@FXML
public void eliminarPedido() {
    tablaPedidos.getItems().remove(tablaPedidos.getSelectionModel().getSelectedItem());
    for (int i = 0; i < pedidos.size(); i++) {
        if (pedidos.get(i).getTipo().equalsIgnoreCase(eFiltrar.getText()) || pedidos.get(i).getTipo().equalsIgnoreCase(eFiltrar.getText()))
            pedidos.remove(i);
    }
}

public void buscar() {
    if (eFiltrar.getText().equalsIgnoreCase("")) {
                tablaPedidos.setItems((ObservableList)pedidos);
    }
    else {
        pedidos1.clear();
        for (int i = 0; i < pedidos.size() ; i++) {
            if (pedidos.get(i).getTipo().equalsIgnoreCase(eFiltrar.getText())) 
               pedidos1.add(pedidos.get(i));
        } 
        tablaPedidos.setItems((ObservableList)pedidos1);
    }
}
