package ENTRADAS;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_Pago extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_nº_tarjeta;
	private JTextField textField_caducidad;
	private JTextField textField_cvc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Ventana_Pago frame = new Ventana_Pago();
					frame.setVisible(true);
				} 
				
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana_Pago() {
		setTitle("SRI LANKA");
		
		setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/Logo.png")).getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1920,1080);
		contentPane = new JPanel() 
		{
			private static final long serialVersionUID = 1L;
			private Image backgroundImage = new ImageIcon(
	            Ventana_Principal.class.getResource("/IMAGENES/Fondo.png")).getImage();
			@Override
			 protected void paintComponent(Graphics g) 
			{
                super.paintComponent(g);
                // Dibuja la imagen escalada al tamaño del panel
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);  
            }
        };
        
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_pago = new JLabel("PAGO CON TARJETA");
		lbl_pago.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 64));
		lbl_pago.setBounds(702, 40, 499, 77);
		lbl_pago.setForeground(new Color(205, 133, 63));
		contentPane.add(lbl_pago);
		
		JLabel lbl_nº_tarjeta = new JLabel("Nº DE TARJETA:");
		lbl_nº_tarjeta.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lbl_nº_tarjeta.setBounds(730, 172, 130, 34);
		lbl_nº_tarjeta.setForeground(new Color(205,133,63));
		contentPane.add(lbl_nº_tarjeta);
		
		JLabel lbl_caducidad = new JLabel("CADUCIDAD DE LA TARJETA:");
		lbl_caducidad.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lbl_caducidad.setBounds(730, 304, 230, 34);
		lbl_caducidad.setForeground(new Color(205,133,63));
		contentPane.add(lbl_caducidad);
		
		JLabel lbl_cvc = new JLabel("CVC:");
		lbl_cvc.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lbl_cvc.setBounds(730, 429, 60, 34);
		lbl_cvc.setForeground(new Color(205,133,63));
		contentPane.add(lbl_cvc);
		
		textField_nº_tarjeta = new JTextField();
		textField_nº_tarjeta.setBounds(730, 231, 160, 30);
		contentPane.add(textField_nº_tarjeta);
		textField_nº_tarjeta.setColumns(10);
		
		textField_caducidad = new JTextField();
		textField_caducidad.setBounds(730, 357, 120, 30);
		contentPane.add(textField_caducidad);
		textField_caducidad.setColumns(10);
		
		textField_cvc = new JTextField();
		textField_cvc.setBounds(730, 484, 86, 30);
		contentPane.add(textField_cvc);
		textField_cvc.setColumns(10);
		
		JButton btn_terminar = new JButton("REALIZAR PAGO");
		btn_terminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono=new ImageIcon(getClass().getResource("/IMAGENES/pulgalcito.jpg"));
				String mensaje="Entrada comprada correctamente";
				String titulo="ACEPTADO";
				JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE, icono);
			}
		});
		btn_terminar.setFont(new Font("Stencil", Font.PLAIN, 15));
		btn_terminar.setBounds(761, 618, 200, 50);
		btn_terminar.setBackground(new Color(255, 255, 255));
		contentPane.add(btn_terminar);
	}
}
