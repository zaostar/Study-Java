package cn.edu.jssvc.yangwenping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ����һ����ΪGUIMAIN�Ĺ����࣬�̳���JFrame����ʵ��ActionListener�ӿ��Դ���ť�¼�
public class GUIMAIN extends JFrame implements ActionListener {
	// �����������
    private JLabel nameLabel, studentIdLabel, classLabel, genderLabel, hobbyLabel;
    private JTextField nameTextField, studentIdTextField;
    private JComboBox<String> classComboBox;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private JCheckBox[] hobbyCheckBoxes;
    private JButton confirmButton, cancelButton;

    // ���캯��
    public GUIMAIN() {
        setTitle("Swing�������");// ���ô��ڱ���
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ���ùرղ���
        setSize(700, 300);// ���ô��ڳߴ�

        // ��������壬���ò���
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // ��������壬���ò���
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        // ��ʼ�������������ӵ���Ϣ�����
        nameLabel = new JLabel("������");
        nameTextField = new JTextField(15);
        studentIdLabel = new JLabel("ѧ�ţ�");
        studentIdTextField = new JTextField(15);
        classLabel = new JLabel("�༶��");
        String[] classNames = {"17�������1", "17�������2", "18�������1", "18�������2", "22�������1", "22�������2"};
        classComboBox = new JComboBox<>(classNames);
        infoPanel.add(nameLabel);
        infoPanel.add(nameTextField);
        infoPanel.add(studentIdLabel);
        infoPanel.add(studentIdTextField);
        infoPanel.add(classLabel);
        infoPanel.add(classComboBox);

        // ��ʼ���Ա����Ȥ������ص����
        genderLabel = new JLabel("�Ա�");
        maleRadioButton = new JRadioButton("��");
        femaleRadioButton = new JRadioButton("Ů");
        hobbyLabel = new JLabel("��Ȥ���ã�");
        String[] hobbies = {"����", "��ѧ", "����", "����", "����", "����"};
        hobbyCheckBoxes = new JCheckBox[hobbies.length];
        for (int i = 0; i < hobbies.length; i++) {
            hobbyCheckBoxes[i] = new JCheckBox(hobbies[i]);
        }
        
        // ��ʼ����ť������¼�������
        confirmButton = new JButton("ȷ��");
        cancelButton = new JButton("ȡ��");
        confirmButton.addActionListener(this);
        cancelButton.addActionListener(this);

        // ������ѡ��ť�飬���Ա�ѡ��ť��ӵ�����
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        // �����������ӵ��������
        mainPanel.add(infoPanel);
        mainPanel.add(createPanel(genderLabel, maleRadioButton, femaleRadioButton));
        mainPanel.add(createPanel(hobbyLabel, hobbyCheckBoxes));

        // ��������ȷ�Ϻ�ȡ����ť����壬��ʹ��FlowLayout���ö��뷽ʽΪ����
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(confirmButton);
        buttonPanel.add(cancelButton);
        mainPanel.add(buttonPanel);

        add(mainPanel);// ���������ӵ�������
        setVisible(true);// ���ô��ڿɼ�
    }

    // ����һ����壬���ڰ������
    private JPanel createPanel(Component label, Component... components) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.add(label);
        for (Component component : components) {
            panel.add(component);
        }
        return panel;
    }

    // ����ť�¼�
    public void actionPerformed(ActionEvent e) {
    	// ��������ȷ�ϰ�ť����ȡ�������������ݣ���ƴ�ӳ��ַ���
        if (e.getSource() == confirmButton) {
            String name = nameTextField.getText();
            String studentId = studentIdTextField.getText();
            String className = (String) classComboBox.getSelectedItem();
            String gender = maleRadioButton.isSelected() ? "��" : "Ů";
            StringBuilder hobbies = new StringBuilder();
            for (JCheckBox checkBox : hobbyCheckBoxes) {
                if (checkBox.isSelected()) {
                    hobbies.append(checkBox.getText()).append(" ");
                }
            }
            // ��ʾ�����ʾ�Ի���
            JOptionPane.showMessageDialog(this, "������" + name + "\nѧ�ţ�" + studentId + "\n�༶��" + className +
                    "\n�Ա�" + gender + "\n��Ȥ���ã�" + hobbies.toString());
        } 
        // ��������ȡ����ť����ո�������������
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

    // ������������GUIMAINʵ��
    public static void main(String[] args) {
        GUIMAIN swingExample = new GUIMAIN();
    }
}