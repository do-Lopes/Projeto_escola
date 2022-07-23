//Aviso: A PRIMEIRA UTILIZAÇÃO DO SISTEMA É NECESSARIO ESCOLHER A OPÇÃO 4


import java.util.List;
import java.util.ArrayList;

public class Menu{

    private Professor P1;

    private final List<Professor> bdPRO = new ArrayList<Professor>();		

    private Aluno A1;

    private final List<Aluno> bdAlunos = new ArrayList<Aluno>();

    private Diretoria D1;
    
    private final List<Diretoria> bdDIR = new ArrayList<Diretoria>();
    
    private Gastos G1;
    
    private final List<Gastos> bdGastos = new ArrayList<Gastos>();

    private final Leitor Ler = new Leitor();
    
    private Relatorio R1;
    
    private final List<Relatorio> bdRelatorio = new ArrayList<Relatorio>();
    
    private final GerRel rls = new GerRel();
    
    private final GerAlunos alns = new GerAlunos();	

    private final GerProfs prof = new GerProfs();

    private final GerDir dir = new GerDir();
    
    private final GerGastos gas = new GerGastos();

    public void MenuEsc(){
        boolean x = true;
        int y,log = 0;  
        System.out.println("Sistema academico");
        System.out.println("\n1)Acesso do aluno");      
        System.out.println("\n2)Acesso Restrito");  
        System.out.println("\n3)Acesso Admnistrativo"); 
        
        try{
            log = Integer.parseInt(Ler.entDados("\nEscolha uma opcao"));
	}
	catch(NumberFormatException nfe){
            Ler.entDados("\nO valor deve ser um inteiro");                    
	}
            
        switch(log){                    
            case 1 -> {
                A1 = new Aluno();                              
                A1.setRegistro(Integer.parseInt(Ler.entDados("\nInforme o Registro: ")));                   
                A1 = alns.consAlunosCod(A1);
                    if(A1!=null){
                        while(x){
                            System.out.println("1) Boletim");
                            System.out.println("2) Sair do sistema");
                            try{
                                y = Integer.parseInt(Ler.entDados("\nEscolha uma opcao"));
                            }
                            catch(NumberFormatException nfe){
                                Ler.entDados("\nO valor deve ser um inteiro");
                                continue;
                            }
                            switch(y){
                                case 1:
                                    System.out.println("\n1) Boletim");
                                    A1 = new Aluno();
                                    A1.setSenha(Integer.parseInt(Ler.entDados("\nInforme a senha: ")));
                                    A1 = alns.consAlunosSenha(A1);
                                    if(A1 != null){
                                        alns.impOneNotasAlunos(A1);
                                    }else{
                                        Ler.entDados("\nRegistro invalido");
                                    }                                
                                break;
                                case 2:        
                                    String resp = Ler.entDados("\nDeseja realmente sair do sistema? [SIM][NAO]");
                                    if(resp.equalsIgnoreCase("Sim")){
                                        MenuEsc();
                                    }else{
                                        break;
                                    }
                                default:
                                    Ler.entDados("\nOpcao invalida");
                                    break;
                            }
                        } 
                    }else{
                        System.out.println("\nRegistro Inválido\n\n\n");
                        MenuEsc();
                    }
                }
            case 2 -> {
                P1 = new Professor();
                P1.setSiape(Integer.parseInt(Ler.entDados("\nInforme o registro: ")));
                P1 = prof.consProfCod(P1);
                if((P1 != null)){
                    while(x){
                        System.out.println("\n1)Cadastro de relatorio");
                        System.out.println("\n2)Gerenciar notas de alunos");
                        System.out.println("\n3)Sair do sistema");

                        try{
                            y = Integer.parseInt(Ler.entDados("\nEscolha uma opcao"));
                        }
                        catch(NumberFormatException nfe){
                            Ler.entDados("\nO valor deve ser um inteiro");
                            continue;
                        }
                        switch(y){
                            case 1: 
                                System.out.println("\nCadastro de relatorio: ");
                                    R1 = new Relatorio();
                                    R1 = rls.cadRelatorios(R1);
                                    if(R1 != null){
                                        Ler.entDados("\nCódigo Disponivel");
                                    }else{
                                        Ler.entDados("\nO codigo de registro ja foi utilizado");
                                    }                                                                                           
                            break;
                            case 2:
                                System.out.println("\nGerenciar notas de alunos");
                                String case321 = Ler.entDados("[Visualizar]/[Editar] notas");
                                if(case321.equalsIgnoreCase("Visualizar")){
                                    A1 = new Aluno();
                                    A1.setRegistro(Integer.parseInt(Ler.entDados("\n Informe o registro do aluno: ")));
                                    A1 = alns.consAlunosCod(A1);
                                    if(A1 != null){
                                        alns.impOneNotasAlunos(A1);
                                    }else{
                                        Ler.entDados("\nNão há aluno com esse codigo");
                                    }
                                }
                                if(case321.equalsIgnoreCase("Editar")){
                                    A1 = new Aluno();
                                    A1.setRegistro(Integer.parseInt(Ler.entDados("\n Informe o codigo do aluno: ")));
                                    A1 = alns.consAlunosCod(A1);
                                    if(A1 != null){
                                        alns.attCadNOta(A1);
                                    }else{
                                        Ler.entDados("\nNão há aluno com esse codigo");
                                    }
                                }
                            break;
                                                        
                            case 3:
                                String resp = Ler.entDados("\nDeseja realmente sair do sistema? [SIM][NAO]");
                                if(resp.equalsIgnoreCase("Sim")){
                                    MenuEsc();
                                }else{
                                    break;
                                }
                                default:
                                    Ler.entDados("\nOpcao invalida");
                                break;
                        }                            
                    }
                }else{
                    System.out.println("\nRegistro Inválido\n\n\n");
                    MenuEsc();
                }
            }
                            
                           
                            
            
            
            case 3 -> {
                D1 = new Diretoria();                
                
                D1.setCodiretorial(Integer.parseInt(Ler.entDados("\nInforme o registro: ")));
                
                D1 = dir.consDirCod(D1);
                if((D1 != null)){
                while(x){
                    System.out.println("1) Matricular usuario no sistema");
                    System.out.println("2) Listar usuários");
                    System.out.println("3) Remover usuário do sistema");
                    System.out.println("4) Gerenciar notas");
                    System.out.println("5) Gerenciar relatorio de falta de professores");
                    System.out.println("6) Gerenciar gastos da escola");
                    System.out.println("7) Visualizar relatórios de classe");
                    System.out.println("8) Atualizar dados de usuários");
                    System.out.println("9) Sair do sistema");

                    try{
                        y = Integer.parseInt(Ler.entDados("\nEscolha uma opcao"));
                    }
                    catch(NumberFormatException nfe){
                        Ler.entDados("\nO valor deve ser um inteiro");
                        continue;
                    }                    
                    switch(y){
                        case 1:
                            System.out.println("\n1) Matricula do sistema");
                            String caso1 = Ler.entDados("\nCadastrar [Aluno]/[Professor]/[Diretor]:");
                            if(caso1.equalsIgnoreCase("aluno")){
                                A1 = new Aluno();
                                A1 = alns.cadAlunos(A1);
                                if(A1 != null){
                                    Ler.entDados("\nCódigo Disponivel");
                                }else{
                                    Ler.entDados("\nO codigo de matricula ja foi utilizado");
                                }
                            }
                            if(caso1.equalsIgnoreCase("professor")){
                                P1 = new Professor();
                                P1 = prof.cadProf(P1);
                                if(P1 != null){
                                    Ler.entDados("\nCódigo Disponivel");
                                }else{
                                    Ler.entDados("\nO codigo de matricula ja foi utilizado");
                                }
                            }
                            if(caso1.equalsIgnoreCase("diretor")){
                                D1 = new Diretoria();
                                D1 = dir.cadDir(D1);
                                if(D1 != null){
                                    Ler.entDados("\nCódigo Disponivel");
                                }else{
                                    Ler.entDados("\nO codigo de matricula ja foi utilizado");
                                }
                            }
                        break;
                        case 2:
                            System.out.println("\n2)Listar Usuários");
                            String caso21 = Ler.entDados("\n1)Listar todos os usuários \n2)Listar pelo código ");
                            if(caso21.equalsIgnoreCase("1")){
                                System.out.println("\n1) Listar todos os usuários");
                                String caso2 = Ler.entDados("\nListar [Alunos]/[Professores]/[Diretoria]:");
                                if(caso2.equalsIgnoreCase("alunos")){
                                    alns.impAllBdAlunos();
                                }
                                if(caso2.equalsIgnoreCase("professores")){
                                    prof.impAllBdProf();
                                }
                                if(caso2.equalsIgnoreCase("diretoria")){
                                    dir.impAllBdDir();
                                }
                            }
                            if(caso21.equalsIgnoreCase("2")){
                                System.out.println("\nConsultar pelo código");
                                String caso321 = Ler.entDados("\nListar [Alunos]/[Professores]:");
                                if(caso321.equalsIgnoreCase("alunos")){
                                    A1 = new Aluno();
                                    A1.setRegistro(Integer.parseInt(Ler.entDados("\n Informe o codigo do aluno: ")));
                                    A1 = alns.consAlunosCod(A1);
                                    if(A1 != null){
                                        alns.impOneAlunos(A1);
                                    }else{
                                        Ler.entDados("\nNão há aluno com esse codigo");
                                    }
                                }
                                if(caso321.equalsIgnoreCase("professores")){
                                    P1 = new Professor();
                                    P1.setSiape(Integer.parseInt(Ler.entDados("\n Informe o codigo do professor: ")));
                                    P1 = prof.consProfCod(P1);
                                    if(P1 != null){
                                        prof.impOneProf(P1);
                                    }else{
                                        Ler.entDados("\nNão há professor com esse codigo");
                                    }
                                }
                            }
                        break;
                        case 3:
                            System.out.println("\n3)Remover usuário do sistema");
                            String caso4 = Ler.entDados("\nQual tipo de usuário sera removido: [Professor]/[Aluno]/[diretoria]");
                            if(caso4.equalsIgnoreCase("Aluno")){
                                A1 = new Aluno();
                                A1.setRegistro(Integer.parseInt(Ler.entDados("\n Informe o codigo do aluno a ser removido: ")));
                                A1 = alns.consAlunosCod(A1);
                                if(A1 != null){
                                    alns.removeAlunosCod(A1);
                                }else{
                                    Ler.entDados("\nNao existe esse usuário");
                                }
                            }
                            if(caso4.equalsIgnoreCase("professor")){
                                P1 = new Professor();
                                P1.setSiape(Integer.parseInt(Ler.entDados("\n Informe o codigo do professor a ser removido: ")));
                                P1 = prof.consProfCod(P1);
                                if(P1 != null){
                                    prof.removeProfCod(P1);
                                }else{
                                    Ler.entDados("\nNao existe essa blusa");
                                }
                            }
                            if(caso4.equalsIgnoreCase("diretoria")){
                                D1 = new Diretoria();
                                D1.setCodiretorial(Integer.parseInt(Ler.entDados("\n Informe o codigo do membro a ser removido: ")));
                                D1 = dir.consDirCod(D1);                
                                if(D1 != null){
                                    dir.removeDirCod(D1);
                                }else{
                                    Ler.entDados("\nNao existe esse membro");
                                }
                            }
                        break;
                        case 4:
                            System.out.println("\n4)Gerenciar notas de alunos");
                            String caso212 = Ler.entDados("\n1)[Consultar] pelo codigo \n2)[Editar] Notas ");
                            if(caso212.equalsIgnoreCase("consultar")){
                                A1 = new Aluno();
                                A1.setRegistro(Integer.parseInt(Ler.entDados("\n Informe o codigo do aluno: ")));
                                A1 = alns.consAlunosCod(A1);
                                if(A1 != null){
                                    alns.impOneNotasAlunos(A1);
                                }else{
                                    Ler.entDados("\nO aluno não está cadastrado no sistema");
                                }
                            }
                            if(caso212.equalsIgnoreCase("Editar")){
                                A1 = new Aluno();
                                A1.setRegistro(Integer.parseInt(Ler.entDados("\n Informe o codigo do aluno: ")));
                                A1 = alns.consAlunosCod(A1);
                                if(A1 != null){
                                    alns.attCadNOta(A1);
                                }else{
                                    Ler.entDados("\nO aluno não está cadastrado no sistema");
                                }
                            }                            
                            break;
                        case 5:
                            System.out.println("\n5)Gerenciar relatorio de falta de professores");
                            String caso51 = Ler.entDados("\n[Cadastrar]/[Visualizar] Relatorio de falta");
                            if(caso51.equalsIgnoreCase("cadastrar")){
                                P1 = new Professor();
                                P1.setSiape(Integer.parseInt(Ler.entDados("\n Informe o codigo do professor: ")));
                                P1 = prof.consProfCod(P1);
                                if(P1 != null){
                                    prof.cadAbonos(P1);
                                }else{
                                    Ler.entDados("\nO funcionário não está cadastrado no sistema");
                                }
                            }
                            if(caso51.equalsIgnoreCase("Visualizar")){
                                P1 = new Professor();
                                P1.setSiape(Integer.parseInt(Ler.entDados("\n Informe o codigo do professor: ")));
                                P1 = prof.consProfCod(P1);
                                if(P1 != null){
                                    prof.impOneAbono(P1);
                                }else{
                                    Ler.entDados("\nO funcionário não está cadastrado no sistema");
                                }
                            } 
                        break;                                             
                        case 6:
                            System.out.println("\n6)Gerenciar gastos da escola");
                            String caso61 = Ler.entDados("\n[Cadastrar]/[Listar]/Listar por [codigo]");
                            if(caso61.equalsIgnoreCase("cadastrar")){
                                G1 = new Gastos();
                                G1 = gas.cadGastos(G1);
                                if(G1 != null){
                                    Ler.entDados("\nCódigo Disponivel");
                                }else{
                                    Ler.entDados("\nO codigo de registro ja foi utilizado");
                                }                               
                            }
                            if(caso61.equalsIgnoreCase("codigo")){
                                G1 = new Gastos();
                                G1.setGastosCod(Integer.parseInt(Ler.entDados("Informe o registro de relatório de gastos: ")));
                                G1 = gas.consGastosEscola(G1);
                                if(G1 != null){
                                    gas.impOneGastos(G1);         
                                }else{
                                    Ler.entDados("\nNão há relatório com esse registro");
                                }
                            }
                            if(caso61.equalsIgnoreCase("listar")){
                                gas.impAllBdDir();
                            }   
                        break;
                        case 7:
                            System.out.println("\n7)Visualizar diarios de classe");
                                rls.impAllRelatorio();
                        break;    
                        case 8:
                            System.out.println("8) Atualizar dados de usuários");
                            String caso8 = Ler.entDados("\nAtualizar dados de [Aluno]/[Professor]/[Diretoria]");
                            if(caso8.equalsIgnoreCase("Aluno")){
                                A1 = new Aluno();
                                A1.setRegistro(Integer.parseInt(Ler.entDados("\n Informe o codigo do aluno a ser atualizado: ")));
                                A1 = alns.consAlunosCod(A1);
                                if(A1 != null){
                                    alns.AttAlunoCod(A1);
                                }else{
                                    Ler.entDados("\nNao existe esse usuário");
                                }
                            }
                            if(caso8.equalsIgnoreCase("professor")){
                                P1 = new Professor();
                                P1.setSiape(Integer.parseInt(Ler.entDados("\n Informe o codigo do professor a ser atualizado: ")));
                                P1 = prof.consProfCod(P1);
                                if(P1 != null){
                                    prof.AttProfessorCod(P1);
                                }else{
                                    Ler.entDados("\nNao existe essa blusa");
                                }
                            }
                            if(caso8.equalsIgnoreCase("diretoria")){
                                D1 = new Diretoria();
                                D1.setCodiretorial(Integer.parseInt(Ler.entDados("\n Informe o codigo do membro a ser atualizado: ")));
                                D1 = dir.consDirCod(D1);                
                                if(D1 != null){
                                    dir.AttDiretoriaCod(D1);
                                }else{
                                    Ler.entDados("\nNao existe esse membro");
                                }
                            }
                        break;
                        case 9:
                            String resp = Ler.entDados("\nDeseja realmente sair do sistema? [SIM][NAO]");
                            if(resp.equalsIgnoreCase("Sim")){
                                MenuEsc();
                            }else{
                                break;
                            }
                        default:
                            Ler.entDados("\nOpcao invalida");
                            break;
                        }    
                    }
                }else{
                    System.out.println("\nRegistro Inválido\n\n\n");
                    MenuEsc();
                }
            }
            
            case 4 -> {
                D1 = new Diretoria();
                D1 = dir.cadInicial(D1);
                if((D1 != null)){
                    MenuEsc();
                }
            }
        }
    }
}
        