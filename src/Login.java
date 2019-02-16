import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField tf_id;
	private JTextField tf_pass;
	static Login frame ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			DataReader.readBooks();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(0, 204, 204));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		tf_id = new JTextField();
		tf_id.setBounds(338, 167, 86, 20);
		tf_id.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(tf_id);
		tf_id.setColumns(10);
		
		JLabel lblUserId = new JLabel("User ID:");
		lblUserId.setBounds(243, 170, 46, 14);
		panel.add(lblUserId);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(243, 212, 66, 20);
		panel.add(lblPassword);
		
		tf_pass = new JTextField();
		tf_pass.setHorizontalAlignment(SwingConstants.LEFT);
		tf_pass.setColumns(10);
		tf_pass.setBounds(338, 212, 86, 20);
		panel.add(tf_pass);
		
		JButton bt_submit = new JButton("Submit");
		bt_submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				AdminPanel a = new AdminPanel();
				 a.setVisible(true);
				    
				
			}
		});
		bt_submit.setBackground(new Color(51, 204, 153));
		bt_submit.setBounds(289, 266, 89, 23);
		panel.add(bt_submit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(193, 90, 276, 217);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(108, 27, 41, 19);
		panel_1.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
	}
}
