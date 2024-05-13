import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App extends JFrame {

    private JFrame frame;
    private JPanel panelI, panelD, panelS, panelBackground, panelDesplegado;
    private Point initialClick;
    private Dimension initialSize;
    private boolean isResizing = false;

    public App() {
        frame = new JFrame("Visual Studio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        panelBackground = new JPanel();
        panelI = new JPanel();
        panelD = new JPanel();
        panelS = new JPanel();
        panelDesplegado = new JPanel();

        componentes();
    }

    private void componentes() {
        panelBackground();
        panelIzquierdo();
        panelSuperior();
        panelDesplegado();
    }

    private void panelBackground(){
        panelBackground.setBackground(Color.WHITE);
        panelBackground.setSize(800,800);
        panelBackground.setLayout(null);
        frame.add(panelBackground);
    }

    private void panelIzquierdo() {
        panelI.setBackground(new Color(24, 24, 24));
        panelI.setBounds(0, 30, 50, 800);
        panelI.setLayout(null);
        panelBackground.add(panelI);
    
        botonesPanelIzquierdo();
    }

    private void panelSuperior() {
        panelS.setBackground(new Color(28, 28, 28));
        panelS.setBounds(0, 0, 800, 30);
        panelBackground.add(panelS);
    }

    private void botonesPanelIzquierdo() {
        ImageIcon icono = new ImageIcon("iconos/Explorer.png"); // Cambia la ruta por la ubicación de tu imagen
        Image imagen = icono.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon iconoe = new ImageIcon(imagen);
        
        JButton Explorer = new JButton(iconoe);
        Explorer.setBounds(0, 0, 50, 50); 
        Explorer.setPreferredSize(new Dimension(iconoe.getIconWidth(), iconoe.getIconHeight()));
        Explorer.setBorderPainted(false);
        Explorer.setFocusPainted(false);
        Explorer.setContentAreaFilled(false);
        Explorer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelDesplegado.setVisible(!panelDesplegado.isVisible()); // Alternar visibilidad
                if (panelDesplegado.isVisible()) {
                    panelDesplegado.setSize(100, panelDesplegado.getHeight()); // Establecer ancho inicial de 100
                }
            }
        });
        Explorer.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Explorer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            
            public void mouseExited(MouseEvent e) {
                Explorer.setCursor(Cursor.getDefaultCursor());
            }
        });
        
        ImageIcon icono2 = new ImageIcon("iconos/Search.png"); // Cambia la ruta por la ubicación de tu imagen
        Image imagen2 = icono2.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon iconoe2 = new ImageIcon(imagen2);
        
        JButton Search = new JButton(iconoe2);
        Search.setBounds(0, 50, 50, 50); 
        Search.setPreferredSize(new Dimension(iconoe.getIconWidth(), iconoe.getIconHeight()));
        Search.setBorderPainted(false);
        Search.setFocusPainted(false);
        Search.setContentAreaFilled(false);
        Search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelDesplegado.setVisible(!panelDesplegado.isVisible()); // Alternar visibilidad
                if (panelDesplegado.isVisible()) {
                    panelDesplegado.setSize(100, panelDesplegado.getHeight()); // Establecer ancho inicial de 100
                }
            }
        });
        Search.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Search.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            
            public void mouseExited(MouseEvent e) {
                Search.setCursor(Cursor.getDefaultCursor());
            }
        });

        ImageIcon icono3 = new ImageIcon("iconos/Source_Control.png"); // Cambia la ruta por la ubicación de tu imagen
        Image imagen3 = icono3.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon iconoe3 = new ImageIcon(imagen3);
        
        JButton Source_Control = new JButton(iconoe3);
        Source_Control.setBounds(0, 100, 50, 50); 
        Source_Control.setPreferredSize(new Dimension(iconoe.getIconWidth(), iconoe.getIconHeight()));
        Source_Control.setBorderPainted(false);
        Source_Control.setFocusPainted(false);
        Source_Control.setContentAreaFilled(false);

        ImageIcon icono4 = new ImageIcon("iconos/Run_Debug.png"); // Cambia la ruta por la ubicación de tu imagen
        Image imagen4 = icono4.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon iconoe4 = new ImageIcon(imagen4);
        
        JButton Run_Debug = new JButton(iconoe4);
        Run_Debug.setBounds(0, 150, 50, 50); 
        Run_Debug.setPreferredSize(new Dimension(iconoe.getIconWidth(), iconoe.getIconHeight()));
        Run_Debug.setBorderPainted(false);
        Run_Debug.setFocusPainted(false);
        Run_Debug.setContentAreaFilled(false);

        panelI.add(Explorer);
        panelI.add(Search);
        panelI.add(Source_Control);
        panelI.add(Run_Debug);
    }
    
    private void panelDesplegado() {
        panelDesplegado.setBackground(new Color(24,24,24));
        panelDesplegado.setBounds(50, 30, 100, 800); // Establecer ancho inicial de 100
        panelDesplegado.setVisible(false);
        
        panelDesplegado.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                initialSize = panelDesplegado.getSize();
                isResizing = isCursorNearBorder(e);
                if (isResizing) {
                    panelDesplegado.setCursor(Cursor.getPredefinedCursor(Cursor.E_RESIZE_CURSOR));
                }
            }
            
            public void mouseReleased(MouseEvent e) {
                isResizing = false;
                panelDesplegado.setCursor(Cursor.getDefaultCursor());
            }
        });
        
        panelDesplegado.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (isResizing) {
                    int dx = e.getX() - initialClick.x;
                    int dy = e.getY() - initialClick.y;
                    
                    int newWidth = initialSize.width + dx;
                    int newHeight = initialSize.height + dy;
                    
                    panelDesplegado.setSize(newWidth, newHeight);
                    
                    if (panelDesplegado.getWidth() <= 0) {
                        panelDesplegado.setVisible(false);
                        panelDesplegado.setSize(100, panelDesplegado.getHeight()); // Establecer ancho inicial de 100 al cerrar
                    }
                } else {
                    int thisX = frame.getLocation().x;
                    int thisY = frame.getLocation().y;
                    int xMoved = (thisX + e.getX()) - (thisX + initialClick.x);
                    int yMoved = (thisY + e.getY()) - (thisY + initialClick.y);
                    int X = thisX + xMoved;
                    int Y = thisY + yMoved;
                    frame.setLocation(X, Y);
                }
            }
            
            public void mouseMoved(MouseEvent e) {
                if (isCursorNearBorder(e)) {
                    panelDesplegado.setCursor(Cursor.getPredefinedCursor(Cursor.E_RESIZE_CURSOR));
                } else {
                    panelDesplegado.setCursor(Cursor.getDefaultCursor());
                }
            }
        });

        panelBackground.add(panelDesplegado);
    }
    
    private boolean isCursorNearBorder(MouseEvent e) {
        int borderSize = 5; // Tamaño del borde para el redimensionamiento
        int x = e.getX();
        int width = panelDesplegado.getWidth();
        
        return (x < borderSize || x > width - borderSize);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }
}
