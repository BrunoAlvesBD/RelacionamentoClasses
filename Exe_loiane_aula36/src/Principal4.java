import java.util.Scanner;

public class Principal4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome da agenda");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];

        for(int i = 0; i < contatos.length; i++){
            System.out.println("Informe as informações do contato contato"+(i+1));

            Contato c = new Contato();
            System.out.println("Informe o nome");
             nome = scan.nextLine();
             c.setNome(nome);
            System.out.println("Informe o telefone");
             String telefone = scan.nextLine();
             c.setTelefone(telefone);
             System.out.println("Informe o email");
             String email = scan.nextLine();
             c.setEmail(email);

             contatos[i] = c;
        }
        agenda.setContatos(contatos);
        if (agenda != null) {
            System.out.println(agenda.obterContato());
        }
    }
}
