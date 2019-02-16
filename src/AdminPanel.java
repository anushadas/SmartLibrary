

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.eclipse.wb.swing.FocusTraversalOnArray;


public class AdminPanel extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	private JTextField textField_7;
	private JTextField textField_8;


	/**
	 * Create the frame.
	 */
	public AdminPanel() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 153, 204));
		panel_1.setBounds(176, 0, 420, 28);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblWelcome = new JLabel("HOME");
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWelcome.setBounds(130, 8, 80, 12);
		panel_1.add(lblWelcome);
		
		JLabel lblAdminname = new JLabel("Admin-Name");
		lblAdminname.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminname.setBounds(302, 0, 118, 27);
		panel_1.add(lblAdminname);
		lblAdminname.setForeground(new Color(0, 0, 0));
		
		JLabel lblAdminicon = new JLabel("Admin-icon");
		lblAdminicon.setBackground(Color.WHITE);
		lblAdminicon.setBounds(249, 0, 80, 26);
		panel_1.add(lblAdminicon);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(new Color(51, 153, 255));
		panel_2.setBounds(0, 0, 177, 453);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(51, 153, 255));
		panel_3.setBounds(0, 0, 177, 28);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setBounds(10, 11, 42, 17);
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMenu.setForeground(new Color(255, 255, 255));
		panel_3.add(lblMenu);
		lblMenu.setBackground(new Color(255, 255, 255));
		panel_3.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblMenu}));
		
		JButton btnNewButton = new JButton("Add / Remove BOOK ");
		btnNewButton.setForeground(Color.WHITE);
		
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setBackground(new Color(51, 153, 255));
		btnNewButton.setBounds(0, 48, 177, 40);
		panel_2.add(btnNewButton);
		
		JButton btnViewCatalog = new JButton("View Catalogue");
		btnViewCatalog.setForeground(Color.WHITE);
		btnViewCatalog.setHorizontalAlignment(SwingConstants.LEFT);
		btnViewCatalog.setBackground(new Color(51, 153, 255));
		btnViewCatalog.setBounds(0, 86, 177, 40);
		panel_2.add(btnViewCatalog);
		
		JButton btnSerachCataloge = new JButton("Search Book");
		btnSerachCataloge.setForeground(Color.WHITE);
		btnSerachCataloge.setHorizontalAlignment(SwingConstants.LEFT);
		btnSerachCataloge.setBackground(new Color(51, 153, 255));
		btnSerachCataloge.setBounds(0, 123, 177, 40);
		panel_2.add(btnSerachCataloge);
		
		JButton btnCheckInout = new JButton("Check IN / OUT ");
		btnCheckInout.setForeground(Color.WHITE);
		btnCheckInout.setHorizontalAlignment(SwingConstants.LEFT);
		btnCheckInout.setBackground(new Color(51, 153, 255));
		btnCheckInout.setBounds(0, 162, 177, 40);
		panel_2.add(btnCheckInout);
		
		JButton btnIssuedBooks = new JButton("Issued Books");
		btnIssuedBooks.setForeground(Color.WHITE);
		btnIssuedBooks.setHorizontalAlignment(SwingConstants.LEFT);
		btnIssuedBooks.setBackground(new Color(51, 153, 255));
		btnIssuedBooks.setBounds(0, 201, 177, 40);
		panel_2.add(btnIssuedBooks);
		
		JButton btnStudnetRecords = new JButton("Student Records");
		btnStudnetRecords.setForeground(Color.WHITE);
		btnStudnetRecords.setHorizontalAlignment(SwingConstants.LEFT);
		btnStudnetRecords.setBackground(new Color(51, 153, 255));
		btnStudnetRecords.setBounds(0, 238, 177, 40);
		panel_2.add(btnStudnetRecords);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.WHITE);
		btnExit.setHorizontalAlignment(SwingConstants.LEFT);
		btnExit.setBackground(new Color(51, 153, 255));
		btnExit.setBounds(0, 276, 177, 40);
		panel_2.add(btnExit);
		
		Panel panel_4 = new Panel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(176, 34, 420, 425);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		String[] choices = { "Title","Author", "Book ID"};
		String[] choices2 = { "Year","Subject"};
		
		
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Panel Add_panel = new Panel();
				Add_panel.setBackground(SystemColor.inactiveCaptionBorder);
				Add_panel.setBounds(44, 10, 324, 251);
				panel_4.add(Add_panel);
				Add_panel.setLayout(null);
				
				textField = new JTextField();
				textField.setBounds(192, 53, 86, 20);
				Add_panel.add(textField);
				textField.setColumns(10);
				
				JLabel lblTitle = new JLabel("Title:");
				lblTitle.setBounds(75, 53, 46, 14);
				Add_panel.add(lblTitle);
				
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(192, 79, 86, 20);
				Add_panel.add(textField_1);
				
				JLabel lblBookId = new JLabel("Book ID:");
				lblBookId.setBounds(75, 79, 46, 14);
				Add_panel.add(lblBookId);
				
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(192, 107, 86, 20);
				Add_panel.add(textField_2);
				
				JLabel lblAuthor = new JLabel("Author:");
				lblAuthor.setBounds(75, 107, 46, 14);
				Add_panel.add(lblAuthor);
				
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBounds(192, 134, 86, 20);
				Add_panel.add(textField_3);
				
				JLabel lblGenere = new JLabel("Subject:");
				lblGenere.setBounds(75, 134, 46, 14);
				Add_panel.add(lblGenere);
				
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(192, 162, 86, 20);
				Add_panel.add(textField_4);
				
				JLabel lblIsbn = new JLabel("ISBN:");
				lblIsbn.setBounds(75, 162, 46, 14);
				Add_panel.add(lblIsbn);
				
				textField_5 = new JTextField();
				textField_5.setColumns(10);
				textField_5.setBounds(192, 189, 86, 20);
				Add_panel.add(textField_5);
				
				JLabel lblYearOfPublication = new JLabel("Year of Publication:");
				lblYearOfPublication.setBounds(75, 189, 101, 17);
				Add_panel.add(lblYearOfPublication);
				
					
				JButton btnAdd = new JButton("Add");
				btnAdd.setBounds(135, 220, 89, 23);
				Add_panel.add(btnAdd);
				
				btnAdd.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String title=textField.getText().toString();
						int id=Integer.parseInt(textField_1.getText());
						String author=textField_2.getText().toString();
						String sub=textField_3.getText().toString();
						int isbn=Integer.parseInt(textField_4.getText());
						String yr = textField_5.getText().toString();
						DataReader.bList.add(new Book(id,isbn,title,author,sub,yr," "));
						
						try {
							PrintWriter writer = new PrintWriter( new File(System.getProperty("user.dir")+"\\book.txt"));
							writer.print("");
							writer.close();
							
							DataReader.writeBooks();
							DataReader.readBooks();
						} catch (IOException e) {
							
							e.printStackTrace();
						}
						 JOptionPane.showMessageDialog(null, "Book Added to Catalogue", "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
						
					}
				});
				
				JLabel lblAddBookTo = new JLabel("Add book to Catalouge");
				lblAddBookTo.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblAddBookTo.setHorizontalAlignment(SwingConstants.CENTER);
				lblAddBookTo.setBounds(84, 11, 167, 31);
				Add_panel.add(lblAddBookTo);
				
				Panel panel_5 = new Panel();
				panel_5.setBackground(new Color(204, 204, 255));
				panel_5.setBounds(44, 267, 324, 148);
				panel_4.add(panel_5);
				panel_5.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("Remove Book from Catalouge");
				lblNewLabel.setBounds(81, 21, 183, 15);
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
				panel_5.add(lblNewLabel);
				
				JLabel label = new JLabel("Book ID:");
				label.setBounds(106, 62, 46, 14);
				panel_5.add(label);
				
				textField_6 = new JTextField();
				textField_6.setColumns(10);
				textField_6.setBounds(178, 59, 86, 20);
				panel_5.add(textField_6);
				
				JButton btnRemove = new JButton("Remove");
				btnRemove.setBounds(127, 102, 89, 23);
				panel_5.add(btnRemove);
				
				btnRemove.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						
						
						int id=Integer.parseInt(textField_6.getText());
						Book rmvbook  =new Book(id,0,"","","","","");
						
						DataReader.quicksort(DataReader.bList,0,DataReader.bList.size()-1);
						int index = DataReader.binarySearch(DataReader.bList, rmvbook);
						
						DataReader.bList.remove(index);
						
						for(int i = 0 ; i < DataReader.bList.size(); i++){
							String  t =((Book) DataReader.bList.get(i)).toString();
							System.out.println(t);
							
						}
						try {
							PrintWriter writer = new PrintWriter( new File(System.getProperty("user.dir")+"\\book.txt"));
							writer.print("");
							writer.close();
							
							DataReader.writeBooks();
							DataReader.readBooks();
						} catch (IOException e) {
							
							e.printStackTrace();
						}
						 JOptionPane.showMessageDialog(null, "Book removed from Catalogue", "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
						
					}
						
						
					
				});
				
				Button button = new Button("X");
				button.setFont(new Font("Arial", Font.PLAIN, 20));
				button.setForeground(new Color(255, 0, 0));
				button.setBounds(374, 10, 36, 32);
				panel_4.add(button);
				btnNewButton.setEnabled(false);
				btnNewButton.setBackground(new Color(0, 153, 204));
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel_4.removeAll();
						btnNewButton.setEnabled(true);
						btnNewButton.setBackground(new Color(51, 153, 255));
					}
				});
			}
		});
		
		
		
		btnViewCatalog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
				btnViewCatalog.setEnabled(false);
				btnViewCatalog.setBackground(new Color(0, 153, 204));
		         String[] columnNames = {"Book id",
	                        "ISBN",
		                        "Title",
		                        "Author",
		                        "Subject","description"};

		Object[][] data = new String[DataReader.bList.size()][6];
		System.out.println(DataReader.bList.size());
		for(int i = 0 ; i < DataReader.bList.size(); i++){
			String[] aa =  DataReader.bList.get(i).toString().split(",");
			for(int j = 0 ; j<6;j++){
				data[i][j] = aa[j];
			}
			
		}
				
		
		
				
				
				table = new JTable(data,columnNames);
				table.setBorder(new EmptyBorder(0, 0, 0, 0));
				table.setBackground(SystemColor.scrollbar);
				

				
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(10, 59, 400, 355);
				panel_4.add(scrollPane);
				
				
		
				Button button_2 = new Button("Catalogue");
				button_2.setBounds(150, 10, 120, 32);
				button_2.setFont(new Font("Arial", Font.PLAIN, 20));
				button_2.setForeground(new Color(255, 0, 0));
				button_2.setBackground(new Color(255, 255, 255));
				
								
				panel_4.add(button_2);
				
			
				
				Button button_1 = new Button("X");
				button_1.setBounds(393, 10, 27, 32);
				button_1.setFont(new Font("Arial", Font.PLAIN, 20));
				button_1.setForeground(new Color(255, 0, 0));
								
				panel_4.add(button_1);
				
			
				button_1.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										panel_4.removeAll();
										panel_4.repaint();
										btnViewCatalog.setEnabled(true);
										btnViewCatalog.setBackground(new Color(51, 153, 255));
									}
								});

			}
		});
		
		
		
		btnSerachCataloge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				panel_4.removeAll();
				
				JLabel lblNewLabel_1 = new JLabel("Search Book");
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblNewLabel_1.setBounds(156, 11, 130, 22);
				panel_4.add(lblNewLabel_1);
				
				
				
		
				JLabel lblNewLabel_2 = new JLabel("Search By");
				lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel_2.setBounds(122, 44, 97, 22);
				panel_4.add(lblNewLabel_2);
				
				JLabel lblEnterHere = new JLabel("Enter Here : ");
				lblEnterHere.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblEnterHere.setBounds(122, 77, 97, 22);
				panel_4.add(lblEnterHere);
				
				textField_7 = new JTextField();
				textField_7.setBounds(273, 80, 86, 20);
				panel_4.add(textField_7);
				textField_7.setColumns(10);
				
				JButton btnSearch = new JButton("Search");
				btnSearch.setBounds(173, 155, 89, 23);
				panel_4.add(btnSearch);
				
			     JComboBox<String> cb = new JComboBox<String>(choices);
			     cb.setBounds(220, 44, 97, 22);
			    cb.setVisible(true);
			    cb.setLightWeightPopupEnabled(false);
			    panel_4.add(cb);
				
				JLabel lblFilterBy = new JLabel("Filter By:");
				lblFilterBy.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblFilterBy.setBounds(122, 110, 64, 22);
				panel_4.add(lblFilterBy);
				
				 JComboBox<String> cb3 = new JComboBox<String>(choices2);
				 cb3.setBounds(190, 110, 70, 22);
				 cb3.setLightWeightPopupEnabled(false);
					    cb3.setVisible(true);
					    panel_4.add(cb3);
				
				
				textField_8 = new JTextField();
				textField_8.setColumns(10);
				textField_8.setBounds(273, 111, 86, 20);
				panel_4.add(textField_8);
				
				JLabel lblResults = new JLabel("Results:");
				lblResults.setFont(new Font("Tahoma", Font.BOLD, 16));
				lblResults.setBounds(10, 189, 72, 22);
				panel_4.add(lblResults);
				
				JLabel lblSortBy = new JLabel("Sort By:");
				lblSortBy.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblSortBy.setBounds(92, 189, 97, 22);
				panel_4.add(lblSortBy);
				
				 JComboBox<String> cb2 = new JComboBox<String>(choices);
				 cb2.setBounds(150, 189, 70, 22);
					    cb2.setVisible(true);
					    cb2.setLightWeightPopupEnabled(false);
					    panel_4.add(cb2);
				btnSearch.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								 String search=cb.getSelectedItem().toString();
								 String ipSearch=textField_7.getText().toString();
								 String filter= cb3.getSelectedItem().toString();
								 String ipFilter=textField_8.getText().toString();
								 System.out.println(search+" "+ipSearch);
								int id;Book sBook;
								if(search.equals("Title"))
								{
									id=1;
									sBook  =new Book(0,0,ipSearch,"","","","");
								}
								else if(search.equals("Author"))
								{
									id=2;
									sBook  =new Book(0,0,"",ipSearch,"","","");
								}
								else
								{
									id=0;
									sBook  =new Book(Integer.parseInt(ipSearch),0,"","","","","");
								}
								for(int i=0;i<DataReader.bList.size();i++)
								{
									DataReader.bList.get(i).setFlag(id);
								}
								//String sort=cb2.getSelectedItem().toString();
								LinkedList<Book> searchList=new LinkedList<Book>();
								//if(!ipFilter.equals(""))
								 //{
									//For Filter Binary Search needs to return array of integers. 
								 //}
								searchList.add(DataReader.bList.get(DataReader.binarySearch(DataReader.bList, sBook)));
								//DataReader.quicksort(searchList,0,searchList.size()-1);
								  Object[][] data = new String[searchList.size()][6];
									System.out.println(searchList.size());
									for(int i = 0 ; i < searchList.size(); i++){
										String[] aa =  searchList.get(i).toString().split(",");
										for(int j = 0 ; j<6;j++){
											data[i][j] = aa[j];
										}
										
									}
											
									String[] columnNames = {"Book ID",
						                       "ISBN",
						                       "Title",
						                       "Author",
						                       "Subject",
						                       "YOP"};
											
											table = new JTable(data,columnNames);
											table.setBorder(new EmptyBorder(0, 0, 0, 0));
											table.setBackground(SystemColor.scrollbar);
											
											JScrollPane scrollPane = new JScrollPane(table);
											scrollPane.setBounds(10, 222, 400, 192);
											panel_4.add(scrollPane);
											panel_4.revalidate();
											panel_4.repaint();
											
								

							}
						});
					  
						
					    panel_4.repaint();
					
			}
		});
		
		
	}
}
