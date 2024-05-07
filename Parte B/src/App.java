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
                 points.add(e.getPoint());
                 canvas.repaint();
             }
         });
 
         add(canvas);
 
         pack();
         setLocationRelativeTo(null);
         setVisible(true);
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
 

