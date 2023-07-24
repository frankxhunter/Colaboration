package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JButton btnInicio;
	private JLabel lblBienvenidoACodman;
	private JLabel lblDedicadaALa;
	private JLabel lblDeArchivosDe;
	private JLabel lblPresionainiciarPara;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Login() {
//		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/ICONS/icons8_flow_chart_100px.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setType(Type.POPUP);
		setBackground(UIManager.getColor("inactiveCaption"));
		setForeground(SystemColor.activeCaption);
		setFont(new Font("Candara", Font.PLAIN, 15));
		setTitle("CODMAN");
		setBounds(100, 100, 700, 480);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblBienvenidoACodman());
		contentPane.add(getLblDedicadaALa());
		contentPane.add(getLblDeArchivosDe());
		contentPane.add(getLblPresionainiciarPara());
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
			label.setBounds(new Rectangle(0, 0, 344, 441));
			label.setBackground(SystemColor.activeCaption);
//			label.setIcon(new ImageIcon(Login.class.getResource("/ICONS/inicio.jpg")));
			label.setBounds(0, 0, 354, 441);
		}
		return label;
	}
	private JButton getBtnNewButton() {
		if (btnInicio == null) {
			btnInicio = new JButton("Iniciar");			
			btnInicio.setFocusable(false);
			btnInicio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Principal p = new Principal();
					p.setVisible(true);
					setVisible(false);
				}
			});
			btnInicio.setBackground(SystemColor.textHighlightText);
			btnInicio.setBorder(new LineBorder(new Color(153, 180, 209), 4, true));
			btnInicio.setFont(new Font("Candara", Font.PLAIN, 20));
			btnInicio.setBounds(383, 385, 270, 45);
		}
		return btnInicio;
	}
	private JLabel getLblBienvenidoACodman() {
		if (lblBienvenidoACodman == null) {
			lblBienvenidoACodman = new JLabel("Bienvenido a CODMAN una aplicaci\u00F3n \r\n\r\n");
			lblBienvenidoACodman.setToolTipText("");
			lblBienvenidoACodman.setHorizontalTextPosition(SwingConstants.LEFT);
			lblBienvenidoACodman.setHorizontalAlignment(SwingConstants.LEFT);
			lblBienvenidoACodman.setVerticalAlignment(SwingConstants.TOP);
			lblBienvenidoACodman.setFont(new Font("Candara", Font.PLAIN, 15));
			lblBienvenidoACodman.setBounds(383, 43, 270, 19);
		}
		return lblBienvenidoACodman;
	}
	private JLabel getLblDedicadaALa() {
		if (lblDedicadaALa == null) {
			lblDedicadaALa = new JLabel("dedicada a la codificaci\u00F3n y decodificaci\u00F3n\r\n\r\n\r\n");
			lblDedicadaALa.setVerticalAlignment(SwingConstants.TOP);
			lblDedicadaALa.setToolTipText("");
			lblDedicadaALa.setHorizontalTextPosition(SwingConstants.LEFT);
			lblDedicadaALa.setHorizontalAlignment(SwingConstants.LEFT);
			lblDedicadaALa.setFont(new Font("Candara", Font.PLAIN, 15));
			lblDedicadaALa.setBounds(383, 73, 270, 19);
		}
		return lblDedicadaALa;
	}
	private JLabel getLblDeArchivosDe() {
		if (lblDeArchivosDe == null) {
			lblDeArchivosDe = new JLabel("de archivos de manera f\u00E1cil y eficiente\r\n\r\n\r\n");
			lblDeArchivosDe.setVerticalAlignment(SwingConstants.TOP);
			lblDeArchivosDe.setToolTipText("");
			lblDeArchivosDe.setHorizontalTextPosition(SwingConstants.LEFT);
			lblDeArchivosDe.setHorizontalAlignment(SwingConstants.LEFT);
			lblDeArchivosDe.setFont(new Font("Candara", Font.PLAIN, 15));
			lblDeArchivosDe.setBounds(383, 103, 270, 19);
		}
		return lblDeArchivosDe;
	}
	private JLabel getLblPresionainiciarPara() {
		if (lblPresionainiciarPara == null) {
			lblPresionainiciarPara = new JLabel("Presiona \"Iniciar\" para comenzar a trabajar");
			lblPresionainiciarPara.setVerticalAlignment(SwingConstants.TOP);
			lblPresionainiciarPara.setToolTipText("");
			lblPresionainiciarPara.setHorizontalTextPosition(SwingConstants.LEFT);
			lblPresionainiciarPara.setHorizontalAlignment(SwingConstants.LEFT);
			lblPresionainiciarPara.setFont(new Font("Candara", Font.PLAIN, 15));
			lblPresionainiciarPara.setBounds(383, 196, 270, 19);
		}
		return lblPresionainiciarPara;
	}
}
