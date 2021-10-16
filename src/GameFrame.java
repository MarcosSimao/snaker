import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame(){
        System.out.println("ola mundoi");
        System.out.println("ola mundoi2");
      this.add(new GamePanel());
      this.setTitle("snaker");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setResizable(false);
      this.pack();
      this.setVisible(true);
      this.setLocationRelativeTo(null);
    }
}
