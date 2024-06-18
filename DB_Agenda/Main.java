package DB_Agenda;

import java.sql.SQLException;

import DB_Agenda.Banco;
import Filme.BD;

public class Main {

        public static void main(String[] args) {
        Banco banco = new Banco();
        try {
            if (!banco.getConnection()) {
                System.out.println("Erro ao conectar com o banco!");
                return;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        AgendaOi agendaEi = new AgendaOi(Banco);

        Agenda agenda = new Agenda();
        agenda.setNome("Arthur Esquierdo");
        agenda.setTelefone("11988556677");
        agenda.setEmail("arthuresquierdo@hotmail.com");
        
        if (.salvar(agenda)) {
            System.out.println("Contato salvo com sucesso!");
        } else {
            System.out.println("Erro ao salvar contato!");
        }
        banco.close();
}
    
}
