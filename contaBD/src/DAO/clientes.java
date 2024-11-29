
package DAO;


import java.util.Date;

public class clientes {
    private int idCli;              // ID_CLI
    private String nomeCli;         // NOME_CLI
    private String endeCli;         // ENDE_CLI
    private String numeCli;         // NUME_CLI
    private String complCli;        // COMPL_CLI
    private String bairCli;         // BAIR_CLI
    private String cidaCli;         // CIDA_CLI
    private String ufCli;           // UF_CLI
    private String cepCli;          // CEP_CLI
    private String foneCli;         // FONE_CLI
    private String cpfCli;          // CPF_CLI
    private String dataNasc;          // DATA_NASC
    private String cnpjCli;         // CNPJ_CLI

    // Construtor
    public clientes(int idCli, String nomeCli, String endeCli, String numeCli, 
                   String complCli, String bairCli, String cidaCli, 
                   String ufCli, String cepCli, String foneCli, 
                   String cpfCli, String dataNasc, String cnpjCli) {
        this.idCli = idCli;
        this.nomeCli = nomeCli;
        this.endeCli = endeCli;
        this.numeCli = numeCli;
        this.complCli = complCli;
        this.bairCli = bairCli;
        this.cidaCli = cidaCli;
        this.ufCli = ufCli;
        this.cepCli = cepCli;
        this.foneCli = foneCli;
        this.cpfCli = cpfCli;
        this.dataNasc = dataNasc;
        this.cnpjCli = cnpjCli;
    }

    // Getters e Setters
    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String getEndeCli() {
        return endeCli;
    }

    public void setEndeCli(String endeCli) {
        this.endeCli = endeCli;
    }

    public String getNumeCli() {
        return numeCli;
    }

    public void setNumeCli(String numeCli) {
        this.numeCli = numeCli;
    }

    public String getComplCli() {
        return complCli;
    }

    public void setComplCli(String complCli) {
        this.complCli = complCli;
    }

    public String getBairCli() {
        return bairCli;
    }

    public void setBairCli(String bairCli) {
        this.bairCli = bairCli;
    }

    public String getCidaCli() {
        return cidaCli;
    }

    public void setCidaCli(String cidaCli) {
        this.cidaCli = cidaCli;
    }

    public String getUfCli() {
        return ufCli;
    }

    public void setUfCli(String ufCli) {
        this.ufCli = ufCli;
    }

    public String getCepCli() {
        return cepCli;
    }

    public void setCepCli(String cepCli) {
        this.cepCli = cepCli;
    }

    public String getFoneCli() {
        return foneCli;
    }

    public void setFoneCli(String foneCli) {
        this.foneCli = foneCli;
    }

    public String getCpfCli() {
        return cpfCli;
    }

    public void setCpfCli(String cpfCli) {
        this.cpfCli = cpfCli;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCnpjCli() {
        return cnpjCli;
    }

    public void setCnpjCli(String cnpjCli) {
        this.cnpjCli = cnpjCli;
    }
    
    public clientes(){
        
    }
    
    public String dadosSQLValues(){
        String dadosClientes;
        dadosClientes = "'"
        + this.getIdCli() + "','"
        + this.getNomeCli() + "','"
        + this.getEndeCli() + "','"
        + this.getNumeCli() + "','"
        + this.getComplCli() + "','"
        + this.getBairCli() + "','"
        + this.getCidaCli() + "','"
        + this.getUfCli() + "','"
        + this.getCepCli() + "','"
        + this.getFoneCli() + "','"
        + this.getCpfCli() + "','"
        + this.getDataNasc() + "','"
        + this.getCnpjCli() + "'";
        
        return dadosClientes;
    }
    public String AlteraDadosSQLValues(){
        String dadosClientes;
        dadosClientes = "ID_CLI='"
        + this.getIdCli() + "',NOME_CLI='"
        + this.getNomeCli() + "',ENDE_CLI='"
        + this.getEndeCli() + "',NUME_CLI='"
        + this.getNumeCli() + "',COMPL_CLI='"
        + this.getComplCli() + "',BAIR_CLI='"
        + this.getBairCli() + "',CIDA_CLI='"
        + this.getCidaCli() + "',UF_CLI='"
        + this.getUfCli() + "',CEP_CLI='"
        + this.getCepCli() + "',FONE_CLI='"
        + this.getFoneCli() + "',CPF_CLI='"
        + this.getCpfCli() + "',DATA_NASC='"
        + this.getDataNasc() + "',CNPJ_CLI='"
        + this.getCnpjCli() + "'";
        
        return dadosClientes;
    }
    
    
}
    
