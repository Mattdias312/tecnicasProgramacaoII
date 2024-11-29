
package DAO;


public class historicos {
    private String idHis;          // ID_HIS
    private String descricao;      // DES_HIS

    // Construtor
    public historicos(String idHis, String descricao) {
        this.idHis = idHis;
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getIdHis() {
        return idHis;
    }

    public void setIdHis(String idHis) {
        this.idHis = idHis;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public historicos(){
        
    }
    
    public String dadosSQLValues(){
        String historico;
        historico = "'"
        + this.getIdHis() + "','"
        + this.getDescricao() + "'";
        
        return historico;
    }    
    
    public String alterarRegistroJFBD(){
        String historico;
        historico = "ID_HIS='"
        + this.getIdHis() + "',DES_HIS='"
        + this.getDescricao() + "'";
        
        return historico;
    }    
}

