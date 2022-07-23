

public class ModeloFisicaException extends Exception{
    
    Leitor Ler = new Leitor();
    
    public void ModeloFisica(){
        System.out.println("\nDigite um nota valida");
    }
    
    public Aluno corrFisica(Aluno A){
            try{
		A.setFisica(Integer.parseInt(Ler.entDados("\nInforme uma nota valida: ")));
            }
            catch(ModeloFisicaException mfe){
		mfe.ModeloFisica();
		mfe.corrFisica(A);
            }
            catch(NumberFormatException nfe){
		FormatException x = new FormatException();
		x.corrForm(A);
            }
	return A;
    }
    
    
    
    
    
    
    
}
