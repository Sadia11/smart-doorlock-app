package com.example.sadi.smartdoorapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Sami Ullah on 3/16/2016.
 */
public class Image_Upload extends Main_ScreenActivity {
    private static final int RESULT_LOAD_IMAGE = 1;
    ImageView imageToUpload;
    Button bUploadImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_upload);
        bUploadImage=(Button)findViewById(R.id.bUploadImage);
     /*   Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        UploadImage();
    }
    public void UploadImage()
    {
        imageToUpload=(ImageView)findViewById(R.id.imageToUpload);
        imageToUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.imageToUpload:
                        Intent galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                        startActivityForResult(galleryIntent,RESULT_LOAD_IMAGE);
                        break;
                    case R.id.bUploadImage:
                        break;
                }

            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==RESULT_LOAD_IMAGE && resultCode==RESULT_OK && data!=null){
            Uri selectedImage = data.getData();
            imageToUpload.setImageURI(selectedImage);

        }
    }
}
