import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App extends JFrame {

    private JFrame frame;
    private JPanel panelI, panelS, panelC, panelBackground, panelDesplegado, panelTerminal;
    private JTextArea terminalTextArea;
    private boolean isMaximized = false;
    private boolean resizing = false;
    private int prevMouseY;
    private Point initialClick;
    private Dimension initialSize;
    private boolean isResizing = false;
    Font fuente = new Font("Aptos",Font.BOLD, 13);

    public App() {
        frame = new JFrame("Visual Studio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(800, 726);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        panelBackground = new JPanel();
        panelI = new JPanel();
        panelS = new JPanel();
        panelC = new JPanel();
        panelDesplegado = new JPanel();
        panelTerminal = new JPanel(); // Panel de la terminal

        componentes();
    }

    private void componentes() {
        panelBackground();
        panelIzquierdo();
        panelSuperior();
        panelDesplegado();
        panelTerminal();
        panelCentral();
    }

    private void panelBackground(){
        panelBackground.setBackground(Color.WHITE);
        panelBackground.setSize(800,726);
        panelBackground.setLayout(null);
        frame.add(panelBackground);
    }

    private void panelIzquierdo() {
        panelI.setBackground(new Color(24, 24, 24));
        panelI.setBounds(0, 30, 55, 726);
        panelI.setLayout(null);
        panelBackground.add(panelI);
    
        botonesPanelIzquierdo();
    }


    private void panelSuperior() {
        panelS.setBackground(new Color(24, 24, 24));
        panelS.setBounds(0, 0, 800, 30);
        panelS.setLayout(null);

        ImageIcon icon = new ImageIcon("iconos/Visual_icon.png"); // Cambia la ruta por la ubicación de tu imagen
        JLabel visual = new JLabel();

        botonesPanelSuperior();

        visual.setBounds(10, 7, 20, 20);
        visual.setIcon(new ImageIcon(icon.getImage().getScaledInstance(visual.getWidth(),visual.getHeight(), Image.SCALE_SMOOTH)));

        panelBackground.add(panelS);
        panelS.add(visual); 

    }

    private void panelCentral(){
        panelC.setBackground(new Color(28, 28, 28));
        panelC.setBounds(55, 30, 745, 726);
        panelC.setLayout(null);
        panelBackground.add(panelC);

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Aptos",Font.PLAIN,17));
        textArea.setBackground(new Color(28,28,28));
        textArea.setForeground(Color.WHITE); // Cambia el color del texto a blanco

        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setBounds(0, 0, 730, 656);
        scroll.setPreferredSize(new Dimension(10, 65)); // Establece un tamaño preferido para el JScrollPane

        scroll.getVerticalScrollBar().setUnitIncrement(16);
        scroll.getHorizontalScrollBar().setUnitIncrement(16);
        scroll.getVerticalScrollBar().setUI(new Scroll());
        scroll.getHorizontalScrollBar().setUI(new Scroll());
        panelC.add(scroll);

    }

    private void botonesPanelSuperior() {
        agregarBotonConMenu("File", 55, 55, new String[]{
            "New Text File                                       Ctrl+N",
            "New File                      Ctrl+Alt+Windows+N",
            "New Window                             Ctrl+Shift+N"
        });
        agregarBotonConMenu("Edit", 115, 60, new String[]{
            "Undo                                                     Ctrl+Z",
            "Redo                                                     Ctrl+Y",
            "Cut                                                        Ctrl+X ",
            "Copy                                                     Ctrl+C",
            "Paste                                                     Ctrl+V"
        });
        agregarBotonConMenu("Selection", 175, 90, new String[]{
            "Select All                                               Ctrl+A",
            "Expand Selection       Shift+Alt+RightArrow",
            "Shrink Selection            Shift+Alt+leftArrow"
        });
        agregarBotonConMenu("View", 265, 70, new String[]{
            "Command Palette                      Ctrl+Shift+P",
            "Open View..."
        });
        agregarBotonConMenu("Go", 325, 60, new String[]{
            "Back                                         Alt+LeftArrow",
            "Foward                                  Alt+RightArrow",
            "Last Edit Location                  Ctrl+K Ctrl+Q"
        });
        agregarBotonConMenu("Run", 365, 60, new String[]{
            "Start Debugging                                        F5",
            "Run Without Debugging                  Ctrl+F5",
            "Stop Debugging                              Shift+F5",
            "Restart Debugging                  Ctrl+Shift+F5"
        });
        agregarBotonConMenu("...", 425, 70, new String[]{
            "Terminal", "Help"
        });
        
    }

    private void agregarBotonConMenu(String titulo, int x, int ancho, String[] opciones) {
        JButton boton = new JButton(titulo);
        boton.setBounds(x, 5, ancho, 20);
        boton.setBackground(new Color(28, 28, 28));
        boton.setForeground(Color.GRAY);
        boton.setBorderPainted(false);
        boton.setFocusPainted(false);
        boton.setContentAreaFilled(false);
        boton.setHorizontalAlignment(SwingConstants.LEFT);
    
        JPopupMenu menu = new JPopupMenu();
        menu.setBackground(new Color(28, 28, 28)); // Establecer el color de fondo del menú desplegable
    
        for (String opcion : opciones) {
            if (opcion.equals("Terminal")) {
                JMenu terminalMenu = new JMenu("Terminal");
                terminalMenu.setForeground(Color.WHITE);
                terminalMenu.setBackground(new Color(28, 28, 28));
                terminalMenu.setPreferredSize(new Dimension(150, 30));
                
                JMenuItem newTerminal = new JMenuItem("New Terminal                          Ctrl+Shift+ñ");
                newTerminal.setForeground(Color.WHITE);
                newTerminal.setBackground(new Color(28, 28, 28));
                newTerminal.addActionListener(e -> toggleTerminalPanel());
                newTerminal.setPreferredSize(new Dimension(250, 30));
                terminalMenu.add(newTerminal);
                
                JMenuItem splitTerminal = new JMenuItem("Split Terminal                          Ctrl+Shift+5");
                splitTerminal.setForeground(Color.WHITE);
                splitTerminal.setBackground(new Color(28, 28, 28));
                splitTerminal.addActionListener(e -> System.out.println("Split Terminal selected"));
                splitTerminal.setPreferredSize(new Dimension(250, 30));
                terminalMenu.add(splitTerminal);
                
                menu.add(terminalMenu);
            } else if (opcion.equals("Help")) {
                JMenu helpMenu = new JMenu("Help");
                helpMenu.setForeground(Color.WHITE);
                helpMenu.setBackground(new Color(28, 28, 28));
                
                JMenuItem welcome = new JMenuItem("Welcome");
                welcome.setForeground(Color.WHITE);
                welcome.setBackground(new Color(28, 28, 28));
                welcome.addActionListener(e -> System.out.println("Welcome selected"));
                welcome.setPreferredSize(new Dimension(250, 30));
                helpMenu.add(welcome);
                
                JMenuItem showAllCommands = new JMenuItem("Show All Commands                       Ctrl+Shift+P");
                showAllCommands.setForeground(Color.WHITE);
                showAllCommands.setBackground(new Color(28, 28, 28));
                showAllCommands.addActionListener(e -> System.out.println("Show All Commands selected"));
                helpMenu.add(showAllCommands);
                
                JMenuItem documentation = new JMenuItem("Documentation");
                documentation.setForeground(Color.WHITE);
                documentation.setBackground(new Color(28, 28, 28));
                documentation.addActionListener(e -> System.out.println("Documentation selected"));
                helpMenu.add(documentation);
                
                menu.add(helpMenu);
            } else {
                JMenuItem item = new JMenuItem(opcion);
                item.setForeground(Color.WHITE); // Establecer el color del texto de las opciones del menú
                item.setPreferredSize(new Dimension(250, 30));
                item.setBackground(new Color(28, 28, 28)); // Establecer el color de fondo de las opciones del menú
                item.addActionListener(e -> {
                    String[] words = opcion.split("\\s+"); // Dividir la opción en palabras usando espacios como delimitador
                    System.out.println(words[0] + " selected"); // Imprimir solo la primera palabra de la opción
                });
                menu.add(item);
            }
        }
    
        boton.addMouseListener(new MouseAdapter() {
            private boolean menuVisible = false;
    
            @Override
            public void mouseEntered(MouseEvent e) {
                boton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
    
            @Override
            public void mouseExited(MouseEvent e) {
                boton.setCursor(Cursor.getDefaultCursor());
            }
    
            @Override
            public void mousePressed(MouseEvent e) {
                if (menuVisible) {
                    menu.setVisible(false);
                } else {
                    menu.show(boton, 0, boton.getHeight());
                }
                menuVisible = !menuVisible;
            }
        });
        
        JButton Run = new JButton("▷");
        Run.setBounds(730, 5, 50, 20);
        Run.setForeground(Color.GRAY);
        Run.setBorderPainted(false);
        Run.setFocusPainted(false);
        Run.setContentAreaFilled(false);
        Run.addActionListener(e -> System.out.println("Running  Code..."));
        Run.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Run.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            
            public void mouseExited(MouseEvent e) {
                Run.setCursor(Cursor.getDefaultCursor());
            }
        });

        panelS.add(Run);

        panelS.add(boton);
    }


    private void botonesPanelIzquierdo() {
        ImageIcon icono = new ImageIcon("iconos/Explorer.png"); // Cambia la ruta por la ubicación de tu imagen
        Image imagen = icono.getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
        ImageIcon iconoe = new ImageIcon(imagen);
        
        JButton Explorer = new JButton(iconoe);
        Explorer.setBounds(0, 0, 55, 55); 
        Explorer.setPreferredSize(new Dimension(iconoe.getIconWidth(), iconoe.getIconHeight()));
        Explorer.setBorderPainted(false);
        Explorer.setFocusPainted(false);
        Explorer.setContentAreaFilled(false);
        Explorer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelDesplegado.setVisible(!panelDesplegado.isVisible()); // Alternar visibilidad
                if (panelDesplegado.isVisible()) {
                    panelDesplegado.setSize(210, panelDesplegado.getHeight()); // Establecer ancho inicial de 100
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
        Image imagen2 = icono2.getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
        ImageIcon iconoe2 = new ImageIcon(imagen2);
        
        JButton Search = new JButton(iconoe2);
        Search.setBounds(0, 60, 55, 55); 
        Search.setPreferredSize(new Dimension(iconoe.getIconWidth(), iconoe.getIconHeight()));
        Search.setBorderPainted(false);
        Search.setFocusPainted(false);
        Search.setContentAreaFilled(false);
        Search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelDesplegado.setVisible(!panelDesplegado.isVisible()); // Alternar visibilidad
                if (panelDesplegado.isVisible()) {
                    panelDesplegado.setSize(210, panelDesplegado.getHeight()); // Establecer ancho inicial de 100
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
        Image imagen3 = icono3.getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
        ImageIcon iconoe3 = new ImageIcon(imagen3);
        
        JButton Source_Control = new JButton(iconoe3);
        Source_Control.setBounds(0, 110, 55, 55); 
        Source_Control.setPreferredSize(new Dimension(iconoe.getIconWidth(), iconoe.getIconHeight()));
        Source_Control.setBorderPainted(false);
        Source_Control.setFocusPainted(false);
        Source_Control.setContentAreaFilled(false);

        Source_Control.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelDesplegado.setVisible(!panelDesplegado.isVisible()); // Alternar visibilidad
                if (panelDesplegado.isVisible()) {
                    panelDesplegado.setSize(210, panelDesplegado.getHeight()); // Establecer ancho inicial de 100
                }
            }
        });
        Source_Control.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Source_Control.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            
            public void mouseExited(MouseEvent e) {
                Source_Control.setCursor(Cursor.getDefaultCursor());
            }
        });

        ImageIcon icono4 = new ImageIcon("iconos/Run_Debug.png"); // Cambia la ruta por la ubicación de tu imagen
        Image imagen4 = icono4.getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
        ImageIcon iconoe4 = new ImageIcon(imagen4);
        
        JButton Run_Debug = new JButton(iconoe4);
        Run_Debug.setBounds(0, 160, 55, 55); 
        Run_Debug.setPreferredSize(new Dimension(iconoe.getIconWidth(), iconoe.getIconHeight()));
        Run_Debug.setBorderPainted(false);
        Run_Debug.setFocusPainted(false);
        Run_Debug.setContentAreaFilled(false);

        Run_Debug.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelDesplegado.setVisible(!panelDesplegado.isVisible()); // Alternar visibilidad
                if (panelDesplegado.isVisible()) {
                    panelDesplegado.setSize(210, panelDesplegado.getHeight()); // Establecer ancho inicial de 100
                }
            }
        });
        Run_Debug.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Run_Debug.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            
            public void mouseExited(MouseEvent e) {
                Run_Debug.setCursor(Cursor.getDefaultCursor());
            }
        });


        ImageIcon icono5 = new ImageIcon("iconos/Extensions.png"); // Cambia la ruta por la ubicación de tu imagen
        Image imagen5 = icono5.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
        ImageIcon iconoe5 = new ImageIcon(imagen5);

        JButton Extensions = new JButton(iconoe5);
        Extensions.setBounds(0, 210, 55, 55); 
        Extensions.setPreferredSize(new Dimension(iconoe.getIconWidth(), iconoe.getIconHeight()));
        Extensions.setBorderPainted(false);
        Extensions.setFocusPainted(false);
        Extensions.setContentAreaFilled(false);

        Extensions.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelDesplegado.setVisible(!panelDesplegado.isVisible()); // Alternar visibilidad
                if (panelDesplegado.isVisible()) {
                    panelDesplegado.setSize(210, panelDesplegado.getHeight()); // Establecer ancho inicial de 100
                }
            }
        });
        Extensions.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Extensions.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            
            public void mouseExited(MouseEvent e) {
                Extensions.setCursor(Cursor.getDefaultCursor());
            }
        });

        ImageIcon icono6 = new ImageIcon("iconos/Testing.png"); // Cambia la ruta por la ubicación de tu imagen
        Image imagen6 = icono6.getImage().getScaledInstance(53, 53, Image.SCALE_SMOOTH);
        ImageIcon iconoe6 = new ImageIcon(imagen6);

        JButton Testing = new JButton(iconoe6);
        Testing.setBounds(0, 260, 50, 50); 
        Testing.setPreferredSize(new Dimension(iconoe.getIconWidth(), iconoe.getIconHeight()));
        Testing.setBorderPainted(false);
        Testing.setFocusPainted(false);
        Testing.setContentAreaFilled(false);
        
        Testing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelDesplegado.setVisible(!panelDesplegado.isVisible()); // Alternar visibilidad
                if (panelDesplegado.isVisible()) {
                    panelDesplegado.setSize(210, panelDesplegado.getHeight()); // Establecer ancho inicial de 100
                }
            }
        });
        Testing.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Testing.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            
            public void mouseExited(MouseEvent e) {
                Testing.setCursor(Cursor.getDefaultCursor());
            }
        });

        ImageIcon icono7 = new ImageIcon("iconos/Tabnine.png"); // Cambia la ruta por la ubicación de tu imagen
        Image imagen7 = icono7.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon iconoe7 = new ImageIcon(imagen7);

        JButton Tabnine_AI = new JButton(iconoe7);
        Tabnine_AI.setBounds(0, 310, 55, 55); 
        Tabnine_AI.setPreferredSize(new Dimension(iconoe.getIconWidth(), iconoe.getIconHeight()));
        Tabnine_AI.setBorderPainted(false);
        Tabnine_AI.setFocusPainted(false);
        Tabnine_AI.setContentAreaFilled(false);

        Tabnine_AI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelDesplegado.setVisible(!panelDesplegado.isVisible()); // Alternar visibilidad
                if (panelDesplegado.isVisible()) {
                    panelDesplegado.setSize(210, panelDesplegado.getHeight()); // Establecer ancho inicial de 100
                }
            }
        });
        Tabnine_AI.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Tabnine_AI.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            
            public void mouseExited(MouseEvent e) {
                Tabnine_AI.setCursor(Cursor.getDefaultCursor());
            }
        });

        ImageIcon icono8 = new ImageIcon("iconos/Additional.png"); // Cambia la ruta por la ubicación de tu imagen
        Image imagen8 = icono8.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon iconoe8 = new ImageIcon(imagen8);

        JButton Additional = new JButton(iconoe8);
        Additional.setBounds(0, 360, 55, 55); 
        Additional.setPreferredSize(new Dimension(iconoe.getIconWidth(), iconoe.getIconHeight()));
        Additional.setBorderPainted(false);
        Additional.setFocusPainted(false);
        Additional.setContentAreaFilled(false);

        Additional.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Additional.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            
            public void mouseExited(MouseEvent e) {
                Additional.setCursor(Cursor.getDefaultCursor());
            }

            public void mouseClicked(MouseEvent e) {
                MenuDesplegableAdditional(Additional);
            }
        });


        ImageIcon icono9 = new ImageIcon("iconos/Account.png"); // Cambia la ruta por la ubicación de tu imagen
        Image imagen9 = icono9.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon iconoe9 = new ImageIcon(imagen9);

        JButton Account = new JButton(iconoe9);
        Account.setBounds(0, 550, 55, 55); 
        Account.setPreferredSize(new Dimension(iconoe.getIconWidth(), iconoe.getIconHeight()));
        Account.setBorderPainted(false);
        Account.setFocusPainted(false);
        Account.setContentAreaFilled(false);

        Account.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Account.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            
            public void mouseExited(MouseEvent e) {
                Account.setCursor(Cursor.getDefaultCursor());
            }

            public void mouseClicked(MouseEvent e) {
                MenuDesplegableAccount(Account);
            }
        });


        ImageIcon icono10 = new ImageIcon("iconos/Config.png"); // Cambia la ruta por la ubicación de tu imagen
        Image imagen10 = icono10.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon iconoe10 = new ImageIcon(imagen10);

        JButton Config = new JButton(iconoe10);
        Config.setBounds(0, 605, 55, 55); 
        Config.setPreferredSize(new Dimension(iconoe.getIconWidth(), iconoe.getIconHeight()));
        Config.setBorderPainted(false);
        Config.setFocusPainted(false);
        Config.setContentAreaFilled(false);

        Config.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Config.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            
            public void mouseExited(MouseEvent e) {
                Config.setCursor(Cursor.getDefaultCursor());
            }

            public void mouseClicked(MouseEvent e) {
                MenuDesplegableConfig(Config);
            }
            
        });

        panelI.add(Explorer);
        panelI.add(Search);
        panelI.add(Source_Control);
        panelI.add(Run_Debug);
        panelI.add(Extensions);
        panelI.add(Testing);
        panelI.add(Tabnine_AI);
        panelI.add(Additional);
        panelI.add(Account);
        panelI.add(Config);
    }

    private void MenuDesplegableAdditional(Component invoker) {
        JPopupMenu menu = new JPopupMenu();

        menu.setBackground(new Color(28, 28, 28)); // Establecer el color de fondo del menú desplegable
        

        JMenuItem item1 = new JMenuItem("       Live Share");
        item1.setForeground(Color.WHITE); 
        item1.setBackground(new Color(28, 28, 28)); 
        item1.setFont(fuente);
        item1.addActionListener(e -> System.out.println("Live Share selected"));

        JMenuItem item2 = new JMenuItem("       Sourcery");
        item2.setForeground(Color.WHITE);
        item2.setBackground(new Color(28, 28, 28));
        item2.setFont(fuente);
        item2.addActionListener(e -> System.out.println("Sourcery selected"));

        JMenuItem item3 = new JMenuItem("       Abstra");
        item3.setForeground(Color.WHITE);
        item3.setBackground(new Color(28, 28, 28));
        item3.setFont(fuente);
        item3.addActionListener(e -> System.out.println("Abstra selected"));

        JMenuItem item4 = new JMenuItem("       GitLens");
        item4.setForeground(Color.WHITE);
        item4.setBackground(new Color(28, 28, 28));
        item4.setFont(fuente);
        item4.addActionListener(e -> System.out.println("GitLens selected"));

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);

        menu.setBackground(Color.BLACK);

    
        // Personalizar el tamaño
        menu.setPreferredSize(new Dimension(185, 130));

        menu.show(invoker, 0, invoker.getHeight());
        
    }

    private void MenuDesplegableAccount(Component invoker) {
        JPopupMenu menu = new JPopupMenu();

        menu.setBackground(new Color(28, 28, 28)); // Establecer el color de fondo del menú desplegable
        

        JMenuItem item1 = new JMenuItem("       Account Login");
        item1.setForeground(Color.WHITE); 
        item1.setBackground(new Color(28, 28, 28)); 
        item1.setFont(fuente);
        item1.addActionListener(e -> System.out.println("Login selected"));

        JMenuItem item2 = new JMenuItem("       Backup and Sync Settings...");
        item2.setForeground(Color.WHITE);
        item2.setBackground(new Color(28, 28, 28)); 
        item2.setFont(fuente);
        item2.addActionListener(e -> System.out.println("Settings selected"));

        JMenuItem item3 = new JMenuItem("       Turn on Cloud Changes...");
        item3.setForeground(Color.WHITE);
        item3.setBackground(new Color(28, 28, 28));
        item3.setFont(fuente);
        item3.addActionListener(e -> System.out.println("Turn on Cloud Changes selected"));

        JMenuItem item4 = new JMenuItem("       Turn on Remote Tunnel Access...");
        item4.setForeground(Color.WHITE);
        item4.setBackground(new Color(28, 28, 28));
        item4.setFont(fuente);
        item4.addActionListener(e -> System.out.println("Turn on Remote Tunnel Acces"));

        JMenuItem item5 = new JMenuItem("       Sign in with tabnine to use Tabnine AI (1)");
        item5.setForeground(Color.WHITE);
        item5.setBackground(new Color(28, 28, 28));
        item5.setFont(fuente);
        item5.addActionListener(e -> System.out.println("Tabnine AI selected"));

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);
        menu.add(item5);

        menu.setBackground(Color.BLACK);

        // Personalizar el tamaño
        menu.setPreferredSize(new Dimension(350, 150));

        menu.show(invoker.getParent(), invoker.getWidth(), invoker.getY());
        
    }

    private void MenuDesplegableConfig(Component invoker) {
        JPopupMenu menu = new JPopupMenu();

        menu.setBackground(new Color(28, 28, 28)); // Establecer el color de fondo del menú desplegable
        

        JMenuItem item1 = new JMenuItem("       Command Palette...");
        item1.setForeground(Color.WHITE); 
        item1.setBackground(new Color(28, 28, 28)); 
        item1.addActionListener(e -> System.out.println("Command Palette selected"));

        JMenuItem item2 = new JMenuItem("       Profiles (Default)");
        item2.setForeground(Color.WHITE);
        item2.setBackground(new Color(28, 28, 28)); 
        item2.addActionListener(e -> System.out.println("Sourcery selected"));

        JMenuItem item3 = new JMenuItem("       Settings");
        item3.setForeground(Color.WHITE);
        item3.setBackground(new Color(28, 28, 28));
        item3.addActionListener(e -> System.out.println("Settings selected"));

        JMenuItem item4 = new JMenuItem("       Extensions");
        item4.setForeground(Color.WHITE);
        item4.setBackground(new Color(28, 28, 28));
        item4.addActionListener(e -> System.out.println("Extensions selected"));

        JMenuItem item5 = new JMenuItem("       Keyboard Shortcuts");
        item5.setForeground(Color.WHITE);
        item5.setBackground(new Color(28, 28, 28));
        item5.addActionListener(e -> System.out.println("Keyboard Shortcuts selected"));

        JMenuItem item6 = new JMenuItem("       User Snippets");
        item6.setForeground(Color.WHITE);
        item6.setBackground(new Color(28, 28, 28));
        item6.addActionListener(e -> System.out.println("User Snippets selected"));

        JMenuItem item7 = new JMenuItem("       User Tasks");
        item7.setForeground(Color.WHITE);
        item7.setBackground(new Color(28, 28, 28));
        item7.addActionListener(e -> System.out.println("User Tasks selected"));

        JMenuItem item8 = new JMenuItem("       Themes");
        item8.setForeground(Color.WHITE);
        item8.setBackground(new Color(28, 28, 28));
        item8.addActionListener(e -> System.out.println("Themes selected"));

        JMenuItem item9 = new JMenuItem("       Backup and Sync Settings...");
        item9.setForeground(Color.WHITE);
        item9.setBackground(new Color(28, 28, 28));
        item9.addActionListener(e -> System.out.println("Settings selected"));

        JMenuItem item10 = new JMenuItem("      Check for updates...");
        item10.setForeground(Color.WHITE);
        item10.setBackground(new Color(28, 28, 28));
        item10.addActionListener(e -> System.out.println("Check for updates selected"));

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);
        menu.add(item5);
        menu.add(item6);
        menu.add(item7);
        menu.add(item8);
        menu.add(item9);
        menu.add(item10);


        menu.setBackground(Color.BLACK);

    
        // Personalizar el tamaño
        menu.setPreferredSize(new Dimension(300, 350));

        menu.show(invoker.getParent(), invoker.getWidth(), invoker.getY());
        
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

    private void panelTerminal() {
        panelTerminal.setBackground(new Color(30, 30, 30));
        panelTerminal.setBounds(55, 726, 750, 200); // Comienza fuera de la vista
        panelTerminal.setLayout(null);
        panelTerminal.setVisible(false); // Por defecto, el panel de la terminal está oculto
        panelBackground.add(panelTerminal);
    
        JLabel problemsLabel = new JLabel("PROBLEMS");
    problemsLabel.setBounds(10, 0, 80, 20);
    problemsLabel.setForeground(new Color(85,85,85));
    JLabel outputLabel = new JLabel("OUTPUT");
    outputLabel.setBounds(100, 0, 60, 20);
    outputLabel.setForeground(new Color(85,85,85));
    JLabel debugConsoleLabel = new JLabel("DEBUG CONSOLE");
    debugConsoleLabel.setBounds(170, 0, 110, 20);
    debugConsoleLabel.setForeground(new Color(85,85,85));
    JLabel terminalLabel = new JLabel("TERMINAL");
    terminalLabel.setBounds(290, 0, 85, 20);
    terminalLabel.setForeground(new Color(85,85,85));
    JLabel portsLabel = new JLabel("PORTS");
    portsLabel.setBounds(370, 0, 60, 20);
    portsLabel.setForeground(new Color(85,85,85));
    JLabel commentsLabel = new JLabel("COMMENTS");
    commentsLabel.setBounds(450, 0, 90, 20);
    commentsLabel.setForeground(new Color(85,85,85));

    panelTerminal.add(problemsLabel);
    panelTerminal.add(outputLabel);
    panelTerminal.add(debugConsoleLabel);
    panelTerminal.add(terminalLabel);
    panelTerminal.add(portsLabel);
    panelTerminal.add(commentsLabel);
    
        JButton closeButton = new JButton("X");
        closeButton.setBounds(690, 0, 44, 20);
        closeButton.setBackground(new Color(30, 30, 30));
        closeButton.setForeground(Color.WHITE);
        closeButton.setBorderPainted(false);
        closeButton.setFocusPainted(false);
        closeButton.addActionListener(e -> panelTerminal.setVisible(false));
        panelTerminal.add(closeButton);
    
        JButton maximizeButton = new JButton("︿");
        maximizeButton.setBounds(646, 0, 50, 20);
        maximizeButton.setBackground(new Color(30, 30, 30));
        maximizeButton.setForeground(Color.WHITE);
        maximizeButton.setBorderPainted(false);
        maximizeButton.setFocusPainted(false);
        maximizeButton.addActionListener(e -> toggleMaximizeTerminalPanel(maximizeButton));
        panelTerminal.add(maximizeButton);
    
        terminalTextArea = new JTextArea("PS C:\\Users\\User\\Escritorio\\Punto3\\Punto3>  ");
        terminalTextArea.setBackground(new Color(30, 30, 30));
        terminalTextArea.setForeground(Color.WHITE);
        terminalTextArea.setCaretColor(Color.WHITE);
        terminalTextArea.setBounds(0, 30, 750, 170);
        terminalTextArea.setEditable(true);
        terminalTextArea.setLineWrap(true);
        terminalTextArea.setFocusable(true);
        terminalTextArea.setDisabledTextColor(Color.WHITE); // Para asegurar que el texto predefinido sea blanco
        panelTerminal.add(terminalTextArea);
        

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(585, 0, 65, 20);
        clearButton.setBackground(new Color(30, 30, 30));
        clearButton.setForeground(Color.WHITE);
        clearButton.setBorderPainted(false);
        clearButton.setFocusPainted(false);
        clearButton.addActionListener(e -> terminalTextArea.setText("PS C:\\Users\\User\\Escritorio\\Punto3\\Punto3>    "));
        panelTerminal.add(clearButton);
        
        
        panelTerminal.add(terminalTextArea);
    
        panelTerminal.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getY() >= panelTerminal.getHeight() - 10) {
                    resizing = true;
                    prevMouseY = e.getYOnScreen();
                }
            }
    
            @Override
            public void mouseReleased(MouseEvent e) {
                resizing = false;
            }
        });
    
        panelTerminal.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (resizing) {
                    int mouseY = e.getYOnScreen();
                    int deltaY = mouseY - prevMouseY;
                    int newHeight = panelTerminal.getHeight() + deltaY;
                    int newY = panelTerminal.getY() - deltaY;
    
                    if (newY >= 30 && newY <= 526) {
                        panelTerminal.setBounds(55, newY, 750, newHeight);
                        panelDesplegado.setBounds(55, 30, 750, newY - 30);
                        prevMouseY = mouseY;
                    }
                }
            }
    
            @Override
            public void mouseMoved(MouseEvent e) {
                if (e.getY() >= panelTerminal.getHeight() - 10) {
                    panelTerminal.setCursor(Cursor.getPredefinedCursor(Cursor.S_RESIZE_CURSOR));
                } else {
                    panelTerminal.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                }
            }
        });
    }
    
    private void toggleTerminalPanel() {
        if (panelTerminal.isVisible()) {
            panelTerminal.setVisible(false);
            panelDesplegado.setBounds(55, 30, 750, 696); // Restaurar el tamaño original de panelDesplegado
        } else {
            panelTerminal.setVisible(true);
            panelTerminal.setBounds(55, 526, 750, 200); // Posicionar el panelTerminal en su ubicación visible
            panelDesplegado.setBounds(55, 30, 750, 496); // Ajustar el tamaño de panelDesplegado
        }
    }
    
    private void toggleMaximizeTerminalPanel(JButton maximizeButton) {
        if (isMaximized) {
            panelTerminal.setBounds(55, 526, 750, 200); // Restaurar tamaño original
            panelDesplegado.setBounds(55, 30, 750, 496); // Restaurar tamaño original
            maximizeButton.setText("︿");
        } else {
            panelTerminal.setBounds(55, 30, 750, 696); // Maximizar el panel de la terminal
            panelDesplegado.setBounds(55, 726, 750, 0); // Ajustar el tamaño de panelDesplegado
            maximizeButton.setText("﹀");
        }
        isMaximized = !isMaximized;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }
}