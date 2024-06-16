package week4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

public class Case3 extends javax.swing.JFrame {
    private final ButtonGroup buttonGroup1;
    private final javax.swing.JButton jButton1;
    private final javax.swing.JButton jButton2;
    private final javax.swing.JLabel jLabel1;
    private final javax.swing.JLabel jLabel2;
    private final javax.swing.JLabel jLabel3;
    private final javax.swing.JRadioButton choose1;
    private final javax.swing.JRadioButton choose2;
    private final javax.swing.JScrollPane jScrollPane1;
    private final javax.swing.JTextArea output;
    private final javax.swing.JTextField inputAlas;
    private final javax.swing.JTextField inputTinggi;

    public Case3() {
        initComponents();

        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(choose1);
        buttonGroup1.add(choose2);
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        choose2 = new javax.swing.JRadioButton();
        choose1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputAlas = new javax.swing.JTextField();
        inputTinggi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose Geometric Shape");

        choose2.setText("Triangle");

        choose1.setText("Parallelogram");
        choose1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                choose1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Input Base:");

        jLabel3.setText("Input Height:");

        inputAlas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                inputAlasActionPerformed(evt);
            }
        });

        jButton1.setText("Process");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        jButton2.setText("Clear");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputTinggi, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(inputAlas))
                        .addGap(83, 83, 83))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(choose1)
                            .addGap(99, 99, 99)
                            .addComponent(choose2))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choose2)
                    .addComponent(choose1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputAlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(inputTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }

    private void choose1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void inputAlasActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (choose1.isSelected()) {
            if (inputAlas.getText().isEmpty() && inputTinggi.getText().isEmpty()) {
                output.setText("Base and Height are Empty");
            } else if (inputTinggi.getText().isEmpty()) {
                output.setText("Height is Empty");
            } else if (inputAlas.getText().isEmpty()) {
                output.setText("Base is Empty");
            } else {
                int base = Integer.parseInt(inputAlas.getText());
                int height = Integer.parseInt(inputTinggi.getText());
                int result = base * height;
                output.setText("Area of " + choose1.getText() + " is " + result);
            }
        } else if (choose2.isSelected()) {
            if (inputAlas.getText().isEmpty() && inputTinggi.getText().isEmpty()) {
                output.setText("Base and Height are Empty");
            } else if (inputTinggi.getText().isEmpty()) {
                output.setText("Height is Empty");
            } else if (inputAlas.getText().isEmpty()) {
                output.setText("Base is Empty");
            } else {
                double base = Double.parseDouble(inputAlas.getText());
                double height = Double.parseDouble(inputTinggi.getText());
                double result = base * height / 2;
                output.setText("Area of " + choose2.getText() + " is " + result);
            }
        } else {
            output.setText("No Geometric Shape Selected");
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        inputAlas.setText("");
        inputTinggi.setText("");
        output.setText("");
        buttonGroup1.clearSelection();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Case3().setVisible(true);
            }
        });
    }
}
