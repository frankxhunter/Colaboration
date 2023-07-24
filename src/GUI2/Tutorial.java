package GUI2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tutorial extends JDialog {

    private final JPanel contentPanel = new JPanel();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            Tutorial dialog = new Tutorial();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	/*public static void main(String[] args) {
		try {
			Tutorial dialog = new Tutorial();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

    /**
     * Create the dialog.
     */
    public Tutorial() {
        setTitle("CODMAN");
        setIconImage(Toolkit.getDefaultToolkit().getImage(Tutorial.class.getResource("/ICONS/icons8_flow_chart_100px.png")));
        setBackground(SystemColor.inactiveCaption);
        setBounds(100, 100, 910, 610);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBackground(SystemColor.inactiveCaption);
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);



        JButton btnNewButton_1 = new JButton("Anterior");
        btnNewButton_1.setFont(new Font("Candara", Font.PLAIN, 15));
        btnNewButton_1.setBorder(new LineBorder(SystemColor.textHighlight, 3, true));
        btnNewButton_1.setBackground(Color.WHITE);
        btnNewButton_1.setBounds(334, 537, 89, 23);
        contentPanel.add(btnNewButton_1);

        JLabel lblNewLabel = new JLabel("CODMAN es una aplicación para comprimir archivos de manera eficiente y sencilla libre de costos y licencias a diferencia de otras \r\n\r\n");
        lblNewLabel.setFont(new Font("Candara", Font.PLAIN, 15));
        lblNewLabel.setBounds(24, 26, 843, 37);
        contentPanel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("aplicaciones relacionadas con este tema ");
        lblNewLabel_1.setFont(new Font("Candara", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(24, 58, 843, 37);
        contentPanel.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Para usar CODMAN de manera correcta siga los siguientes pasos :");
        lblNewLabel_2.setFont(new Font("Candara", Font.PLAIN, 15));
        lblNewLabel_2.setBounds(24, 100, 843, 37);
        contentPanel.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("\r\n");
        lblNewLabel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        lblNewLabel_3.setIcon(new ImageIcon(Tutorial.class.getResource("/ICONS/Captura de pantalla (4).png")));
        lblNewLabel_3.setBounds(45, 150, 245, 297);
        contentPanel.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("1- Seleccione una de las dos opciones.");
        lblNewLabel_4.setFont(new Font("Candara", Font.PLAIN, 15));
        lblNewLabel_4.setBounds(300, 148, 260, 37);
        contentPanel.add(lblNewLabel_4);

        JLabel lblNewLabel_4_1 = new JLabel("2- Posterior a la selección aparecerá");
        lblNewLabel_4_1.setFont(new Font("Candara", Font.PLAIN, 15));
        lblNewLabel_4_1.setBounds(300, 176, 260, 37);
        contentPanel.add(lblNewLabel_4_1);

        JLabel lblNewLabel_4_2 = new JLabel("en la pantalla las opciones siguientes.");
        lblNewLabel_4_2.setFont(new Font("Candara", Font.PLAIN, 15));
        lblNewLabel_4_2.setBounds(300, 196, 260, 37);
        contentPanel.add(lblNewLabel_4_2);

        JLabel lblNewLabel_4_1_1 = new JLabel("*(PULSA SIGUIENTE)");
        lblNewLabel_4_1_1.setFont(new Font("Candara", Font.PLAIN, 15));
        lblNewLabel_4_1_1.setBounds(300, 224, 260, 37);
        contentPanel.add(lblNewLabel_4_1_1);

        final JLabel lblPage_2 = new JLabel("2/3\r\n");
        lblPage_2.setFont(new Font("Candara", Font.PLAIN, 15));
        lblPage_2.setBounds(448, 502, 25, 28);
        lblPage_2.setVisible(false);
        contentPanel.add(lblPage_2);

        final JLabel lblPage = new JLabel("1/3\r\n");
        lblPage.setFont(new Font("Candara", Font.PLAIN, 15));
        lblPage.setBounds(448, 502, 25, 28);

        contentPanel.add(lblPage);

        JButton btnSiguiente = new JButton("Siguiente");
        btnSiguiente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(lblPage_2.isVisible()==false) {
                    lblPage.setVisible(false);
                    lblPage_2.setVisible(true);
                }else {
                    lblPage_2.setVisible(false);
                }

            }
        });
        btnSiguiente.setFont(new Font("Candara", Font.PLAIN, 15));
        btnSiguiente.setBorder(new LineBorder(SystemColor.textHighlight, 3, true));
        btnSiguiente.setBackground(Color.WHITE);
        btnSiguiente.setBounds(493, 537, 89, 23);
        contentPanel.add(btnSiguiente);


    }
}
