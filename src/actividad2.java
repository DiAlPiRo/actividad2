import javax.swing.*;

public class actividad2 {
    public static void main(String args[]) {
int pesos = Integer.parseInt(JOptionPane.showInputDialog("ingresar la cantidad de pesos"));
double bolivar = (0.0014 * pesos);
        JOptionPane.showMessageDialog(null,"el valor de pesos en bolivares es" + bolivar);

 }
}