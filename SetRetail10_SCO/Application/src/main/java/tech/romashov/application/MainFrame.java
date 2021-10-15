package tech.romashov.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.ThreadLocalRandom;

public class MainFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private Logger logger = LoggerFactory.getLogger(MainFrame.class);

    public MainFrame() {
        super("MainFrame");
        JFrame.setDefaultLookAndFeelDecorated(true);
        initFrame();
    }

    private void initFrame() {
        this.setName("TestContentPane");
        this.setTitle("TestContentPaneTitle");
        int x = ThreadLocalRandom.current().nextInt(0, 300 + 1);
        int y = ThreadLocalRandom.current().nextInt(0, 300 + 1);
        this.setLocation(x, y);

        // Создание панели с двумя кнопками
        JPanel contents = new JPanel();
        JLabel logLabel = new JLabel();
        JButton button = new JButton("Button");
        button.setName("TestButton");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                logLabel.setText("Button was clicked");
                logLabel.setName("LogLabel");
            }
        });

        contents.add(button);
        contents.add(logLabel);

        // Замена панели содержимого
        setContentPane(contents);

        // Определение размера окна
        setSize(200, 100);
        // Открытие окна
        setVisible(true);
        setAlwaysOnTop(true);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                logger.info("Close application");
                dispose();
                System.exit(0);
            }
        });
    }
}
