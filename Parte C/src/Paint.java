/**
 * @file Paint.java
 * @brief Clase Paint para crear los Listener.
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
import java.util.Random;

public class Paint extends Canvas implements KeyListener, MouseListener, MouseMotionListener{

    int x = -1, y = -1, w = -1, h = -1; // Coordenadas y dimensiones de la línea
    boolean Borrar = false; // Variable para borrar
    Random random = new Random(); // Generador de números aleatorios
    Color currentColor = getRandomColor(); // Color actual random

    /**
     * Constructor de la clase Paint.
     */
    public Paint() {
        addMouseListener(this); // Se agregan los escuchadores de ratón
        addMouseMotionListener(this);
        addKeyListener(this); // Se agrega el escuchador de teclado
        
        setBackground(Color.WHITE); // Color de fondo
    }

    /**
     * Método para dibujar en el lienzo.
     * @param g El contexto de gráficos.
     */
    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g; // Contexto de gráficos 2D
        g2d.setStroke(new BasicStroke(2)); // Grosor de la línea
        g2d.setColor(currentColor); // Color de la línea

        if (w != -1 && h != -1) {
            g2d.drawLine(x, y, w,h); // Se dibuja la línea
        }

        if (Borrar) {
            g2d.setColor(Color.WHITE); // Se borra el lienzo
            g2d.fillRect(-10, -10, 600, 600);
            Borrar = false; // Se restablece la variable
        }

    }

    /**
     * Método para obtener un color aleatorio.
     * @return Un objeto Color representando un color aleatorio.
     */
    public Color getRandomColor() {
        int r = random.nextInt(256); // Componente roja
        int g = random.nextInt(256); // Componente verde
        int b = random.nextInt(256); // Componente azul
        return new Color(r, g, b); // Nuevo color
    }

    /**
     * Funciones para el mouse.
     */

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        currentColor = getRandomColor(); // Nuevo color al presionar el botón del mouse
        paint(this.getGraphics());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x = -1;
        w = -1;
    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {
        w = e.getX();
        h = e.getY();
        paint(this.getGraphics());
        x = w;
        y = h;
    }

    @Override
    public void mouseMoved(MouseEvent e) {}

    /**
     * Funciones para el teclado.
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
