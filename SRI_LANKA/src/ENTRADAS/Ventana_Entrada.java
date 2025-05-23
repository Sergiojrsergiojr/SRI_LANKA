package ENTRADAS;

import java.awt.image.BufferedImage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;
import com.google.zxing.*;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import ENTRADAS.Ventana_1.*;

public class Ventana_Entrada extends JFrame {

private BufferedImage qrImage; // Guardamos la imagen generada para poder exportarla

	public Ventana_Entrada(String texto) 
	{
		//Título de la vetana
		setTitle("ENTRADA");
		//Logo para la ventana
		setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/Logo.png")).getImage());
		//Tamaño de la ventana
		setSize(1000, 450);
		//Tipo de cerrar la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		try 
		{
			int width = 250;
			int height = 250;
			// Crear la matriz QR
			BitMatrix bitMatrix = new MultiFormatWriter().encode(texto, BarcodeFormat.QR_CODE, width, height);
			qrImage = MatrixToImageWriter.toBufferedImage(bitMatrix);
			getContentPane().setLayout(null);
			// Mostrar la imagen
			JLabel qrLabel = new JLabel(new ImageIcon(qrImage));
			qrLabel.setBounds(553, 95, 404, 271);
			qrLabel.setHorizontalAlignment(SwingConstants.CENTER);
			getContentPane().add(qrLabel);
			// Botón de guardar
			JButton guardarBtn = new JButton("Guardar QR como PNG");
			guardarBtn.setBounds(0, 392, 986, 21);
			guardarBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					guardarImagen();
				}
			});

			getContentPane().add(guardarBtn);
			
			//Labels para los campos que se rellenan al generar la entrada
			JLabel lbltitulo_entrada = new JLabel("SRY LANKA");
			lbltitulo_entrada.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 30));
			lbltitulo_entrada.setBounds(390, 40, 239, 48);
			getContentPane().add(lbltitulo_entrada);

			JLabel lblNombre = new JLabel("NOMBRE  : " + Ventana_1.Nombre);
			lblNombre.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNombre.setBounds(359, 153, 495, 21);
			getContentPane().add(lblNombre);

			JLabel lblApellido = new JLabel("APELLIDO  : " + Ventana_1.Apellido);
			lblApellido.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblApellido.setBounds(359, 203, 495, 21);
			getContentPane().add(lblApellido);

			JLabel lblEdad = new JLabel("EDAD  : " + Ventana_1.Edad);
			lblEdad.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblEdad.setBounds(359, 254, 495, 21);
			getContentPane().add(lblEdad);

			JLabel lblCorreo = new JLabel("CORREO  : " + Ventana_1.Correo);
			lblCorreo.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblCorreo.setBounds(359, 300, 495, 21);
			getContentPane().add(lblCorreo);

			JLabel LogoEntrada = new JLabel("");

			//Imagen que se muestra en la entrada
			LogoEntrada.setIcon(new ImageIcon(Ventana_Entrada.class.getResource("/IMAGENES/Totem.png")));
			LogoEntrada.setBounds(28, 25, 316, 331);
			getContentPane().add(LogoEntrada);
			
			JLabel Fondoentrada = new JLabel("");
			Fondoentrada.setBounds(69, 41, 859, 315);
			Fondoentrada.setOpaque(true);
			Fondoentrada.setBackground(new Color(144, 238, 144));
			getContentPane().add(Fondoentrada);

			//Fondo de la entrada
			JLabel lblFondo = new JLabel("");
			lblFondo.setIcon(new ImageIcon(Ventana_Entrada.class.getResource("/IMAGENES/Fondo.png")));
			lblFondo.setBounds(0, 0, 1016, 425);
			getContentPane().add(lblFondo);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Error al generar el código QR.");
		}
	}

	private void guardarImagen() {

		JFileChooser selector = new JFileChooser();
		selector.setDialogTitle("Guardar imagen de la ventana");
		selector.setSelectedFile(new File("Entrada.png"));

		int opcion = selector.showSaveDialog(this);
		
		if (opcion == JFileChooser.APPROVE_OPTION) {
			File archivo = selector.getSelectedFile();

			try 
			{

				// Crear imagen del tamaño de la ventana
				BufferedImage imagenVentana = new BufferedImage(
					this.getWidth(),
					this.getHeight(),
					BufferedImage.TYPE_INT_ARGB
				);

				// Dibujar la ventana sobre la imagen
				Graphics2D g2d = imagenVentana.createGraphics();
				this.paint(g2d); // 'this' es el JFrame
				g2d.dispose();

				// Guardar la imagen
				ImageIO.write(imagenVentana, "png", archivo);
				JOptionPane.showMessageDialog(this, "Ventana guardada correctamente.");

			} catch (Exception ex) {

				ex.printStackTrace();
				JOptionPane.showMessageDialog(this, "Error al guardar la imagen.");
			}
		}
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {
			new Ventana_Entrada("https://www.ejemplo.com").setVisible(true);
		});
	}
}