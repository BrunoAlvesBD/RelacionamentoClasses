public class Agenda {
    private String nome;
    private Contato[] contatos;


    public Agenda() {}
    public Agenda(String nome) {}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
    public String obterContato() {
        String info = "Nome: " + nome + "\n";
        if (contatos != null) {
            for (Contato c : contatos) {
                info += c.obterContato() + "\n";
            }
        }
        return info;
    }
}
