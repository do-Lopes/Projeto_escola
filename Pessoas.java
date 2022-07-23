abstract class Pessoas{
        private String rua;
        private int cep;
        private int telefone;        
        private String nome;
        
        public String getRua(){
            return rua;
            }
        
        public int getCep(){
            return cep;
            }
        
        public int getTelefone(){
            return telefone;
            }
        
        public String getNome(){
            return nome;
            }
        
                
        public void setRua(String rua){
            this.rua = rua;
            }
        
        public void setTelefone(int telefone) throws ModeloTelException{
            if((telefone>00000000)&&(telefone<99999999)){
            this.telefone = telefone;
            }else{
                throw new ModeloTelException();
            }
        }
        
        public void setNome(String nome){
            this.nome = nome;
            }
        
        public void setCep(int cep) throws ModeloCepException{
            if((cep>0)&&(cep<100000000)){
            this.cep = cep;
            }else{
                throw new ModeloCepException();
            }
        }
        
        
}