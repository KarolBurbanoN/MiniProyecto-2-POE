/**
 * @file Paint.java
 * @brief Clase Paint que representa el área de dibujo y maneja eventos de ratón y teclado.
 * @author
 *         - Sebastian Castro - 2359435
 *         - Karol Burbano - 2359305
 *         - Veronica Lorena Mujica - 2359406
 *         - Jeidy Nicol Murillo Murillo - 2359310
 */

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Paint extends Canvas implements KeyListener, MouseListener, MouseMotionListener{

    int x = -1  , y = -1 , w = -1 , h = -1; 
    boolean Borrar = false; // Variable para borrar
    Color penColor = Color.BLACK; // Color predeterminado del lapiz

    /**
     * Constructor de la clase Paint que inicializa el área de dibujo y añade los EventListener.
     */

    public Paint() {
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
        
        setBackground(Color.WHITE); // Color del Fondo
    }

    /**
     * Método paint que dibuja sobre el área de dibujo.
     * @param g Gráficos utilizados para dibujar.
     */

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g; 
        g2d.setStroke(new BasicStroke(2)); // Tañaño del trazo del lapiz
        g2d.setColor(penColor); // Utiliza el color actual del lápiz

        if (w != -1 && h != -1) {
            g2d.drawLine(x, y, w,h);
        }

        if (Borrar) {
            g2d.setColor(Color.WHITE);
            g2d.fillRect(-10, -10, 600, 600);
            Borrar = false;
        }

    }

    /**
     * Método que establece el color del lápiz.
     * @param color Nuevo color del lápiz.
     */

     public void setPenColor(Color color) {
        penColor = color;
    }

    /**
     * Método que establece el color del lápiz.
     * @param color Nuevo color del lápiz.
     */

    public Color getPenColor() {
        return penColor;
    }

    /**
     * Métodos para el funcionamiento del mouse.
     */

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        paint(this.getGraphics());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x = -1;
        w = -1;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        w = e.getX();
        h = e.getY();
        paint(this.getGraphics());
        x = w;
        y = h;
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {}

    /**
     * Métodos para el funcionamiento del Teclado. Se establece una letra para borrar.
     */

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'b') {
            Borrar = true;
            paint(this.getGraphics());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}