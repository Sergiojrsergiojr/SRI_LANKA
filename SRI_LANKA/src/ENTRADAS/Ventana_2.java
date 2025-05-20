package ENTRADAS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lbl_Jueves;
	private JLabel lbl_Viernes;
	private JLabel lbl_Sabado;
	private JLabel lbl_Nombre;
	private JButton btn_Jueves;
	private JButton btn_Viernes;
	private JButton btn_Sabado;
	private JLabel lbl_info_jueves;
	private JLabel lbl_img_viernes;
	private JLabel lbl_info_viernes;
	private JLabel lbl_img_sabado;
	private JLabel lbl_info_sabado;
	private JLabel lbl_condiciones;
	private JLabel lbl_privacidad;

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
					Ventana_2 frame = new Ventana_2();
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
	public Ventana_2() {
		setTitle("SRI LANKA");
		
		setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/Logo.png")).getImage());
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
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
		
		lbl_Jueves = new JLabel("JUEVES\r\n");
		lbl_Jueves.setForeground(new Color(205, 133, 63));
		lbl_Jueves.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lbl_Jueves.setBounds(730, 181, 162, 25);
		contentPane.add(lbl_Jueves);
		
		lbl_Viernes = new JLabel("VIERNES");
		lbl_Viernes.setForeground(new Color(205, 133, 63));
		lbl_Viernes.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lbl_Viernes.setBounds(730, 346, 114, 25);
		contentPane.add(lbl_Viernes);
		
		lbl_Sabado = new JLabel("SÁBADO");
		lbl_Sabado.setForeground(new Color(205, 133, 63));
		lbl_Sabado.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lbl_Sabado.setBounds(730, 519, 101, 34);
		contentPane.add(lbl_Sabado);
		
		lbl_Nombre = new JLabel("VENTA DE ENTRADAS");
		lbl_Nombre.setForeground(new Color(205,133,63));
		lbl_Nombre.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 64));
		lbl_Nombre.setBackground(Color.WHITE);
		lbl_Nombre.setBounds(702, 40, 499, 77);
		contentPane.add(lbl_Nombre);
		
		btn_Jueves = new JButton("PULSE AQUÍ");
		btn_Jueves.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Ventana_jueves venta= new Ventana_jueves();
				venta.setVisible(true);
			}
		});
		
		btn_Jueves.setFont(new Font("Stencil", Font.PLAIN, 15));
		btn_Jueves.setBounds(902, 188, 200, 50);
		contentPane.add(btn_Jueves);
		
		btn_Viernes = new JButton("PULSE AQUÍ");
		btn_Viernes.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Ventana_viernes venta= new Ventana_viernes();
				venta.setVisible(true);
			}
		});
		
		btn_Viernes.setFont(new Font("Stencil", Font.PLAIN, 15));
		btn_Viernes.setBounds(902, 340, 200, 50);
		contentPane.add(btn_Viernes);
		
		btn_Sabado = new JButton("PULSE AQUÍ");
		btn_Sabado.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Ventana_sabado venta= new Ventana_sabado();
				venta.setVisible(true);
			}
		});
		
		btn_Sabado.setFont(new Font("Stencil", Font.PLAIN, 15));
		btn_Sabado.setBounds(902, 518, 200, 50);
		contentPane.add(btn_Sabado);
		
		JLabel lbl_img_jueves = new JLabel("New label");
		lbl_img_jueves.setIcon(new ImageIcon(Ventana_2.class.getResource("/IMAGENES/Captura de pantalla 2025-05-12 140545.png")));
		lbl_img_jueves.setBounds(639, 176, 81, 115);
		contentPane.add(lbl_img_jueves);
		
		lbl_info_jueves = new JLabel("<html>HORARIO: 00:00h-06:00h<br>EDAD: +18<br>SRI LANKA 📍</html>");
		lbl_info_jueves.setBounds(730, 217, 140, 59);
		lbl_info_jueves.setForeground(new Color(205, 133, 63));
		contentPane.add(lbl_info_jueves);
		
		lbl_img_viernes = new JLabel("New label");
		lbl_img_viernes.setIcon(new ImageIcon(Ventana_2.class.getResource("/IMAGENES/Captura de pantalla 2025-05-12 140545.png")));
		lbl_img_viernes.setBounds(639, 346, 81, 115);
		contentPane.add(lbl_img_viernes);
		
		lbl_info_viernes = new JLabel("<html>HORARIO: 00:00h-06:00h<br>EDAD: +18<br>SRI LANKA 📍</html>");
		lbl_info_viernes.setForeground(new Color(205, 133, 63));
		lbl_info_viernes.setBounds(730, 382, 140, 59);
		contentPane.add(lbl_info_viernes);
		
		lbl_img_sabado = new JLabel("New label");
		lbl_img_sabado.setIcon(new ImageIcon(Ventana_2.class.getResource("/IMAGENES/Captura de pantalla 2025-05-12 140545.png")));
		lbl_img_sabado.setBounds(639, 519, 81, 115);
		contentPane.add(lbl_img_sabado);
		
		lbl_info_sabado = new JLabel("<html>HORARIO: 00:00h-06:00h<br>EDAD: +18<br>SRI LANKA 📍</html>");
		lbl_info_sabado.setForeground(new Color(205, 133, 63));
		lbl_info_sabado.setBounds(730, 564, 140, 59);
		contentPane.add(lbl_info_sabado);
		
		lbl_condiciones = new JLabel("<html>Condiciones de Acceso<br>- En SRI LANKA, nos reservamos el derecho de admisión. Para garantizar la mejor experiencia a nuestros asistentes, aplicamos las siguientes condiciones:<br>Edad mínima: 18 años (con identificación oficial vigente).<br>- Vestimenta: No se permite ropa deportiva, chanclas ni atuendos ofensivos.<br>- Estado: No se admiten personas bajo efectos de alcohol o sustancias ilícitas.<br>- Objetos prohibidos: No se permite ingresar con armas, drogas, alimentos o bebidas externas.<br>- Conducta: Actitudes violentas o irrespetuosas no serán toleradas.<br>- Grabaciones: Podrían tomarse imágenes o videos con fines promocionales.</html>");
		lbl_condiciones.setBounds(1318, 214, 309, 378);
		lbl_condiciones.setForeground(new Color(255, 255, 255));
		lbl_condiciones.setFont(new Font("Algerian", Font.PLAIN, 20));
		contentPane.add(lbl_condiciones);
		
		lbl_privacidad = new JLabel("<html>Política de Privacidad:<br>En SRI LANKA, valoramos tu privacidad y protegemos tus datos.<br>- Recopilamos información solo para fines operativos y promocionales (reservas, listas, sorteos).<br>- Tus datos no serán compartidos con terceros sin tu consentimiento.<br>- Puedes ejercer tus derechos de acceso, rectificación o eliminación escribiéndonos a: privacidad@srilanka.com.<br>- Contamos con cámaras de videovigilancia por razones de seguridad.");
		lbl_privacidad.setForeground(Color.WHITE);
		lbl_privacidad.setFont(new Font("Algerian", Font.PLAIN, 20));
		lbl_privacidad.setBounds(97, 181, 359, 529);
		contentPane.add(lbl_privacidad);
	}
}
