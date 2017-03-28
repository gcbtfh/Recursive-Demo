package demo.perfsoft.com.recursivedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countDown(3);
        printLine(10);
    }

    public void countDown(int n){
        if(n == 0){
            Log.i("HUNG", "BUM");
        }else {
            Log.i("HUNG", " "+n);
            countDown(n-1);
        }
    }

    public void printLine(int n){
        if(n > 0){
            Log.i("HUNG", "Hello World");
            printLine(n-1);
        }
    }


}
