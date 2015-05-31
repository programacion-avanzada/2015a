package unlam.pa.subventana;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

    private static final long serialVersionUID = 6966941401495907811L;
    
    private JPanel contenido;
	private JTextArea textarea;
	private JButton botonAgregar;
    private Secundaria ventanaSecundaria;

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contenido = new JPanel();
		contenido.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenido);
		contenido.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		contenido.add(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmChau = new JMenuItem("Salir");
		mntmChau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ventanaSecundaria != null)
                    ventanaSecundaria.dispose();
                dispose();
            }
        });
		mnMenu.add(mntmChau);
		
		JMenu mnHelp = new JMenu("Ayuda");
		menuBar.add(mnHelp);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(31, 44, 366, 192);
		contenido.add(scrollPane);
		
		textarea = new JTextArea();
		textarea.setLineWrap(true);
		textarea.setText("Ingres\u00E1 texto campe\u00F3n!");
		scrollPane.setViewportView(textarea);
		
		botonAgregar = new JButton("Agregar");
		botonAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lanzarSecundaria();
			}
		});
		botonAgregar.setBounds(152, 239, 89, 23);
		contenido.add(botonAgregar);
	}
	
	public void agregarTexto(String texto) {
		textarea.append(texto);
	}
	
	private void lanzarSecundaria() {
		ventanaSecundaria = new Secundaria(this);
		ventanaSecundaria.addWindowListener(new WindowCloseListener() {
			@Override
			public void windowClosed(WindowEvent e) {
				System.out.println("Se cierra secundaria!!!");
				botonAgregar.setEnabled(true);
			}
		});
		ventanaSecundaria.setVisible(true);
		botonAgregar.setEnabled(false);
	}
	
	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Principal frame = new Principal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
