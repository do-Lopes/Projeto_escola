
public class FormatException {
    
    Leitor Ler = new Leitor();

    int x;

    public void FormEX(){
	System.out.println("\nDigite um CEP valido");
    }
        
        public Aluno corrForm(Aluno A){
            try{
		A.setCep(Integer.parseInt(Ler.entDados("\nInforme um numero válido: ")));
            }
            catch(NumberFormatException nfe){
		FormatException x = new FormatException();
		x.corrForm(A);
            }
            catch(ModeloCepException mce){
		mce.ModeloCep();
		mce.corrCep(A);
            }
        return A;
    }
        public Diretoria corrForm(Diretoria D){
           try{
		D.setCep(Integer.parseInt(Ler.entDados("\nInforme um numero válido: ")));
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
        
        public Professor corrForm(Professor P){
           try{
		P.setCep(Integer.parseInt(Ler.entDados("\nInforme um numero válido: ")));
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
