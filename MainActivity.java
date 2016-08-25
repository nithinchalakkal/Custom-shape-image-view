package com.example.roundimage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.os.Bundle;
import android.widget.ImageView;


public class MainActivity extends Activity {

/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ImageView img1 = (ImageView) findViewById(R.id.imageView1);
    ImageView img2 = (ImageView) findViewById(R.id.imageView2);
  
    Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.qqq);

    img2.setImageResource(R.drawable.qqq);
    // TODO Auto-generated method stub
    
    
    
    Bitmap circleBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
    BitmapShader shader = new BitmapShader (bitmap,  TileMode.CLAMP, TileMode.CLAMP);
    Paint paint = new Paint();
    paint.setShader(shader);
    Canvas c = new Canvas(circleBitmap);
    c.drawCircle(bitmap.getWidth()/2, bitmap.getHeight()/2, bitmap.getWidth()/2, paint);
    

   img1.setImageBitmap(circleBitmap);
}
}
    
    
    
    
