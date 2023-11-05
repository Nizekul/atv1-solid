public class Autenticador {

    public boolean autenticarUsuario(RepositorioUsuarios usuarioManager, String email, String senha) {
        Usuario usuario = usuarioManager.getUsuarioPorEmail(email);

        if (usuario == null) {
            return false;
        }

        if (usuario.verificarSenha(senha)) {
            // atualiza usuário para autenticado
            usuario.autenticar();
            usuarioManager.registraLogin(usuario);
            return true;
        }
        
        return false;
    }
}
