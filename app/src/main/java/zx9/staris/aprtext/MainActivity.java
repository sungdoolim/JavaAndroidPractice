package zx9.staris.aprtext;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imgView1;
    ImageView imgView2;
    int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgView1=findViewById(R.id.imgView1);
        imgView2=findViewById(R.id.imgView2);


        // 화면을 자바로 구성하기
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        Button button1 = new Button(this);
        button1.setText("Button1");
        button1.setLayoutParams(params);
        mainLayout.addView(button1);

       // setContentView(mainLayout);// 결국 위에서 만든 linearlayout을 보여준다
    }

    public void btnTestClick(View v){
        Toast.makeText(this,"토스트!",Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
            //startActivity(myIntent);
            //Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-3152-1372"));
            startActivity(myIntent);

    }

    public void btnFrameLayoutTest(View v){
        if(index==0){
            imgView1.setVisibility(View.VISIBLE);
            imgView2.setVisibility(View.INVISIBLE);
            index=1;
        }else{
            imgView2.setVisibility(View.VISIBLE);
            imgView1.setVisibility(View.INVISIBLE);

            index=0;
        }
    }
}