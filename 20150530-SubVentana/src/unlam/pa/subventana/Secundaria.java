package unlam.pa.subventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Secundaria extends JFrame {

    private static final long serialVersionUID = 4280526833873026237L;
    
    private JPanel contenido;
	private JTextField textfield;

	public Secundaria(final Principal principal) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contenido = new JPanel();
		contenido.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenido);
		contenido.setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				principal.agregarTexto(textfield.getText());
				dispose();
			}
		});
		btnSalir.setBounds(176, 228, 89, 23);
		contenido.add(btnSalir);
		
		textfield = new JTextField();
		textfield.setBounds(82, 64, 265, 32);
		contenido.add(textfield);
		textfield.setColumns(10);
	}
}
