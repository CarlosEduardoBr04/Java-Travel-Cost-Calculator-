
import javax.swing.JOptionPane;

        
    public class Custo {
    private double TotalPercurso;
    private Object p;

    public Custo() {
        this(0.0);
    }

    public Custo(double TotalPercurso) {
        this.TotalPercurso = TotalPercurso;
    }

    public double getTotalPercurso() {
        return TotalPercurso;
    }

    public void setTotalPercurso(double TotalPercurso) {
        this.TotalPercurso = TotalPercurso;
    }
    
    public void CalcularViagem(Percurso p){
     
     this.TotalPercurso = (p.getKmPercorrido()* p.getValorCombustivel())+p.getValorPedagio();
     
     JOptionPane.showMessageDialog(null, "Total da Viagem:R$"+ this.TotalPercurso);
    }
    }
    

   
