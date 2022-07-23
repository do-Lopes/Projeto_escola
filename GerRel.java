
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class GerRel {
    
    private final Calendar hoje = Calendar.getInstance();     
    
    private final List<Relatorio> bdRelatorio = new ArrayList<Relatorio>();
    
    private final Leitor Ler = new Leitor();
    
    public List<Relatorio> bdRelatorio(){
        return bdRelatorio;
    }
    
    public Relatorio cadRelatorios(Relatorio R1){  
        R1.setDia(hoje.get(Calendar.DAY_OF_MONTH));
        R1.setMes(hoje.get(Calendar.MONTH));
        R1.setAno(hoje.get(Calendar.YEAR));
        R1.setDiario(Ler.entDados("\nRelatorio: "));
        R1.setDiariocod(Integer.parseInt(Ler.entDados("\nInforme o registro: ")));
        if(consDiarioCod(R1) == null){
            bdRelatorio.add(R1);
            return R1;   
        }else{
            return null;
        }
    }
    
    public Relatorio consDiarioCod(Relatorio R1){
        for(int i = 0; i < bdRelatorio.size(); i++){
            if(R1.getDiariocod() == bdRelatorio.get(i).getDiariocod()){
                return bdRelatorio.get(i);
            }
        }
    return null;
    }
    
    public void impAllRelatorio(){        
        for(int i = 0; i < bdRelatorio.size(); i++){
        System.out.println("\nRelatórios: ");
        System.out.println("\tData: "+bdRelatorio.get(i).getDia()+"/"+bdRelatorio.get(i).getMes()+"/"+bdRelatorio.get(i).getAno());
        System.out.println("\tRelatorio: "+bdRelatorio.get(i).getDiario()); 
        }
    }
    
        
    
    
    
}
