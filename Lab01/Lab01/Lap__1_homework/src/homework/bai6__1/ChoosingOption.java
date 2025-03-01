package homework.bai6__1;
// 6.1

import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, 
                "Do you want to change to the first class ticket?");
        
        JOptionPane.showMessageDialog(null, "You've chosen: " 
                + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));

        System.exit(0);
    }
}

/*
trả lời câu hỏi

a)
Nếu ta chọn "Cancel" thay vì "Yes" hoặc "No", chương trình sẽ hiển thị thông báo "You've chosen: No". Điều này xảy ra vì giá trị trả về của JOptionPane.showConfirmDialog khi ta chọn "Cancel"  sẽ là JOptionPane.CANCEL_OPTION, nhưng trong code này, chỉ có hai trường hợp được xử lý:

Nếu option == JOptionPane.YES_OPTION, thông báo sẽ là "Yes".

Trong mọi trường hợp khác, thông báo sẽ là "No".

Vì JOptionPane.CANCEL_OPTION không được xử lý riêng biệt, nó sẽ rơi vào trường hợp mặc định là "No".

b)
Để tùy chỉnh các tùy chọn hiển thị cho người dùng thành "I do" và "I don’t", ta dùng JOptionPane.showOptionDialog thay vì JOptionPane.showConfirmDialog.

 */

