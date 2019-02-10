package com.example.sasorishi.calculatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9 ,bt0;
    private Button btComa, btEqual, btPlus, btSoustract, btMutiplicate, btDivide, btDelete, btErase, btReturn, btCos, btSin, btTan, btRacine, btExposant;
    private TextView display;

    private String ConvertString = "";
    private double value = 0;
    private double value2 = 0;
    private double calcul = 0;
    private boolean newCalcul = false;

    DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
    DecimalFormat df = new DecimalFormat("#.##########", otherSymbols);

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bt0 = (Button) findViewById(R.id.idBt0);
        this.bt1 = (Button) findViewById(R.id.idBt1);
        this.bt2 = (Button) findViewById(R.id.idBt2);
        this.bt3 = (Button) findViewById(R.id.idBt3);
        this.bt4 = (Button) findViewById(R.id.idBt4);
        this.bt5 = (Button) findViewById(R.id.idBt5);
        this.bt6 = (Button) findViewById(R.id.idBt6);
        this.bt7 = (Button) findViewById(R.id.idBt7);
        this.bt8 = (Button) findViewById(R.id.idBt8);
        this.bt9 = (Button) findViewById(R.id.idBt9);

        this.btComa = (Button) findViewById(R.id.idBtComa);
        this.btEqual = (Button) findViewById(R.id.idBtEqual);
        this.btPlus = (Button) findViewById(R.id.idBtPlus);
        this.btSoustract = (Button) findViewById(R.id.idBtSoustract);
        this.btDivide = (Button) findViewById(R.id.idBtDivide);
        this.btMutiplicate = (Button) findViewById(R.id.idBtMultiplicate);
        this.btDelete = (Button) findViewById(R.id.idBtDelete);
        this.btErase = (Button) findViewById(R.id.idBtErase);
        this.btReturn = (Button) findViewById(R.id.idBtReturn);
        this.btRacine = (Button) findViewById(R.id.idBtRacine);
        this.btExposant = (Button) findViewById(R.id.idBtExposant);

        this.btCos = (Button) findViewById(R.id.idBtCos);
        this.btSin = (Button) findViewById(R.id.idBtSin);
        this.btTan = (Button) findViewById(R.id.idBtTan);

        this.display = (TextView) findViewById(R.id.idDisplay);
        this.display.setMovementMethod(new ScrollingMovementMethod());

        this.bt0.setOnClickListener(this);
        this.bt1.setOnClickListener(this);
        this.bt2.setOnClickListener(this);
        this.bt3.setOnClickListener(this);
        this.bt4.setOnClickListener(this);
        this.bt5.setOnClickListener(this);
        this.bt6.setOnClickListener(this);
        this.bt7.setOnClickListener(this);
        this.bt8.setOnClickListener(this);
        this.bt9.setOnClickListener(this);

        this.btComa.setOnClickListener(this);
        this.btEqual.setOnClickListener(this);
        this.btPlus.setOnClickListener(this);
        this.btSoustract.setOnClickListener(this);
        this.btDivide.setOnClickListener(this);
        this.btMutiplicate.setOnClickListener(this);
        this.btDelete.setOnClickListener(this);
        this.btErase.setOnClickListener(this);
        this.btReturn.setOnClickListener(this);
        this.btRacine.setOnClickListener(this);
        this.btExposant.setOnClickListener(this);

        this.btCos.setOnClickListener(this);
        this.btTan.setOnClickListener(this);
        this.btSin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId() == R.id.idBt0)
        {
            this.display.setText(this.display.getText() + "0");
            if(newCalcul == true)
            {
                display.setText("");
                display.setText(display.getText() + "0");
                System.out.println(this.display);
                this.newCalcul = false;
            }
        }

        if(v.getId() == R.id.idBt1)
        {
            this.display.setText(this.display.getText() + "1");
            if(newCalcul == true)
            {
                display.setText("");
                display.setText(display.getText() + "1");
                System.out.println(this.display);
                this.newCalcul = false;
            }
        }

        if(v.getId() == R.id.idBt2)
        {
            this.display.setText(this.display.getText() + "2");
            if(newCalcul == true)
            {
                display.setText("");
                display.setText(display.getText() + "2");
                System.out.println(this.display);
                this.newCalcul = false;
            }
        }

        if(v.getId() == R.id.idBt3)
        {
            this.display.setText(this.display.getText() + "3");
            if(newCalcul == true)
            {
                display.setText("");
                display.setText(display.getText() + "3");
                System.out.println(this.display);
                this.newCalcul = false;
            }
        }

        if(v.getId() == R.id.idBt4)
        {
            this.display.setText(this.display.getText() + "4");
            if(newCalcul == true)
            {
                display.setText("");
                display.setText(display.getText() + "4");
                System.out.println(this.display);
                this.newCalcul = false;
            }
        }

        if(v.getId() == R.id.idBt5)
        {
            this.display.setText(this.display.getText() + "5");
            if(newCalcul == true)
            {
                display.setText("");
                display.setText(display.getText() + "5");
                System.out.println(this.display);
                this.newCalcul = false;
            }
        }

        if(v.getId() == R.id.idBt6)
        {
            this.display.setText(this.display.getText() + "6");
            if(newCalcul == true)
            {
                display.setText("");
                display.setText(display.getText() + "6");
                System.out.println(this.display);
                this.newCalcul = false;
            }
        }

        if(v.getId() == R.id.idBt7)
        {
            this.display.setText(this.display.getText() + "7");
            if(newCalcul == true)
            {
                display.setText("");
                display.setText(display.getText() + "7");
                System.out.println(this.display);
                this.newCalcul = false;
            }
        }

        if(v.getId() == R.id.idBt8)
        {
            this.display.setText(this.display.getText() + "8");
            if(newCalcul == true)
            {
                display.setText("");
                display.setText(display.getText() + "8");
                System.out.println(this.display);
                this.newCalcul = false;
            }
        }

        if(v.getId() == R.id.idBt9)
        {
            this.display.setText(this.display.getText() + "9");
            if(newCalcul == true)
            {
                display.setText("");
                display.setText(display.getText() + "9");
                System.out.println(this.display);
                this.newCalcul = false;
            }
        }

        if(v.getId() == R.id.idBtComa)
        {
            this.display.setText(this.display.getText() + ",");
        }

        if(v.getId() == R.id.idBtPlus)
        {
            this.display.setText(this.display.getText() + "+");
        }

        if(v.getId() == R.id.idBtSoustract)
        {
            this.display.setText(this.display.getText() + "-");
        }

        if(v.getId() == R.id.idBtMultiplicate)
        {
            this.display.setText(this.display.getText() + "*");
        }

        if(v.getId() == R.id.idBtDivide)
        {
            this.display.setText(this.display.getText() + "÷");
        }

        if(v.getId() == R.id.idBtRacine)
        {
            this.display.setText(this.display.getText() + "Ѵ");
        }

        if(v.getId() == R.id.idBtExposant)
        {
            this.display.setText(this.display.getText() + "^");
        }

        if(v.getId() == R.id.idBtCos)
        {
            this.display.setText(this.display.getText() + "cos");
        }

        if(v.getId() == R.id.idBtTan)
        {
            this.display.setText(this.display.getText() + "tan");
        }

        if(v.getId() == R.id.idBtSin)
        {
            this.display.setText(this.display.getText() + "sin");
        }

        if(v.getId() == R.id.idBtDelete)
        {
            this.display.setText("");
        }

        if(v.getId() == R.id.idBtErase)
        {
            this.display.setText("");
        }

        if(v.getId() == R.id.idBtReturn)
        {
            //this.display.setText(display.getText().substring(0, display.getText ().length() - 1));
        }

        if(v.getId() == R.id.idBtEqual)
        {
            this.ConvertString = this.display.getText().toString();

            String[] parts = ConvertString.split("[\\+ \\- \\* \\÷ \\= \\^ \\Ѵ cos tan sin]");

            if(ConvertString.contains("+"))
            {
                int split = ConvertString.split("\\+",-1).length-1;

                String part1 = parts[0];
                this.value = Float.parseFloat(part1);

                for(int i = 1; i <= split; i++)
                {
                    String part2 = parts[i];
                    this.value2 = Float.parseFloat(part2);
                    this.value += this.value2;
                }
                this.calcul = this.value;
                this.display.setText("" + df.format(this.calcul));
                this.newCalcul = true;
            }

            if(ConvertString.contains("-"))
            {
                int split = ConvertString.split("\\-",-1).length-1;

                String part1 = parts[0];
                this.value = Float.parseFloat(part1);

                for(int i = 1; i <= split; i++)
                {
                    String part2 = parts[i];
                    this.value2 = Float.parseFloat(part2);
                    this.value -= this.value2;
                }
                this.calcul = this.value;
                this.display.setText("" + df.format(this.calcul));
                this.newCalcul = true;
            }

            if(ConvertString.contains("*"))
            {
                int split = ConvertString.split("\\*",-1).length-1;

                String part1 = parts[0];
                this.value = Float.parseFloat(part1);

                for(int i = 1; i <= split; i++)
                {
                    String part2 = parts[i];
                    this.value2 = Float.parseFloat(part2);
                    this.value *= this.value2;
                }
                this.calcul = this.value;
                this.display.setText("" + df.format(this.calcul));
                this.newCalcul = true;
            }

            if(ConvertString.contains("÷"))
            {
                int split = ConvertString.split("\\÷",-1).length-1;

                String part1 = parts[0];
                this.value = Float.parseFloat(part1);

                for(int i = 1; i <= split; i++)
                {
                    String part2 = parts[i];
                    this.value2 = Float.parseFloat(part2);
                    this.value /= this.value2;
                }
                this.calcul = this.value;
                this.display.setText("" + df.format(this.calcul));
                this.newCalcul = true;
            }

            if(ConvertString.contains("Ѵ"))
            {
                String part2 = parts[1];
                this.value = Float.parseFloat(part2);

                this.calcul = Math.sqrt(this.value);
                this.display.setText("" + df.format(this.calcul));
                this.newCalcul = true;
            }

            if(ConvertString.contains("^"))
            {
                String part1 = parts[0];
                String part2 = parts[1];
                this.value = Float.parseFloat(part2);

                this.value = Float.parseFloat(part1);
                this.value2 = Float.parseFloat(part2);

                this.calcul = Math.pow(this.value, this.value2);
                this.display.setText("" + df.format(this.calcul));
                this.newCalcul = true;
            }

            if(ConvertString.contains("cos"))
            {
                String part1 = parts[0];
                this.value = Double.parseDouble(part1);

                double angleRadian = Math.toRadians(value);
                this.calcul = Math.cos(angleRadian);
                this.display.setText("" + df.format(this.calcul));
                this.newCalcul = true;
            }

            if(ConvertString.contains("tan"))
            {
                String part1 = parts[0];
                this.value = Double.parseDouble(part1);

                double angleRadian = Math.toRadians(value);
                this.calcul = Math.tan(angleRadian);
                this.display.setText("" + df.format(this.calcul));
                this.newCalcul = true;
            }

            if(ConvertString.contains("sin"))
            {
                String part1 = parts[0];
                this.value = Double.parseDouble(part1);

                double angleRadian = Math.toRadians(value);
                this.calcul = Math.sin(angleRadian);
                this.display.setText("" + df.format(this.calcul));
                this.newCalcul = true;
            }
        }
    }
}
