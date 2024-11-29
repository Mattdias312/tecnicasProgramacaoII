
package DAO;


public class agencias {
    private int numAge;        // NUM_AGE
    private String nomeAge;    // NOME_AGE
    private String endeAge;    // ENDE_AGE
    private String numeAge;    // NUME_AGE
    private String complAge;   // COMPL_AGE
    private String bairAge;    // BAIR_AGE
    private String cidaAge;    // CIDA_AGE
    private String ufAge;      // UF_AGE
    private String cepAge;     // CEP_AGE
    private String foneAge;    // FONE_AGE

    public agencias(int numAge, String nomeAge, String endeAge, String numeAge, String complAge, String bairAge, String cidaAge, String ufAge, String cepAge, String foneAge) {
        this.numAge = numAge;
        this.nomeAge = nomeAge;
        this.endeAge = endeAge;
        this.numeAge = numeAge;
        this.complAge = complAge;
        this.bairAge = bairAge;
        this.cidaAge = cidaAge;
        this.ufAge = ufAge;
        this.cepAge = cepAge;
        this.foneAge = foneAge;
    }

    // Getters e Setters
    public int getNumAge() {
        return numAge;
    }

    public void setNumAge(int numAge) {
        this.numAge = numAge;
    }

    public String getNomeAge() {
        return nomeAge;
    }

    public void setNomeAge(String nomeAge) {
        this.nomeAge = nomeAge;
    }

    public String getEndeAge() {
        return endeAge;
    }

    public void setEndeAge(String endeAge) {
        this.endeAge = endeAge;
    }

    public String getNumeAge() {
        return numeAge;
    }

    public void setNumeAge(String numeAge) {
        this.numeAge = numeAge;
    }

    public String getComplAge() {
        return complAge;
    }

    public void setComplAge(String complAge) {
        this.complAge = complAge;
    }

    public String getBairAge() {
        return bairAge;
    }

    public void setBairAge(String bairAge) {
        this.bairAge = bairAge;
    }

    public String getCidaAge() {
        return cidaAge;
    }

    public void setCidaAge(String cidaAge) {
        this.cidaAge = cidaAge;
    }

    public String getUfAge() {
        return ufAge;
    }

    public void setUfAge(String ufAge) {
        this.ufAge = ufAge;
    }

    public String getCepAge() {
        return cepAge;
    }

    public void setCepAge(String cepAge) {
        this.cepAge = cepAge;
    }

    public String getFoneAge() {
        return foneAge;
    }

    public void setFoneAge(String foneAge) {
        this.foneAge = foneAge;
    }
    
    public agencias(){
        
    }
    public String dadosSQLValues(){
        String dadosAgencia;
        dadosAgencia = "'"
        + this.getNumAge() + "','"
        + this.getNomeAge() + "','"
        + this.getEndeAge() + "','"
        + this.getNumeAge() + "','"
        + this.getComplAge() + "','"
        + this.getBairAge() + "','"
        + this.getCidaAge() + "','"
        + this.getUfAge() + "','"
        + this.getCepAge() + "','"
        + this.getFoneAge() + "'";
        
        
        return dadosAgencia;
    }
    
    public String AlteraDadosSQLValues(){
        String dadosAgencia;
        dadosAgencia = "NUM_AGE='"
        + this.getNumAge() + "',NOME_AGE='"
        + this.getNomeAge() + "',ENDE_AGE='"
        + this.getEndeAge() + "',NUME_AGE='"
        + this.getNumeAge() + "',COMPL_AGE='"
        + this.getComplAge() + "',BAIR_AGE='"
        + this.getBairAge() + "',CIDA_AGE='"
        + this.getCidaAge() + "',UF_AGE='"
        + this.getUfAge() + "',CEP_AGE='"
        + this.getCepAge() + "',FONE_AGE='"
        + this.getFoneAge() + "'";
        
        
        return dadosAgencia;
    }
    
}
