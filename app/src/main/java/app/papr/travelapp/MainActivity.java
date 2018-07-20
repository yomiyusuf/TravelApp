package app.papr.travelapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initBackgroundImage();
    }

    private void initBackgroundImage() {
        ImageView imageView = findViewById(R.id.IV_background);

        RequestOptions options = new RequestOptions();
        options.centerCrop();
        options.placeholder(new ColorDrawable(Color.BLACK));

        Glide.with(this)
                .load(R.drawable.travel_background)
                .transition(withCrossFade())
                .apply(options)
                .into(imageView);
    }
}
