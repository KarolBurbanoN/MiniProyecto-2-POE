/**
 * @file App.java
 * @brief Clase principal de la aplicación Paint que crea la interfaz gráfica donde se pueden crear poligonos irregulares.
 * @author
 *         - Sebastian Castro - 2359435
 *         - Karol Burbano - 2359305
 *         - Veronica Lorena Mujica - 2359406
 *         - Jeidy Nicol Murillo Murillo - 2359310
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class App extends JFrame {

    private ArrayList<Point> points = new ArrayList<>();
    private boolean fillPolygon = false;

    /**
     * @brief Constructor de la clase App.
     */
    public App() {
        setTitle("Irregular Polygon Drawer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawPolygon(g);
            }
        };
        canvas.setPreferredSize(new Dimension(600, 500));
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) { // Botón izquierdo del ratón
                    points.add(e.getPoint());
                } else if (e.getButton() == MouseEvent.BUTTON3) { // Botón derecho del ratón
                    fillPolygon = true; // Habilita el relleno del polígono
                }
                canvas.repaint();
            }
        });

        // Mensajes para saber el funcionamiento del teclado y mouse

        JLabel fillMessageLabel = new JLabel("To fill the polygon, right-click", SwingConstants.CENTER);
        fillMessageLabel.setForeground(Color.BLACK);
        JLabel deleteMessageLabel = new JLabel("To delete the polygon, press b", SwingConstants.CENTER);
        deleteMessageLabel.setForeground(Color.BLACK);

        JPanel messagePanel = new JPanel(new GridLayout(2, 1));
        messagePanel.add(fillMessageLabel, BorderLayout.WEST);
        messagePanel.add(deleteMessageLabel, BorderLayout.EAST);

        add(messagePanel, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        canvas.requestFocusInWindow(); // Para recibir eventos del teclado en el lienzo
        canvas.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == 'b') {
                    points.clear(); // Borrar los puntos del polígono
                    fillPolygon = false; // Desactivar el relleno
                    canvas.repaint();
                }
            }
        });
    }

    /**
     * @brief Dibuja el polígono irregular en el lienzo.
     * @param g El contexto gráfico en el que se dibuja el polígono.
     */
    private void drawPolygon(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);

        if (points.size() >= 2) {
            Point previousPoint = points.get(0);
            for (int i = 1; i < points.size(); i++) {
                Point currentPoint = points.get(i);
                g2d.drawLine(previousPoint.x, previousPoint.y, currentPoint.x, currentPoint.y);
                previousPoint = currentPoint;
            }
            // Dibuja la línea que une el último punto con el primero para cerrar el polígono
            Point firstPoint = points.get(0);
            g2d.drawLine(previousPoint.x, previousPoint.y, firstPoint.x, firstPoint.y);

            if (fillPolygon) {
                int[] xPoints = new int[points.size()];
                int[] yPoints = new int[points.size()];
                for (int i = 0; i < points.size(); i++) {
                    xPoints[i] = points.get(i).x;
                    yPoints[i] = points.get(i).y;
                }
                g2d.setColor(new Color(0, 0, 255, 50)); // Color azul semitransparente para el relleno
                g2d.fillPolygon(xPoints, yPoints, points.size());
            }
        }

        // Dibuja los puntos
        g2d.setColor(Color.BLUE);
        for (Point point : points) {
            g2d.fillOval(point.x - 3, point.y - 3, 6, 6);
        }
    }

    /**
     * @brief Método principal que inicia la aplicación.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::new);
    }
}
