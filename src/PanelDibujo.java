import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class PanelDibujo extends JPanel {
    static Scanner sc = new Scanner(System.in);


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int anchura=getWidth();
        int altura=getHeight();

        /*g.drawLine(50, 50, 100, 50);  // Tramo horizontal superior
        g.drawLine(50, 50, 150, 50);  // Tramo horizontal superior
        g.drawLine(100, 50, 100, 200);  // Tramo vertical
        g.drawLine(50, 200, 100, 200);  // Tramo horizontal inferior
        */
        String nombre;
        double peso;
        double altura1;
        double imc;
        g.drawRoundRect(0, 0, 50, 50, 30, 30);
        System.out.println("Ingrese el nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingrese el peso:");
        peso = sc.nextDouble();
        System.out.println("Ingrese la altura:");
        altura1 = sc.nextDouble();
        imc = peso / (altura1 * altura1);

        g.drawString(" "+imc, 10, 20);
    }
}
