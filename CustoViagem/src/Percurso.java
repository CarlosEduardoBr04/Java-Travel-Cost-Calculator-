
import javax.swing.JOptionPane;


public class Percurso {
    private double KmPercorrido;
    private double ValorCombustivel;
    private double ValorPedagio;

    public Percurso() {
       this (0.0,0.0,0.0);
    }

    public Percurso(double KmPercorrido, double ValorCombustivel, double ValorPedagio) {
        this.KmPercorrido = KmPercorrido;
        this.ValorCombustivel = ValorCombustivel;
        this.ValorPedagio = ValorPedagio;
    }

    public double getKmPercorrido() {
        return KmPercorrido;
    }

    public void setKmPercorrido(double KmPercorrido) {
        this.KmPercorrido = KmPercorrido;
    }

    public double getValorCombustivel() {
        return ValorCombustivel;
    }

    public void setValorCombustivel(double ValorCombustivel) {
        this.ValorCombustivel = ValorCombustivel;
    }

    public double getValorPedagio() {
        return ValorPedagio;
    }

    public void setValorPedagio(double ValorPedagio) {
        this.ValorPedagio = ValorPedagio;
    }
    
    public void CadastarPercurso(){
     setKmPercorrido(Double.parseDouble(JOptionPane.showInputDialog("Digite o Km Percorrido:")));
     setValorCombustivel(Double.parseDouble(JOptionPane.showInputDialog("Digite Valor do Combustivel:")));
     setValorPedagio(Double.parseDouble(JOptionPane.showInputDialog("Digite Valor do Padagio:")));
    }
    public void ListarPercurso(){
      JOptionPane.showMessageDialog(null,"\nKm Percorrido:"+ getKmPercorrido()+"\n Valor do Combustivel:"+getValorCombustivel()+"\nValor do Pedagio:"+getValorPedagio());
    }
}

