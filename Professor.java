public class Professor extends Pessoas{
    private int siape;
    private int dia;
    private int mes;
    private int ano;
    private String abon;

  
    public String getAbon(){
        return abon;
    }      

    public int getSiape(){
        return siape;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
    

    public void setAbon(String abon){
        this.abon = abon;
    }

    public void setSiape(int siape){
        this.siape = siape;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
}
        
