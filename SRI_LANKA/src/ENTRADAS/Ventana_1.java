package ENTRADAS;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class Ventana_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_1 frame = new Ventana_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
    public Ventana_1() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setExtendedState(this.MAXIMIZED_BOTH);
        // Panel con fondo escalado
        contentPane = new JPanel() {
            private static final long serialVersionUID = 1L;
            private Image backgroundImage = new ImageIcon(
                Ventana_1.class.getResource("/IMAGENES/Fondo.png")).getImage();
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibuja la imagen escalada al tamaño del panel
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                
               
            }
        };
        
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        JLabel lbl_Nombre = new JLabel("SRI LANKA");
        lbl_Nombre.setForeground(new Color(0, 0, 0));
        lbl_Nombre.setBackground(new Color(255, 255, 255));
        lbl_Nombre.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 64));
        contentPane.add(lbl_Nombre);
    }

}
