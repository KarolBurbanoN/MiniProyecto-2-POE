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
import java.awt.event.*;

public class App extends JFrame {

    /**
     * Constructor de la clase App que inicializa la interfaz gráfica.
     */
    public App() {
        setTitle("Paint");
        setPreferredSize(new Dimension(600, 500));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        Paint paintComponent = new Paint();
        add(paintComponent);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.X_AXIS)); // Establece la orientación horizontal

        JButton colorButton = new JButton("Select Color");
        colorButton.addActionListener(new ActionListener() {
            /**
             * Método actionPerformed que se ejecuta al hacer clic en el botón de selección de color.
             * Muestra un diálogo para seleccionar un color y actualiza el color del lápiz en el componente Paint.
             * @param e Evento de acción generado por el botón.
             */
            public void actionPerformed(ActionEvent e) {
                Color selectedColor = JColorChooser.showDialog(null, "Choose a color", paintComponent.getPenColor());
                paintComponent.setPenColor(selectedColor);
            }
        });
        controlPanel.add(colorButton);
        
        controlPanel.add(Box.createHorizontalGlue()); // Espaciador para mover el JLabel a la derecha

        JLabel deleteLabel = new JLabel("To delete, press 'b'  ");
        controlPanel.add(deleteLabel);

        add(controlPanel, BorderLayout.NORTH);

        pack();
        setVisible(true);
        paintComponent.requestFocus();
    }

    /**
     * Método principal que inicia la aplicación Swing.
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new App();
            }
        });
    }
}


