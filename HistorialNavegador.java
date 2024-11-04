import java.util.ArrayList;
import java.util.Stack;

public class HistorialNavegador {

    private Stack<String> historial = new Stack<>();

    public boolean visitarPagina(String pUrl){
        historial.push(pUrl);
        return true;
    }

    public String retroceder(){
        if(historial.isEmpty())
            return null;
        return historial.pop();
    }

    public String verUltimaPagina(){
        if(historial.isEmpty())
            return null;
        return historial.peek();
    }

    public ArrayList<String> verHistorialCompleto(){
        ArrayList<String> listHistorial = new ArrayList<>();

        for(String s : historial)
            listHistorial.add(s);

        return listHistorial;
    }

}
