package Iphone;

import Funcoes.FuncoesInternet.AdicionarAba;
import Funcoes.FuncoesInternet.AtualizarPagina;
import Funcoes.FuncoesInternet.ExibirPagina;


public class Iphone {
    public static void main(String[] args) {
        AdicionarAba adc = new AdicionarAba();
        AtualizarPagina att = new AtualizarPagina();
        ExibirPagina exib = new ExibirPagina();

        adc.adicionar();
        att.atualizar();
        exib.exibir();
    }    
}
