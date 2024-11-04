import Dominio.Persona;

public class Main {
    public static void main(String[] args) {
//        ColaDePedidos cp = new ColaDePedidos();
//        cp.agregarPedido("Juan", "Detalle 1");
//        cp.agregarPedido("Luis", "Detalle 2");
//        cp.agregarPedido("Ana", "Detalle 3");
//
//        System.out.println(cp.verProximoPedido());
//        System.out.println(cp.atenderPedido());
//
//        for(Pedido p : cp.verTodosLosPedidos()){
//            System.out.println(p.toString());
//        }

        HistorialNavegador hn = new HistorialNavegador();

        hn.visitarPagina("google.com");
        hn.visitarPagina("youtube.com");
        hn.visitarPagina("facebook.com");

        System.out.println(hn.verUltimaPagina());
        System.out.println(hn.retroceder());

        for(String s : hn.verHistorialCompleto()){
            System.out.println(s);
        }


    }
}