package ENTRADAS;

import static ENTRADAS.Ventana_1.Apellido;
import static ENTRADAS.Ventana_1.Correo;
import static ENTRADAS.Ventana_1.Edad;
import static ENTRADAS.Ventana_1.Nombre;
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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

	public class Ventana_sabado extends JFrame
	{
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		public static String Dia="Sabado";
		public static int Precio;

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
						Ventana_sabado frame = new Ventana_sabado();
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
		public Ventana_sabado()
		{
			//Título de la ventana
			setTitle("SRI LANKA");
			//Logo para la ventana
			setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/Logo.png")).getImage());
			//Tipo de cerrar la ventana
			setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			//Tamaño de la ventana
			setBounds(0, 0, 1920, 1080);
			contentPane = new JPanel()
		{
			//Fondo de la ventana
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

		JLabel lbl_entrada_sabado = new JLabel("ENTRADA SÁBADO");
		lbl_entrada_sabado.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 64));
		lbl_entrada_sabado.setBounds(702, 40, 499, 77);
		lbl_entrada_sabado.setForeground(new Color(205, 133, 63));
		contentPane.add(lbl_entrada_sabado);

		//Labels para las opciones que ofrece con información y su precio
		JLabel lbl_consumicion = new JLabel("CONSUMICIONES");
		lbl_consumicion.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lbl_consumicion.setBounds(730, 172, 198, 34);
		lbl_consumicion.setForeground(new Color(205,133,63));
		contentPane.add(lbl_consumicion);

		JLabel lbl_listas = new JLabel("LISTAS GRATIS");
		lbl_listas.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lbl_listas.setBounds(730, 359, 163, 34);
		lbl_listas.setForeground(new Color(205,133,63));
		contentPane.add(lbl_listas);

		JLabel lbl_mesasvip_sabado = new JLabel("MESAS VIP");
		lbl_mesasvip_sabado.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		lbl_mesasvip_sabado.setBounds(730, 495, 153, 46);
		lbl_mesasvip_sabado.setForeground(new Color(205,133,63));
		contentPane.add(lbl_mesasvip_sabado);

		JLabel lbl_1consu_sabado = new JLabel("1 CONSUMICIÓN");
		lbl_1consu_sabado.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lbl_1consu_sabado.setBounds(730, 232, 130, 23);
		lbl_1consu_sabado.setForeground(new Color(205,133,63));
		contentPane.add(lbl_1consu_sabado);

		JLabel lbl_2consu_sabado = new JLabel("2 CONSUMICIONES");
		lbl_2consu_sabado.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lbl_2consu_sabado.setBounds(730, 291, 153, 23);
		lbl_2consu_sabado.setForeground(new Color(205,133,63));
		contentPane.add(lbl_2consu_sabado);

		JLabel lbl_horario_1consu_sabado = new JLabel("1 CONSUMICIÓN hasta la 01:30h, luego solo acceso");
		lbl_horario_1consu_sabado.setBounds(730, 266, 331, 14);
		lbl_horario_1consu_sabado.setForeground(new Color(205,133,63));
		contentPane.add(lbl_horario_1consu_sabado);

		JLabel lbl_horario_2consu_sabado = new JLabel("2 CONSUMICIONES hasta la 01:30h, luego solo 1 CONSUMICIÓN");
		lbl_horario_2consu_sabado.setBounds(730, 325, 382, 14);
		lbl_horario_2consu_sabado.setForeground(new Color(205,133,63));
		contentPane.add(lbl_horario_2consu_sabado);

		JButton btn_comprar_1consu_sabado = new JButton("15€ COMPRAR");
		btn_comprar_1consu_sabado.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
				Precio=15;
				//Conexión a la base de datos
				ConexionMySQL x= new ConexionMySQL("root", "", "sri_lanka");
				x.conectar();
				String sentencia="INSERT INTO entradas(Nombre,Apellido,Edad,Correo,Dia,TipoEntrada) VALUES ('"+Nombre+"','"+Apellido+"','"+Edad+"','"+Correo+"','"+Dia+"','"+Precio+"')";
				x.ejecutarInsertDeleteUpdate(sentencia);
				x.desconectar();
				}
				catch (SQLException ex)
				{
					ex.printStackTrace();
				}
					Ventana_Pago venta= new Ventana_Pago();
					venta.setVisible(true);
					dispose();
			}
		});
		
		btn_comprar_1consu_sabado.setBounds(1112, 262, 121, 27);
		contentPane.add(btn_comprar_1consu_sabado);

		JButton btn_comprar_2consu_sabado = boton20euros();
		btn_comprar_2consu_sabado.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					Precio=20;
					//Conexión a la base de datos
					ConexionMySQL x= new ConexionMySQL("root", "", "sri_lanka");
					x.conectar();
					String sentencia="INSERT INTO entradas(Nombre,Apellido,Edad,Correo,Dia,TipoEntrada) VALUES ('"+Nombre+"','"+Apellido+"','"+Edad+"','"+Correo+"','"+Dia+"','"+Precio+"')";
					x.ejecutarInsertDeleteUpdate(sentencia);
					x.desconectar();
				}
				catch (SQLException ex)
				{
				ex.printStackTrace();
				}
			
				Ventana_Pago venta= new Ventana_Pago();
				venta.setVisible(true);
				dispose();
			}
		});
		
		btn_comprar_2consu_sabado.setBounds(1112, 321, 121, 27);
		contentPane.add(btn_comprar_2consu_sabado);

		JButton btn_qr_comprar_sabado = new JButton("COMPRAR GRATIS");
		btn_qr_comprar_sabado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//Imagen para que al comprar la entrada gartis salga en el JOptionPane
				ImageIcon icono=new ImageIcon(getClass().getResource("/IMAGENES/pulgalcito.jpg"));
				//Configuracuión del mensaje para el JOptionPane
				String mensaje="Entrada comprada correctamente";
				String titulo="ACEPTADO";
				JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE, icono);
			}
		});
		
		btn_qr_comprar_sabado.setBounds(1112, 448, 140, 27);
		contentPane.add(btn_qr_comprar_sabado);

		JLabel lbl_qr_sabado = new JLabel("QR GRATIS");
		lbl_qr_sabado.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lbl_qr_sabado.setBounds(730, 417, 130, 23);
		lbl_qr_sabado.setForeground(new Color(205,133,63));
		contentPane.add(lbl_qr_sabado);

		JLabel lbl_horario_qr_sabado = new JLabel("QR GRATIS hasta las 00:30h");
		lbl_horario_qr_sabado.setBounds(730, 452, 177, 14);
		lbl_horario_qr_sabado.setForeground(new Color(205,133,63));
		contentPane.add(lbl_horario_qr_sabado);

		//Label para mostrar la imagen del mapa de la discoteca
		JLabel lbl_mapeo = new JLabel("New label");
		lbl_mapeo.setIcon(new ImageIcon(Ventana_viernes.class.getResource("/IMAGENES/mapeo.png")));
		lbl_mapeo.setBounds(730, 558, 425, 412);
		contentPane.add(lbl_mapeo);

		JButton btn_comprar_verdes = new JButton("250€ COMPRAR");
		btn_comprar_verdes.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					Precio=250;
					//Conexión a la base de datos
					ConexionMySQL x= new ConexionMySQL("root", "", "sri_lanka");
					x.conectar();
					String sentencia="INSERT INTO entradas(Nombre,Apellido,Edad,Correo,Dia,TipoEntrada) VALUES ('"+Nombre+"','"+Apellido+"','"+Edad+"','"+Correo+"','"+Dia+"','"+Precio+"')";
					x.ejecutarInsertDeleteUpdate(sentencia);
					x.desconectar();
				}
				catch (SQLException ex)
				{
					ex.printStackTrace();
				}
			
				Ventana_Pago venta= new Ventana_Pago();
				venta.setVisible(true);
				dispose();
		}
	});
		
		btn_comprar_verdes.setBounds(1165, 679, 140, 27);
		contentPane.add(btn_comprar_verdes);

		JButton btn_comprar_negras = new JButton("500€ COMPRAR\r\n");
		btn_comprar_negras.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{			
					Precio=500;
					//Conexión a la base datos
					ConexionMySQL x= new ConexionMySQL("root", "", "sri_lanka");
					x.conectar();
					String sentencia="INSERT INTO entradas(Nombre,Apellido,Edad,Correo,Dia,TipoEntrada) VALUES ('"+Nombre+"','"+Apellido+"','"+Edad+"','"+Correo+"','"+Dia+"','"+Precio+"')";
					x.ejecutarInsertDeleteUpdate(sentencia);
					x.desconectar();
				}
				catch (SQLException ex)
				{
					ex.printStackTrace();
				}
			
				Ventana_Pago venta= new Ventana_Pago();
				venta.setVisible(true);
				dispose();
			}
		});
		
		btn_comprar_negras.setBounds(1163, 753, 140, 27);
		contentPane.add(btn_comprar_negras);

		//Labels para mostrar las imagenes de los laterales
		JLabel lbl_totem_izq = new JLabel("");
		lbl_totem_izq.setIcon(new ImageIcon(Ventana_Principal.class.getResource("/IMAGENES/Totem.png")));
		lbl_totem_izq.setBounds(110, 150, 360, 371);
		contentPane.add(lbl_totem_izq);
       
		JLabel lbl_totem_der = new JLabel("");
		lbl_totem_der.setIcon(new ImageIcon(Ventana_Principal.class.getResource("/IMAGENES/Totem.png")));
		lbl_totem_der.setBounds(1460, 150, 360, 371);
		contentPane.add(lbl_totem_der);
		}

		private JButton boton20euros() {
			JButton btn_comprar_2consu_sabado = new JButton("20€ COMPRAR");
			return btn_comprar_2consu_sabado;
		}
	}
