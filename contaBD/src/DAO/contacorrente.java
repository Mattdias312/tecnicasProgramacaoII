
package DAO;


public class contacorrente {
    private String numAge;      // NUM_AGE
    private String numCc;      // NUM_CC
    private String idCli;       // ID_CLI
    private String saldo;     // SALDO

    // Construtor
    public contacorrente(String numAge, String numCc, String idCli, String saldo) {
        this.numAge = numAge;
        this.numCc = numCc;
        this.idCli = idCli;
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

    public String getIdCli() {
        return idCli;
    }

    public void setIdCli(String idCli) {
        this.idCli = idCli;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
    
    public contacorrente(){
        
    }
    
    public String dadosSQLValues(){
        String dadosCc;
        dadosCc = "'"
        + this.getNumAge() + "','"
        + this.getNumCc() + "','"
        + this.getIdCli() + "','"
        + this.getSaldo() + "'";
        
        return dadosCc;
    }
    
    public String alterarRegistroJFBD(){
        String dadosCc;
        dadosCc = "NUM_AGE='"
        + this.getNumAge() + "',NUM_CC='"
        + this.getNumCc() + "',ID_CLI='"
        + this.getIdCli() + "',SALDO='"
        + this.getSaldo() + "'";
        
        return dadosCc;
    }
}

    
