package MPolimorifismo.servico;

import MPolimorifismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando arquivo...");
    }
}

