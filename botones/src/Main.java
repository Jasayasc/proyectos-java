import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton btn = new JButton("Click");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Click me");
            }
        });
        btn.setBounds(130,100,100,40);

        frame.add(btn);

        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}