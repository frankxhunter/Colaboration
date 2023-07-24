package GUI2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFileChooser;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.io.StreamCorruptedException;

import HuffmanCompress.HuffmanBytes;
public class Principal extends JDialog {

    private final JPanel contentPanel = new JPanel();
    private JLabel label;
    private JButton btnComprimir;
    private JButton btnDescomprimir;
    private JButton btnSalir;
    private JTextField direccionParaLeer;
    private JLabel lblEscribaLaDireccion;
    private JLabel lblDeseaTrabajar;
    private JLabel lblLeerDesde;
    private JTextField direccionParaGuardar;
    private JLabel lblGuardarEn;
    private JButton btnBuscarRuta;
    private JButton btnBuscarRutaGuard;
    private JButton btnBuscarRuta_2;
    private JButton btnBuscarRutaGuard_2;
    private JButton btnAceptar;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            Principal dialog = new Principal();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	/*public static void main(String[] args) {
		try {
			Principal dialog = new Principal();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
    /**
     * Create the dialog.
     */
    public Principal() {
        setBounds(new Rectangle(0, 0, 400, 440));
        setTitle("CODMAN");
        setFont(new Font("Candara", Font.PLAIN, 15));
        setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/ICONS/icons8_flow_chart_100px.png")));
        setBounds(100, 100, 690, 445);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBackground(SystemColor.inactiveCaption);
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);
        contentPanel.add(getDireccionParaLeer());
        contentPanel.add(getDireccionParaGuardar());
        contentPanel.add(getBtnBuscarRuta_2());
        contentPanel.add(getButton_1());
        contentPanel.add(getBtnBuscarRutaGuard_2());
        contentPanel.add(getButton_1_1());
        contentPanel.add(getBtnAceptar());
        contentPanel.add(getLblEscribaLaDireccion());
        contentPanel.add(getLblDeseaTrabajar());
        contentPanel.add(getLblLeerDesde());
        contentPanel.add(getLblGuardarEn());
        contentPanel.add(getLabel());
        contentPanel.add(getBtnComprimir());
        contentPanel.add(getBtnDescomprimir());
        contentPanel.add(getBtnSalir());

