import java.util.HashMap;
import java.util.Map;

public class RepositorioUsuarios {
    private Map<String, Usuario> usuarios;

    public RepositorioUsuarios() {
        this.usuarios = new HashMap<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.put(usuario.getEmail(), usuario);
    }

    public Usuario getUsuarioPorEmail(String email) {
        return usuarios.get(email);
    }

    public void registraLogin(Usuario usuario) {
        // Registra Login
    }
}