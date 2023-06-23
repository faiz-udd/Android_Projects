package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button Btn1, Btn2, Btn3, Btn4,Btn5, Btn6, Btn7, Btn8, Btn9;

    //variable for getting values in the Buttons
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;

    //
    int flag=0, count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buttons Initialization
        init();

        //Setting onClick Listener on Btn

    }
    //Init Method Definition
    private  void init(){
        Btn1= findViewById(R.id.btn1);
        Btn2 = findViewById(R.id.btn2);
        Btn3 = findViewById(R.id.btn3);
        Btn4= findViewById(R.id.btn4);
        Btn5 = findViewById(R.id.btn5);
        Btn6 = findViewById(R.id.btn6);
        Btn7= findViewById(R.id.btn7);
        Btn8 = findViewById(R.id.btn8);
        Btn9 = findViewById(R.id.btn9);
    }
    //check Function defined for as onclick Method for Buttons, This Functions will be implemented as we click the btns
    //we can also use onclick Listener but for that we have to set Onclick listener on each Btn which is more cumbersome.
    //so for keeping it simple, we'll implement this function b/c all the btn have same task to perform
    public void check(View view){
        /*
        btnCurrent is a variable of type Button.
        It is being initialized by casting the view object to the Button type.
        */
        Button btnCurrent = (Button) view;
        // Restrict user from reAssigning value to a button which already has a value in it, till the Winner is declared
        if(btnCurrent.getText().toString().equals("")) {


            count++;
        /*
        view is the object that is being casted to the Button type. (Button) is the cast operator,
        indicating that we want to treat the view object as a Button.
        The casted object is then assigned to the btnCurrent variable of type Button.
        By performing this cast, the view object is being explicitly converted to a Button type,
        allowing you to access the methods and properties specific to the Button class.
        This is useful when you have a generic View object but you know it represents a Button
        in a specific context, so you want to work with it as a Button rather than a generic View.

        Note that if the cast is not valid
        (i.e., the view object is not actually a Button or a subclass of Button),
        a ClassCastException will be thrown at runtime. Therefore, it's important to ensure
        that the object being casted  is of the correct type to avoid runtime errors.
         */

            //Put "x" in Btn when clicked for the first time and "0" for the second time and so on
            if (flag == 0) {
                btnCurrent.setText("X");
                flag = 1; //make it true for the time,if it was zero, so that in the second time it should go to else  and vise versa
            } else {
                btnCurrent.setText("O");
                flag = 0;
            }
            if (count > 4) {
                //this is to check if the values in consecutive Btn is same or not,if same then the player would be winner
                b1 = Btn1.getText().toString();
                b2 = Btn2.getText().toString();
                b3 = Btn3.getText().toString();
                b4 = Btn4.getText().toString();
                b5 = Btn5.getText().toString();
                b6 = Btn6.getText().toString();
                b7 = Btn7.getText().toString();
                b8 = Btn8.getText().toString();
                b9 = Btn9.getText().toString();

                //conditions to check if the btn values are same or not
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    //1
                    Toast.makeText(this, "Game Over! Winner is: " + b1, Toast.LENGTH_SHORT).show();
                    //If winner is declared blank all the buttons so that new game can be started and make count and flag =0; initial valu
                    NewGame();
                } else if (b4.equals(b5) && b5.equals(b6) && !b5.equals("")) {
                    //2
                    Toast.makeText(this, "Game Over! Winner is: " + b4, Toast.LENGTH_SHORT).show();
                    //If winner is declared blank all the buttons so that new game can be started and make count and flag =0; initial valu
                    NewGame();
                } else if (b7.equals(b8) && b8.equals(b9) && !b9.equals("")) {
                    //3
                    Toast.makeText(this, "Game Over! Winner is: " + b7, Toast.LENGTH_SHORT).show();
                    //If winner is declared blank all the buttons so that new game can be started and make count and flag =0; initial valu
                    NewGame();
                } else if (b1.equals(b4) && b4.equals(b7) && !b4.equals("")) {
                    //4
                    Toast.makeText(this, "Game Over! Winner is: " + b1, Toast.LENGTH_SHORT).show();
                    //If winner is declared blank all the buttons so that new game can be started and make count and flag =0; initial valu
                    NewGame();
                } else if (b2.equals(b5) && b5.equals(b8) && !b5.equals("")) {
                    //5
                    Toast.makeText(this, "Game Over! Winner is: " + b2, Toast.LENGTH_SHORT).show();
                    //If winner is declared blank all the buttons so that new game can be started and make count and flag =0; initial valu
                    NewGame();
                } else if (b3.equals(b6) && b6.equals(b9) && !b9.equals("")) {
                    //6
                    Toast.makeText(this, "Game Over! Winner is: " + b3, Toast.LENGTH_SHORT).show();
                    //If winner is declared blank all the buttons so that new game can be started and make count and flag =0; initial valu
                    NewGame();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    //7 For Diagonal Row
                    Toast.makeText(this, "Game Over! Winner is: " + b1, Toast.LENGTH_SHORT).show();
                    //If winner is declared blank all the buttons so that new game can be started and make count and flag =0; initial valu
                    NewGame();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    //8 For Diagonal row
                    Toast.makeText(this, "Game Over! Winner is: " + b3, Toast.LENGTH_SHORT).show();
                    //If winner is declared blank all the buttons so that new game can be started and make count and flag =0; initial valu
                    NewGame();
                }

            }
        }
    }
    public void NewGame(){
        Btn1.setText("");
        Btn2.setText("");
        Btn3.setText("");
        Btn4.setText("");
        Btn5.setText("");
        Btn6.setText("");
        Btn7.setText("");
        Btn8.setText("");
        Btn9.setText("");
        count =0;
        flag=0;


    }
}