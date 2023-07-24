package GUI2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class info extends JDialog {

    private final JPanel contentPanel = new JPanel();
    private JLabel lblCodmanHaSido;
    private JLabel lblIngenieraInformticaDe;
    private JLabel lblCujaeElCul;
    private JLabel label;
    private JLabel lblFrankMesaDomnguez;
    private JLabel lblMarcoAntonioGonzlez;
    private JLabel lblGabrielFernandezLorenzo;
    private JLabel lblFabinAlejandroReyes;
    private JButton btnVolver;
    private JButton btnTutorial;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            info dialog = new info();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	/*public static void main(String[] args) {
		try {
			info dialog = new info();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

    /**
     * Create the dialog.
     */
    public info() {
        setTitle("CODMAN");
        setIconImage(Toolkit.getDefaultToolkit().getImage(info.class.getResource("/ICONS/icons8_flow_chart_100px.png")));
        setBounds(100, 100, 581, 300);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBackground(SystemColor.inactiveCaption);
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);
        contentPanel.add(getLblCodmanHaSido());
        contentPanel.add(getLblIngenieraInformticaDe());
        contentPanel.add(getLblCujaeElCul());
        contentPanel.add(getLblFrankMesaDomnguez());
        contentPanel.add(getLblMarcoAntonioGonzlez());
        contentPanel.add(getLblGabrielFernndez());
        contentPanel.add(getLblFabinAlejandroReyes());
        contentPanel.add(getLabel());
        contentPanel.add(getBtnVolver());
        contentPanel.add(getBtnTutorial());
    }
    private JButton getBtnVolver() {
        if (btnVolver == null) {
            btnVolver = new JButton("Volver");
            btnVolver.setVerticalAlignment(SwingConstants.BOTTOM);
            btnVolver.setFocusable(false);
            btnVolver.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    Principal p = new Principal();
                    p.setVisible(true);
                    setVisible(false);
                }
            });
            btnVolver.setFont(new Font("Candara", Font.PLAIN, 14));
            btnVolver.setBackground(SystemColor.window);
            btnVolver.setBorder(new LineBorder(SystemColor.activeCaption, 2, true));
            btnVolver.setBounds(444, 213, 89, 23);
        }
        return btnVolver;
    }
    private JLabel getLblCodmanHaSido() {
        if (lblCodmanHaSido == null) {
            lblCodmanHaSido = new JLabel("CODMAN ha sido elaborado por el colectivo de estudiantes de la carrera de ");
            lblCodmanHaSido.setFont(new Font("Candara", Font.PLAIN, 14));
            lblCodmanHaSido.setHorizontalAlignment(SwingConstants.CENTER);
            lblCodmanHaSido.setBounds(58, 42, 449, 14);
        }
        return lblCodmanHaSido;
    }
    private JLabel getLblIngenieraInformticaDe() {
        if (lblIngenieraInformticaDe == null) {
            lblIngenieraInformticaDe = new JLabel("Ingenier\u00EDa Inform\u00E1tica de la Ciudad Universitaria Jos\u00E9 Antonio Echevarria");
            lblIngenieraInformticaDe.setFont(new Font("Candara", Font.PLAIN, 14));
            lblIngenieraInformticaDe.setHorizontalAlignment(SwingConstants.CENTER);
            lblIngenieraInformticaDe.setBounds(58, 59, 449, 14);
        }
        return lblIngenieraInformticaDe;
    }
    private JLabel getLblCujaeElCul() {
        if (lblCujaeElCul == null) {
            lblCujaeElCul = new JLabel("CUJAE el cu\u00E1l etsa integrado por los siguientes educandos:");
            lblCujaeElCul.setFont(new Font("Candara", Font.PLAIN, 14));
            lblCujaeElCul.setHorizontalAlignment(SwingConstants.CENTER);
            lblCujaeElCul.setBounds(58, 78, 449, 14);
        }
        return lblCujaeElCul;
    }
    private JLabel getLabel() {
        if (label == null) {
            label = new JLabel("");
            label.setBorder(new LineBorder(new Color(0, 0, 0), 2));
            label.setBounds(10, 11, 545, 239);
        }
        return label;
    }
    private JLabel getLblFrankMesaDomnguez() {
        if (lblFrankMesaDomnguez == null) {
            lblFrankMesaDomnguez = new JLabel("Frank Mesa Dom\u00EDnguez ");
            lblFrankMesaDomnguez.setHorizontalAlignment(SwingConstants.CENTER);
            lblFrankMesaDomnguez.setFont(new Font("Candara", Font.PLAIN, 14));
            lblFrankMesaDomnguez.setBounds(58, 120, 449, 14);
        }
        return lblFrankMesaDomnguez;
    }
    private JLabel getLblMarcoAntonioGonzlez() {
        if (lblMarcoAntonioGonzlez == null) {
            lblMarcoAntonioGonzlez = new JLabel("Marco Antonio Gonz\u00E1lez Ochoa");
            lblMarcoAntonioGonzlez.setHorizontalAlignment(SwingConstants.CENTER);
            lblMarcoAntonioGonzlez.setFont(new Font("Candara", Font.PLAIN, 14));
            lblMarcoAntonioGonzlez.setBounds(58, 142, 449, 14);
        }
        return lblMarcoAntonioGonzlez;
    }
    private JLabel getLblGabrielFernndez() {
        if (lblGabrielFernandezLorenzo == null) {
            lblGabrielFernandezLorenzo = new JLabel("Gabriel Fern\u00E1ndez Lorenzo");
            lblGabrielFernandezLorenzo.setHorizontalAlignment(SwingConstants.CENTER);
            lblGabrielFernandezLorenzo.setFont(new Font("Candara", Font.PLAIN, 14));
            lblGabrielFernandezLorenzo.setBounds(58, 164, 449, 14);
        }
        return lblGabrielFernandezLorenzo;
    }
    private JLabel getLblFabinAlejandroReyes() {
        if (lblFabinAlejandroReyes == null) {
            lblFabinAlejandroReyes = new JLabel("Fabi\u00E1n Alejandro Reyes Montero");
            lblFabinAlejandroReyes.setHorizontalAlignment(SwingConstants.CENTER);
            lblFabinAlejandroReyes.setFont(new Font("Candara", Font.PLAIN, 14));
            lblFabinAlejandroReyes.setBounds(58, 188, 449, 14);
        }
        return lblFabinAlejandroReyes;
    }

    private JButton getBtnTutorial() {
        if (btnTutorial == null) {
            btnTutorial = new JButton("Tutorial");
            btnTutorial.setVerticalAlignment(SwingConstants.BOTTOM);
            btnTutorial.setFocusable(false);
            btnTutorial.setFont(new Font("Candara", Font.PLAIN, 14));
            btnTutorial.setBorder(new LineBorder(SystemColor.activeCaption, 2, true));
            btnTutorial.setBackground(Color.WHITE);
            btnTutorial.setBounds(28, 211, 89, 23);
        }
        return btnTutorial;
    }
}
