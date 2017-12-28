package sanjeev.example.com.searchlist;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.electra.lib.searchdialogue.SearchDialogue;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array = new ArrayList<>();
                array.add("Hardik");
                array.add("Archit");
                array.add("Jignesh");
                array.add("Umang");
                array.add("Gatti");

                SearchDialogue.show(MainActivity.this, array);
            }
        });


    }
}
