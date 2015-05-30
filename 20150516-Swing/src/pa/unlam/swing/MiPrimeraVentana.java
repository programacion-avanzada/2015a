package pa.unlam.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;

public class MiPrimeraVentana extends JFrame {

	private static final long serialVersionUID = 2547561672065481436L;

	private JPanel contentPane;
	private JLabel lblHolaMundo;

	public MiPrimeraVentana() {
		super();
		setResizable(false);
		setTitle("Mi Primera Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 328, 83);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblHolaMundo = new JLabel();
		lblHolaMundo.setText("Hola Mundo!!!");
		lblHolaMundo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblHolaMundo);
	}

	public static void main(String[] args) {
		MiPrimeraVentana frame = new MiPrimeraVentana();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}	
}
