
public class ModeloBiologiaException extends Exception{
    
    Leitor Ler = new Leitor();
    
    public void ModeloBiologia(){
        System.out.println("\nDigite uma nota valida");
    }
    
    public Aluno corrBiologia(Aluno A){
        try{
		A.setBiologia(Integer.parseInt(Ler.entDados("\nInforme uma nota valida: ")));
            }
            catch(ModeloBiologiaException mbe){
		mbe.ModeloBiologia();
		mbe.corrBiologia(A);
            }
            catch(NumberFormatException nfe){
		FormatException x = new FormatException();
		x.corrForm(A);
            }
        
        return A;
    }
    
    
    
    
    
    
}
