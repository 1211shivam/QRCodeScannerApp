package com.example.qrcodeapp;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class GenerateActivity extends AppCompatActivity {
    private EditText editText;
    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate);

        editText = findViewById(R.id.edit_text);
        imageView = findViewById(R.id.qr_code);
        button = findViewById(R.id.button_generate);

        button.setOnClickListener(v -> {
            String text = editText.getText().toString();
            if (!text.isEmpty()) {
                BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                try {
                    Bitmap bitmap = barcodeEncoder.encodeBitmap(text, BarcodeFormat.QR_CODE, 400, 400);
                    imageView.setImageBitmap(bitmap);
                } catch (WriterException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
