public class Pedido {
    private String nombreCliente;
    private String detallePedido;

    public Pedido(String nombreCliente, String detallePedido) {
        this.nombreCliente = nombreCliente;
        this.detallePedido = detallePedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", detallePedido='" + detallePedido + '\'' +
                '}';
    }
}
