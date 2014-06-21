
public class LogIn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String user = JOptionPane.showInputDialog("Digite o usuário: ");
         String pass = JOptionPane.showInputDialog("Digite a senha: ");
       
         if ((user.equals("seu nome")) && (pass.equals("123")) {
                                                                                             JOptionPane.showMessageDialog(null,"Oi");
        }
        else{
               JOptionPane.showMessageDialog(null, "Usuário ou senha inválido!!!");
        }

	}

}
