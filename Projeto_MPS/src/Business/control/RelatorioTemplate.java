/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.control;

/**
 *
 * @author Junior Ribeiro
 */
public class RelatorioTemplate {

    protected String Cabecalho() {
        return "";
    }

    protected String informacoes() {
        return "";
    }

    protected String Rodape() {
        return "";
    }

    public String gerarRelatorio() {
        return this.Cabecalho() + this.informacoes() + this.Rodape();
    }

    protected abstract void salvarRelatorio();

}
