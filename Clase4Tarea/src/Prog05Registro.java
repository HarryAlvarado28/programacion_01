
public class Prog05Registro extends javax.swing.JFrame {

	public Prog05Registro() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {
		jInternalFrame1 = new javax.swing.JInternalFrame();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jCheckBox1 = new javax.swing.JCheckBox();
		jCheckBox2 = new javax.swing.JCheckBox();
		jCheckBox3 = new javax.swing.JCheckBox();
		jCheckBox4 = new javax.swing.JCheckBox();
		jRadioButton1 = new javax.swing.JRadioButton();
		jComboBox1 = new javax.swing.JComboBox<>();
		jRadioButton2 = new javax.swing.JRadioButton();
		jComboBox2 = new javax.swing.JComboBox<>();
		jComboBox3 = new javax.swing.JComboBox<>();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jComboBox4 = new javax.swing.JComboBox<>();
		jTextField5 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		jRadioButton3 = new javax.swing.JRadioButton();
		jRadioButton4 = new javax.swing.JRadioButton();
		jComboBox5 = new javax.swing.JComboBox<>();
		jLabel10 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		buttonGroup1 = new javax.swing.ButtonGroup();
		buttonGroup2 = new javax.swing.ButtonGroup();
		buttonGroup3 = new javax.swing.ButtonGroup();
		buttonGroup4 = new javax.swing.ButtonGroup();
		jTabbedPane4 = new javax.swing.JTabbedPane();
		jLayeredPane1 = new javax.swing.JLayeredPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jCheckBox5 = new javax.swing.JCheckBox();
		jCheckBox6 = new javax.swing.JCheckBox();
		jButton4 = new javax.swing.JButton();
		jCheckBox7 = new javax.swing.JCheckBox();
		jCheckBox8 = new javax.swing.JCheckBox();
		jComboBox6 = new javax.swing.JComboBox<>();
		jPanel3 = new javax.swing.JPanel();
		jLayeredPane2 = new javax.swing.JLayeredPane();

		jInternalFrame1.setVisible(true);

		javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
		jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
		jInternalFrame1Layout.setHorizontalGroup(jInternalFrame1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 126, Short.MAX_VALUE));
		jInternalFrame1Layout.setVerticalGroup(jInternalFrame1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 19, Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jLabel6.setForeground(new java.awt.Color(0, 153, 255));
		jLabel6.setText("Add student details ");

		jLabel7.setForeground(new java.awt.Color(0, 153, 255));
		jLabel7.setText("Student name :");

		jTextField4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField4ActionPerformed(evt);
			}
		});

		jComboBox4
				.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NANCY", "MARIA", "HARRY", "PABLO" }));
		jComboBox4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox4ActionPerformed(evt);
			}
		});

		jTextField5.setText("                    ");

		jLabel8.setForeground(new java.awt.Color(0, 153, 255));
		jLabel8.setText("Student Address:");

		jLabel9.setForeground(new java.awt.Color(0, 153, 255));
		jLabel9.setText("Father´s name:");

		jTextField6.setText(" ");

		jRadioButton3.setText("Female");
		jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton3ActionPerformed(evt);
			}
		});

		jRadioButton4.setText("Male");
		jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton4ActionPerformed(evt);
			}
		});

		jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st PUC", "2nd PUC" }));
		jComboBox5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox5ActionPerformed(evt);
			}
		});

		jLabel10.setForeground(new java.awt.Color(0, 153, 255));
		jLabel10.setText("Class :");

		jCheckBox5.setText("SSLC Mark Card");
		jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox5ActionPerformed(evt);
			}
		});

		jCheckBox6.setText("Character Certificate");

		jButton4.setText("ADD RECORD");

		jCheckBox7.setText("NCC certificate given");

		jCheckBox8.setText("PHOTO (passport size)");

		jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Section A", "Section B", "Section C", "Section D" }));

		jPanel3.setBackground(new java.awt.Color(204, 255, 204));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 147, Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 121, Short.MAX_VALUE));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jButton4)
								.addGap(149, 149, 149))
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout
								.createSequentialGroup().addGap(30, 30, 30).addGroup(jPanel1Layout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jRadioButton4)
												.addGap(33, 33, 33))
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jCheckBox6).addComponent(jCheckBox5))
										.addGroup(jPanel1Layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING, false)
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
														.createSequentialGroup().addComponent(jLabel10)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jComboBox5,
																javax.swing.GroupLayout.PREFERRED_SIZE, 136,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel7)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addGroup(jPanel1Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(jLabel8).addComponent(jLabel9))
																.addGap(36, 36, 36)
																.addGroup(jPanel1Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																		.addComponent(jTextField5,
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				134, Short.MAX_VALUE)
																		.addComponent(jTextField6,
																				javax.swing.GroupLayout.Alignment.TRAILING))))))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jRadioButton3).addComponent(jComboBox6,
														javax.swing.GroupLayout.PREFERRED_SIZE, 123,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 157,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(175, 175, 175).addComponent(jTextField4,
								javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(346, 346, 346)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jCheckBox7).addComponent(jCheckBox8)))
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel6))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(170, 170, 170).addComponent(jPanel3,
								javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(9, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel7).addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel8))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel9))
						.addGap(16, 16, 16)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jRadioButton4).addComponent(jRadioButton3))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel10))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jCheckBox5).addComponent(jCheckBox8))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jCheckBox6).addComponent(jCheckBox7))
						.addGap(18, 18, 18).addComponent(jButton4).addGap(18, 18, 18)
						.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(48, Short.MAX_VALUE)));

		jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
		jLayeredPane1.setLayout(jLayeredPane1Layout);
		jLayeredPane1Layout
				.setHorizontalGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jLayeredPane1Layout.createSequentialGroup().addContainerGap()
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jLayeredPane1Layout
				.setVerticalGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								jLayeredPane1Layout.createSequentialGroup()
										.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap()));

		jTabbedPane4.addTab("ADD STUDENTS DETAILS", jLayeredPane1);

		jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jLayeredPane2.setForeground(new java.awt.Color(0, 153, 255));

		jLabel1.setForeground(new java.awt.Color(0, 153, 255));
		jLabel1.setText("Modify student details ");

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jTextField2.setText("                    ");

		jTextField3.setText(" ");

		jLabel2.setForeground(new java.awt.Color(0, 153, 255));
		jLabel2.setText("Student name :");

		jLabel3.setForeground(new java.awt.Color(0, 153, 255));
		jLabel3.setText("Student Address:");

		jLabel4.setForeground(new java.awt.Color(0, 153, 255));
		jLabel4.setText("Father´s name:");

		jRadioButton1.setText("Male");
		jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton1ActionPerformed(evt);
			}
		});

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maria", "Nancy", "Pablo", "Juan" }));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});

		jRadioButton2.setText("Female");
		jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton2ActionPerformed(evt);
			}
		});

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st PUC", "2nd PUC" }));
		jComboBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox2ActionPerformed(evt);
			}
		});

		jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Section A", "Section B", "Section C", "Section D" }));

		jCheckBox1.setText("SSLC Mark Card");
		jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox1ActionPerformed(evt);
			}
		});

		jCheckBox2.setText("Character Certificate");

		jCheckBox3.setText("PHOTO (passport size)");

		jCheckBox4.setText("NCC certificate given");

		jButton1.setText("DELETE RECORD");

		jButton2.setText("MODIFY RECORD");

		jLabel5.setForeground(new java.awt.Color(0, 153, 255));
		jLabel5.setText("Class :");

		jPanel2.setBackground(new java.awt.Color(204, 255, 204));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 172, Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 134, Short.MAX_VALUE));

		jLayeredPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jRadioButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jRadioButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jComboBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jComboBox3, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jCheckBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jCheckBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jCheckBox3, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jCheckBox4, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jLayeredPane2.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
		jLayeredPane2.setLayout(jLayeredPane2Layout);
		jLayeredPane2Layout.setHorizontalGroup(jLayeredPane2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jLayeredPane2Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButton1).addGap(221, 221, 221))
				.addGroup(jLayeredPane2Layout.createSequentialGroup()
						.addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jLayeredPane2Layout.createSequentialGroup().addGap(346, 346, 346)
										.addGroup(jLayeredPane2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jCheckBox4)
												.addGroup(jLayeredPane2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jCheckBox3)
														.addGroup(jLayeredPane2Layout
																.createSequentialGroup().addComponent(
																		jButton2)
																.addGap(15, 15, 15)))))
								.addGroup(jLayeredPane2Layout.createSequentialGroup().addGap(20, 20, 20)
										.addComponent(jLabel1))
								.addGroup(jLayeredPane2Layout.createSequentialGroup()
										.addGroup(jLayeredPane2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jLayeredPane2Layout.createSequentialGroup().addGap(30, 30, 30)
														.addGroup(jLayeredPane2Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING)
																.addGroup(jLayeredPane2Layout.createSequentialGroup()
																		.addComponent(jRadioButton1).addGap(33, 33, 33))
																.addGroup(jLayeredPane2Layout.createSequentialGroup()
																		.addComponent(jLabel5).addGap(63, 63, 63)
																		.addComponent(jComboBox2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				136,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(
																		jLayeredPane2Layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(jCheckBox2)
																				.addComponent(jCheckBox1))
																.addGroup(jLayeredPane2Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(jLabel2)
																		.addGroup(jLayeredPane2Layout
																				.createSequentialGroup()
																				.addGroup(jLayeredPane2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel3)
																						.addComponent(jLabel4))
																				.addGap(36, 36, 36)
																				.addGroup(jLayeredPane2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								134, Short.MAX_VALUE)
																						.addComponent(jTextField3,
																								javax.swing.GroupLayout.Alignment.TRAILING))))))
												.addGroup(jLayeredPane2Layout.createSequentialGroup()
														.addGap(175, 175, 175).addComponent(jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE, 132,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jLayeredPane2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(jLayeredPane2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jRadioButton2).addComponent(jComboBox3,
																javax.swing.GroupLayout.PREFERRED_SIZE, 123,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jLayeredPane2Layout.createSequentialGroup().addGap(175, 175, 175)
										.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(9, Short.MAX_VALUE)));
		jLayeredPane2Layout.setVerticalGroup(jLayeredPane2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jLayeredPane2Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
						.addGap(18, 18, 18)
						.addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2).addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel3))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel4))
						.addGap(16, 16, 16)
						.addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jRadioButton1).addComponent(jRadioButton2))
						.addGap(18, 18, 18)
						.addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel5))
						.addGap(18, 18, 18)
						.addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jCheckBox1).addComponent(jCheckBox3))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jCheckBox2).addComponent(jCheckBox4))
						.addGap(18, 18, 18)
						.addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton1).addComponent(jButton2))
						.addGap(36, 36, 36)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(23, Short.MAX_VALUE)));

		jPanel2.getAccessibleContext().setAccessibleName("");

		jTabbedPane4.addTab("MODIFY/DELETE STUDENTS DETAILS", jLayeredPane2);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(106, Short.MAX_VALUE).addComponent(jTabbedPane4,
						javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(20, 20, 20)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(jTabbedPane4).addContainerGap()));

		pack();
	}

	private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Prog05Registro.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Prog05Registro.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Prog05Registro.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Prog05Registro.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Prog05Registro().setVisible(true);
			}
		});
	}

	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JCheckBox jCheckBox2;
	private javax.swing.JCheckBox jCheckBox3;
	private javax.swing.JCheckBox jCheckBox4;
	private javax.swing.JCheckBox jCheckBox5;
	private javax.swing.JCheckBox jCheckBox6;
	private javax.swing.JCheckBox jCheckBox7;
	private javax.swing.JCheckBox jCheckBox8;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.ButtonGroup buttonGroup2;
	private javax.swing.ButtonGroup buttonGroup3;
	private javax.swing.ButtonGroup buttonGroup4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton4;
	private javax.swing.JTabbedPane jTabbedPane4;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JComboBox<String> jComboBox2;
	private javax.swing.JComboBox<String> jComboBox3;
	private javax.swing.JComboBox<String> jComboBox4;
	private javax.swing.JComboBox<String> jComboBox5;
	private javax.swing.JComboBox<String> jComboBox6;
	private javax.swing.JInternalFrame jInternalFrame1;
	private javax.swing.JLayeredPane jLayeredPane1;
	private javax.swing.JLayeredPane jLayeredPane2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.JRadioButton jRadioButton3;
	private javax.swing.JRadioButton jRadioButton4;
}