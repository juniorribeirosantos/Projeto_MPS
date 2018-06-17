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
public class RelatorioMateriais extends RelatorioTemplate {

    @Override
    protected String informacoes() {
        // Pega as informações do banco de dados para gerar relatório    
        return "";
    }

    @Override
    protected void salvarRelatorio() {
      // Gera o arquivo referente ao relat[orio
    }

}
