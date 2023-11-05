public class App {
    public static void main(String[] args) throws Exception {
        RepositorioUsuarios teste = new RepositorioUsuarios();
        Usuario user1 = new Usuario("user1@email.com", "1234");
        Usuario user2 = new Usuario("user2@email.com", "2234");
        Usuario user3 = new Usuario("user3@email.com", "3234");
        Usuario user4 = new Usuario("user4@email.com", "4234");
        Usuario user5 = new Usuario("user5@email.com", "5234");
        Usuario user6 = new Usuario("user6@email.com", "6234");
        Usuario user7 = new Usuario("user7@email.com", "7234");
        Usuario user8 = new Usuario("user8@email.com", "8234");
        Usuario user9 = new Usuario("user9@email.com", "9234");
        teste.adicionarUsuario(user1);
        teste.adicionarUsuario(user2);
        teste.adicionarUsuario(user3);
        teste.adicionarUsuario(user4);
        teste.adicionarUsuario(user5);
        teste.adicionarUsuario(user6);
        teste.adicionarUsuario(user7);
        teste.adicionarUsuario(user8);
        teste.adicionarUsuario(user9);
        
        Autenticador autenticador = new Autenticador();

        try {
            boolean autenticado = autenticador.autenticarUsuario(teste, user4.getEmail(), user4.getSenha());
            if (autenticado) {
                System.out.println("Usuario autenticado com sucesso.");
            } else {
                System.out.println("Falha na autenticacao: usuario nao encontrado ou senha incorreta.");
            }
        } catch (Exception e) {
            System.err.println("Erro ao calcular o hash da senha: " + e.getMessage());
        }

    }
}
