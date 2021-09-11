package zx9.staris.aprtext;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnTestClick(View v){
        Toast.makeText(this,"토스트!",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
            //startActivity(myIntent);
            //Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-3152-1372"));
            startActivity(myIntent);

    }
}