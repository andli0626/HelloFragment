package andli.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 在主页面容器中，添加一个Fragment
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.main_content,new PlaceholderFragment())
                .commit();
    }
}
