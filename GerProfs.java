import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;




public class GerProfs{	

    private final Calendar hoje = Calendar.getInstance();	

    private final List<Professor> bdPRO = new ArrayList<Professor>();
      
    private final Leitor Ler = new Leitor();

    public List<Professor> getBdPRO(){
        return bdPRO;
    }
	
    public Professor consProfCod(Professor P1){
        for(int i = 0; i < bdPRO.size(); i++){
            if(P1.getSiape() == bdPRO.get(i).getSiape()){
                return bdPRO.get(i);
            }
        }
    return null;
    }

    public void impOneProf(Professor P1){	
        System.out.println("\nInfos dos Professores");
        System.out.println("\n Nome do Professor: "+P1.getNome());
        System.out.println("\n Registro:"+P1.getSiape());		
        System.out.println("\n Endereço:"+P1.getRua());
        System.out.println("\n CEP:"+P1.getCep());
    }

    public Professor removeProfCod(Professor P1){
        P1 = consProfCod(P1);
            if(P1 != null){
                bdPRO.remove(P1);
            }
        return P1;
    }

   
    
    public void AttProfessorCod(Professor P1){
            
                    P1.setNome(Ler.entDados("\nInforme o nome do aluno: "));       

                    P1.setRua(Ler.entDados("\nInforme a Rua do Aluno: "));

                    try{
                        P1.setCep(Integer.parseInt(Ler.entDados("\nInforme o CEP[00000000] do Aluno: ")));
                    }
                    catch(ModeloCepException mce){
                        mce.ModeloCep();
                        P1 = mce.corrCep(P1);	
                    }
                    catch(NumberFormatException nfe){
                        FormatException x = new FormatException();
                        P1 = x.corrForm(P1);
                    }
                    
                    try{
                        P1.setTelefone(Integer.parseInt(Ler.entDados("\nInforme o Telefone Residencial[00000000] do aluno: ")));
                    }
                    catch(ModeloTelException nte){
                        nte.ModeloTel();
                        P1 = nte.corrTel(P1);            
                    }
                    catch(NumberFormatException nfe){
                        FormatException x = new FormatException();
                        P1 = x.corrForm(P1);
                    }
            
            for(int i = 0; i < bdPRO.size(); i++){
			if(P1.getSiape() == bdPRO.get(i).getSiape()){
				bdPRO.set(i, P1);
			}
		}
            
	}

    public Professor cadAbonos(Professor P1){
        P1.setDia(hoje.get(Calendar.DAY_OF_MONTH));            
        P1.setMes(hoje.get(Calendar.MONTH));            
        P1.setAno(hoje.get(Calendar.YEAR));            
        P1.setAbon(Ler.entDados("\nRelatório: "));           
        return null;
    }
    
    public void impOneAbono(Professor P1){
        System.out.println("\nRelatorio");
        System.out.println("Data: "+P1.getDia()+"/"+P1.getMes()+"/"+P1.getAno());
        System.out.println("Relatorio: "+P1.getAbon());
    }            
        

    public Professor cadProf(Professor P1){

			
        P1.setNome(Ler.entDados("\nInforme o nome do professor: "));
			
			

        P1.setRua(Ler.entDados("\nInforme a Rua do Professor: "));
			
			
		
        try{
            P1.setCep(Integer.parseInt(Ler.entDados("\nInforme o CEP do Professor: ")));
        }
        catch(ModeloCepException mce){
            mce.ModeloCep();
            P1 = mce.corrCep(P1);	
            }
        catch(NumberFormatException nfe){
                FormatException x = new FormatException();
                P1 = x.corrForm(P1);
        }
		


	try{
        P1.setTelefone(Integer.parseInt(Ler.entDados("\nInforme o telefone residencial do Professor: ")));
	}
        catch(ModeloTelException nte){
            nte.ModeloTel();
            P1 = nte.corrTel(P1);            
        }
	catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            P1 = x.corrForm(P1);
        }		

        
        try{       
            P1.setSiape(Integer.parseInt(Ler.entDados("\nInforme o registro do professor: ")));
        }
        catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            P1 = x.corrForm(P1);
        }
			


        if(consProfCod(P1)== null){
            bdPRO.add(P1);
            return P1;
        }else{
            return null;
        }
    }


	
    public void impAllBdProf(){
        for(int i = 0; i < bdPRO.size(); i++){	
        System.out.println("\nInfos dos Professores");
        System.out.println("\n Nome do Professor: "+bdPRO.get(i).getNome());
        System.out.println("\n Registro:"+bdPRO.get(i).getSiape());		
        System.out.println("\n Endereço:"+bdPRO.get(i).getRua());
        System.out.println("\n Telefone:"+bdPRO.get(i).getTelefone());
        }
    }	
}