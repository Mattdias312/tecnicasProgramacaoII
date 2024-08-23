
package tdd.Controlador;

import java.util.ArrayList;
import java.util.List;
import tdd.Model.Usuario;

public class Controlador {
    private List<Usuario> listaUsuarios;
    
    public Controlador(){
        listaUsuarios = new ArrayList<Usuario>();
    }
    
    public void cadastrarUsuario(String usuario, String senha, String nome){
        listaUsuarios.add(new Usuario(usuario, senha, nome));
    }    
    
    public boolean logar(String usuario, String senha){
        int i;
        Usuario aux;
        for(i=0;i<listaUsuarios.size();i++){
            aux = listaUsuarios.get(i);
            if(aux.getUsuario() == usuario && aux.getSenha() == senha){
                return true;
            }
        }
        
        return false;      
    }
}
