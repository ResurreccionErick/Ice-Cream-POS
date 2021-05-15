
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PrinterException;
import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class pos extends javax.swing.JFrame{

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public pos() {
        initComponents(); 
    }
    
    String cashierName;
    public pos(String name) { //GETTING THE INPUT USERNAME FROM LOGIN UI
        initComponents(); 
        this.cashierName = name;
        jLabel_cashier.setText(cashierName);
   }
   
    DefaultTableModel model = new DefaultTableModel();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_date = new javax.swing.JLabel();
        jLabel_cashier = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        ic_strawberry = new javax.swing.JLabel();
        ic_chocolate = new javax.swing.JLabel();
        ic_macha = new javax.swing.JLabel();
        ic_vanilla = new javax.swing.JLabel();
        ic_rockyroad = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        d_cocacola = new javax.swing.JLabel();
        d_water = new javax.swing.JLabel();
        d_coffee = new javax.swing.JLabel();
        d_rootbeer = new javax.swing.JLabel();
        d_orangejuice = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jTextField_total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_pay = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_balance = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("ICE CREAM SHOP");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cashier:");

        jLabel_date.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel_date.setForeground(new java.awt.Color(255, 255, 255));

        jLabel_cashier.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel_cashier.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(218, 218, 218)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_date, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addGap(248, 248, 248))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_cashier, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel_cashier, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_date, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1259, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        ic_strawberry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Strawberry-Ice-Cream-Temp-2.jpg"))); // NOI18N
        ic_strawberry.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        ic_strawberry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ic_strawberryMouseClicked(evt);
            }
        });

        ic_chocolate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/2dd845aa872d103562c9_1024.jpg"))); // NOI18N
        ic_chocolate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        ic_chocolate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ic_chocolateMouseClicked(evt);
            }
        });

        ic_macha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Matcha-Ice-Cream-22.jpg"))); // NOI18N
        ic_macha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        ic_macha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ic_machaMouseClicked(evt);
            }
        });

        ic_vanilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/c57c8b6f-442a-4cb5-8fb8-4f8d52629301.jpg"))); // NOI18N
        ic_vanilla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        ic_vanilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ic_vanillaMouseClicked(evt);
            }
        });

        ic_rockyroad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rocky-road-ice-cream-2-525.jpg"))); // NOI18N
        ic_rockyroad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        ic_rockyroad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ic_rockyroadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(ic_strawberry)
                .addGap(35, 35, 35)
                .addComponent(ic_chocolate)
                .addGap(35, 35, 35)
                .addComponent(ic_macha)
                .addGap(35, 35, 35)
                .addComponent(ic_vanilla)
                .addGap(35, 35, 35)
                .addComponent(ic_rockyroad)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ic_rockyroad)
                    .addComponent(ic_vanilla)
                    .addComponent(ic_macha)
                    .addComponent(ic_chocolate)
                    .addComponent(ic_strawberry))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(" ICE CREAM ", jPanel2);

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));

        d_cocacola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1.jpg"))); // NOI18N
        d_cocacola.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        d_cocacola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d_cocacolaMouseClicked(evt);
            }
        });

        d_water.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/2.jpg"))); // NOI18N
        d_water.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        d_water.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d_waterMouseClicked(evt);
            }
        });

        d_coffee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/3.jpg"))); // NOI18N
        d_coffee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        d_coffee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d_coffeeMouseClicked(evt);
            }
        });

        d_rootbeer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/4.jpg"))); // NOI18N
        d_rootbeer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        d_rootbeer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d_rootbeerMouseClicked(evt);
            }
        });

        d_orangejuice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/5.jpg"))); // NOI18N
        d_orangejuice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        d_orangejuice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d_orangejuiceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(d_cocacola)
                .addGap(35, 35, 35)
                .addComponent(d_water)
                .addGap(35, 35, 35)
                .addComponent(d_coffee)
                .addGap(35, 35, 35)
                .addComponent(d_rootbeer)
                .addGap(35, 35, 35)
                .addComponent(d_orangejuice)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d_orangejuice)
                    .addComponent(d_rootbeer)
                    .addComponent(d_coffee)
                    .addComponent(d_water)
                    .addComponent(d_cocacola))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(" DRINKS ", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, -1, 260));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 419, 967, 313));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jTextField_total.setEditable(false);
        jTextField_total.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_total.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_total.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setText("PRINT RECEIPT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TOTAL:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PAY:");

        jTextField_pay.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_pay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_pay.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_pay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_payKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_payKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("BALANCE:");

        jTextField_balance.setEditable(false);
        jTextField_balance.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_balance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_balance.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(jTextField_total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(jTextField_pay, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField_balance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_total, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(995, 422, 254, 340));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 3, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setText("Click here to logout");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 749, -1, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/papers.co-sn87-soft-pink-pastel-blur-gradation-29-wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ic_strawberryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_strawberryMouseClicked
        
       String name = "Strawberry ice cream";
        int price = 35;

        int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity: "));
        int total = qty * price;

        model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,

            });

            int sum = 0;
            for(int i = 0; i<jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());

            }
            jTextField_total.setText(Integer.toString(sum));
    }//GEN-LAST:event_ic_strawberryMouseClicked

    private void ic_chocolateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_chocolateMouseClicked
         
        String name = "Chocolate ice cream";
        int price = 45;

        int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity: "));
        int total = qty * price;

        model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,

            });

            int sum = 0;
            for(int i = 0; i<jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());

            }
            jTextField_total.setText(Integer.toString(sum));
    }//GEN-LAST:event_ic_chocolateMouseClicked

    private void ic_machaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_machaMouseClicked
       
       String name = "Mocha ice cream";
        int price = 55;

        int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity: "));
        int total = qty * price;

        model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,

            });

            int sum = 0;
            for(int i = 0; i<jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());

            }
            jTextField_total.setText(Integer.toString(sum));
    }//GEN-LAST:event_ic_machaMouseClicked

    private void ic_vanillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_vanillaMouseClicked
         
        String name = "Vanilla ice cream";
        int price = 75;

        int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity: "));
        int total = qty * price;

        model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,

            });

            int sum = 0;
            for(int i = 0; i<jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());

            }
            jTextField_total.setText(Integer.toString(sum));
    }//GEN-LAST:event_ic_vanillaMouseClicked

    private void ic_rockyroadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_rockyroadMouseClicked
         
       String name = "RockyRoad ice cream";
        int price = 85;

        int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity: "));
        int total = qty * price;

        model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,

            });

            int sum = 0;
            for(int i = 0; i<jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());

            }
            jTextField_total.setText(Integer.toString(sum));
    }//GEN-LAST:event_ic_rockyroadMouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
      System.exit(0);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void d_orangejuiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_orangejuiceMouseClicked
        String name = "Orange-juice";
        int price = 55;

        int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity: "));
        int total = qty * price;

        model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,

            });

            int sum = 0;
            for(int i = 0; i<jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());

            }
            jTextField_total.setText(Integer.toString(sum));
    }//GEN-LAST:event_d_orangejuiceMouseClicked

    private void d_rootbeerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_rootbeerMouseClicked
        String name = "RootBeer";
        int price = 45;

        int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity: "));
        int total = qty * price;

        model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,

            });

            int sum = 0;
            for(int i = 0; i<jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());

            }
            jTextField_total.setText(Integer.toString(sum));
    }//GEN-LAST:event_d_rootbeerMouseClicked

    private void d_coffeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_coffeeMouseClicked
        String name = "Black Coffee";
        int price = 35;

        int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity: "));
        int total = qty * price;

        model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,

            });

            int sum = 0;
            for(int i = 0; i<jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());

            }
            jTextField_total.setText(Integer.toString(sum));
    }//GEN-LAST:event_d_coffeeMouseClicked

    private void d_waterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_waterMouseClicked
        String name = "Water bottle";
        int price = 25;

        int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity: "));
        int total = qty * price;

        model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,

            });

            int sum = 0;
            for(int i = 0; i<jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());

            }
            jTextField_total.setText(Integer.toString(sum));
    }//GEN-LAST:event_d_waterMouseClicked

    private void d_cocacolaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_cocacolaMouseClicked
        String name = "Coca cola";
        int price = 15;

        int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity: "));
        int total = qty * price;

        model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,

            });

            int sum = 0;
            for(int i = 0; i<jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());

            }
            jTextField_total.setText(Integer.toString(sum));
    }//GEN-LAST:event_d_cocacolaMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int getMoney1 = Integer.parseInt(jTextField_total.getText());
        int getMoney2 = Integer.parseInt(jTextField_pay.getText());
        int total = getMoney2 - getMoney1;
        if(getMoney1 <= getMoney2){
        jTextField_balance.setText(String.valueOf(total));   
        prints();
        }else{
            JOptionPane.showMessageDialog(null, "Not enough money");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_payKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_payKeyPressed

        
        
    }//GEN-LAST:event_jTextField_payKeyPressed

    private void jTextField_payKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_payKeyReleased
         
    }//GEN-LAST:event_jTextField_payKeyReleased

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
       

      
    }//GEN-LAST:event_jButton1KeyPressed
    
    
    public void prints(){
        String subtotal = jTextField_total.getText();
        String pay = jTextField_pay.getText();
        String bal = jTextField_balance.getText();
       
        new receipt(subtotal,pay,bal,jTable1.getModel()).setVisible(true);
        
 
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
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pos().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel d_cocacola;
    private javax.swing.JLabel d_coffee;
    private javax.swing.JLabel d_orangejuice;
    private javax.swing.JLabel d_rootbeer;
    private javax.swing.JLabel d_water;
    private javax.swing.JLabel ic_chocolate;
    private javax.swing.JLabel ic_macha;
    private javax.swing.JLabel ic_rockyroad;
    private javax.swing.JLabel ic_strawberry;
    private javax.swing.JLabel ic_vanilla;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_cashier;
    private javax.swing.JLabel jLabel_date;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_balance;
    private javax.swing.JTextField jTextField_pay;
    private javax.swing.JTextField jTextField_total;
    // End of variables declaration//GEN-END:variables

}
