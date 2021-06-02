package fp.daw.exprog20210602.ejercicio4;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio4 extends JFrame {
	private static Integer pulsaciones = 0;

	public Ejercicio4() {
		super("Examen 3ª Evaluación –Ejercicio 4");
		JButton b = new JButton("Pulsa aquí");
		b.addActionListener(new Runnable() {
			public void run() {
				

			}
		});
		getContentPane().add(BorderLayout.NORTH, b);
		JLabel e1 = new JLabel();
		getContentPane().add(BorderLayout.CENTER, e1);
		JLabel e2 = new JLabel("Reiniciar");
		getContentPane().add(BorderLayout.SOUTH, e2);

	}

}
