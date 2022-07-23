
public class ModeloInglesException extends Exception{
    
    Leitor Ler = new Leitor();
    
    public void ModeloIngles(){
        System.out.println("\nDigite um nota valida");
    }
    
    public Aluno corrIngles(Aluno A){
            try{
		A.setIngles(Integer.parseInt(Ler.entDados("\nInforme uma nota valida: ")));
            }
            catch(ModeloInglesException mie){
		mie.ModeloIngles();
		mie.corrIngles(A);
            }
            catch(NumberFormatException nfe){
		FormatException x = new FormatException();
		x.corrForm(A);
            }
	return A;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
