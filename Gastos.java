public class Gastos {
    private int dia;
    private int mes;
    private int ano;
    private int gastosCod;
    private int gastos;
    private String itens;
    
    public String getItens(){
        return itens;
    }
    
    public int getGastosCod(){
            return gastosCod;
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
                        
        public int getGastos(){
            return gastos;
        }
        
        public void setAno(int ano){
            this.ano = ano;
        }
        
        public void setMes(int mes){
            this.mes = mes;
        }
        
        public void setDia(int dia){
            this.dia = dia;
        }
        
        public void setGastosCod(int gastosCod){
            this.gastosCod = gastosCod;
        }
    
        public void setGastos(int gastos){
            this.gastos = gastos;
        }
        
        public void setItens(String itens){
            this.itens = itens;
        }
    
}
