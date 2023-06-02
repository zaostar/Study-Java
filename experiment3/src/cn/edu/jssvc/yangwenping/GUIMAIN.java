package cn.edu.jssvc.yangwenping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 创建一个名为GUIMAIN的公共类，继承自JFrame，并实现ActionListener接口以处理按钮事件
public class GUIMAIN extends JFrame implements ActionListener {
	// 声明各种组件
    private JLabel nameLabel, studentIdLabel, classLabel, genderLabel, hobbyLabel;
    private JTextField nameTextField, studentIdTextField;
    private JComboBox<String> classComboBox;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private JCheckBox[] hobbyCheckBoxes;
    private JButton confirmButton, cancelButton;

    // 构造函数
    public GUIMAIN() {
        setTitle("Swing常用组件");// 设置窗口标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置关闭操作
        setSize(700, 300);// 设置窗口尺寸

        // 创建主面板，设置布局
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // 创建主面板，设置布局
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        // 初始化组件并将其添加到信息面板中
        nameLabel = new JLabel("姓名：");
        nameTextField = new JTextField(15);
        studentIdLabel = new JLabel("学号：");
        studentIdTextField = new JTextField(15);
        classLabel = new JLabel("班级：");
        String[] classNames = {"17软件工程1", "17软件工程2", "18软件工程1", "18软件工程2", "22软件工程1", "22软件工程2"};
        classComboBox = new JComboBox<>(classNames);
        infoPanel.add(nameLabel);
        infoPanel.add(nameTextField);
        infoPanel.add(studentIdLabel);
        infoPanel.add(studentIdTextField);
        infoPanel.add(classLabel);
        infoPanel.add(classComboBox);

        // 初始化性别和兴趣爱好相关的组件
        genderLabel = new JLabel("性别：");
        maleRadioButton = new JRadioButton("男");
        femaleRadioButton = new JRadioButton("女");
        hobbyLabel = new JLabel("兴趣爱好：");
        String[] hobbies = {"音乐", "文学", "旅游", "篮球", "足球", "健身"};
        hobbyCheckBoxes = new JCheckBox[hobbies.length];
        for (int i = 0; i < hobbies.length; i++) {
            hobbyCheckBoxes[i] = new JCheckBox(hobbies[i]);
        }
        
        // 初始化按钮并添加事件监听器
        confirmButton = new JButton("确认");
        cancelButton = new JButton("取消");
        confirmButton.addActionListener(this);
        cancelButton.addActionListener(this);

        // 创建单选按钮组，将性别单选按钮添加到其中
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        // 将各个面板添加到主面板中
        mainPanel.add(infoPanel);
        mainPanel.add(createPanel(genderLabel, maleRadioButton, femaleRadioButton));
        mainPanel.add(createPanel(hobbyLabel, hobbyCheckBoxes));

        // 创建包含确认和取消按钮的面板，并使用FlowLayout设置对齐方式为居中
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(confirmButton);
        buttonPanel.add(cancelButton);
        mainPanel.add(buttonPanel);

        add(mainPanel);// 将主面板添加到窗口中
        setVisible(true);// 设置窗口可见
    }

    // 创建一个面板，用于包含组件
    private JPanel createPanel(Component label, Component... components) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.add(label);
        for (Component component : components) {
            panel.add(component);
        }
        return panel;
    }

    // 处理按钮事件
    public void actionPerformed(ActionEvent e) {
    	// 如果点击了确认按钮，获取各个输入框的内容，并拼接成字符串
        if (e.getSource() == confirmButton) {
            String name = nameTextField.getText();
            String studentId = studentIdTextField.getText();
            String className = (String) classComboBox.getSelectedItem();
            String gender = maleRadioButton.isSelected() ? "男" : "女";
            StringBuilder hobbies = new StringBuilder();
            for (JCheckBox checkBox : hobbyCheckBoxes) {
                if (checkBox.isSelected()) {
                    hobbies.append(checkBox.getText()).append(" ");
                }
            }
            // 显示结果提示对话框
            JOptionPane.showMessageDialog(this, "姓名：" + name + "\n学号：" + studentId + "\n班级：" + className +
                    "\n性别：" + gender + "\n兴趣爱好：" + hobbies.toString());
        } 
        // 如果点击了取消按钮，清空各个输入框的内容
        else if (e.getSource() == cancelButton) {
            nameTextField.setText("");
            studentIdTextField.setText("");
            classComboBox.setSelectedIndex(0);
            maleRadioButton.setSelected(true);
            for (JCheckBox checkBox : hobbyCheckBoxes) {
                checkBox.setSelected(false);
            }
        }
    }

    // 主方法，创建GUIMAIN实例
    public static void main(String[] args) {
        GUIMAIN swingExample = new GUIMAIN();
    }
}