/**
 * @file App.java
 * @brief Clase principal de la aplicación Paint que crea la interfaz gráfica y controla su funcionamiento.
 * @author
 *         - Sebastian Castro - 2359435
 *         - Karol Burbano - 2359305
 *         - Veronica Lorena Mujica - 2359406
 *         - Jeidy Nicol Murillo Murillo - 2359310
 */

import javax.swing.*;
import java.awt.*;

/**
 * La clase principal que representa la ventana de la aplicación de pintura.
 */
public class App extends JFrame {

    /**
     * Constructor de la clase App.
     */
    public App() {
        setTitle("Paint"); // Título de la ventana
        setPreferredSize(new Dimension(600, 500)); // Tamaño preferido de la ventana
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Define la operación de cierre
        setResizable(false); // No se puede redimensionar
        setLocationRelativeTo(null); // Se coloca en el centro de la pantalla

        Paint paintComponent = new Paint(); // Componente de pintura
        add(paintComponent); // Se agrega al marco principal

        JPanel controlPanel = new JPanel(); // Panel de control
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.X_AXIS)); // Orientación horizontal
        
        controlPanel.add(Box.createHorizontalGlue()); // Espaciador para alinear el JLabel a la derecha

        JLabel deleteLabel = new JLabel("To delete, press 'b'  "); // Etiqueta de instrucción
        controlPanel.add(deleteLabel); // Se agrega al panel de control

        add(controlPanel, BorderLayout.NORTH); // Se agrega el panel de control en la parte superior

        pack(); // Se ajusta el tamaño de la ventana
        setVisible(true); // Se hace visible
        paintComponent.requestFocus(); // Se solicita el enfoque al componente de pintura
    }

    /**
     * Método principal para ejecutar la aplicación.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new App(); // Se crea una instancia de la aplicación
            }
        });
    }
}
