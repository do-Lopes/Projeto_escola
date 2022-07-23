
public class ModeloPortuguesException extends Exception {
    
    Leitor Ler = new Leitor();
    
    public void ModeloPortugues(){
        System.out.println("\nDigite uma nota valida");
    }
    
    public Aluno corrPortugues(Aluno A){
        try{
		A.setPortugues(Integer.parseInt(Ler.entDados("\nInforme uma nota valida: ")));
            }
            catch(ModeloPortuguesException mpe){
		mpe.ModeloPortugues();
		mpe.corrPortugues(A);
            }
            catch(NumberFormatException nfe){
		FormatException x = new FormatException();
		x.corrForm(A);
            }
        
        return A;
    }
    
}
