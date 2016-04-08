package inventorymanager;

import java.sql.*;
import javax.swing.table.*;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.fonts.*;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;


public class Inventory_Manager extends javax.swing.JFrame {

    /**
     * Creates new form Inventory_Manager
     */
    public Inventory_Manager() {
        initComponents();
        table();
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
            System.out.println(list);
            pro_list.addItem(list);
        }
        
        }catch (Exception e) 
        {
        e.printStackTrace();
      
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        textField4 = new java.awt.TextField();
        textField5 = new java.awt.TextField();
        textField6 = new java.awt.TextField();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        adm_back4 = new java.awt.Button();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        item_status = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        detail = new javax.swing.JTable();
        add = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        Report = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        in_man_yes = new javax.swing.JButton();
        in_man_no = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pro_quantity = new javax.swing.JTextField();
        pro_list = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        in_man_update = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        label13 = new java.awt.Label();
        in_man_reset2 = new java.awt.Button();
        in_man_submit2 = new java.awt.Button();
        label12 = new java.awt.Label();
        status1 = new javax.swing.JLabel();
        status2 = new javax.swing.JLabel();
        Confirm_password = new javax.swing.JPasswordField();
        New_password = new javax.swing.JPasswordField();
        Existing_password = new javax.swing.JPasswordField();

        jLabel1.setText("jLabel1");

        jLabel2.setText("Product Name");

        jLabel3.setText("Barcode");

        jLabel4.setText("MFD");

        jLabel5.setText("Quantity");

        jLabel6.setText("Price");

        jLabel13.setText("EXD");

        textField1.setText("textField1");

        textField2.setText("textField2");

        textField3.setText("textField3");

        textField4.setText("textField4");

        textField5.setText("textField5");

        textField6.setText("textField6");

        button1.setLabel("Submit");

        button2.setLabel("Reset");

        adm_back4.setLabel("Back");
        adm_back4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_back4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(adm_back4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)
                                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(299, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel13)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(adm_back4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Manager");

        item_status.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        item_status.setText("Items out of stock");

        detail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product", "Barcode", "MFD", "EXD", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        detail.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(detail);
        detail.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(item_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add)
                .addGap(221, 221, 221))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(item_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        tabs.addTab("Check Item Status", jPanel1);

        label3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label3.setText("Report Generation...");

        Report.setText("Generate Report");
        Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addComponent(Report)
                .addGap(204, 204, 204))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(Report)
                .addContainerGap(392, Short.MAX_VALUE))
        );

        tabs.addTab("Generate Report", jPanel3);

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel7.setText("Are you sure you want to logout?");

        in_man_yes.setText("YES");
        in_man_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_man_yesActionPerformed(evt);
            }
        });

        in_man_no.setText("NO");
        in_man_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_man_noActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(in_man_yes)
                        .addGap(54, 54, 54)
                        .addComponent(in_man_no))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel7)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in_man_yes)
                    .addComponent(in_man_no))
                .addContainerGap(366, Short.MAX_VALUE))
        );

        tabs.addTab("Logout", jPanel4);

        jLabel8.setText("Product");

        pro_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_listActionPerformed(evt);
            }
        });

        jLabel9.setText("Quantity");

        in_man_update.setText("Update");
        in_man_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_man_updateActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel10.setText("Add Product quantity");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(pro_list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(pro_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(in_man_update))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel10))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(status)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pro_list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(pro_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(in_man_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                .addComponent(status)
                .addContainerGap())
        );

        tabs.addTab("Add item", jPanel5);

        label10.setText("Existing Password");

        label11.setText("New Password");

        label13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label13.setText("Change Password...");

        in_man_reset2.setLabel("Reset");
        in_man_reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_man_reset2ActionPerformed(evt);
            }
        });

        in_man_submit2.setLabel("Submit");
        in_man_submit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_man_submit2ActionPerformed(evt);
            }
        });

        label12.setText("Confirm Password");

        status1.setForeground(new java.awt.Color(255, 38, 25));

        status2.setForeground(new java.awt.Color(32, 173, 47));
        status2.setText("jLabel9");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(status2)
                        .addContainerGap(478, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(in_man_submit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(New_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(in_man_reset2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Existing_password, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Confirm_password))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(status1))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Existing_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(New_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status1)
                .addGap(19, 19, 19)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(in_man_submit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(in_man_reset2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                .addComponent(status2)
                .addContainerGap())
        );

        tabs.addTab("Change Password", panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );

        tabs.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adm_back4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_back4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adm_back4ActionPerformed

    private void in_man_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_man_yesActionPerformed
        // TODO add your handling code here:
        first fr = new first();
        dispose();
        fr.show();
    }//GEN-LAST:event_in_man_yesActionPerformed

    private void in_man_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_man_noActionPerformed
        // TODO add your handling code here:
        Inventory_Manager inman = new Inventory_Manager();
        dispose();
        inman.show();
    }//GEN-LAST:event_in_man_noActionPerformed

    private void in_man_submit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_man_submit2ActionPerformed
        // TODO add your handling code here:
        sqlconnect sql = new sqlconnect();
        try {
            Connection con;
            con = sql.Connections();
            Statement st = con.createStatement();
            String Query;
            String sel="select * from login where Name='inman'";
            ResultSet res=st.executeQuery(sel);
            while(res.next())
            {
            String pw=res.getString("Password");
            if(Existing_password.getText().equals(pw))
            {
            if (New_password.getText().equals(Confirm_password.getText())) {
                Query = "UPDATE login SET password='" + New_password.getText() + "' WHERE password='" + Existing_password.getText() + "' and Name='inman'";
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
            /*status2.setText("Invalid password");
            status1.setText(" ");
            Existing_password.setText(" ");
            New_password.setText(" ");
            Confirm_password.setText(" ");*/
        }
    }//GEN-LAST:event_in_man_submit2ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
  TableModel model=detail.getModel();
        
        int selectrow=detail.getSelectedRow();
        int selectcol=detail.getSelectedColumn();
        
        System.out.println(selectrow+"==="+selectcol);
        System.out.println(model.getValueAt(selectrow, selectcol));
        
        DefaultTableModel model1 = new DefaultTableModel();
        detail.setModel(model1);
        
        
        model1.setColumnIdentifiers(new Object[]{"Product", "Barcode", "MFD", "EXD", "Price", "Quantity"});
        
       
       
        sqlconnect sql = new sqlconnect();
        try {
            Connection con;
            con = sql.Connections();
            Statement st = con.createStatement();
            String Query = "update inventory set quantity='"+model.getValueAt(selectrow,5)+"' where pro_name='"+model.getValueAt(selectrow, selectcol)+"'" ;
            st.executeUpdate(Query);
                                

        } catch (Exception e) {
            System.out.println(e);
        }
        table();
    }//GEN-LAST:event_addActionPerformed

    private void pro_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_listActionPerformed
        // TODO add your handling code here:
        
        sqlconnect sql=new sqlconnect(); 
        try
        {
        Connection con;    
        con=sql.Connections();
        Statement st = con.createStatement();
        String Query;
             Query = "SELECT * from inventory WHERE pro_name='"+pro_list.getSelectedItem()+"'";
        ResultSet res = st.executeQuery(Query); 
        while(res.next())
        {
            pro_quantity.setText(res.getString("quantity"));
        }
         }catch (Exception e) 
         {
          e.printStackTrace();
         }
    }//GEN-LAST:event_pro_listActionPerformed

    private void in_man_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_man_updateActionPerformed
        // TODO add your handling code here:
         sqlconnect sql=new sqlconnect(); 
        try
        {
        Connection con;    
        con=sql.Connections();
        Statement st = con.createStatement();
        String Query;
             Query = "UPDATE inventory SET quantity='"+pro_quantity.getText()+"' WHERE pro_name='"+pro_list.getSelectedItem()+"'";
        System.out.println(Query);
        int res = st.executeUpdate(Query);
        if(res>0)
        {
            status.setText("Sucessfully updated");
            jPanel1.repaint();
        }
        else
        {
            status.setText("Error ");
        }
         }catch (Exception e) 
         {
          e.printStackTrace();
         }
    }//GEN-LAST:event_in_man_updateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        table();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void in_man_reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_man_reset2ActionPerformed
        // TODO add your handling code here:
            Existing_password.setText(" ");
            New_password.setText(" ");
            Confirm_password.setText(" ");
    }//GEN-LAST:event_in_man_reset2ActionPerformed

    private void ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportActionPerformed
        // TODO add your handling code here:
        sqlconnect sql=new sqlconnect();
        try
        {
        Connection con;    
        con=sql.Connections();
        Statement st = con.createStatement();
        String Query;
        Query="SELECT * FROM inventory";
        ResultSet res=st.executeQuery(Query);
        
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("/home/vishal/Documents/tech/test.pdf"));
        document.open();
        Paragraph layout=new Paragraph(":::Inventory Report:::");
        layout.setAlignment(Element.ALIGN_CENTER);
        layout.setSpacingAfter(50);
        
        document.add(layout);
        
        PdfPTable table = new PdfPTable(6);
        table.setWidthPercentage(300 / 3f);
        table.setWidths(new int[]{3, 3, 3,3,3,3});
        PdfPCell cell;
        cell = new PdfPCell(new Phrase("Product"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Barcode"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("MFD"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("EXD"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Price"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Quantity"));
        table.addCell(cell);
        cell.setRowspan(6);
        while(res.next())
        {
            
        
        table.addCell(res.getString("pro_name"));
        table.addCell(res.getString("barcode"));
        table.addCell(res.getString("mfd"));
        table.addCell(res.getString("exd"));
        table.addCell(res.getString("price"));
        table.addCell(res.getString("quantity"));
         
        
        
        }
        document.add(table);
        document.close();
        File fo=new File("/home/vishal/Documents/tech/test.pdf");
        Desktop.getDesktop().open(fo);
          //  FileInputStream fin=new FileInputStream("/home/vishal/Documents/tech/test.pdf");
           // fin.
        }catch(Exception e)
        {
            
        }
        
        
    }//GEN-LAST:event_ReportActionPerformed
    void table(){
        DefaultTableModel model = new DefaultTableModel();
        detail.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Product", "Barcode", "MFD", "EXD", "Price", "Quantity"});
        sqlconnect sql = new sqlconnect();
        try {
            Connection con;
            con = sql.Connections();
            Statement st = con.createStatement();
            String Query = "select * from inventory";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                String pro_name = res.getString("pro_name");
                String barcode = res.getString("barcode");
                String mfd = res.getString("mfd");
                String exd = res.getString("exd");
                String price = res.getString("price");
                String quantity = res.getString("quantity");
                System.out.println(quantity);
              
                    
                if (quantity.equals("0")) {

                    model.addRow(new Object[]{pro_name, barcode, mfd, exd, price, quantity});
                     
                } else {
                    //item_status.setText("Perfect");
                }

            }
      
        } catch (Exception e) {
            System.out.println(e);
        }
    }
 
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
            java.util.logging.Logger.getLogger(Inventory_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory_Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Confirm_password;
    private javax.swing.JPasswordField Existing_password;
    private javax.swing.JPasswordField New_password;
    private javax.swing.JButton Report;
    private javax.swing.JButton add;
    private java.awt.Button adm_back4;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JTable detail;
    private javax.swing.JButton in_man_no;
    private java.awt.Button in_man_reset2;
    private java.awt.Button in_man_submit2;
    private javax.swing.JButton in_man_update;
    private javax.swing.JButton in_man_yes;
    private java.awt.Label item_status;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label3;
    private javax.swing.JPanel panel;
    private javax.swing.JComboBox pro_list;
    private javax.swing.JTextField pro_quantity;
    private javax.swing.JLabel status;
    private javax.swing.JLabel status1;
    private javax.swing.JLabel status2;
    private javax.swing.JTabbedPane tabs;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    // End of variables declaration//GEN-END:variables
}
