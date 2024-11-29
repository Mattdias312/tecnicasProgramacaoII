
package DAO;


import java.util.Date;

public class movimentacao {
    private String numAge;                   // NUM_AGE
    private String numCc;                   // NUM_CC
    private String dataMov;                 // DATA_MOV
    private String numDocto;              // NUM_DOCTO
    private String debitoCredito;            // DEBITO_CREDITO
    private String idHis;                    // ID_HIS
    private String complHis;               // COMPL_HIS
    private String valor;                  // VALOR
    private String saldo;                  // SALDO

    // Construtor
    public movimentacao(String numAge, String numCc, String dataMov, String numDocto, 
                        String debitoCredito, String idHis, String complHis, 
                        String valor, String saldo) {
        this.numAge = numAge;
        this.numCc = numCc;
        this.dataMov = dataMov;
        this.numDocto = numDocto;
        this.debitoCredito = debitoCredito;
        this.idHis = idHis;
        this.complHis = complHis;
        this.valor = valor;
        this.saldo = saldo;
    }

    // Getters e Setters
    public String getNumAge() {
        return numAge;
    }

    public void setNumAge(String numAge) {
        this.numAge = numAge;
    }

    public String getNumCc() {
        return numCc;
    }

    public void setNumCc(String numCc) {
        this.numCc = numCc;
    }

    public String getDataMov() {
        return dataMov;
    }

    public void setDataMov(String dataMov) {
        this.dataMov = dataMov;
    }

    public String getNumDocto() {
        return numDocto;
    }

    public void setNumDocto(String numDocto) {
        this.numDocto = numDocto;
    }

    public String getDebitoCredito() {
        return debitoCredito;
    }

    public void setDebitoCredito(String debitoCredito) {
        this.debitoCredito = debitoCredito;
    }

    public String getIdHis() {
        return idHis;
    }

    public void setIdHis(String idHis) {
        this.idHis = idHis;
    }

    public String getComplHis() {
        return complHis;
    }

    public void setComplHis(String complHis) {
        this.complHis = complHis;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
    
    public movimentacao(){
        
    }
    
    public String dadosSQLValues(){
        String dadosMov;
        dadosMov = "'"
        + this.getNumAge() + "','"
        + this.getNumCc() + "','"
        + this.getDataMov() + "','"
        + this.getNumDocto() + "','"
        + this.getDebitoCredito() + "','"
        + this.getIdHis() + "','"
        + this.getComplHis() + "','"
        + this.getValor() + "','"
        + this.getSaldo() + "'";
        
        
        return dadosMov;
    }
    
    public String alterarRegistroJFBD(){
        String dadosMov;
        dadosMov = "NUM_AGE='"
        + this.getNumAge() + "',NUM_CC='"
        + this.getNumCc() + "',DATA_MOV='"
        + this.getDataMov() + "',NUM_DOCTO='"
        + this.getNumDocto() + "',DEBITO_CREDITO='"
        + this.getDebitoCredito() + "',ID_HIS='"
        + this.getIdHis() + "',COMPL_HIS='"
        + this.getComplHis() + "',VALOR='"
        + this.getValor() + "',SALDO='"
        + this.getSaldo() + "'";
        
        
        return dadosMov;
    }
}

