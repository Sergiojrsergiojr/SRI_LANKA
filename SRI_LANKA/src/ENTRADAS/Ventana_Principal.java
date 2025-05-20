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
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
					Ventana_Principal frame = new Ventana_Principal();
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
    public Ventana_Principal() {
		setTitle("SRI LANKA");

		setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/Logo.png")).getImage());
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setBounds(0,0,1920,1080);
        // Panel con fondo escalado
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
        
        JLabel lbl_Nombre = new JLabel("SRI LANKA");
        lbl_Nombre.setBounds(861, 28, 245, 77);
        lbl_Nombre.setForeground(new Color(205, 133, 63));
        lbl_Nombre.setBackground(new Color(255, 255, 255));
        lbl_Nombre.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 64));
        contentPane.add(lbl_Nombre);
        
        JButton btn_comprar = new JButton("COMPRAR ENTRADAS");
        btn_comprar.setFont(new Font("Stencil", Font.PLAIN, 15));
        btn_comprar.setBackground(new Color(255, 255, 255));
        btn_comprar.addActionListener(new ActionListener() 
        {
        	public void actionPerformed(ActionEvent e) 
        	{
        		Ventana_1 venta= new Ventana_1();
        		venta.setVisible(true);        	
        	}
        });
        
        btn_comprar.setBounds(906, 800, 200, 50);
        contentPane.add(btn_comprar);
        
        JTextArea txt_Intro = new JTextArea();
        txt_Intro.setFont(new Font("Algerian", Font.PLAIN, 20));
        txt_Intro.setEnabled(false);
        txt_Intro.setText(" Bienvenidos a SRI LANKA – La experiencia nocturna que estabas esperando \r\n\r\nSumérgete en un paraíso de música, luces y energía sin límites. SRI LANKA no es solo una discoteca, es un viaje sensorial donde la fiesta cobra vida en cada rincón. Inspirada en el exotismo y la vibra tropical de su nombre, nuestra sala te transporta a un ambiente único, con los mejores DJs, espectáculos en vivo, coctelería de autor y un público que vibra al ritmo de la noche.\r\n\r\nCada fin de semana, abrimos las puertas a una experiencia diferente: sets explosivos, artistas invitados y un ambiente exclusivo que no encontrarás en ningún otro lugar. Ya sea que vengas a celebrar, a bailar o simplemente a vivir la noche, en SRI LANKA cada instante es inolvidable.\r\n\r\n ¡Compra ya tus entradas y asegura tu lugar en la pista!\r\nNo te quedes fuera del epicentro de la fiesta. Los cupos son limitados y las noches en SRI LANKA son leyenda.\r\n\r\n👉 Reserva ahora. Vive el ritmo. Siente la jungla.\r\nSRI LANKA – Donde la noche se convierte en aventura.\r\n\r\n");
        txt_Intro.setOpaque(false);
        txt_Intro.setBackground(new Color(0,0,0,0));
        txt_Intro.setForeground(new Color(255, 255, 255));
        txt_Intro.setBounds(688, 175, 636, 561);
        contentPane.add(txt_Intro);
        txt_Intro.setLineWrap(true);
        txt_Intro.setWrapStyleWord(true);
        
        JLabel lbl_totem_izq = new JLabel("");
        lbl_totem_izq.setIcon(new ImageIcon(Ventana_Principal.class.getResource("/IMAGENES/Totem.png")));
        lbl_totem_izq.setBounds(110, 150, 360, 371);
        contentPane.add(lbl_totem_izq);
       
        JLabel lbl_totem_der = new JLabel("");
        lbl_totem_der.setIcon(new ImageIcon(Ventana_Principal.class.getResource("/IMAGENES/Totem.png")));
        lbl_totem_der.setBounds(1460, 150, 360, 371);
        contentPane.add(lbl_totem_der);
    }
}
