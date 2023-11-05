import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Usuario {
    private String email;
    private String senha;
    private String hashSenha;
    private boolean autenticado;

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
        this.autenticado = false;
        this.hashSenha = calcularHashSenha(senha);
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getHashSenha() {
        return hashSenha;
    }

    public boolean getAutenticado() {
        return autenticado;
    }

    public boolean setAutenticado(boolean autenticar) {
        autenticado = autenticar;
        return autenticado;
    }

    public boolean verificarSenha(String senha) {
        String senhaHasheada = calcularHashSenha(senha);
        return senhaHasheada.equals(hashSenha);
    }

    public void autenticar() {
        autenticado = true;
    }

    private String calcularHashSenha(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(senha.getBytes());
            StringBuilder hash = new StringBuilder();

            for (byte hashByte : hashBytes) {
                hash.append(String.format("%02x", hashByte));
            }

            return hash.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}