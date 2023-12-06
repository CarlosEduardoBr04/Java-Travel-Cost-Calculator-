
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
       Percurso per = new Percurso();
       Custo c = new Custo();
    
    
 int op;
      double a,b;
      
      do{
          op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao \n" + "\n 1- Cadastar Percurso \n 2- Listar Percurso \n 3- Totalizar Viagem \n 0- Sair" ));

          switch (op)
          {
            case 1:
              per.CadastarPercurso();
              break;
            case 2:
              per.ListarPercurso();
              break;
            case 3:
             double CalcularViagem;
            
             c.CalcularViagem(per);
             JOptionPane.showMessageDialog(null," Valor Total Viagem:"+ c.getTotalPercurso());
              break;
            case 0:
             JOptionPane.showMessageDialog(null,"A Finalizar Programa");
              break;
              default:
              JOptionPane.showMessageDialog(null,"Opcao Invalida");
              break;
          }
      } while(op!=0);
    }
    
}

