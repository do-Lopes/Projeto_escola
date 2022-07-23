import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;




public class GerDir {
    
    private final Calendar hoje = Calendar.getInstance();
    
    private Diretoria D1;

    private final List<Diretoria> bdDIR = new ArrayList<Diretoria>();
    
    private final Leitor Ler = new Leitor();

    public List<Diretoria> getBdDIR(){
        return bdDIR;
    }
        
    public Diretoria consDirCod(Diretoria D1){
        for(int i = 0; i < bdDIR.size(); i++){
            if(D1.getCodiretorial() == bdDIR.get(i).getCodiretorial()){
                return bdDIR.get(i);
            }
        }
    return null;
    }
        
    public void impOneDir(Diretoria D1){	
        System.out.println("\nInfos do membro da diretoria");
        System.out.println("\n Nome do membro: "+D1.getNome());
        System.out.println("\n Telefone:"+D1.getTelefone());  
        System.out.println("\n Registro:"+D1.getCodiretorial());		
        System.out.println("\n Endereço:"+D1.getRua());
        System.out.println("\n CEP:"+D1.getCep());
    }
        
    public Diretoria removeDirCod(Diretoria D1){
     D1 = consDirCod(D1);
        if(D1 != null){
            bdDIR.remove(D1);
        }
        return D1;
    }
        
        
    public Diretoria cadDir(Diretoria D1){

        D1.setNome(Ler.entDados("\nInforme o nome do membro "));


        D1.setRua(Ler.entDados("\nInforme a Rua do membro: "));

        try{
                D1.setCep(Integer.parseInt(Ler.entDados("\nInforme o CEP do membro: ")));
        }
        catch(ModeloCepException mce){
                mce.ModeloCep();
                D1 = mce.corrCep(D1);	
            }
        catch(NumberFormatException nfe){
                FormatException x = new FormatException();
                D1 = x.corrForm(D1);
        }


        try{
            D1.setTelefone(Integer.parseInt(Ler.entDados("\nInforme o telefone residencial do usuário: ")));
        }
        catch(ModeloTelException nte){
            nte.ModeloTel();
            D1 = nte.corrTel(D1);            
        }
        catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            D1 = x.corrForm(D1);
        }
        
        try{       
            D1.setCodiretorial(Integer.parseInt(Ler.entDados("\nInforme o registro do usuário: ")));
        }
        catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            D1 = x.corrForm(D1);
        }


        if(consDirCod(D1)== null){
                bdDIR.add(D1);
                return D1;
        }else{
        return null;
        }
    }

    public void impAllBdDir(){
        for(int i = 0; i < bdDIR.size(); i++){	
            System.out.println("\nInfos dos membros da diretoria");
            System.out.println("\n Nome do membro: "+bdDIR.get(i).getNome());
            System.out.println("\n Registro:"+bdDIR.get(i).getCodiretorial());	
            System.out.println("\n Telefone:"+bdDIR.get(i).getTelefone());
            System.out.println("\n Endereço:"+bdDIR.get(i).getRua());
            System.out.println("\n CEP:"+bdDIR.get(i).getCep());
        }
    }

    
    public Diretoria cadInicial(Diretoria D1){
        try{       
            D1.setCodiretorial(Integer.parseInt(Ler.entDados("\nInforme o registro do usuário: ")));
        }
        catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            D1 = x.corrForm(D1);
        }
        
        if(consDirCod(D1)== null){
                bdDIR.add(D1);
                return D1;
        }else{
        return null;
        }
    }
    
    public void AttDiretoriaCod(Diretoria D1){

        D1.setNome(Ler.entDados("\nInforme o nome: "));       

        D1.setRua(Ler.entDados("\nInforme a Rua: "));

        try{
            D1.setCep(Integer.parseInt(Ler.entDados("\nInforme o CEP[8 DIGITOS]: ")));
        }
        catch(ModeloCepException mce){
            mce.ModeloCep();
            D1 = mce.corrCep(D1);	
        }
        catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            D1 = x.corrForm(D1);
        }

        try{
            D1.setTelefone(Integer.parseInt(Ler.entDados("\nInforme o Telefone Residencial[8 DIGITOS]: ")));
        }
        catch(ModeloTelException nte){
            nte.ModeloTel();
            D1 = nte.corrTel(D1);            
        }
        catch(NumberFormatException nfe){
            FormatException x = new FormatException();
            D1 = x.corrForm(D1);
        }                                    

        for(int i = 0; i < bdDIR.size(); i++){
            if(D1.getCodiretorial() == bdDIR.get(i).getCodiretorial()){
                    bdDIR.set(i, D1);
            }
        }
    }                            




            

			


        
       
}
