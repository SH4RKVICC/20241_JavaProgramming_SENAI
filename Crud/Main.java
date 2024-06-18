package Crud;

import java.sql.SQLException;

import Filme.BD;

public class Main {
    public static void main(String[] args) {
        BD bd = new BD();
        try {
            if (!bd.getConnection()) {
                System.out.println("Erro ao conectar com o banco!");
                return;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        FilmeDAO filmeDAO = new FilmeDAO(bd);

        Filme filme = new Filme();
        filme.setCodigo("6");
        filme.setTitulo("Pulp Fiction");
        filme.setGenero("Crime");
        filme.setProdutora("Miramax Films");
        filme.setDataCompra(java.sql.Date.valueOf("1994-10-14"));
        
        if (filmeDAO.salvar(filme)) {
            System.out.println("Filme salvo com sucesso!");
        } else {
            System.out.println("Erro ao salvar o filme!");
        }
        bd.close();
}