        JButton btnAyuda = new JButton("Ayuda");
        btnAyuda.setFocusable(false);
        btnAyuda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                info i = new info();
                i.setVisible(true);
                setVisible(false);
            }
        });
        btnAyuda.setFont(new Font("Candara", Font.PLAIN, 15));
        btnAyuda.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        btnAyuda.setBackground(Color.WHITE);
        btnAyuda.setBounds(10, 178, 126, 30);
        contentPanel.add(btnAyuda);
    }
    private static void addPopup(Component component, final JPopupMenu popup) {
        component.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showMenu(e);
                }
            }
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showMenu(e);
                }
            }
            private void showMenu(MouseEvent e) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        });
    }
    private JLabel getLabel() {
        if (label == null) {
            label = new JLabel("");
            label.setIcon(new ImageIcon(Principal.class.getResource("/ICONS/inicio.jpg")));
            label.setBounds(146, 0, 528, 406);
        }
        return label;
    }
    private JButton getBtnComprimir() {
        if (btnComprimir == null) {
            btnComprimir = new JButton("Comprimir\r\n");
            btnComprimir.setFocusable(false);
            btnComprimir.setBorder(null);
            btnComprimir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    lblDeseaTrabajar.setVisible(true);
                    lblDeseaTrabajar.setText("desea comprimir");
                    lblEscribaLaDireccion.setVisible(true);
                    lblLeerDesde.setVisible(true);
                    lblGuardarEn.setVisible(true);
                    direccionParaLeer.setVisible(true);
                    direccionParaGuardar.setVisible(true);
                    btnBuscarRuta.setVisible(true);
                    btnBuscarRutaGuard.setVisible(true);
                    btnBuscarRuta_2.setVisible(false);
                    btnBuscarRutaGuard_2.setVisible(false);
                    btnAceptar.setVisible(true);
                    btnAceptar.setText("Comprimir");

                }
            });
            btnComprimir.setIcon(new ImageIcon(Principal.class.getResource("/ICONS/icons8_data_matrix_code_24px_2.png")));
            btnComprimir.setFont(new Font("Candara", Font.PLAIN, 15));
            btnComprimir.setBorder(new LineBorder(new Color(153, 180, 209), 4, true));
            btnComprimir.setBackground(Color.WHITE);
            btnComprimir.setBounds(10, 82, 126, 30);
        }
        return btnComprimir;
    }
    private JButton getBtnDescomprimir() {
        if (btnDescomprimir== null) {
            btnDescomprimir = new JButton("Descomprimir\r\n");
            btnDescomprimir.setFocusable(false);
            btnDescomprimir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    lblDeseaTrabajar.setVisible(true);
                    lblDeseaTrabajar.setText("desea descomprimir");
                    lblEscribaLaDireccion.setVisible(true);
                    lblLeerDesde.setVisible(true);
                    lblGuardarEn.setVisible(true);
                    direccionParaLeer.setVisible(true);
                    direccionParaGuardar.setVisible(true);
                    btnBuscarRuta.setVisible(false);
                    btnBuscarRutaGuard.setVisible(false);
                    btnBuscarRuta_2.setVisible(true);
                    btnBuscarRutaGuard_2.setVisible(true);
                    btnAceptar.setVisible(true);
                    btnAceptar.setText("Descomprimir");
                }
            });
            btnDescomprimir.setIcon(new ImageIcon(Principal.class.getResource("/ICONS/icons8_j2k_24px.png")));
            btnDescomprimir.setFont(new Font("Candara", Font.PLAIN, 15));
            btnDescomprimir.setBorder(new LineBorder(new Color(153, 180, 209), 4, true));
            btnDescomprimir.setBackground(Color.WHITE);
            btnDescomprimir.setBounds(10, 123, 126, 30);
        }
        return btnDescomprimir;
    }
    private JButton getBtnSalir() {
        if (btnSalir == null) {
            btnSalir = new JButton("Salir\r\n");
            btnSalir.setFocusable(false);
            btnSalir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    setVisible(false);
                }
            });
            btnSalir.setIcon(new ImageIcon(Principal.class.getResource("/ICONS/icons8_exit_24px.png")));
            btnSalir.setFont(new Font("Candara", Font.PLAIN, 15));
            btnSalir.setBorder(new LineBorder(new Color(153, 180, 209), 4, true));
            btnSalir.setBackground(Color.WHITE);
            btnSalir.setBounds(10, 338, 113, 30);
        }
        return btnSalir;
    }
    private JTextField getDireccionParaLeer() {
        if (direccionParaLeer == null) {
            direccionParaLeer = new JTextField();
            direccionParaLeer.setBorder(new LineBorder(SystemColor.textHighlight, 3));
            direccionParaLeer.setBounds(165, 82, 415, 30);
            direccionParaLeer.setColumns(10);
            direccionParaLeer.setVisible(false);
        }
        return direccionParaLeer;
    }
    private JLabel getLblEscribaLaDireccion() {
        if (lblEscribaLaDireccion == null) {
            lblEscribaLaDireccion = new JLabel("Escriba la direcci\u00F3n del archivo el cual ");
            lblEscribaLaDireccion.setBorder(null);
            lblEscribaLaDireccion.setFont(new Font("Candara", Font.PLAIN, 15));
            lblEscribaLaDireccion.setBounds(155, 11, 238, 27);
            lblEscribaLaDireccion.setVisible(false);

        }
        return lblEscribaLaDireccion;
    }
    private JLabel getLblDeseaTrabajar() {
        if (lblDeseaTrabajar == null) {
            lblDeseaTrabajar = new JLabel();

            lblDeseaTrabajar.setBorder(null);
            lblDeseaTrabajar.setFont(new Font("Candara", Font.PLAIN, 15));
            lblDeseaTrabajar.setBounds(387, 11, 132, 27);
            lblDeseaTrabajar.setVisible(false);
        }
        return lblDeseaTrabajar;
    }
    private JLabel getLblLeerDesde() {
        if (lblLeerDesde == null) {
            lblLeerDesde = new JLabel("Leer desde:");
            lblLeerDesde.setBorder(null);
            lblLeerDesde.setFont(new Font("Candara", Font.PLAIN, 15));
            lblLeerDesde.setBounds(165, 61, 73, 19);
            lblLeerDesde.setVisible(false);
        }
        return lblLeerDesde;
    }
    private JTextField getDireccionParaGuardar() {
        if (direccionParaGuardar == null) {
            direccionParaGuardar = new JTextField();
            direccionParaGuardar.setColumns(10);
            direccionParaGuardar.setBorder(new LineBorder(SystemColor.textHighlight, 3));
            direccionParaGuardar.setBounds(165, 174, 415, 30);
            direccionParaGuardar.setVisible(false);
        }
        return direccionParaGuardar;
    }
    private JLabel getLblGuardarEn() {
        if (lblGuardarEn == null) {
            lblGuardarEn = new JLabel("Guardar en:");
            lblGuardarEn.setFont(new Font("Candara", Font.PLAIN, 15));
            lblGuardarEn.setBounds(165, 148, 297, 27);
            lblGuardarEn.setVisible(false);
        }
        return lblGuardarEn;
    }
    private JButton getButton_1() {
        if (btnBuscarRuta == null) {
            btnBuscarRuta = new JButton("...\r\n");
            btnBuscarRuta.setFocusable(false);
            btnBuscarRuta.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    JFileChooser fc = new JFileChooser();
                    FileNameExtensionFilter filtro = new FileNameExtensionFilter("TXT", "txt");
                    FileNameExtensionFilter filtro_2 = new FileNameExtensionFilter("PNG, JPG", "JPEG","jpg", "png","jpeg");
                    FileNameExtensionFilter filtro_3 = new FileNameExtensionFilter("ZIP", "zip");
                    FileNameExtensionFilter filtro_4 = new FileNameExtensionFilter("RAR", "rar");
                    FileNameExtensionFilter filtro_5 = new FileNameExtensionFilter("DOC", "doc", "docx");
                    FileNameExtensionFilter filtro_6 = new FileNameExtensionFilter("XLS", "xls");

                    fc.setFileFilter(filtro);
                    fc.setFileFilter(filtro_2);
                    fc.setFileFilter(filtro_3);
                    fc.setFileFilter(filtro_4);
                    fc.setFileFilter(filtro_5);
                    fc.setFileFilter(filtro_6);

                    fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

                    int seleccion = fc.showOpenDialog(rootPane);
                    if(seleccion == JFileChooser.APPROVE_OPTION){
                        File fichero = fc.getSelectedFile();
                        getDireccionParaLeer().setText(fichero.getAbsolutePath());
                    }

                }
            });
            btnBuscarRuta.setBorder(new LineBorder(new Color(0, 120, 215), 3));
            btnBuscarRuta.setBackground(Color.WHITE);
            btnBuscarRuta.setBounds(601, 82, 36, 30);
            btnBuscarRuta.setVisible(false);
        }
        return btnBuscarRuta;
    }
    private JButton getButton_1_1() {
        if (btnBuscarRutaGuard == null) {
            btnBuscarRutaGuard = new JButton("...");
            btnBuscarRutaGuard.setFocusable(false);
            btnBuscarRutaGuard.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    JFileChooser fc = new JFileChooser(direccionParaLeer.getText());
                    FileNameExtensionFilter filtro = new FileNameExtensionFilter("COD",".cod");

                    fc.setFileFilter(filtro);

                    fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);


                    int seleccion = fc.showSaveDialog(rootPane);
                    if(seleccion == JFileChooser.APPROVE_OPTION){
                        File fichero = fc.getSelectedFile();
                        getDireccionParaGuardar().setText(fichero.getAbsolutePath());
                    }
                }
            });
            btnBuscarRutaGuard.setBorder(new LineBorder(new Color(0, 120, 215), 3));
            btnBuscarRutaGuard.setBackground(Color.WHITE);
            btnBuscarRutaGuard.setBounds(601, 174, 36, 30);
            btnBuscarRutaGuard.setVisible(false);
        }
        return btnBuscarRutaGuard;
    }
    private JButton getBtnBuscarRuta_2() {
        if (btnBuscarRuta_2 == null) {
            btnBuscarRuta_2 = new JButton("...\r\n");
            btnBuscarRuta_2.setFocusable(false);
            btnBuscarRuta_2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    JFileChooser fc = new JFileChooser();
                    FileNameExtensionFilter filtro = new FileNameExtensionFilter("COD",".cod");

                    fc.setFileFilter(filtro);

                    int seleccion = fc.showSaveDialog(rootPane);
                    if(seleccion == JFileChooser.APPROVE_OPTION){
                        File fichero = fc.getSelectedFile();
                        getDireccionParaLeer().setText(fichero.getAbsolutePath());
                    }
                }
            });
            btnBuscarRuta_2.setBorder(new LineBorder(SystemColor.textHighlight, 3));
            btnBuscarRuta_2.setBackground(Color.WHITE);
            btnBuscarRuta_2.setBounds(601, 82, 36, 30);
            btnBuscarRuta_2.setVisible(false);
        }
        return btnBuscarRuta_2;
    }
    private JButton getBtnBuscarRutaGuard_2() {
        if (btnBuscarRutaGuard_2 == null) {
            btnBuscarRutaGuard_2 = new JButton("...");
            btnBuscarRutaGuard_2.setFocusable(false);
            btnBuscarRutaGuard_2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    JFileChooser fc = new JFileChooser(direccionParaLeer.getText());
                    FileNameExtensionFilter filtro = new FileNameExtensionFilter("TXT", "txt");
                    FileNameExtensionFilter filtro_2 = new FileNameExtensionFilter("PNG, JPG", "JPEG","jpg", "png","jpeg");
                    FileNameExtensionFilter filtro_3 = new FileNameExtensionFilter("ZIP", "zip");
                    FileNameExtensionFilter filtro_4 = new FileNameExtensionFilter("RAR", "rar");
                    FileNameExtensionFilter filtro_5 = new FileNameExtensionFilter("DOC", "doc", "docx");
                    FileNameExtensionFilter filtro_6 = new FileNameExtensionFilter("XLS", "xls");

                    fc.setFileFilter(filtro);
                    fc.setFileFilter(filtro_2);
                    fc.setFileFilter(filtro_3);
                    fc.setFileFilter(filtro_4);
                    fc.setFileFilter(filtro_5);
                    fc.setFileFilter(filtro_6);

                    fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

                    int seleccion = fc.showOpenDialog(rootPane);
                    if(seleccion == JFileChooser.APPROVE_OPTION){
                        File fichero = fc.getSelectedFile();
                        getDireccionParaGuardar().setText(fichero.getAbsolutePath());
                    }
                }
            });
            btnBuscarRutaGuard_2.setBorder(new LineBorder(SystemColor.textHighlight, 3));
            btnBuscarRutaGuard_2.setBackground(Color.WHITE);
            btnBuscarRutaGuard_2.setBounds(601, 174, 36, 30);
            btnBuscarRutaGuard_2.setVisible(false);
        }
        return btnBuscarRutaGuard_2;
    }
    private JButton getBtnAceptar() {
        if (btnAceptar == null) {
            btnAceptar = new JButton("Aceptar");
            btnAceptar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(btnAceptar.getText().equals("Comprimir")) {
                        try {
                            comprimir();
                        } catch (ClassNotFoundException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                    }else {
                        try {
                            descomprimir();
                        } catch (ClassNotFoundException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                    }
                }
            });
            btnAceptar.setFocusable(false);
            btnAceptar.setBorder(new LineBorder(new Color(0, 120, 215), 3, true));
            btnAceptar.setBackground(Color.WHITE);
            btnAceptar.setFont(new Font("Candara", Font.PLAIN, 15));
            btnAceptar.setBounds(511, 338, 113, 30);
            btnAceptar.setVisible(false);
        }
        return btnAceptar;
    }
    private void comprimir() throws ClassNotFoundException {
        try {
            File entrada = HuffmanBytes.HuffmanBytesCompress(new File(lblLeerDesde.getText()), lblGuardarEn.getText());
        }
        catch (StreamCorruptedException e) {
            System.out.println("Archivo corrupto o dañado");
        }
        catch (IOException  e) {
            System.out.println(e.getMessage());
        }
    }

    private void descomprimir() throws ClassNotFoundException {
        try {
            File salida = HuffmanBytes.HuffmanBytesCompress(new File(lblLeerDesde.getText()), lblGuardarEn.getText());
        }
        catch (StreamCorruptedException e) {
            System.out.println("Archivo corrupto o dañado");
        }
        catch (IOException  e) {
            System.out.println(e.getMessage());
        }
    }


}
