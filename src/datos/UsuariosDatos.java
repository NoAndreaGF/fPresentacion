package datos;

import clasesfaceboot.Usuario;
import java.util.List;
import java.util.ArrayList;

public class UsuariosDatos {
    
    private List<Usuario> usuarios = new ArrayList<>();
    private static Usuario usuarioActual = new Usuario();
        
    public UsuariosDatos() {
        usuarios = new ArrayList<Usuario>();
    }
    
    public void add(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    /**
     * Método para comprovar posibilidad de registro.
     * @param email
     * @return 
     */
    public boolean existente(String email) {
                
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);
            
            if (u.getEmail().equals(email)) {
              return true;  
            }
        }
        return false;
    }
    
    /**
     * Método para mantener.
     * @param email
     * @param contrasenia
     * @return 
     */
    public Usuario usuario(String email, String contrasenia) {
        Usuario registrado = null;
        
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);
            
            if (u.getEmail().equals(email) && u.getContrasena().equals(contrasenia)) {
              registrado = usuarios.get(i);
              usuarioActual = registrado;
            }
        }
        return registrado;
    }
   
    public Usuario getUsuarioActual(){
        return usuarioActual;
    }
  
}
