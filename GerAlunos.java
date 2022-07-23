import java.util.List;
import java.util.ArrayList;



public class GerAlunos {

    private final List<Aluno> bdAlunos = new ArrayList<Aluno>();

    private final Leitor Ler = new Leitor();




    public List<Aluno> getBdAlunos(){
        return bdAlunos;
    }

    
    
    public Aluno consAlunosSenha(Aluno A1){
        for(int i = 0; i < bdAlunos.size(); i++){
            if(A1.getSenha() == bdAlunos.get(i).getSenha()){
                return bdAlunos.get(i);
            }
        }
    return null;
}

        
	
    public Aluno consAlunosCod(Aluno A1){
        for(int i = 0; i < bdAlunos.size(); i++){
            if(A1.getRegistro() == bdAlunos.get(i).getRegistro()){
                return bdAlunos.get(i);
            }
        }
    return null;
}

    public void impOneNotasAlunos(Aluno A1){
        System.out.println("\n NOTAS");
        System.out.println("\n Matematica:"+A1.getMatematica());
        System.out.println("\n Fisica:"+A1.getFisica());
        System.out.println("\n Ingles:"+A1.getIngles());
        System.out.println("\n Portugues:"+A1.getPortugues());
        System.out.println("\n Biologia:"+A1.getBiologia());
    }

    public void impOneAlunos(Aluno A1){	
        System.out.println("\n Nome do Aluno: "+A1.getNome());
        System.out.println("\n CEP do aluno:"+A1.getCep());
        System.out.println("\n Endereço do aluno:"+A1.getRua());
        System.out.println("\n Nome do responsavel do aluno:"+A1.getResponsavel());
        System.out.println("\n Telefone:"+A1.getTelefone());
        System.out.println("\n Registro:"+A1.getRegistro());
        System.out.println("\n Senha: "+A1.getSenha());
    }


    public Aluno removeAlunosCod(Aluno A1){
        A1 = consAlunosCod(A1);
        if(A1 != null){
            bdAlunos.remove(A1);
        }
        return A1;
    }



//----------------------------------------------------------------------------------------

    public void AttAlunoCod(Aluno A1){

        A1.setNome(Ler.entDados("\nInforme o nome do aluno: "));       

        A1.setRua(Ler.entDados("\nInforme a Rua do Aluno: "));

        try{
            A1.setCep(Integer.parseInt(Ler.entDados("\nInforme o CEP[00000000] do Aluno: ")));
        }
        catch(ModeloCepException mce){
            mce.ModeloCep();
            A1 = mce.corrCep(A1);	
        }
        catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            A1 = x.corrForm(A1);
        }

        A1.setResponsavel(Ler.entDados("\nInforme o nome do responsavel: "));

        try{
            A1.setTelefone(Integer.parseInt(Ler.entDados("\nInforme o Telefone Residencial[00000000] do aluno: ")));
        }
        catch(ModeloTelException nte){
            nte.ModeloTel();
            A1 = nte.corrTel(A1);            
        }
        catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            A1 = x.corrForm(A1);
        }

        for(int i = 0; i < bdAlunos.size(); i++){
        if(A1.getRegistro() == bdAlunos.get(i).getRegistro()){
                bdAlunos.set(i, A1);
            }
        }
    }

//----------------------------------------------------------------------------------


    public Aluno cadAlunos(Aluno A1){

        A1.setNome(Ler.entDados("\nInforme o nome do aluno: "));       
					
        A1.setRua(Ler.entDados("\nInforme a Rua do Aluno: "));
				
        try
        {
            A1.setCep(Integer.parseInt(Ler.entDados("Informe o CEP[8 DIGITOS]")));
        }
        catch(ModeloCepException mce){
            mce.ModeloCep();
            A1 = mce.corrCep(A1);	
        }
        catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            A1 = x.corrForm(A1);
        }

        A1.setResponsavel(Ler.entDados("\nInforme o nome do responsavel: "));

        try{
            A1.setTelefone(Integer.parseInt(Ler.entDados("\nInforme o Telefone Residencial[8 DIGITOS] do aluno: ")));
        }
        catch(ModeloTelException nte){
            nte.ModeloTel();
            A1 = nte.corrTel(A1);            
        }
        catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            A1 = x.corrForm(A1);
        }
                
        try{  
            A1.setRegistro(Integer.parseInt(Ler.entDados("\nAtribua um registro ao aluno: ")));
        }catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            A1 = x.corrForm(A1);
        }
        
        try{   
            A1.setSenha(Integer.parseInt(Ler.entDados("\nAtribua uma senha ao aluno: ")));
        }catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            A1 = x.corrForm(A1);
        }
        

        if(consAlunosSenha(A1)==null){
            if(consAlunosCod(A1)== null){
                bdAlunos.add(A1);
                return A1;
            }else{
                return null;
            }
        }else{
            System.out.println("Senha Indisponivel");
            return null;
        }
    }
			
       
        
    //---------------------------------------------------------------------------------    
	
    public void impAllBdAlunos(){
        for(int i = 0; i < bdAlunos.size(); i++){
            System.out.println("\n------------------------------------");
            System.out.println("\nInfos dos Alunos");
            System.out.println("\n Nome do Aluno: "+bdAlunos.get(i).getNome());
            System.out.println("\n Registro:"+bdAlunos.get(i).getRegistro());
            System.out.println("\n Senha:"+bdAlunos.get(i).getSenha());
            System.out.println("\n CEP do aluno:"+bdAlunos.get(i).getCep());
            System.out.println("\n Endereço do aluno:"+bdAlunos.get(i).getRua());
            System.out.println("\n Nome do responsavel do aluno:"+bdAlunos.get(i).getResponsavel());
            System.out.println("\n Telefone Residencial:"+bdAlunos.get(i).getResponsavel());
            System.out.println("\n------------------------------------");
	}
    }
    
    public void attCadNOta(Aluno A1){
        
        try{
            A1.setPortugues(Integer.parseInt(Ler.entDados("\nNota de Portugues: ")));
        }
        catch(ModeloPortuguesException mpe){
            mpe.ModeloPortugues();
            mpe.corrPortugues(A1);
        }
        catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            A1 = x.corrForm(A1);
        }

        try{
            A1.setMatematica(Integer.parseInt(Ler.entDados("\nNota de Matematica: ")));
        }
        catch(ModeloMatematicaException mme){
            mme.ModeloMatematica();
            mme.corrMatematica(A1);
        }
        catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            A1 = x.corrForm(A1);
        }

        try{
            A1.setIngles(Integer.parseInt(Ler.entDados("\nNota de Ingles: ")));
        }
        catch(ModeloInglesException mie){
                mie.ModeloIngles();
                mie.corrIngles(A1);
        }        
        catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            A1 = x.corrForm(A1);
        }

        try{
            A1.setFisica(Integer.parseInt(Ler.entDados("\nNota de Fisica: ")));
        }
        catch(ModeloFisicaException mfe){
            mfe.ModeloFisica();
            mfe.corrFisica(A1);
        }
        catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            A1 = x.corrForm(A1);
        }
        try{
            A1.setBiologia(Integer.parseInt(Ler.entDados("\nNota de Biologia: ")));
        }
        catch(ModeloBiologiaException mbe){
            mbe.ModeloBiologia();
            mbe.corrBiologia(A1);
        }
        catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            A1 = x.corrForm(A1);
        }

        for(int i = 0; i < bdAlunos.size(); i++){
                if(A1.getRegistro() == bdAlunos.get(i).getRegistro()){
                        bdAlunos.set(i, A1);
            }
        }
    }
}
                              
           
                
        
