import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ColaDePedidos {
    Queue<Pedido> pedidos = new LinkedList<>();
    public boolean agregarPedido(String pNombreCliente, String pDetallePedido){
        Pedido p = new Pedido(pNombreCliente, pDetallePedido);
        return pedidos.offer(p);
    }
    public Pedido atenderPedido(){
        if(pedidos.isEmpty())
            return null;
        return pedidos.poll();
    }
    public Pedido verProximoPedido(){
        if(pedidos.isEmpty())
            return null;
        return pedidos.peek();
    }
    public ArrayList<Pedido> verTodosLosPedidos(){
        ArrayList<Pedido> listPedidos = new ArrayList<>();
        for(Pedido p : pedidos){
            listPedidos.add(p);
            System.out.println(p.toString());
        }
        return listPedidos;
    }

}
