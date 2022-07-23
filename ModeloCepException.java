

public class ModeloCepException extends Exception{
   
    Leitor Ler = new Leitor();
    
    public void ModeloCep(){
        System.out.println("\nDigite um CEP valido");
    }
    
        public Aluno corrCep(Aluno A){
            try{
		A.setCep(Integer.parseInt(Ler.entDados("\nInforme um CEP valido: ")));
            }
            catch(ModeloCepException mce){
		mce.ModeloCep();
		mce.corrCep(A);
            }
            catch(NumberFormatException nfe){
		FormatException x = new FormatException();
		x.corrForm(A);
            }
	return A;
    }
        
        public Diretoria corrCep(Diretoria D){
           try{
		D.setCep(Integer.parseInt(Ler.entDados("\nInforme um CEP valido: ")));
            }
            catch(ModeloCepException mce){
		mce.ModeloCep();
		mce.corrCep(D);
            }
            catch(NumberFormatException nfe){
		FormatException x = new FormatException();
		x.corrForm(D);
            }
	return D; 
        }
        
        public Professor corrCep(Professor P){
           try{
		P.setCep(Integer.parseInt(Ler.entDados("\nInforme um CEP valido: ")));
            }
            catch(ModeloCepException mce){
		mce.ModeloCep();
		mce.corrCep(P);
            }
            catch(NumberFormatException nfe){
		FormatException x = new FormatException();
		x.corrForm(P);
            }
	return P; 
        }
}    
    
    

