
package inventorymanager;

import java.awt.Color;
import java.sql.*;


public class Admin extends javax.swing.JFrame {


    public Admin() {
        initComponents();
        
        
        sqlconnect sql=new sqlconnect();
        try
        {
        Connection con;    
        con=sql.Connections();
        Statement st=con.createStatement();
        String Query="select * from inventory";
        ResultSet res = st.executeQuery(Query);
        
        while(res.next())
        {
            String list=res.getString("pro_name");
            
            change_price_list.addItem(list);
        }
        
        }catch (Exception e) 
        {
        e.printStackTrace();
      
        }

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        employ_name = new java.awt.TextField();
        employ_email = new java.awt.TextField();
        employ_address = new java.awt.TextField();
        employ_number = new java.awt.TextField();
        employ_gender = new java.awt.TextField();
        label7 = new java.awt.Label();
        adm_submit1 = new java.awt.Button();
        adm_reset1 = new java.awt.Button();
        statuss = new javax.swing.JLabel();
        employ_password = new javax.swing.JPasswordField();
        lbl_name = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        lbl_number = new javax.swing.JLabel();
        lbl_gender = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        change_price_pro_price = new java.awt.TextField();
        label14 = new java.awt.Label();
        change_price_list = new javax.swing.JComboBox();
        status = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        adm_submit3 = new java.awt.Button();
        adm_reset3 = new java.awt.Button();
        label13 = new java.awt.Label();
        status1 = new javax.swing.JLabel();
        status2 = new javax.swing.JLabel();
        Existing_password = new javax.swing.JPasswordField();
        New_password = new javax.swing.JPasswordField();
        Confirm_password = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Product_name = new java.awt.TextField();
        Barcode = new java.awt.TextField();
        MFD = new java.awt.TextField();
        EXD = new java.awt.TextField();
        Price = new java.awt.TextField();
        Quantity = new java.awt.TextField();
        Add_Items_submit = new java.awt.Button();
        Add_Items_reset = new java.awt.Button();
        status3 = new java.awt.Label();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        adm_yes = new javax.swing.JButton();
        adm_no = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");

        jTabbedPane1.setToolTipText("");

        label1.setText("Name");

        label2.setText("E-mail");

        label3.setText("Mo.number");

        label4.setText("Address");

        label5.setText("Gender");

        label6.setText("Password");

        employ_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                employ_nameFocusLost(evt);
            }
        });

        employ_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                employ_emailFocusLost(evt);
            }
        });

        employ_address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                employ_addressFocusLost(evt);
            }
        });

        employ_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                employ_numberFocusLost(evt);
            }
        });

        employ_gender.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                employ_genderFocusLost(evt);
            }
        });

        label7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label7.setText("Employee Details...");

        adm_submit1.setLabel("Submit");
        adm_submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_submit1ActionPerformed(evt);
            }
        });

        adm_reset1.setLabel("Reset");
        adm_reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_reset1ActionPerformed(evt);
            }
        });

        employ_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                employ_passwordFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adm_reset1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191)
                        .addComponent(lbl_name))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)
                        .addComponent(lbl_email))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adm_submit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statuss))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(employ_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(employ_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(employ_address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(employ_gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(employ_number, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(employ_password)))
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_address)
                            .addComponent(lbl_number)
                            .addComponent(lbl_gender)
                            .addComponent(lbl_password))))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(employ_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl_name))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(employ_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lbl_email))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(employ_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_address))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(employ_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbl_number))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employ_gender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbl_gender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(employ_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_password)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adm_submit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adm_reset1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(statuss)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add New Employee", jPanel1);

        label8.setText("Product Name");

        label9.setText("Product Price");

        label14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label14.setText("Change Product Price...");

        change_price_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_price_listActionPerformed(evt);
            }
        });

        status.setForeground(new java.awt.Color(3, 182, 26));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change_price_list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(change_price_pro_price, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(change_price_list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(change_price_pro_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 403, Short.MAX_VALUE)
                .addComponent(status)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Change Price", jPanel2);

        label10.setText("Existing Password");

        label11.setText("New Password");

        label12.setText("Confirm Password");

        adm_submit3.setLabel("Submit");
        adm_submit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_submit3ActionPerformed(evt);
            }
        });

        adm_reset3.setLabel("Reset");
        adm_reset3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_reset3ActionPerformed(evt);
            }
        });

        label13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label13.setText("Change Password...");

        status1.setForeground(new java.awt.Color(253, 31, 2));

        status2.setForeground(new java.awt.Color(253, 35, 18));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status1))
                    .addComponent(status2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(Existing_password, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adm_submit3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(New_password, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Confirm_password, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(adm_reset3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)))))))
                .addGap(315, 315, 315))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Existing_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(New_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(status1))
                    .addComponent(Confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adm_submit3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adm_reset3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addComponent(status2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Change Password", jPanel3);

        jPanel4.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel1.setText("Enter Product Details");

        jLabel2.setText("Product Name");

        jLabel3.setText("Barcode");

        jLabel4.setText("MFD(yyyy-mm-dd)");

        jLabel5.setText("Quantity");

        jLabel6.setText("Price");

        jLabel13.setText("EXD(yyyy-mm-dd)");

        Add_Items_submit.setLabel("Submit");
        Add_Items_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Items_submitActionPerformed(evt);
            }
        });

        Add_Items_reset.setLabel("Reset");
        Add_Items_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Items_resetActionPerformed(evt);
            }
        });

        status3.setForeground(new java.awt.Color(239, 3, 3));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(MFD, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Barcode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(Add_Items_submit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)
                                            .addComponent(Add_Items_reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(EXD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(status3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Product_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Barcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(MFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel13)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EXD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Add_Items_reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Add_Items_submit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(status3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add new Items", jPanel4);

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel7.setText("Are you sure you want to logout?");

        adm_yes.setText("YES");
        adm_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_yesActionPerformed(evt);
            }
        });

        adm_no.setText("NO");
        adm_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_noActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(adm_yes)
                        .addGap(54, 54, 54)
                        .addComponent(adm_no))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel7)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adm_yes)
                    .addComponent(adm_no))
                .addContainerGap(352, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Logout", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adm_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_yesActionPerformed
        // TODO add your handling code here:
        first fr=new first();
        dispose();
        fr.show();
    }//GEN-LAST:event_adm_yesActionPerformed

    private void adm_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_noActionPerformed
        // TODO add your handling code here:
        Admin ad=new Admin();
        dispose();
        ad.show();
    }//GEN-LAST:event_adm_noActionPerformed

    private void adm_submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_submit1ActionPerformed
        // TODO add your handling code here:
        if(flag[0]==true || flag[1]==true || flag[2]==true || flag[3]==true || flag[4]==true || flag[5]==true){
            statuss.setText("please fill all filelds");
        } 
        else
        {
                sqlconnect sql=new sqlconnect();
            
        try
        {
        Connection con;    
        con=sql.Connections();
        Statement st = con.createStatement();
        String Query;
             Query = "INSERT into login VALUES('"+employ_name.getText()+"','"+employ_email.getText()+"','"+employ_address.getText()+"','"+employ_number.getText()+"','"+employ_gender.getText()+"','"+employ_password.getText()+"')";
        
        int res = st.executeUpdate(Query);
        if(res>0)
        {
            System.out.println("successfully added");
            statuss.setText("successfully added");
        }
         }catch (Exception e) 
         {
          e.printStackTrace();
         }
        }
    }//GEN-LAST:event_adm_submit1ActionPerformed

    private void change_price_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_price_listActionPerformed
        // TODO add your handling code here:
        sqlconnect sql=new sqlconnect(); 
        try
        {
        Connection con;    
        con=sql.Connections();
        Statement st = con.createStatement();
        String Query;
             Query = "SELECT * from inventory WHERE pro_name='"+change_price_list.getSelectedItem()+"'";
        ResultSet res = st.executeQuery(Query); 
        while(res.next())
        {
            change_price_pro_price.setText(res.getString("price"));
        }
         }catch (Exception e) 
         {
          e.printStackTrace();
         }
      
    }//GEN-LAST:event_change_price_listActionPerformed

    private void adm_submit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_submit3ActionPerformed
        // TODO add your handling code here:
          sqlconnect sql = new sqlconnect();
        try {
            Connection con;
            con = sql.Connections();
            Statement st = con.createStatement();
            String Query;
            String sel="select * from login where Name='admin'";
            ResultSet res=st.executeQuery(sel);
            while(res.next())
            {
            String pw=res.getString("Password");
            if(Existing_password.getText().equals(pw))
            {
            if (New_password.getText().equals(Confirm_password.getText())) {
                Query = "UPDATE login SET password='" + New_password.getText() + "' WHERE password='" + Existing_password.getText() + "' and Name='admin'";
                System.out.println(Query);
                int rs = st.executeUpdate(Query);
                if (rs > 0) {
                    status2.setText("Sucessfully updated");
                    status1.setText(" ");
                }
            } else {
                status1.setText("Password missmatch");
                status2.setText(" ");
            }
            }
            
            else{
             status2.setText("Invalid password");
            status1.setText(" ");
            Existing_password.setText(" ");
            New_password.setText(" ");
            Confirm_password.setText(" ");
                    }
            }
        } catch (Exception e) {
          
        }
    }//GEN-LAST:event_adm_submit3ActionPerformed

    private void adm_reset3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_reset3ActionPerformed
        // TODO add your handling code here:
        Existing_password.setText(" ");
        New_password.setText(" ");
        Confirm_password.setText(" ");
    }//GEN-LAST:event_adm_reset3ActionPerformed

    private void Add_Items_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Items_submitActionPerformed
        // TODO add your handling code here:
        sqlconnect sql=new sqlconnect();
        if(Product_name.getText()!=" " & Barcode.getText()!=" " & MFD.getText()!=" " & EXD.getText()!=" " & Price.getText()!="" & Quantity.getText()!="" )
         {
            try
        {
        Connection con;    
        con=sql.Connections();
        Statement st = con.createStatement();
        String Query;
             Query = "INSERT into inventory VALUES('"+Product_name.getText()+"','"+Barcode.getText()+"','"+MFD.getText()+"','"+EXD.getText()+"','"+Price.getText()+"','"+Quantity.getText()+"')";
        System.out.println(Query);
        int res = st.executeUpdate(Query);
        if(res>0)
        {
            status3.setText("successfully added");
        }
         }catch (Exception e) 
         {
          e.printStackTrace();
         }
        }
        else
        {
            status3.setText("Fill all the fileds");
        }
    }//GEN-LAST:event_Add_Items_submitActionPerformed

    private void Add_Items_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Items_resetActionPerformed
        // TODO add your handling code here:
        Product_name.setText(" ");
        Barcode.setText(" ");
        MFD.setText(" ");
        EXD.setText(" ");
        Price.setText(" ");
        Quantity.setText(" ");
    }//GEN-LAST:event_Add_Items_resetActionPerformed

    private void adm_reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_reset1ActionPerformed
        // TODO add your handling code here:
        employ_name.setText(" ");
        employ_address.setText(" ");
        employ_email.setText(" ");
        employ_gender.setText(" ");
        employ_number.setText(" ");
        employ_password.setText(" ");
    }//GEN-LAST:event_adm_reset1ActionPerformed
