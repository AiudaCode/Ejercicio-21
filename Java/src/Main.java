
import javax.swing.JOptionPane;

public class Main
{
    public static void main(String[] args)
    {
        //Se crea un objeto de la clase Triangulo (Instanciaciación)
        Triangulo obj = new Triangulo();
        double l1, l2, l3;//se definen 3 variable de tipo double "l1", "l2" y "l3"
        
        //Se pide el primer lado y se guarda en l1;
        l1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite lado 1"));
        obj.setLado1(l1);//se llama al metodo modificador de lado 1 y se encapsula "l1"
        
        //Se pide el primer lado y se guarda en l1;
        l2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite lado 2"));
        obj.setLado2(l2);//se llama al metodo modificador de lado 2 y se encapsula "l2"
        
        //Se pide el primer lado y se guarda en l1;
        l3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite lado 3"));
        obj.setLado3(l3);//se llama al metodo modificador de lado 3 y se encapsula "l3"
        
        //Se muestra en pantalla el perimetro
        JOptionPane.showMessageDialog(null, "El perimetro es: " + obj.perimetro());

        //Se muestra en pantalla el semiperimetro
        JOptionPane.showMessageDialog(null, "El semiperimetro es: " + obj.semiperimetro());
        
        //Se muestra en pantalla el area
        JOptionPane.showMessageDialog(null, "El area es: " + obj.area());
    }
}
