import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;

public class ge extends javax.swing.JFrame {

    public ge() {
        initComponents();
        calc_ge.setDisabledIcon( (new ImageIcon(getClass().getResource("assets/calculate_mid.png"))));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        clear_ge = new javax.swing.JButton();
        a00 = new javax.swing.JTextField();
        a01 = new javax.swing.JTextField();
        a02 = new javax.swing.JTextField();
        a03 = new javax.swing.JTextField();
        a04 = new javax.swing.JTextField();
        a05 = new javax.swing.JTextField();
        a10 = new javax.swing.JTextField();
        a11 = new javax.swing.JTextField();
        a12 = new javax.swing.JTextField();
        a13 = new javax.swing.JTextField();
        a14 = new javax.swing.JTextField();
        a15 = new javax.swing.JTextField();
        a20 = new javax.swing.JTextField();
        a21 = new javax.swing.JTextField();
        a22 = new javax.swing.JTextField();
        a23 = new javax.swing.JTextField();
        a24 = new javax.swing.JTextField();
        a25 = new javax.swing.JTextField();
        a30 = new javax.swing.JTextField();
        a31 = new javax.swing.JTextField();
        a32 = new javax.swing.JTextField();
        a33 = new javax.swing.JTextField();
        a34 = new javax.swing.JTextField();
        a35 = new javax.swing.JTextField();
        a40 = new javax.swing.JTextField();
        a41 = new javax.swing.JTextField();
        a42 = new javax.swing.JTextField();
        a43 = new javax.swing.JTextField();
        a44 = new javax.swing.JTextField();
        a45 = new javax.swing.JTextField();
        a50 = new javax.swing.JTextField();
        a51 = new javax.swing.JTextField();
        a52 = new javax.swing.JTextField();
        a53 = new javax.swing.JTextField();
        a54 = new javax.swing.JTextField();
        a55 = new javax.swing.JTextField();
        no_eq_ge = new javax.swing.JTextField();
        back_button_ge = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ge_ans = new javax.swing.JTextArea();
        go_ge = new javax.swing.JButton();
        b0 = new javax.swing.JTextField();
        b1 = new javax.swing.JTextField();
        b2 = new javax.swing.JTextField();
        b3 = new javax.swing.JTextField();
        b4 = new javax.swing.JTextField();
        b5 = new javax.swing.JTextField();
        calc_ge = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1300, 732));
        setMinimumSize(new java.awt.Dimension(1300, 732));
        setPreferredSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setEnabled(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 732));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 732));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 732));
        jPanel1.setLayout(null);

        clear_ge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/clear_normal.png"))); // NOI18N
        clear_ge.setContentAreaFilled(false);
        clear_ge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear_ge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clear_geMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clear_geMouseExited(evt);
            }
        });
        clear_ge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_geActionPerformed(evt);
            }
        });
        jPanel1.add(clear_ge);
        clear_ge.setBounds(220, 570, 140, 70);

        a00.setEditable(false);
        a00.setBackground(new java.awt.Color(141, 119, 171));
        a00.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a00.setForeground(new java.awt.Color(255, 255, 255));
        a00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a00.setBorder(null);
        a00.setName(""); // NOI18N
        a00.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a00);
        a00.setBounds(53, 152, 60, 40);

        a01.setEditable(false);
        a01.setBackground(new java.awt.Color(141, 119, 171));
        a01.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a01.setForeground(new java.awt.Color(255, 255, 255));
        a01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a01.setBorder(null);
        a01.setName(""); // NOI18N
        a01.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a01);
        a01.setBounds(136, 152, 60, 40);

        a02.setEditable(false);
        a02.setBackground(new java.awt.Color(141, 119, 171));
        a02.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a02.setForeground(new java.awt.Color(255, 255, 255));
        a02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a02.setBorder(null);
        a02.setName(""); // NOI18N
        a02.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a02);
        a02.setBounds(219, 152, 60, 40);

        a03.setEditable(false);
        a03.setBackground(new java.awt.Color(141, 119, 171));
        a03.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a03.setForeground(new java.awt.Color(255, 255, 255));
        a03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a03.setBorder(null);
        a03.setName(""); // NOI18N
        a03.setPreferredSize(new java.awt.Dimension(70, 40));
        a03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a03ActionPerformed(evt);
            }
        });
        jPanel1.add(a03);
        a03.setBounds(301, 152, 60, 40);

        a04.setEditable(false);
        a04.setBackground(new java.awt.Color(141, 119, 171));
        a04.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a04.setForeground(new java.awt.Color(255, 255, 255));
        a04.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a04.setBorder(null);
        a04.setName(""); // NOI18N
        a04.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a04);
        a04.setBounds(384, 152, 60, 40);

        a05.setEditable(false);
        a05.setBackground(new java.awt.Color(141, 119, 171));
        a05.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a05.setForeground(new java.awt.Color(255, 255, 255));
        a05.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a05.setBorder(null);
        a05.setName(""); // NOI18N
        a05.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a05);
        a05.setBounds(467, 152, 60, 40);

        a10.setEditable(false);
        a10.setBackground(new java.awt.Color(141, 119, 171));
        a10.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a10.setForeground(new java.awt.Color(255, 255, 255));
        a10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a10.setBorder(null);
        a10.setName(""); // NOI18N
        a10.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a10);
        a10.setBounds(53, 221, 60, 40);

        a11.setEditable(false);
        a11.setBackground(new java.awt.Color(141, 119, 171));
        a11.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a11.setForeground(new java.awt.Color(255, 255, 255));
        a11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a11.setBorder(null);
        a11.setName(""); // NOI18N
        a11.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a11);
        a11.setBounds(136, 221, 60, 40);

        a12.setEditable(false);
        a12.setBackground(new java.awt.Color(141, 119, 171));
        a12.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a12.setForeground(new java.awt.Color(255, 255, 255));
        a12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a12.setBorder(null);
        a12.setName(""); // NOI18N
        a12.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a12);
        a12.setBounds(219, 221, 60, 40);

        a13.setEditable(false);
        a13.setBackground(new java.awt.Color(141, 119, 171));
        a13.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a13.setForeground(new java.awt.Color(255, 255, 255));
        a13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a13.setBorder(null);
        a13.setName(""); // NOI18N
        a13.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a13);
        a13.setBounds(301, 221, 60, 40);

        a14.setEditable(false);
        a14.setBackground(new java.awt.Color(141, 119, 171));
        a14.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a14.setForeground(new java.awt.Color(255, 255, 255));
        a14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a14.setBorder(null);
        a14.setName(""); // NOI18N
        a14.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a14);
        a14.setBounds(384, 221, 60, 40);

        a15.setEditable(false);
        a15.setBackground(new java.awt.Color(141, 119, 171));
        a15.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a15.setForeground(new java.awt.Color(255, 255, 255));
        a15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a15.setBorder(null);
        a15.setName(""); // NOI18N
        a15.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a15);
        a15.setBounds(467, 221, 60, 40);

        a20.setEditable(false);
        a20.setBackground(new java.awt.Color(141, 119, 171));
        a20.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a20.setForeground(new java.awt.Color(255, 255, 255));
        a20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a20.setBorder(null);
        a20.setName(""); // NOI18N
        a20.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a20);
        a20.setBounds(53, 290, 60, 40);

        a21.setEditable(false);
        a21.setBackground(new java.awt.Color(141, 119, 171));
        a21.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a21.setForeground(new java.awt.Color(255, 255, 255));
        a21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a21.setBorder(null);
        a21.setName(""); // NOI18N
        a21.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a21);
        a21.setBounds(136, 290, 60, 40);

        a22.setEditable(false);
        a22.setBackground(new java.awt.Color(141, 119, 171));
        a22.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a22.setForeground(new java.awt.Color(255, 255, 255));
        a22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a22.setBorder(null);
        a22.setName(""); // NOI18N
        a22.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a22);
        a22.setBounds(219, 290, 60, 40);

        a23.setEditable(false);
        a23.setBackground(new java.awt.Color(141, 119, 171));
        a23.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a23.setForeground(new java.awt.Color(255, 255, 255));
        a23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a23.setBorder(null);
        a23.setName(""); // NOI18N
        a23.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a23);
        a23.setBounds(301, 290, 60, 40);

        a24.setEditable(false);
        a24.setBackground(new java.awt.Color(141, 119, 171));
        a24.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a24.setForeground(new java.awt.Color(255, 255, 255));
        a24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a24.setBorder(null);
        a24.setName(""); // NOI18N
        a24.setPreferredSize(new java.awt.Dimension(70, 40));
        a24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a24ActionPerformed(evt);
            }
        });
        jPanel1.add(a24);
        a24.setBounds(384, 290, 60, 40);

        a25.setEditable(false);
        a25.setBackground(new java.awt.Color(141, 119, 171));
        a25.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a25.setForeground(new java.awt.Color(255, 255, 255));
        a25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a25.setBorder(null);
        a25.setName(""); // NOI18N
        a25.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a25);
        a25.setBounds(467, 290, 60, 40);

        a30.setEditable(false);
        a30.setBackground(new java.awt.Color(141, 119, 171));
        a30.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a30.setForeground(new java.awt.Color(255, 255, 255));
        a30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a30.setBorder(null);
        a30.setName(""); // NOI18N
        a30.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a30);
        a30.setBounds(53, 359, 60, 40);

        a31.setEditable(false);
        a31.setBackground(new java.awt.Color(141, 119, 171));
        a31.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a31.setForeground(new java.awt.Color(255, 255, 255));
        a31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a31.setBorder(null);
        a31.setName(""); // NOI18N
        a31.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a31);
        a31.setBounds(136, 359, 60, 40);

        a32.setEditable(false);
        a32.setBackground(new java.awt.Color(141, 119, 171));
        a32.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a32.setForeground(new java.awt.Color(255, 255, 255));
        a32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a32.setBorder(null);
        a32.setName(""); // NOI18N
        a32.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a32);
        a32.setBounds(219, 359, 60, 40);

        a33.setEditable(false);
        a33.setBackground(new java.awt.Color(141, 119, 171));
        a33.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a33.setForeground(new java.awt.Color(255, 255, 255));
        a33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a33.setBorder(null);
        a33.setName(""); // NOI18N
        a33.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a33);
        a33.setBounds(301, 359, 60, 40);

        a34.setEditable(false);
        a34.setBackground(new java.awt.Color(141, 119, 171));
        a34.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a34.setForeground(new java.awt.Color(255, 255, 255));
        a34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a34.setBorder(null);
        a34.setName(""); // NOI18N
        a34.setPreferredSize(new java.awt.Dimension(70, 40));
        a34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a34ActionPerformed(evt);
            }
        });
        jPanel1.add(a34);
        a34.setBounds(384, 359, 60, 40);

        a35.setEditable(false);
        a35.setBackground(new java.awt.Color(141, 119, 171));
        a35.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a35.setForeground(new java.awt.Color(255, 255, 255));
        a35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a35.setBorder(null);
        a35.setName(""); // NOI18N
        a35.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a35);
        a35.setBounds(467, 359, 60, 40);

        a40.setEditable(false);
        a40.setBackground(new java.awt.Color(141, 119, 171));
        a40.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a40.setForeground(new java.awt.Color(255, 255, 255));
        a40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a40.setBorder(null);
        a40.setName(""); // NOI18N
        a40.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a40);
        a40.setBounds(53, 427, 60, 40);

        a41.setEditable(false);
        a41.setBackground(new java.awt.Color(141, 119, 171));
        a41.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a41.setForeground(new java.awt.Color(255, 255, 255));
        a41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a41.setBorder(null);
        a41.setName(""); // NOI18N
        a41.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a41);
        a41.setBounds(136, 427, 60, 40);

        a42.setEditable(false);
        a42.setBackground(new java.awt.Color(141, 119, 171));
        a42.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a42.setForeground(new java.awt.Color(255, 255, 255));
        a42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a42.setBorder(null);
        a42.setName(""); // NOI18N
        a42.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a42);
        a42.setBounds(219, 427, 60, 40);

        a43.setEditable(false);
        a43.setBackground(new java.awt.Color(141, 119, 171));
        a43.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a43.setForeground(new java.awt.Color(255, 255, 255));
        a43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a43.setBorder(null);
        a43.setName(""); // NOI18N
        a43.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a43);
        a43.setBounds(301, 427, 60, 40);

        a44.setEditable(false);
        a44.setBackground(new java.awt.Color(141, 119, 171));
        a44.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a44.setForeground(new java.awt.Color(255, 255, 255));
        a44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a44.setBorder(null);
        a44.setName(""); // NOI18N
        a44.setPreferredSize(new java.awt.Dimension(70, 40));
        a44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a44ActionPerformed(evt);
            }
        });
        jPanel1.add(a44);
        a44.setBounds(384, 427, 60, 40);

        a45.setEditable(false);
        a45.setBackground(new java.awt.Color(141, 119, 171));
        a45.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a45.setForeground(new java.awt.Color(255, 255, 255));
        a45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a45.setBorder(null);
        a45.setName(""); // NOI18N
        a45.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a45);
        a45.setBounds(467, 427, 60, 40);

        a50.setEditable(false);
        a50.setBackground(new java.awt.Color(141, 119, 171));
        a50.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a50.setForeground(new java.awt.Color(255, 255, 255));
        a50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a50.setBorder(null);
        a50.setName(""); // NOI18N
        a50.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a50);
        a50.setBounds(53, 497, 60, 40);

        a51.setEditable(false);
        a51.setBackground(new java.awt.Color(141, 119, 171));
        a51.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a51.setForeground(new java.awt.Color(255, 255, 255));
        a51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a51.setBorder(null);
        a51.setName(""); // NOI18N
        a51.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a51);
        a51.setBounds(136, 497, 60, 40);

        a52.setEditable(false);
        a52.setBackground(new java.awt.Color(141, 119, 171));
        a52.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a52.setForeground(new java.awt.Color(255, 255, 255));
        a52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a52.setBorder(null);
        a52.setName(""); // NOI18N
        a52.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a52);
        a52.setBounds(219, 497, 60, 40);

        a53.setEditable(false);
        a53.setBackground(new java.awt.Color(141, 119, 171));
        a53.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a53.setForeground(new java.awt.Color(255, 255, 255));
        a53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a53.setBorder(null);
        a53.setName(""); // NOI18N
        a53.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a53);
        a53.setBounds(301, 497, 60, 40);

        a54.setEditable(false);
        a54.setBackground(new java.awt.Color(141, 119, 171));
        a54.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a54.setForeground(new java.awt.Color(255, 255, 255));
        a54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a54.setBorder(null);
        a54.setName(""); // NOI18N
        a54.setPreferredSize(new java.awt.Dimension(70, 40));
        a54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a54ActionPerformed(evt);
            }
        });
        jPanel1.add(a54);
        a54.setBounds(384, 497, 60, 40);

        a55.setEditable(false);
        a55.setBackground(new java.awt.Color(141, 119, 171));
        a55.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a55.setForeground(new java.awt.Color(255, 255, 255));
        a55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a55.setBorder(null);
        a55.setName(""); // NOI18N
        a55.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a55);
        a55.setBounds(467, 497, 60, 40);

        no_eq_ge.setBackground(new java.awt.Color(239, 235, 233));
        no_eq_ge.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        no_eq_ge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        no_eq_ge.setBorder(null);
        no_eq_ge.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        no_eq_ge.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(no_eq_ge);
        no_eq_ge.setBounds(246, 84, 190, 30);

        back_button_ge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back_normal.png"))); // NOI18N
        back_button_ge.setContentAreaFilled(false);
        back_button_ge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_button_ge.setPreferredSize(new java.awt.Dimension(80, 30));
        back_button_ge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                back_button_geMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                back_button_geMouseExited(evt);
            }
        });
        back_button_ge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_button_geActionPerformed(evt);
            }
        });
        jPanel1.add(back_button_ge);
        back_button_ge.setBounds(0, 20, 170, 60);

        ge_ans.setEditable(false);
        ge_ans.setColumns(20);
        ge_ans.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        ge_ans.setRows(5);
        jScrollPane1.setViewportView(ge_ans);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(750, 110, 490, 450);

        go_ge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/go_normal.png"))); // NOI18N
        go_ge.setContentAreaFilled(false);
        go_ge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        go_ge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                go_geMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                go_geMouseExited(evt);
            }
        });
        go_ge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_geActionPerformed(evt);
            }
        });
        jPanel1.add(go_ge);
        go_ge.setBounds(470, 70, 150, 60);

        b0.setEditable(false);
        b0.setBackground(new java.awt.Color(141, 119, 171));
        b0.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        b0.setForeground(new java.awt.Color(255, 255, 255));
        b0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b0.setBorder(null);
        b0.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        b0.setPreferredSize(new java.awt.Dimension(70, 40));
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        jPanel1.add(b0);
        b0.setBounds(610, 152, 60, 40);

        b1.setEditable(false);
        b1.setBackground(new java.awt.Color(141, 119, 171));
        b1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b1.setBorder(null);
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        b1.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(b1);
        b1.setBounds(610, 221, 60, 40);

        b2.setEditable(false);
        b2.setBackground(new java.awt.Color(141, 119, 171));
        b2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b2.setBorder(null);
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        b2.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(b2);
        b2.setBounds(610, 290, 60, 40);

        b3.setEditable(false);
        b3.setBackground(new java.awt.Color(141, 119, 171));
        b3.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b3.setBorder(null);
        b3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        b3.setPreferredSize(new java.awt.Dimension(70, 40));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3);
        b3.setBounds(610, 359, 60, 40);

        b4.setEditable(false);
        b4.setBackground(new java.awt.Color(141, 119, 171));
        b4.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b4.setBorder(null);
        b4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        b4.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(b4);
        b4.setBounds(610, 427, 60, 40);

        b5.setEditable(false);
        b5.setBackground(new java.awt.Color(141, 119, 171));
        b5.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 255, 255));
        b5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b5.setBorder(null);
        b5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        b5.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(b5);
        b5.setBounds(610, 497, 60, 40);

        calc_ge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calculate_normal.png"))); // NOI18N
        calc_ge.setContentAreaFilled(false);
        calc_ge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calc_ge.setEnabled(false);
        calc_ge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calc_geMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calc_geMouseExited(evt);
            }
        });
        calc_ge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc_geActionPerformed(evt);
            }
        });
        jPanel1.add(calc_ge);
        calc_ge.setBounds(400, 570, 210, 70);

        jLabel8.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ge_bg.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel8.setMaximumSize(new java.awt.Dimension(1300, 732));
        jLabel8.setMinimumSize(new java.awt.Dimension(1300, 732));
        jLabel8.setPreferredSize(new java.awt.Dimension(1300, 732));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 1300, 700);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void clear_geActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_geActionPerformed
    JTextField[][]tfa = {{a00, a01, a02, a03, a04, a05},
                              {a10, a11, a12, a13, a14, a15},
                              {a20, a21, a22, a23, a24, a25},
                              {a30, a31, a32, a33, a34, a35},
                              {a40, a41, a42, a43, a44, a45},
                              {a50, a51, a52, a53, a54, a55}};
        
    JTextField[] tfb = {b0, b1, b2, b3, b4, b5};
   
    no_eq_ge.setText("");
    calc_ge.setEnabled(false);
    ge_ans.setText("");
        for(int i=0;i<tfa.length;i++){
            tfb[i].setText("");
            for(int j=0;j<tfa[i].length;j++){
                tfa[i][j].setText("");
            }
        }
        for(int i=0;i<tfa.length;i++){
            tfb[i].setEditable(false);
            tfb[i].setText("");
            for(int j=0;j<tfa[i].length;j++){
                tfa[i][j].setEditable(false);
                tfa[i][j].setText("");
            }
        }
    }//GEN-LAST:event_clear_geActionPerformed
    public int n;
    private void go_geActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_geActionPerformed
        JTextField[][]tfa = {{a00, a01, a02, a03, a04, a05},
            {a10, a11, a12, a13, a14, a15},
            {a20, a21, a22, a23, a24, a25},
            {a30, a31, a32, a33, a34, a35},
            {a40, a41, a42, a43, a44, a45},
            {a50, a51, a52, a53, a54, a55}};
        boolean conti_ge = true;
        JTextField[] tfb = {b0, b1, b2, b3, b4, b5};
        for(int i=0;i<tfa.length;i++){
            tfb[i].setEditable(false);
            tfb[i].setText("");
            for(int j=0;j<tfa[i].length;j++){
                tfa[i][j].setEditable(false);
                tfa[i][j].setText("");
            }
        }
        calc_ge.setEnabled(true);
        String inputText = no_eq_ge.getText().replace(" ", "");
        if (inputText.equals("2.0") || inputText.equals("3.0") || inputText.equals("4.0") ||
            inputText.equals("5.0") || inputText.equals("6.0")) {
            n = Integer.parseInt(inputText.substring(0, 1));
        } else {
            try {
                n = Integer.parseInt(inputText);
                if(n < 2 || n > 6) {
                    JOptionPane.showMessageDialog(null, "Enter a number in the range [2-6]");
                    conti_ge = false;
                    calc_ge.setEnabled(false);
                }
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Enter a valid number");
                conti_ge = false;
                calc_ge.setEnabled(false);
            }
        }

        if (conti_ge) {
            ge_ans.setText("");
            for(int i=0;i<n;i++){
                tfb[i].setEditable(true);
                tfb[i].setText("");
                for(int j=0;j<n;j++){
                    tfa[i][j].setEditable(true);
                    tfa[i][j].setText("");
                }
            }
        }
    }//GEN-LAST:event_go_geActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b0ActionPerformed

    private void calc_geActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc_geActionPerformed
        JTextField[][] tfa = {{a00, a01, a02, a03, a04, a05},
                              {a10, a11, a12, a13, a14, a15},
                              {a20, a21, a22, a23, a24, a25},
                              {a30, a31, a32, a33, a34, a35},
                              {a40, a41, a42, a43, a44, a45},
                              {a50, a51, a52, a53, a54, a55}};

        JTextField[] tfb = {b0, b1, b2, b3, b4, b5};
        boolean start_ge = true;
        

        double[][] matx = new double[n][n];
        double[] cons = new double[n];

        for (int i = 0; i < n; i++) {
            String trimmedText = tfb[i].getText().trim();
            trimmedText = trimmedText.replaceAll("\\s", "");
            if(new Scanner(trimmedText).hasNextDouble()){
                cons[i] = Double.valueOf(trimmedText);
            }
            else{
                if(!trimmedText.contains("/")){
                    start_ge=false;
                    break;
                }
                else{
                    cons[i] = filter_functions.parseFraction(trimmedText);
                    if (cons[i] == Double.NaN) 
                        start_ge = false;
                        break;
                }
            }
            for (int j = 0; j < n; j++) {
                String trimmedTextMatx = tfa[i][j].getText().trim();
                trimmedTextMatx = trimmedTextMatx.replaceAll("\\s", "");
                if(new Scanner(trimmedTextMatx).hasNextDouble()){
                    matx[i][j] = Double.valueOf(trimmedTextMatx);
                }
                else{
                     if(!trimmedTextMatx.contains("/")){
                        start_ge=false;
                        break;
                     }
                     else{
                        matx[i][j] = filter_functions.parseFraction(trimmedTextMatx);
                        if (matx[i][j] == Double.NaN) {
                            start_ge = false;
                            break;
                        }
                     }
                }
            }
            if (!start_ge) {
                break;
            }
        }
        
        if (start_ge) {
            gaussian_elimination(matx, cons, ge_ans);
        } else {
            JOptionPane.showMessageDialog(null, "Fill all required fields with valid numbers");
        }
    }//GEN-LAST:event_calc_geActionPerformed

    private void a54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a54ActionPerformed

    private void a44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a44ActionPerformed

    private void a34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a34ActionPerformed

    private void a24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a24ActionPerformed

    private void a03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a03ActionPerformed

    private void calc_geMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calc_geMouseEntered
        calc_ge.setIcon(new ImageIcon(getClass().getResource("assets/calculate_hover.png")));
    }//GEN-LAST:event_calc_geMouseEntered

    private void calc_geMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calc_geMouseExited
        calc_ge.setIcon(new ImageIcon(getClass().getResource("assets/calculate_normal.png")));
    }//GEN-LAST:event_calc_geMouseExited

    private void clear_geMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_geMouseEntered
        clear_ge.setIcon(new ImageIcon(getClass().getResource("assets/clear_hover.png")));
    }//GEN-LAST:event_clear_geMouseEntered

    private void clear_geMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_geMouseExited
        clear_ge.setIcon(new ImageIcon(getClass().getResource("assets/clear_normal.png")));
    }//GEN-LAST:event_clear_geMouseExited

    private void go_geMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_geMouseEntered
        go_ge.setIcon(new ImageIcon(getClass().getResource("assets/go_hover.png")));
    }//GEN-LAST:event_go_geMouseEntered

    private void go_geMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_geMouseExited
       go_ge.setIcon(new ImageIcon(getClass().getResource("assets/go_normal.png")));
    }//GEN-LAST:event_go_geMouseExited

    private void back_button_geMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_button_geMouseEntered
        back_button_ge.setIcon(new ImageIcon(getClass().getResource("assets/back_hover.png")));
    }//GEN-LAST:event_back_button_geMouseEntered

    private void back_button_geMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_button_geMouseExited
        back_button_ge.setIcon(new ImageIcon(getClass().getResource("assets/back_normal.png")));
    }//GEN-LAST:event_back_button_geMouseExited

    private void back_button_geActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_button_geActionPerformed

        back_button_ge.setIcon(new ImageIcon(getClass().getResource("assets/back_mid.png")));

        new main().setVisible(true);
        dispose();
    }//GEN-LAST:event_back_button_geActionPerformed

    public  double f;
    public  void gaussian_elimination(double[][] matx, double[] cons, JTextArea ge_ans) {
        int n = matx.length;
        StringBuilder process = new StringBuilder();

        process.append("Initial Matrix:\n");
        appendMatrix(matx, cons, process);
        process.append("\n");

        for (int k = 0; k < n; k++) {
            process.append("Step ").append(k + 1).append(":\n");
            process.append("Pivot element: ").append(matx[k][k]).append("\n");

            for (int i = k + 1; i < n; i++) {
                double f = factor(matx[i][k], matx[k][k]);
                process.append("Row ").append(i + 1).append(": ");
                for (int j = 0; j < n; j++) {
                    matx[i][j] = forward_elimination(matx[i][j], matx[k][j], f);
                    process.append(matx[i][j]).append(" ");
                }
                cons[i] = forward_elimination(cons[i], cons[k], f);
                process.append("| ").append(cons[i]).append("\n");
            }

            process.append("\nCurrent Matrix:\n");
            appendMatrix(matx, cons, process);
            process.append("\n");
        }

        ge_ans.setText(process.toString());
        back_substitution(matx, cons, ge_ans);
    }
    
    private void appendMatrix(double[][] matx, double[] cons, StringBuilder process) {
        int n = matx.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                process.append(String.format("%.2f", matx[i][j])).append("\t");
            }
            process.append("| ").append(String.format("%.2f", cons[i])).append("\n");
        }
    }

    public  double factor(double a, double b) {
        double result = a/b;
        return result;
    }
    
    

    public  double forward_elimination(double x, double y, double z) {
        double result = x - (y * z);
        return result;
    }

    public  void back_substitution(double[][] a, double[] b, JTextArea ge_ans) {
        double[] answer = new double[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            double val = 0;
            for (int j = i + 1; j < a.length; j++) {
                val += a[i][j] * answer[j];
            }
            answer[i] = (b[i] - val) / a[i][i];
        }
        final_answers(answer, ge_ans);
    }
    
    public void final_answers(double[] ans, JTextArea ge_ans){
        ge_ans.setText(ge_ans.getText()+"\n");
         ge_ans.setText(ge_ans.getText()+"\n"+"Final Answer: \n");
        String[] variables = {"x1: ", "x2: ", "x3: ", "x4: ", "x5: ", "x6: "};
        
        for(int i=0;i<ans.length;i++){
            System.out.print(variables[i]);
            
            System.out.print(": "+ans[i]+"\n");
            ge_ans.setText(ge_ans.getText()+variables[i]+ ans[i]+"\n");
            
        }

    }
    
    
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
            java.util.logging.Logger.getLogger(gauss_jordan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gauss_jordan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gauss_jordan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gauss_jordan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ge().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a00;
    private javax.swing.JTextField a01;
    private javax.swing.JTextField a02;
    private javax.swing.JTextField a03;
    private javax.swing.JTextField a04;
    private javax.swing.JTextField a05;
    private javax.swing.JTextField a10;
    private javax.swing.JTextField a11;
    private javax.swing.JTextField a12;
    private javax.swing.JTextField a13;
    private javax.swing.JTextField a14;
    private javax.swing.JTextField a15;
    private javax.swing.JTextField a20;
    private javax.swing.JTextField a21;
    private javax.swing.JTextField a22;
    private javax.swing.JTextField a23;
    private javax.swing.JTextField a24;
    private javax.swing.JTextField a25;
    private javax.swing.JTextField a30;
    private javax.swing.JTextField a31;
    private javax.swing.JTextField a32;
    private javax.swing.JTextField a33;
    private javax.swing.JTextField a34;
    private javax.swing.JTextField a35;
    private javax.swing.JTextField a40;
    private javax.swing.JTextField a41;
    private javax.swing.JTextField a42;
    private javax.swing.JTextField a43;
    private javax.swing.JTextField a44;
    private javax.swing.JTextField a45;
    private javax.swing.JTextField a50;
    private javax.swing.JTextField a51;
    private javax.swing.JTextField a52;
    private javax.swing.JTextField a53;
    private javax.swing.JTextField a54;
    private javax.swing.JTextField a55;
    private javax.swing.JTextField b0;
    private javax.swing.JTextField b1;
    private javax.swing.JTextField b2;
    private javax.swing.JTextField b3;
    private javax.swing.JTextField b4;
    private javax.swing.JTextField b5;
    private javax.swing.JButton back_button_ge;
    private javax.swing.JButton calc_ge;
    private javax.swing.JButton clear_ge;
    private javax.swing.JTextArea ge_ans;
    private javax.swing.JButton go_ge;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField no_eq_ge;
    // End of variables declaration//GEN-END:variables
}
