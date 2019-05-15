package com.henry.first;

        import android.os.PersistableBundle;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView score;
    TextView score2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        score = findViewById(R.id.score);
        score2 = findViewById(R.id.score2);
    }

    //保留分数
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String scorea = score.getText().toString();
        String scoreb = score2.getText().toString();
        outState.putString("teama_score",scorea);
        outState.putString("teamb_score",scoreb);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String scorea = savedInstanceState.getString("teama_score");
        String scoreb = savedInstanceState.getString("teamb_score");
        score.setText(scorea);
        score2.setText(scoreb);
    }





    public void btnAdd1(View btn){
        if(btn.getId()==R.id.btn1){
            showScore(1);
        }else{
            showScore2(1);
        }
    }

    public void btnAdd2(View btn){
       if(btn.getId()==R.id.btn2){
           showScore(2);
       }else{
           showScore2(2);
       }

    }

    public void btnAdd3(View btn){
        if(btn.getId()==R.id.btn3){
            showScore(3);
        }else {
            showScore2(3);
        }
    }


    public void Reset(View btn){
        score.setText("0");
        score2.setText("0");
    }


    private void showScore(int inc){
        String oldScore =(String)score.getText();
        int newScore = Integer.parseInt(oldScore)+inc;
        score.setText("" + newScore);

    }
    private void showScore2(int inc){
        String oldScore =(String)score2.getText();
        int newScore = Integer.parseInt(oldScore)+inc;
        score2.setText("" + newScore);

    }
}