boolean[] flag={false,false,false,false,false,false};
    private void employ_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_employ_nameFocusLost
      // this.employ_name.setNextFocusableComponent(employ_email);
        if(employ_name.getText().equals(""))
        {
            lbl_name.setForeground(Color.red);
            lbl_name.setText("Please enter the name");
            flag[0]=true;
            //this.employ_name.requestFocusInWindow();
        }else{
            lbl_name.setText("");
            flag[0]=false;
//this.employ_email.requestFocusInWindow();
        
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_employ_nameFocusLost

    private void employ_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_employ_emailFocusLost
        // TODO add your handling code here:
         if(employ_email.getText().equals(""))
        {
            lbl_email.setForeground(Color.red);
            lbl_email.setText("Please enter E-mail");
            flag[1]=true;
//this.employ_email.requestFocusInWindow();
        }else{
            lbl_email.setText("");
            flag[1]=false;
        }
    }//GEN-LAST:event_employ_emailFocusLost

    private void employ_addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_employ_addressFocusLost
        
// TODO add your handling code here:
        
         if(employ_address.getText().equals(""))
        {
            lbl_address.setForeground(Color.red);
            lbl_address.setText("Please enter Address");
            flag[2]=true;
//this.employ_address.requestFocusInWindow();
        }else{
            lbl_address.setText("");
            flag[2]=false;
        }
    }//GEN-LAST:event_employ_addressFocusLost

    private void employ_numberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_employ_numberFocusLost
        // TODO add your handling code here:
         if(employ_number.getText().equals(""))
        {
            lbl_number.setForeground(Color.red);
            lbl_number.setText("Please enter E-mail");
            flag[3]=true;
//this.employ_number.requestFocusInWindow();
        }else{
            lbl_number.setText("");
            flag[3]=false;
        }
        
    }//GEN-LAST:event_employ_numberFocusLost

    private void employ_genderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_employ_genderFocusLost
        // TODO add your handling code here:
         if(employ_gender.getText().equals(""))
        {
            lbl_gender.setForeground(Color.red);
            lbl_gender.setText("Please enter E-mail");
            flag[4]=true;
//this.employ_gender.requestFocusInWindow();
        }else{
            lbl_gender.setText("");
            flag[4]=false;
        }
        
    }//GEN-LAST:event_employ_genderFocusLost

    private void employ_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_employ_passwordFocusLost
        // TODO add your handling code here:
         if(employ_password.getText().equals(""))
        {
            lbl_password.setForeground(Color.red);
            lbl_password.setText("Please enter E-mail");
            flag[5]=true;
//this.employ_password.requestFocusInWindow();
        }else{
            lbl_password.setText("");
            flag[5]=false;
        }
        
    }//GEN-LAST:event_employ_passwordFocusLost

     public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Add_Items_reset;
    private java.awt.Button Add_Items_submit;
    private java.awt.TextField Barcode;
    private javax.swing.JPasswordField Confirm_password;
    private java.awt.TextField EXD;
    private javax.swing.JPasswordField Existing_password;
    private java.awt.TextField MFD;
    private javax.swing.JPasswordField New_password;
    private java.awt.TextField Price;
    private java.awt.TextField Product_name;
    private java.awt.TextField Quantity;
    private javax.swing.JButton adm_no;
    private java.awt.Button adm_reset1;
    private java.awt.Button adm_reset3;
    private java.awt.Button adm_submit1;
    private java.awt.Button adm_submit3;
    private javax.swing.JButton adm_yes;
    private javax.swing.JComboBox change_price_list;
    private java.awt.TextField change_price_pro_price;
    private java.awt.TextField employ_address;
    private java.awt.TextField employ_email;
    private java.awt.TextField employ_gender;
    private java.awt.TextField employ_name;
    private java.awt.TextField employ_number;
    private javax.swing.JPasswordField employ_password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_number;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel status;
    private javax.swing.JLabel status1;
    private javax.swing.JLabel status2;
    private java.awt.Label status3;
    private javax.swing.JLabel statuss;
    // End of variables declaration//GEN-END:variables
}
