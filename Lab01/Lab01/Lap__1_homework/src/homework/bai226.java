package homework;

import javax.swing.JOptionPane;

public class bai226 {
    public static void main(String[] args) {
        String[] options = {"PT bậc 1", "HPT 2 ẩn", "PT bậc 2", "Thoát"};
        while (true) {
            int c = JOptionPane.showOptionDialog(null, "Chọn loại phương trình:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (c == 0) { // PT bậc 1: ax + b = 0
                double a = getNum("Nhập hệ số a:");
                double b = getNum("Nhập hệ số b:");
                JOptionPane.showMessageDialog(null, (a == 0 ? (b == 0 ? "Vô số nghiệm" : "Vô nghiệm") : "x = " + (-b / a)), "Kết quả", JOptionPane.INFORMATION_MESSAGE);
            } 
            else if (c == 1) { // HPT 2 ẩn
                double a = getNum("Nhập a1:"), b = getNum("Nhập b1:"), c1 = getNum("Nhập c1:");
                double d = getNum("Nhập a2:"), e = getNum("Nhập b2:"), f = getNum("Nhập c2:");
                double D = a * e - d * b, Dx = c1 * e - f * b, Dy = a * f - d * c1;
                JOptionPane.showMessageDialog(null, (D == 0 ? (Dx == 0 && Dy == 0 ? "Vô số nghiệm" : "Vô nghiệm") : "x1 = " + (Dx / D) + ", x2 = " + (Dy / D)), "Kết quả", JOptionPane.INFORMATION_MESSAGE);
            } 
            else if (c == 2) { // PT bậc 2: ax^2 + bx + c = 0
                double a = getNum("Nhập hệ số a:");
                double b = getNum("Nhập hệ số b:");
                double c1 = getNum("Nhập hệ số c:");
                if (a == 0) {
                    JOptionPane.showMessageDialog(null, (b == 0 ? (c1 == 0 ? "Vô số nghiệm" : "Vô nghiệm") : "x = " + (-c1 / b)), "Kết quả", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    double d = b * b - 4 * a * c1;
                    JOptionPane.showMessageDialog(null, (d > 0 ? "x1 = " + (-b + Math.sqrt(d)) / (2 * a) + ", x2 = " + (-b - Math.sqrt(d)) / (2 * a) 
                            : d == 0 ? "Nghiệm kép: x = " + (-b / (2 * a)) : "Vô nghiệm"), "Kết quả", JOptionPane.INFORMATION_MESSAGE);
                }
            } 
            else break; 
        }
    }

    static double getNum(String msg) {
        return Double.parseDouble(JOptionPane.showInputDialog(msg));
    }
}
