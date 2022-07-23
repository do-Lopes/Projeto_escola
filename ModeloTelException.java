
public class ModeloTelException extends Exception{
    
    Leitor Ler = new Leitor();
    
    public void ModeloTel(){
        System.out.println("\nDigite um Telefone valido");
    }
    
    
    public Aluno corrTel(Aluno A){
        try{
            A.setTelefone(Integer.parseInt(Ler.entDados("\nInforme um Telefone Residencial válido: ")));
        }
        catch(ModeloTelException nte){
            nte.ModeloTel();
            nte.corrTel(A);
        }
        catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            x.corrForm(A);
        }
    return A;
    }
        
    public Professor corrTel(Professor P){
            try{
		P.setTelefone(Integer.parseInt(Ler.entDados("\nInforme um Telefone Residencial válido: ")));
            }
            catch(ModeloTelException nte){
		nte.ModeloTel();
		nte.corrTel(P);
            }
            catch(NumberFormatException nfe){
		FormatException x = new FormatException();
		x.corrForm(P);
            }
	return P;
    }

    public Diretoria corrTel(Diretoria D){
            try{
		D.setTelefone(Integer.parseInt(Ler.entDados("\nInforme um Telefone Residencial válido: ")));
            }
            catch(ModeloTelException nte){
		nte.ModeloTel();
		nte.corrTel(D);
            }
            catch(NumberFormatException nfe){
		FormatException x = new FormatException();
		x.corrForm(D);
            }
	return D;
    }
    
    
}
