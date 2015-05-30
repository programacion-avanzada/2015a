package pa.unlam.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JPrincipal extends JFrame {

	private static final long serialVersionUID = -555002779902813622L;

	private JPanel contentPane;
	private JButton btnSalir;
	private JButton btnContadorClicks;
	private int contadorClicks;
	

	public JPrincipal() {
		super("Ventana Principal");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				abreConfirmacion();
			}
		});
		contadorClicks = 0;
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(342, 133);
		contentPane = new JPanel();
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		
		btnContadorClicks = new JButton("0");
		btnContadorClicks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setCantidadClicks();
			}
		});
		btnContadorClicks.setBounds(101, 11, 122, 30);
		contentPane.add(btnContadorClicks);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abreConfirmacion();
			}
		});
		btnSalir.setBounds(101, 47, 122, 30);
		contentPane.add(btnSalir);
		
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		JPrincipal frame = new JPrincipal();
		frame.setVisible(true);

	}
	
	public void abreConfirmacion() {
		int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea salir de la aplicación?", this.getTitle(), JOptionPane.YES_NO_OPTION);
		if(respuesta == JOptionPane.YES_OPTION)
			System.exit(0);
	}
	
	private void setCantidadClicks() {
		btnContadorClicks.setText("" + ++contadorClicks);
	}
}
