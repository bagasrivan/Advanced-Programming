import javax.swing.JOptionPane;

public class Case4 extends javax.swing.JFrame {

    private String Celsius;
    private String Fahrenheit;
    private String Kelvin;

    public Case4() {
        initComponents();
        buttonGroup1.add(choose1);
        buttonGroup1.add(choose2);
        buttonGroup1.add(choose3);
        buttonGroup2.add(choose4);
        buttonGroup2.add(choose5);
        buttonGroup2.add(choose6);
    }

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {
        output.setText("");
        inputValue.setText("");
    }

    private void choose1ActionPerformed(java.awt.event.ActionEvent evt) {
        Celsius = "Celcius";
        Fahrenheit = "Fahrenheit";
        Kelvin = "Kelvin";
    }

    private void choose2ActionPerformed(java.awt.event.ActionEvent evt) {
        Celsius = "Kelvin";
        Fahrenheit = "Fahrenheit";
        Kelvin = "Celcius";
    }

    private void choose3ActionPerformed(java.awt.event.ActionEvent evt) {
        Celsius = "Celcius";
        Fahrenheit = "Kelvin";
        Kelvin = "Fahrenheit";
    }

    private void choose4ActionPerformed(java.awt.event.ActionEvent evt) {
        Celsius = "Fahrenheit";
        Fahrenheit = "Celcius";
        Kelvin = "Kelvin";
    }

    private void choose5ActionPerformed(java.awt.event.ActionEvent evt) {
        Celsius = "Fahrenheit";
        Fahrenheit = "Kelvin";
        Kelvin = "Celcius";
    }

    private void choose6ActionPerformed(java.awt.event.ActionEvent evt) {
        Celsius = "Kelvin";
        Fahrenheit = "Fahrenheit";
        Kelvin = "Celcius";
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        double a;
        double b;
        double c;

        a = Double.parseDouble(inputValue.getText());
        if (Celsius == "Celcius" && Fahrenheit == "Fahrenheit") {
            b = (a * 1.8) + 32;
            c = a + 273.15;
        } else if (Celsius == "Kelvin" && Fahrenheit == "Fahrenheit") {
            b = (a * 1.8) - 459.67;
            c = a;
        } else if (Celsius == "Celcius" && Fahrenheit == "Kelvin") {
            b = (a - 273.15) * 1.8 + 32;
            c = a + 273.15;
        } else if (Celsius == "Fahrenheit" && Fahrenheit == "Celcius") {
            b = (a - 32) / 1.8;
            c = b + 273.15;
        } else if (Celsius == "Fahrenheit" && Fahrenheit == "Kelvin") {
            b = (a + 459.67) / 1.8;
            c = b + 273.15;
        } else if (Celsius == "Kelvin" && Fahrenheit == "Celcius") {
            b = a - 273.15;
            c = b * 1.8 + 32;
        }
        output.setText("" + b);
        ket.setText("" + c);
    }

    private void inputValueActionPerformed(java.awt.event.ActionEvent evt) {
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Case4().setVisible(true);
            }
        });
    }

    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton choose1;
    private javax.swing.JRadioButton choose2;
    private javax.swing.JRadioButton choose3;
    private javax.swing.JRadioButton choose4;
    private javax.swing.JRadioButton choose5;
    private javax.swing.JRadioButton choose6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField inputValue;
    private javax.swing.JTextField output;
    private javax.swing.JTextField ket;
}
