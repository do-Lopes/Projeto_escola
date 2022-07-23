import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class GerGastos {
    
    private final Calendar hoje = Calendar.getInstance();   

    private final List<Gastos> bdGastos = new ArrayList<Gastos>();
    
    private final Leitor Ler = new Leitor();
    
    public List<Gastos> bdGastos(){
        return bdGastos;
    }
    
    public Gastos consGastosEscola(Gastos G1){
        for(int i = 0; i < bdGastos.size(); i++){
            if(G1.getGastosCod() == bdGastos.get(i).getDia()){
                return bdGastos.get(i);
            }
        }
        return null;
    }

    public Gastos cadGastos(Gastos G1){
        G1.setDia(hoje.get(Calendar.DAY_OF_MONTH));
        G1.setMes(hoje.get(Calendar.MONTH));
        G1.setAno(hoje.get(Calendar.YEAR));
        G1.setGastos(Integer.parseInt(Ler.entDados("\nInforme o valor dos gastos do dia: ")));
        G1.setItens(Ler.entDados("\nRelatorio: "));
        G1.setGastosCod(Integer.parseInt(Ler.entDados("\nInforme o registro: ")));
        if(consGastosEscola(G1) == null){
                bdGastos.add(G1);
                return G1;
        }else{
            return null;
        }        
    }
    
    public void impOneGastos(Gastos G1){
        System.out.println("\nInfo de gastos da escola");
        System.out.println("Data: "+G1.getDia()+"/"+G1.getMes()+"/"+G1.getAno());
        System.out.println("Gastos: "+G1.getGastos()); 
        System.out.println("Relatorio: "+G1.getItens());
    }
    
    
    public void impAllBdDir(){
        for(int i = 0; i < bdGastos.size(); i++){
            System.out.println("\nInfo de gastos da escola");
            System.out.println("\nData: "+bdGastos.get(i).getDia()+"/"+bdGastos.get(i).getMes()+"/"+bdGastos.get(i).getAno());
            System.out.println("\nGastos: "+bdGastos.get(i).getGastos()); 
            System.out.println("Relatorio: "+bdGastos.get(i).getItens());
        }
    }
}
