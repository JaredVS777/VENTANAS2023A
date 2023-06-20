import javax.swing.*;


public class PruebaPanelDibujo {

    public static void main(String[] args) {
        String nombre;
        //creo una instancia de la clase PanelDibujo y la llamo panel
        PanelDibujo panel=new PanelDibujo();
        //Creo un marco en la ventana
        JFrame aplicacion=new JFrame();
        //pongo un boton para cerrar la ventana
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);//agrego un "panel" a la ventana
        aplicacion.setSize(250,250);//seteo el tamaño de la ventana
        aplicacion.setVisible(true);//permito que se vea la ventana

    }
}
