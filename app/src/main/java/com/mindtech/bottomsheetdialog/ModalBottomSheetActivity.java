package com.mindtech.bottomsheetdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModalBottomSheetActivity extends AppCompatActivity
{
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modal_bottom_sheet);
        final MyBottomSheetDialog myBottomSheetDialog = MyBottomSheetDialog.newInstance("this is first Bottom Sheet");
    
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            myBottomSheetDialog.show(getSupportFragmentManager(),myBottomSheetDialog.getTag());
            }
        });
    }
}
