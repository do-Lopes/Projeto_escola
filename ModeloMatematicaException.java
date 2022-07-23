
public class ModeloMatematicaException extends Exception {
   
    Leitor Ler = new Leitor();
    
    public void ModeloMatematica(){
        System.out.println("\nDigite uma nota valida");
    }
    
    public Aluno corrMatematica(Aluno A){
        try{
		A.setMatematica(Integer.parseInt(Ler.entDados("\nInforme uma nota valida: ")));
            }
            catch(ModeloMatematicaException mme){
		mme.ModeloMatematica();
		mme.corrMatematica(A);
            }
            catch(NumberFormatException nfe){
		FormatException x = new FormatException();
		x.corrForm(A);
            }
        
        return A;
    }
    
    
    
}
