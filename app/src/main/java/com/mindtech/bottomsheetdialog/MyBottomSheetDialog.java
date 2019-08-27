package com.mindtech.bottomsheetdialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/**
 * Created by Ramchandra Singh on 27-Aug-19.
 * Copyright (c) 2019 Mindtech solutions Pvt Ltd. All rights reserved.
 **/

public class MyBottomSheetDialog extends BottomSheetDialogFragment
{
    String mString;
    
    static MyBottomSheetDialog newInstance(String string){
    
        MyBottomSheetDialog f = new MyBottomSheetDialog();
        Bundle args = new Bundle();
        args.putString("string",string);
        f.setArguments(args);
        return f;
    }
    
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    
        mString = getArguments().getString("string");
    }
    
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
    //    return super.onCreateView(inflater, container, savedInstanceState);
    
        View view = inflater.inflate(R.layout.bottom_sheet_modal,container,false);
        TextView v = view.findViewById(R.id.text);
        return view;
        
    
    }
}
