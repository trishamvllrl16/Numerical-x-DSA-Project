import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.mariuszgromada.math.mxparser.*;

public class bisection_method extends javax.swing.JFrame {

    public bisection_method() {
        initComponents();
        centerTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        a_tx = new javax.swing.JTextField();
        eq_tx = new javax.swing.JTextField();
        b_tx = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tbn_calculate_bisection = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_bisection = new javax.swing.JTable();
        er_tx = new javax.swing.JTextField();
        root_not = new javax.swing.JLabel();
        err = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 732));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1310, 732));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a_tx.setBackground(new java.awt.Color(239, 235, 233));
        a_tx.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a_tx.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a_tx.setBorder(null);
        a_tx.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(a_tx, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 363, 240, 40));

        eq_tx.setBackground(new java.awt.Color(239, 235, 233));
        eq_tx.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        eq_tx.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eq_tx.setBorder(null);
        eq_tx.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        eq_tx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eq_txActionPerformed(evt);
            }
        });
        jPanel1.add(eq_tx, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 144, 240, 40));

        b_tx.setBackground(new java.awt.Color(239, 235, 233));
        b_tx.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        b_tx.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b_tx.setBorder(null);
        b_tx.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        b_tx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_txActionPerformed(evt);
            }
        });
        jPanel1.add(b_tx, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 363, 240, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/clear_normal.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/clear_mid.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 150, 70));

        tbn_calculate_bisection.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        tbn_calculate_bisection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calculate_normal.png"))); // NOI18N
        tbn_calculate_bisection.setContentAreaFilled(false);
        tbn_calculate_bisection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbn_calculate_bisection.setPreferredSize(new java.awt.Dimension(80, 30));
        tbn_calculate_bisection.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calculate_mid.png"))); // NOI18N
        tbn_calculate_bisection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbn_calculate_bisectionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tbn_calculate_bisectionMouseExited(evt);
            }
        });
        tbn_calculate_bisection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_calculate_bisectionActionPerformed(evt);
            }
        });
        jPanel1.add(tbn_calculate_bisection, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 220, 70));

        table_bisection.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        table_bisection.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "A", "B", "C(mid)", "f(C)", "Error"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_bisection.setGridColor(new java.awt.Color(153, 153, 255));
        table_bisection.setSelectionBackground(new java.awt.Color(153, 153, 255));
        table_bisection.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table_bisection.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_bisection.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table_bisection);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 610, 570));

        er_tx.setBackground(new java.awt.Color(239, 235, 233));
        er_tx.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        er_tx.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        er_tx.setBorder(null);
        er_tx.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(er_tx, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 247, 240, 40));

        root_not.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        root_not.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(root_not, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 410, 50));

        err.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        err.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(err, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 410, 50));

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back_normal.png"))); // NOI18N
        btn_back.setContentAreaFilled(false);
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_back.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back_mid.png"))); // NOI18N
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_backMouseExited(evt);
            }
        });
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, 60));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bisection_bg.png"))); // NOI18N
        jLabel6.setIconTextGap(0);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -50, 1310, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void centerTable() {
        
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < table_bisection.getColumnModel().getColumnCount(); i++) {
            table_bisection.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }
    
    public double a, b, relative_error;
    
    private void tbn_calculate_bisectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_calculate_bisectionActionPerformed
        tbn_calculate_bisection.setIcon(new ImageIcon(getClass().getResource("assets/calculate_mid.png")));
        table_remove();
        root_not.setText("");
        err.setText("");
        boolean cont = true;
        String aText = a_tx.getText().replaceAll(" ", "");
        String bText = b_tx.getText().replaceAll(" ", "");
        String erText = er_tx.getText().replaceAll(" ", "");
        String eqText = eq_tx.getText().replaceAll(" ", "");

        try {
            double a = filter_functions.isValidFractionOrDouble(aText) ? (aText.contains("/") ? filter_functions.parseFraction(aText) : Double.parseDouble(aText)) : Double.NaN;
            double b = filter_functions.isValidFractionOrDouble(bText) ? (bText.contains("/") ? filter_functions.parseFraction(bText) : Double.parseDouble(bText)) : Double.NaN;
            double relative_error = filter_functions.isValidFractionOrDouble(erText) ? filter_functions.parseFraction(erText) : Double.NaN;
            
            Expression expression = new Expression(eqText, new Argument("x = " + a));
            if (!expression.checkSyntax()) {
                JOptionPane.showMessageDialog(null, "Invalid equation input");
                return;
            }
            
            if (Double.isNaN(a)) {
                JOptionPane.showMessageDialog(null, "Invalid input for a");
                cont = false;
            }
            if (Double.isNaN(b)) {
                JOptionPane.showMessageDialog(null, "Invalid input for b");
                cont = false;
            }
            if (Double.isNaN(relative_error)) {
                JOptionPane.showMessageDialog(null, "Invalid input for relative error");
                cont = false;
            }
            if (eqText == null || eqText.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Equation input is empty or invalid");
                cont = false;
            }

            if (cont) {
                values(a, b, eqText, relative_error);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid numerical input for a, b, or relative error");
        }
    }//GEN-LAST:event_tbn_calculate_bisectionActionPerformed
    
    public void values(double a, double b, String equation, double er) {
        int row = 0;
        Function func = new Function("f(x) = " + equation);
        double funca = evaluateFunction(a, func);
        double funcb = evaluateFunction(b, func);

        if (funca * funcb < 0) {
            bisection(a, b, func, er, row);
        } else {
            JOptionPane.showMessageDialog(null, "Root not found in the given interval.\nGuess again.");
        }
    }

    public void bisection(double a, double b, Function func, double er, int row) {
        double fa = a;
        table_bisection.setValueAt(fa, row, 0);
        double funca = evaluateFunction(fa, func);
        double fb = b;
        table_bisection.setValueAt(fb, row, 1);
        double funcb = evaluateFunction(fb, func);
        double error = Math.abs(fb - fa);
        if(row==0){
            table_bisection.setValueAt("", 0, 4);
        }else{
        
        table_bisection.setValueAt(Math.abs(fb - fa), row, 4);
        }
        if (error > er) {
            double midc = (fa + fb) / 2;
            double x = midc;
            table_bisection.setValueAt(midc, row, 2);
            double funcc = evaluateFunction(x, func);
            table_bisection.setValueAt(funcc, row, 3);
             if(funcc==0){
                     double c = (fa + fb) / 2;
                    table_bisection.setValueAt(c, row, 2);
                    table_bisection.setValueAt("0", row, 4);
                    root_not.setText("ROOT: " + c);
                    err.setText("Error: " + 0);
                 }
            
            if (funcc != 0) {
                if (funcc < 0) {
                    row++;
                    bisection(x, fb, func, er, row);
                } 
                
                else {
                    row++;
                    bisection(fa, x, func, er, row);
                }
            }
        } 
        
        else {
            double c = (fa + fb) / 2;
            table_bisection.setValueAt(c, row, 2);
            

            root_not.setText("ROOT: " + c);
            err.setText("Error: " + error);
        }
    }

    public double evaluateFunction(double x, Function func) {
        Argument arg = new Argument("x = " + x);
        Expression exp = new Expression("f(x)", func, arg);
        return exp.calculate();
    }

    public void table_remove() {
        DefaultTableModel model = (DefaultTableModel) table_bisection.getModel();
        for (int i = 0; i < table_bisection.getRowCount(); i++) {
            for (int j = 0; j < table_bisection.getColumnCount(); j++) {
                table_bisection.setValueAt("", i, j);
            }
        }
    }
    
    private void eq_txActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eq_txActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eq_txActionPerformed

    private void b_txActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_txActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_txActionPerformed

    private void tbn_calculate_bisectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbn_calculate_bisectionMouseEntered
       tbn_calculate_bisection.setIcon(new ImageIcon(getClass().getResource("assets/calculate_hover.png")));
    }//GEN-LAST:event_tbn_calculate_bisectionMouseEntered

    private void tbn_calculate_bisectionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbn_calculate_bisectionMouseExited
       tbn_calculate_bisection.setIcon(new ImageIcon(getClass().getResource("assets/calculate_normal.png")));
    }//GEN-LAST:event_tbn_calculate_bisectionMouseExited

    private void btn_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseEntered
        btn_back.setIcon(new ImageIcon(getClass().getResource("assets/back_hover.png")));
    }//GEN-LAST:event_btn_backMouseEntered

    private void btn_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseExited
        btn_back.setIcon(new ImageIcon(getClass().getResource("assets/back_normal.png")));
    }//GEN-LAST:event_btn_backMouseExited

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        btn_back.setIcon(new ImageIcon(getClass().getResource("assets/back_mid.png")));
        new main().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    public void clr(){
        for(int i=0;i<table_bisection.getRowCount();i++){
            table_bisection.setValueAt("", i, 0);
            table_bisection.setValueAt("", i, 1);
            table_bisection.setValueAt("", i, 2);
            table_bisection.setValueAt("", i, 3);
            table_bisection.setValueAt("", i, 4);
            table_remove();
        }
        root_not.setText("");
            err.setText("");
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for(int i=0;i<table_bisection.getRowCount();i++){
            table_bisection.setValueAt("", i, 0);
            table_bisection.setValueAt("", i, 1);
            table_bisection.setValueAt("", i, 2);
            table_bisection.setValueAt("", i, 3);
            table_bisection.setValueAt("", i, 4);
            
            root_not.setText("");
            err.setText("");
            
            a_tx.setText("");
            b_tx.setText("");
            er_tx.setText("");
            eq_tx.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setIcon(new ImageIcon(getClass().getResource("assets/clear_hover.png")));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setIcon(new ImageIcon(getClass().getResource("assets/clear_normal.png")));
    }//GEN-LAST:event_jButton1MouseExited
    
    
    public void bisection(double a, double b, String equation, double er, int row) {
        Expression expression = new Expression(equation);

        double x, fa, fb, funca, funcb, error;

        fa = a;
        table_bisection.setValueAt(fa, row, 0);
        expression.setArgumentValue("x", fa);
        funca = expression.calculate();

        fb = b;
        table_bisection.setValueAt(fb, row, 1);
        expression.setArgumentValue("x", fb);
        funcb = expression.calculate();

        System.out.println("a: " + fa);
        System.out.println("b: " + fb);

        error = Math.abs(fb - fa);
        table_bisection.setValueAt(Math.abs(fb - fa), row, 4);
        System.out.println("error: " + error);

        if (error > er) {
            double midc = (fa + fb) / 2;
            x = midc;
            table_bisection.setValueAt(midc, row, 2);
            expression.setArgumentValue("x", midc);
            double funcc = expression.calculate();

            System.out.println("mid(c): " + funcc);
            table_bisection.setValueAt(funcc, row, 3);

            if (funcc != 0) {
                if (funcc < 0) {
                    row++;
                    bisection(x, fb, equation, er, row);
                } else {
                    row++;
                    bisection(fa, x, equation, er, row);
                }
            }

        } else {
            double c = (fa + fb) / 2;
            table_bisection.setValueAt(c, row, 2);
            table_bisection.getMousePosition();

            root_not.setText("ROOT: " + c);
            err.setText("Error: " + error);

            System.out.println("root(no round): " + c);
            System.out.println("root(rounded) " + Math.round(c));
            System.out.println("error: " + error);
        }
    }

    public boolean y=true;


    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(trapezoidal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trapezoidal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trapezoidal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trapezoidal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bisection_method().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a_tx;
    private javax.swing.JTextField b_tx;
    private javax.swing.JButton btn_back;
    private javax.swing.JTextField eq_tx;
    private javax.swing.JTextField er_tx;
    private javax.swing.JLabel err;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel root_not;
    private javax.swing.JTable table_bisection;
    private javax.swing.JButton tbn_calculate_bisection;
    // End of variables declaration//GEN-END:variables
}
