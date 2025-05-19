package ENTRADA;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Ventana_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textCorreo;
	private JTextField textEdad;
	

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
		setTitle("SRI LANKA");

		setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/Logo.png")).getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,1920,1080);
        // Panel con fondo escalado
        contentPane = new JPanel() {
            private static final long serialVersionUID = 1L;
            private Image backgroundImage = new ImageIcon(
                Ventana_Principal.class.getResource("/IMAGENES/Fondo.png")).getImage();
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibuja la imagen escalada al tamaño del panel
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                
               
            }
        };
        
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lbl_Nombre = new JLabel("SRI LANKA");
        lbl_Nombre.setBounds(861, 28, 245, 77);
        lbl_Nombre.setForeground(new Color(205, 133, 63));
        lbl_Nombre.setBackground(new Color(255, 255, 255));
        lbl_Nombre.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 64));
        contentPane.add(lbl_Nombre);
        
        JButton btn_registrar = new JButton("CONTINUAR");
        btn_registrar.setFont(new Font("Stencil", Font.PLAIN, 15));
        btn_registrar.setBackground(new Color(255, 255, 255));
        btn_registrar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) 
        	{
        		try
        		{
        			int edad = Integer.parseInt(textEdad.getText().trim()); // Conversión a int
        	        if (edad < 18) 
        	        {
        	        	 String mensaje = "Debes de ser mayor de edad";
        	             String titulo = "ERROR";
        	             JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);

        	        } else 
        	        {
        	            Ventana_2 venta = new Ventana_2();
        	            venta.setVisible(true);
        	            	
        	        }
        		}
        		catch (NumberFormatException ex) 
        		{
        	        JOptionPane.showMessageDialog(null, "Por favor introduce una edad válida (número).");
        	    }	
        	}
        });
        btn_registrar.setBounds(908, 795, 200, 50);
        contentPane.add(btn_registrar);
        
        JLabel lbl_texto_Nombre = new JLabel("INTRODUCIR NOMBRE:");
        lbl_texto_Nombre.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
        lbl_texto_Nombre.setForeground(new Color(205, 133, 63));
        lbl_texto_Nombre.setBounds(631, 237, 263, 29);
        contentPane.add(lbl_texto_Nombre);
        
        textNombre = new JTextField();
        textNombre.setBounds(1161, 246, 214, 29);
        contentPane.add(textNombre);
        textNombre.setColumns(10);
        
        textApellido = new JTextField();
        textApellido.setBounds(1161, 329, 220, 29);
        contentPane.add(textApellido);
        textApellido.setColumns(10);
        
        JLabel lbl_texto_Apellido = new JLabel("INTRODUCIR APELLIDOS: ");
        lbl_texto_Apellido.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
        lbl_texto_Apellido.setBounds(631, 322, 263, 35);
        lbl_texto_Apellido.setForeground(new Color(205, 133, 63));
        contentPane.add(lbl_texto_Apellido);
        
        JLabel lbl_texto_correo = new JLabel("INTRODUCIR CORREO ELECTRONICO:");
        lbl_texto_correo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
        lbl_texto_correo.setForeground(new Color(205, 133, 63));
        lbl_texto_correo.setBounds(632, 525, 399, 50);
        contentPane.add(lbl_texto_correo);
        
        textCorreo = new JTextField();
        textCorreo.setBounds(1161, 540, 220, 29);
        contentPane.add(textCorreo);
        textCorreo.setColumns(10);
        
        textEdad = new JTextField();
        textEdad.setBounds(1161, 441, 72, 29);
        contentPane.add(textEdad);
        textEdad.setColumns(10);
        
        JLabel lbl_texto_Edad = new JLabel("INTRODUCIR EDAD:");
        lbl_texto_Edad.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
        lbl_texto_Edad.setForeground(new Color(205, 133, 63));
        lbl_texto_Edad.setBounds(631, 426, 276, 50);
        contentPane.add(lbl_texto_Edad);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(Ventana_1.class.getResource("/IMAGENES/Totem.png")));
        lblNewLabel.setBounds(158, 302, 382, 373);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon(Ventana_1.class.getResource("/IMAGENES/Totem.png")));
        lblNewLabel_1.setBounds(1491, 302, 382, 373);
        contentPane.add(lblNewLabel_1);
    }
}