import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class molegame extends JFrame {

    public molegame() {
        // JFrame 설정
        setTitle("두더지 잡기 게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 720);
        setLayout(new BorderLayout());

        // 백그라운드 이미지 패널 생성
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image backgroundImage = new ImageIcon("background.png").getImage();
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        // 하단 버튼 패널 생성
        JPanel buttonPanel = new JPanel();
        JButton basicButton = new JButton("BASIC");
        JButton itemButton = new JButton("ITEM");
        JButton bossButton = new JButton("BOSS");
        buttonPanel.add(basicButton);
        buttonPanel.add(itemButton);
        buttonPanel.add(bossButton);
        buttonPanel.setOpaque(false);

        basicButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // BASIC 모드 실행
            }
        });

        itemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ITEM 모드 실행
            }
        });

        bossButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // BOSS 모드 실행
            }
        });

        // 중앙 이미지 패널 생성
        JPanel imagePanel = new JPanel();
        JLabel moleImage = new JLabel(new ImageIcon("mole.png")); // 두더지 이미지
        JLabel hammerImageLeft = new JLabel(new ImageIcon("hammer_left.png")); // 왼쪽 뿅망치 이미지
        JLabel hammerImageRight = new JLabel(new ImageIcon("hammer_right.png")); // 오른쪽 뿅망치 이미지
        imagePanel.add(hammerImageRight);
        imagePanel.add(moleImage);
        imagePanel.add(hammerImageLeft);
        imagePanel.setOpaque(false);


        add(backgroundPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(imagePanel, BorderLayout.CENTER);
        // 화면 표시
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new molegame();
            }
        });
    }
}
