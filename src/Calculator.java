import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JFrame jf;
    JLabel jl;
    JButton SevenButton;
    JButton EightButton;
    JButton NineButton;
    JButton FourButton;
    JButton FiveButton;
    JButton SixButton;
    JButton OneButton;
    JButton TwoButton;
    JButton ThreeButton;
    JButton DotButton;
    JButton ZeroButton;
    JButton EqualButton;
    JButton DivButton;
    JButton MulButton;
    JButton MinusButton;
    JButton AddButton;
    JButton CButton;
    String OldValue;
    // String NewValue;
    boolean sum;
    boolean mul;
    boolean div;
    boolean minus;


    boolean isoperatorclicked = false;


    Calculator() {

        jf = new JFrame(" Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(300,100);
        jf.getContentPane().setBackground(Color.BLUE);



        jl = new JLabel("");
        jl.setBounds(30,50,540,40);
        jl.setBackground(Color.gray);
        jl.setOpaque(true);
        jl.setHorizontalAlignment(SwingConstants.RIGHT);
        jl.setForeground(Color.white);

        jf.add(jl);

// First row

        SevenButton = new JButton("7");
        SevenButton.setBounds(30,130,80,80);
        SevenButton.setFont(new Font("Arial",Font.PLAIN,40));
        SevenButton.addActionListener(this);

        jf.add(SevenButton);

        EightButton = new JButton("8");
        EightButton.setBounds(130,130,80,80);
        EightButton.setFont(new Font("Arial",Font.PLAIN,40));
        EightButton.addActionListener(this);

        jf.add(EightButton);

        NineButton = new JButton("9");
        NineButton.setBounds(230,130,80,80);
        NineButton.setFont(new Font("Arial",Font.PLAIN,40));
        NineButton.addActionListener(this);

        jf.add(NineButton);

        // Second row

        FourButton = new JButton("4");
        FourButton.setBounds(30,230,80,80);
        FourButton.setFont(new Font("Arial",Font.PLAIN,40));
        FourButton.addActionListener(this);

        jf.add(FourButton);

        FiveButton = new JButton("5");
        FiveButton.setBounds(130,230,80,80);
        FiveButton.setFont(new Font("Arial",Font.PLAIN,40));
        FiveButton.addActionListener(this);

        jf.add(FiveButton);

        SixButton = new JButton("6");
        SixButton.setBounds(230,230,80,80);
        SixButton.setFont(new Font("Arial",Font.PLAIN,40));
        SixButton.addActionListener(this);

        jf.add(SixButton);

        // third row

        OneButton = new JButton("1");
        OneButton.setBounds(30,330,80,80);
        OneButton.setFont(new Font("Arial",Font.PLAIN,40));
        OneButton.addActionListener(this);
        jf.add(OneButton);

        TwoButton = new JButton("2");
        TwoButton.setBounds(130,330,80,80);
        TwoButton.setFont(new Font("Arial",Font.PLAIN,40));
        TwoButton.addActionListener(this);

        jf.add(TwoButton);

        ThreeButton = new JButton("3");
        ThreeButton.setBounds(230,330,80,80);
        ThreeButton.setFont(new Font("Arial",Font.PLAIN,40));
        ThreeButton.addActionListener(this);

        jf.add(ThreeButton);

        // fourth row

        DotButton = new JButton(".");
        DotButton.setBounds(30,430,80,80);
        DotButton.setFont(new Font("Arial",Font.PLAIN,40));
        DotButton.addActionListener(this);

        jf.add(DotButton);

        ZeroButton = new JButton("0");
        ZeroButton.setBounds(130,430,80,80);
        ZeroButton.setFont(new Font("Arial",Font.PLAIN,40));
        ZeroButton.addActionListener(this);

        jf.add(ZeroButton);

        EqualButton = new JButton("=");
        EqualButton.setBounds(230,430,80,80);
        EqualButton.setFont(new Font("Arial",Font.PLAIN,40));
        EqualButton.addActionListener(this);

        jf.add(EqualButton);

        // fourth coloumn

        DivButton = new JButton("/");
        DivButton.setBounds(330,130,80,80);
        DivButton.setFont(new Font("Arial",Font.PLAIN,40));
        DivButton.addActionListener(this);

        jf.add(DivButton);

        MulButton = new JButton("*");
        MulButton.setBounds(330,230,80,80);
        MulButton.setFont(new Font("Arial",Font.PLAIN,40));
        MulButton.addActionListener(this);

        jf.add(MulButton);

        MinusButton = new JButton("-");
        MinusButton.setBounds(330,330,80,80);
        MinusButton.setFont(new Font("Arial",Font.PLAIN,40));
        MinusButton.addActionListener(this);

        jf.add(MinusButton);

        AddButton = new JButton("+");
        AddButton.setBounds(330,430,80,80);
        AddButton.setFont(new Font("Arial",Font.PLAIN,40));
        AddButton.addActionListener(this);

        jf.add(AddButton);

        CButton = new JButton("C");
        CButton.setBounds(430,130,80,80);
        CButton.setFont(new Font("Arial",Font.PLAIN,40));
        CButton.addActionListener(this);

        jf.add(CButton);




        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        // write your code here

        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == OneButton){
            if (isoperatorclicked){
                jl.setText("1");
                isoperatorclicked=false;
            }else {
                jl.setText(jl.getText() + "1");
            }
        } else if(e.getSource() == TwoButton){

            if (isoperatorclicked){
                jl.setText("2");
                isoperatorclicked=false;
            }else {
                jl.setText(jl.getText() + "2");
            }
        }else if (e.getSource()== ThreeButton){

            if (isoperatorclicked){
                jl.setText("3");
                isoperatorclicked=false;
            }else {
                jl.setText(jl.getText() + "3");
            }
        }else if (e.getSource() == FourButton){

            if (isoperatorclicked){
                jl.setText("4");
                isoperatorclicked=false;
            }else {
                jl.setText(jl.getText() + "4");
            }

        }else if (e.getSource() == FiveButton){

            if (isoperatorclicked){
                jl.setText("5");
                isoperatorclicked=false;
            }else {
                jl.setText(jl.getText() + "5");
            }

        }else if (e.getSource() == SixButton){

            if (isoperatorclicked){
                jl.setText("6");
                isoperatorclicked=false;
            }else {
                jl.setText(jl.getText() + "6");
            }
        }else if (e.getSource() == SevenButton){

            if (isoperatorclicked){
                jl.setText("7");
                isoperatorclicked=false;
            }else {
                jl.setText(jl.getText() + "7");
            }

        }else if(e.getSource() == EightButton){

            if (isoperatorclicked){
                jl.setText("8");
                isoperatorclicked=false;
            }else {
                jl.setText(jl.getText() + "8");
            }

        }else if (e.getSource() == NineButton){

            if (isoperatorclicked){
                jl.setText("9");
                isoperatorclicked=false;
            }else {
                jl.setText(jl.getText() + "9");
            }

        }else if (e.getSource() == ZeroButton){

            if (isoperatorclicked){
                jl.setText("0");
                isoperatorclicked=false;
            }else {
                jl.setText(jl.getText() + "0");
            }
        }else if(e.getSource() == CButton){
            jl.setText( " " );

        }else if(e.getSource() == DotButton){
            jl.setText( jl.getText()+"." );

        }else if (e.getSource() == EqualButton){

            if (sum){

                String NewValue = jl.getText();
                float OldValueF = Float.parseFloat(OldValue);
                float NewValueF = Float.parseFloat(NewValue);

                float result = OldValueF+NewValueF;
                jl.setText(result + "");
                sum=false;

            }else if (mul){

                String NewValue = jl.getText();
                float OldValueF = Float.parseFloat(OldValue);
                float NewValueF = Float.parseFloat(NewValue);

                float result = OldValueF*NewValueF;
                jl.setText(result + "");
                mul=false;

            }else if (div){

                String NewValue = jl.getText();
                float OldValueF = Float.parseFloat(OldValue);
                float NewValueF = Float.parseFloat(NewValue);

                float result = OldValueF/NewValueF;
                jl.setText(result + "");
                div=false;

            }else if (minus){

                String NewValue = jl.getText();
                float OldValueF = Float.parseFloat(OldValue);
                float NewValueF = Float.parseFloat(NewValue);

                float result = OldValueF-NewValueF;
                jl.setText(result + "");
                minus=false;

            }


        }else if (e.getSource() == AddButton){

            isoperatorclicked=true;
            OldValue = jl.getText();
            sum =true;

            //  jl.setText(" ");

        }else if (e.getSource() == MulButton){

            isoperatorclicked=true;
            OldValue = jl.getText();
            mul=true;


        }else if (e.getSource() == DivButton){

            isoperatorclicked=true;
            OldValue = jl.getText();
            div=true;

        }else if (e.getSource() == MinusButton){

            isoperatorclicked=true;
            OldValue = jl.getText();
            minus=true;

        }
    }
}



//   code link : https://drive.google.com/file/d/1cyQuPyXR0BpfVLQ6j5rpP_if6cEgcFl9/view?usp=sharing
