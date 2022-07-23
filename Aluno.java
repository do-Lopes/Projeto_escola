public class Aluno extends Pessoas{
        private int registro;
        private int senha;
        private String responsavel;
        private int portugues;
        private int matematica;
        private int ingles;
        private int fisica;
        private int biologia;

        
        public int getSenha(){
            return senha;
        }
        
        public String getResponsavel(){
            return responsavel;
        }
       
        
        public int getPortugues(){
            return portugues;
        }
        
        
        public int getMatematica(){
            return matematica;
        }
        
        public int getIngles(){
            return ingles;
        }
        
        public int getFisica(){
            return fisica;
        }
        
        public int getBiologia(){
            return biologia;
            }
        
        public int getRegistro(){
            return registro;
        }
        
        
        public void setSenha(int senha){
            this.senha = senha;
        }
        
        public void setResponsavel(String responsavel){
            this.responsavel = responsavel;
        }
        
        public void setPortugues(int portugues) throws ModeloPortuguesException{
            if((portugues>-1)&&(portugues<11)){
            this.portugues = portugues;
        }else{
                throw new ModeloPortuguesException();
            }
        }
        
        public void setMatematica(int matematica)throws ModeloMatematicaException{
            if((matematica>-1)&&(matematica<11)){
            this.matematica = matematica;
        }else{
                throw new ModeloMatematicaException();
            }
        }
            
        public void setFisica(int fisica)throws ModeloFisicaException{
            if((fisica>-1)&&(fisica<11)){
            this.fisica = fisica;
        }else{
                throw new ModeloFisicaException();
            }
        }
        
        public void setIngles(int ingles)throws ModeloInglesException{
            if((ingles>-1)&&(ingles<11)){
            this.ingles = ingles;
        }else{
                throw new ModeloInglesException();
            }
        }
        
        public void setBiologia(int biologia)throws ModeloBiologiaException{
            if((biologia>-1)&&(biologia<11)){
            this.biologia = biologia;
        }else{
                throw new ModeloBiologiaException();
            }
        }
        
        public void setRegistro(int registro){
            this.registro = registro;          
        }
}       