package ENTRADAS;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_1 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Ventana_1 frame = new Ventana_1();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Ventana_1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,1920,1080);
        // Panel con fondo escalado
        contentPane = new JPanel() {
            private static final long serialVersionUID = 1L;
            private Image backgroundImage = new ImageIcon(
                Ventana_1.class.getResource("/imagenes/Fondo SRY_LANKA.png")).getImage();

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

        // Puedes agregar otros componentes encima del fondo
        
        JLabel lbl_Titulo = new JLabel("SRY LANKA");
        lbl_Titulo.setBounds(693, 82, 160, 78);
        lbl_Titulo.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 34));
        contentPane.add(lbl_Titulo);
        
        JButton btnNewButton = new JButton("New button");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	Ventana_2 venta=new Ventana_2();
        	venta.setVisible(true);
        	}
        });
        btnNewButton.setBounds(764, 522, 89, 23);
        contentPane.add(btnNewButton);
    }
}
