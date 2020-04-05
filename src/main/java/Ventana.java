
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import efectos.MaterialShadow;
import utils.MaterialButtomRectangle;
import utils.MaterialButton;
import utils.MaterialButtonCircle;
import utils.MaterialTextField;

@SuppressWarnings("all")

public class Ventana extends javax.swing.JFrame implements ActionListener, ChangeListener {

	public Ventana() {
		setTitle("Material Design");
		setType(Type.UTILITY);
		initComponents();
		this.setVisible(true);

	}

	private void initComponents() {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		setResizable(false);

		MaterialShadow test = new MaterialShadow();

		MaterialButtonCircle btnNewButton = new MaterialButtonCircle();
		btnNewButton.setText("Text 1");
		btnNewButton.setBackground(Color.WHITE);

		MaterialButtomRectangle btnNewButton_2 = new MaterialButtomRectangle();
		btnNewButton_2.setText("Text 2");
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);

		MaterialButton btnNewButton_1 = new MaterialButton();
		btnNewButton_1.setText("Text 3");
		btnNewButton_1.setBackground(Color.CYAN);

		MaterialTextField btnNewButton_3 = new MaterialTextField();
		btnNewButton_3.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_3.setText("Text 4");
		btnNewButton_3.setBackground(Color.ORANGE);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(20)
				.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnNewButton_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
				.addGap(31)
				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(71, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);
		setSize(new Dimension(317, 305));
		setLocationRelativeTo(null);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
