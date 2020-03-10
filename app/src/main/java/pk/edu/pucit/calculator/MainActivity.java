package pk.edu.pucit.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import bsh.Interpreter;

public class MainActivity extends AppCompatActivity {

    private TextView tv_result, tv_equation, ac , div , mul , sub , seven , eight , nine , add ;
    private TextView four , five , six , per , one , two , three , del , d0 , zero , dot , eq ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_result =findViewById(R.id.tv_result);
        tv_equation=findViewById(R.id.tv_equation);
        ac=findViewById(R.id.tv_ac);
        div=findViewById(R.id.tv_div);
        mul=findViewById(R.id.tv_mul);
        sub=findViewById(R.id.tv_sub);
        seven=findViewById(R.id.tv_7);
        eight=findViewById(R.id.tv_8);
        nine=findViewById(R.id.tv_9);
        add=findViewById(R.id.tv_add);
        four=findViewById(R.id.tv_4);
        five=findViewById(R.id.tv_5);
        six=findViewById(R.id.tv_6);
        per=findViewById(R.id.tv_per);
        one=findViewById(R.id.tv_1);
        two=findViewById(R.id.tv_2);
        three=findViewById(R.id.tv_3);
        del=findViewById(R.id.tv_del);
        d0=findViewById(R.id.tv_d0);
        zero=findViewById(R.id.tv_0);
        dot=findViewById(R.id.tv_dot);
        eq=findViewById(R.id.tv_eq);
        View.OnClickListener acListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_result.setText("");
                tv_equation.setText("");
            }
        };
        View.OnClickListener divListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvValue = tv_equation.getText().toString();
                if (tvValue.length()>0) {
                    int last= tvValue.length()-1;
                    char ch=tvValue.charAt(last);
                    if(ch=='/'||ch=='*'||ch=='+'|ch=='-'||ch=='%')
                    {
                        tvValue=tvValue.substring(0,last)+'/';
                        tv_equation.setText(tvValue+"" );
                    }
                    else {
                        tv_equation.setText(tvValue + "/" + "");
                    }
                    try {
                        tvValue = tv_equation.getText().toString();
                        Interpreter interp = new Interpreter();
                        interp.eval("res=" + tvValue);
                        tv_result.setText(interp.get("res").toString());
                    } catch (Exception e) {
                    }
                }
            }
        };
        View.OnClickListener mulListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvValue = tv_equation.getText().toString();
                if (tvValue.length()>0)
                {
                    int last= tvValue.length()-1;
                    char ch=tvValue.charAt(last);
                    if(ch=='/'||ch=='*'||ch=='+'|ch=='-'||ch=='%')
                    {
                        tvValue=tvValue.substring(0,last)+'*';
                        tv_equation.setText(tvValue+"" );
                    }
                    else
                        {
                        tv_equation.setText(tvValue + "*" + "");
                    }
                    try
                    {
                        tvValue = tv_equation.getText().toString();
                        Interpreter interp = new Interpreter();
                        interp.eval("res=" + tvValue);
                        tv_result.setText(interp.get("res").toString());
                    } catch (Exception e) { }
                }
            }
        };
        View.OnClickListener subListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvValue = tv_equation.getText().toString();
                if (tvValue.length()>0)
                {
                    int last= tvValue.length()-1;
                    char ch=tvValue.charAt(last);
                    if(ch=='/'||ch=='*'||ch=='+'|ch=='-'||ch=='%')
                    {
                        tvValue=tvValue.substring(0,last)+'-';
                        tv_equation.setText(tvValue +"");
                    }
                    else
                    {
                        tv_equation.setText(tvValue + "-" + "");
                    }
                    try
                    {
                        tvValue = tv_equation.getText().toString();
                        Interpreter interp = new Interpreter();
                        interp.eval("res=" + tvValue);
                        tv_result.setText(interp.get("res").toString());
                    } catch (Exception e) { }
                }
            }
        };
        View.OnClickListener sevenListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvValue = tv_equation.getText().toString();
                tv_equation.setText(tvValue+"7"+"");
                try{
                    tvValue = tv_equation.getText().toString();
                    Interpreter interp = new Interpreter();
                    interp.eval("res=" + tvValue);
                    tv_result.setText(interp.get("res").toString());
                }catch(Exception e){}
            }
        };
        View.OnClickListener eightListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvValue = tv_equation.getText().toString();
                tv_equation.setText(tvValue+"8"+"");
                try{
                    tvValue = tv_equation.getText().toString();
                    Interpreter interp = new Interpreter();
                    interp.eval("res=" + tvValue);
                    tv_result.setText(interp.get("res").toString());
                }catch(Exception e){}
            }
        };
        View.OnClickListener nineListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvValue = tv_equation.getText().toString();
                tv_equation.setText(tvValue+"9"+"");
                try{
                    tvValue = tv_equation.getText().toString();
                    Interpreter interp = new Interpreter();
                    interp.eval("res=" + tvValue);
                    tv_result.setText(interp.get("res").toString());
                }catch(Exception e){}
            }
        };
        View.OnClickListener addListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvValue = tv_equation.getText().toString();
                if (tvValue.length()>0) {
                    int last= tvValue.length()-1;
                    char ch=tvValue.charAt(last);
                    if(ch=='/'||ch=='*'||ch=='+'|ch=='-'||ch=='%')
                    {
                        tvValue=tvValue.substring(0,last)+'+';
                        tv_equation.setText(tvValue+"" );
                    }
                    else {
                        tv_equation.setText(tvValue + "+" + "");
                    }
                    try {
                        tvValue = tv_equation.getText().toString();
                        Interpreter interp = new Interpreter();
                        interp.eval("res=" + tvValue);
                        tv_result.setText(interp.get("res").toString());
                    } catch (Exception e) {
                    }
                }
            }
        };
        View.OnClickListener fourListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvValue = tv_equation.getText().toString();
                tv_equation.setText(tvValue+"4"+"");
                try{
                    tvValue = tv_equation.getText().toString();
                    Interpreter interp = new Interpreter();
                    interp.eval("res=" + tvValue);
                    tv_result.setText(interp.get("res").toString());
                }catch(Exception e){}
            }
        };
        View.OnClickListener fiveListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvValue = tv_equation.getText().toString();
                tv_equation.setText(tvValue+"5"+"");
                try{
                    tvValue = tv_equation.getText().toString();
                    Interpreter interp = new Interpreter();
                    interp.eval("res=" + tvValue);
                    tv_result.setText(interp.get("res").toString());
                }catch(Exception e){}
            }
        };
        View.OnClickListener sixListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvValue = tv_equation.getText().toString();
                tv_equation.setText(tvValue+"6"+"");
                try{
                    tvValue = tv_equation.getText().toString();
                    Interpreter interp = new Interpreter();
                    interp.eval("res=" + tvValue);
                    tv_result.setText(interp.get("res").toString());
                }catch(Exception e){}
            }
        };
        View.OnClickListener perListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvValue = tv_equation.getText().toString();
                if (tvValue.length()>0) {
                    int last= tvValue.length()-1;
                    char ch=tvValue.charAt(last);
                    if(ch=='/'||ch=='*'||ch=='+'|ch=='-'||ch=='%')
                    {
                        tvValue=tvValue.substring(0,last)+'%';
                        tv_equation.setText(tvValue+"" );
                    }
                    else {
                        tv_equation.setText(tvValue + "%" + "");
                    }
                    try {
                        tvValue = tv_equation.getText().toString();
                        Interpreter interp = new Interpreter();
                        interp.eval("res=" + tvValue);
                        tv_result.setText(interp.get("res").toString());
                    } catch (Exception e) {
                    }
                }
            }
        };
        View.OnClickListener oneListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvValue = tv_equation.getText().toString();
                tv_equation.setText(tvValue+"1"+"");
                try{
                    tvValue = tv_equation.getText().toString();
                    Interpreter interp = new Interpreter();
                    interp.eval("res=" + tvValue);
                    tv_result.setText(interp.get("res").toString());
                }catch(Exception e){}
            }
        };
        View.OnClickListener twoListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvValue = tv_equation.getText().toString();
                tv_equation.setText(tvValue+"2"+"");
                try{
                    tvValue = tv_equation.getText().toString();
                    Interpreter interp = new Interpreter();
                    interp.eval("res=" + tvValue);
                    tv_result.setText(interp.get("res").toString());
                }catch(Exception e){}
            }
        };
        View.OnClickListener threeListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvValue = tv_equation.getText().toString();
                tv_equation.setText(tvValue+"3"+"");
                try{
                    tvValue = tv_equation.getText().toString();
                    Interpreter interp = new Interpreter();
                    interp.eval("res=" + tvValue);
                    tv_result.setText(interp.get("res").toString());
                }catch(Exception e){}
            }
        };
        View.OnClickListener delListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvValue = tv_equation.getText().toString();
               tvValue= tvValue.substring(0, tvValue.length() - 1);
                tv_equation.setText(tvValue+"");
                try{
                    tvValue = tv_equation.getText().toString();
                    Interpreter interpreter = new Interpreter();
                    interpreter.eval("result=" + tvValue);
                    tv_result.setText(interpreter.get("result").toString());
                }catch(Exception e){}
            }
        };
        View.OnClickListener d0Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvValue = tv_equation.getText().toString();
                int last= tvValue.length()-1;
                char ch=tvValue.charAt(last);
                if(ch=='/')
                {
                    tv_equation.setText("" );
                    tv_result.setText("Error");
                }
                else {
                    tv_equation.setText(tvValue + "00" + "");
                    try {
                        tvValue = tv_equation.getText().toString();
                        Interpreter interp = new Interpreter();
                        interp.eval("res=" + tvValue);
                        tv_result.setText(interp.get("res").toString());
                    } catch (Exception e) {
                    }
                }
            }
        };
        View.OnClickListener zeroListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvValue = tv_equation.getText().toString();
                int last= tvValue.length()-1;
                char ch=tvValue.charAt(last);
                if(ch=='/')
                {
                    tv_equation.setText("" );
                    tv_result.setText("Error");
                }
                else
                    {
                    tv_equation.setText(tvValue + "0" + "");
                    try {
                        tvValue = tv_equation.getText().toString();
                        Interpreter interp = new Interpreter();
                        interp.eval("res=" + tvValue);
                        tv_result.setText(interp.get("res").toString());
                    } catch (Exception e) {
                    }
                }
            }
        };
        View.OnClickListener dotListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvValue = tv_equation.getText().toString();
                if (tvValue.length()>0) {
                    int last= tvValue.length()-1;
                    char ch=tvValue.charAt(last);
                    if(ch=='.')
                    {
                        tvValue=tvValue.substring(0,last)+'.';
                        tv_equation.setText(tvValue+"" );
                    }
                    else {
                        tv_equation.setText(tvValue + "." + "");
                    }
                    try {
                        tvValue = tv_equation.getText().toString();
                        Interpreter interp = new Interpreter();
                        interp.eval("res=" + tvValue);
                        tv_result.setText(interp.get("res").toString());
                    } catch (Exception e) {
                    }
                }
            }

        };
        View.OnClickListener eqListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String tvValue = tv_equation.getText().toString();
                    Interpreter interpreter = new Interpreter();
                    interpreter.eval("result=" + tvValue);
                    tv_equation.setText(interpreter.get("result").toString());
                    tv_result.setText("");
                }catch(Exception e){}
            }
        };
        d0.setOnClickListener(d0Listener);
        zero.setOnClickListener(zeroListener);
        dot.setOnClickListener(dotListener);
        eq.setOnClickListener(eqListener);
        del.setOnClickListener(delListener);
        three.setOnClickListener(threeListener);
        two.setOnClickListener(twoListener);
        one.setOnClickListener(oneListener);
        per.setOnClickListener(perListener);
        six.setOnClickListener(sixListener);
        five.setOnClickListener(fiveListener);
        four.setOnClickListener(fourListener);
        add.setOnClickListener(addListener);
        nine.setOnClickListener(nineListener);
        eight.setOnClickListener(eightListener);
        seven.setOnClickListener(sevenListener);
        sub.setOnClickListener(subListener);
        mul.setOnClickListener(mulListener);
        div.setOnClickListener(divListener);
        ac.setOnClickListener(acListener);
    }
}
