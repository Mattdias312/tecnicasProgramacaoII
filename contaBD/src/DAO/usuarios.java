
package DAO;


public class usuarios {
    private String id;        // ID
    private String senha;     // SENHA
    private String numAge;       // NUM_AGE
    private String numCc;       // NUM_CC

    // Construtor
    public usuarios(String id, String senha, String numAge, String numCc) {
        this.id = id;
        this.senha = senha;
        this.numAge = numAge;
        this.numCc = numCc;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

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
    
    public usuarios(){
        
    }
    
    public String dadosSQLValues(){
        String dadosUsuarios;
        dadosUsuarios = "'"
        + this.getId() + "','"
        + this.getSenha() + "','"
        + this.getNumAge() + "','"
        + this.getNumCc() + "'";
        
        return dadosUsuarios;
    }
    
    public String alterarRegistroJFBD(){
        String dadosUsuarios;
        dadosUsuarios = "ID='"
        + this.getId() + "',SENHA='"
        + this.getSenha() + "',NUM_AGE='"
        + this.getNumAge() + "',NUM_CC='"
        + this.getNumCc() + "'";
        
        return dadosUsuarios;
    }
}

    

