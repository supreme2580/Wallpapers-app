package com.supreme.wallpapers.ui.cars;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.supreme.wallpapers.R;
import com.supreme.wallpapers.ImageAdapter;
import com.supreme.wallpapers.ImageList;

import java.util.ArrayList;

public class CarFragment extends Fragment {

    ArrayList<ImageList> list;

    @SuppressLint("SetTextI18n")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_cars, container, false);
        View customToast = getLayoutInflater().inflate(R.layout.thanks_toast, (ViewGroup) root.findViewById(R.id.thanks_layout));
        TextView toastThanks = customToast.findViewById(R.id.thanksText);
        toastThanks.setText("Special thanks are given to the content developers at Pexer");
        Toast thanks = new Toast(getContext());
        thanks.setDuration(Toast.LENGTH_SHORT);
        thanks.setView(customToast);
        thanks.show();
        GridView grid = root.findViewById(R.id.carGrid);
        images();
        ImageAdapter adapter = new ImageAdapter(root.getContext(), list, 2);
        grid.setAdapter(adapter);
        return root;
    }
    public void images() {
        list = new ArrayList<>();
        list.add(new ImageList("file:///android_asset/cars/1.jpg"));
        list.add(new ImageList("file:///android_asset/cars/2.jpg"));
        list.add(new ImageList("file:///android_asset/cars/3.jpg"));
        list.add(new ImageList("file:///android_asset/cars/4.jpg"));
        list.add(new ImageList("file:///android_asset/cars/5.jpg"));
        list.add(new ImageList("file:///android_asset/cars/6.jpg"));
        list.add(new ImageList("file:///android_asset/cars/7.jpg"));
        list.add(new ImageList("file:///android_asset/cars/8.jpg"));
        list.add(new ImageList("file:///android_asset/cars/9.jpg"));
        list.add(new ImageList("file:///android_asset/cars/10.jpg"));
        list.add(new ImageList("file:///android_asset/cars/11.jpg"));
        list.add(new ImageList("file:///android_asset/cars/12.jpg"));
        list.add(new ImageList("file:///android_asset/cars/13.jpg"));
        list.add(new ImageList("file:///android_asset/cars/14.jpg"));
        list.add(new ImageList("file:///android_asset/cars/15.jpg"));
        list.add(new ImageList("file:///android_asset/cars/16.jpg"));
        list.add(new ImageList("file:///android_asset/cars/17.jpg"));
        list.add(new ImageList("file:///android_asset/cars/18.jpg"));
        list.add(new ImageList("file:///android_asset/cars/19.jpg"));
        list.add(new ImageList("file:///android_asset/cars/20.jpg"));
        list.add(new ImageList("file:///android_asset/cars/21.jpg"));
        list.add(new ImageList("file:///android_asset/cars/22.jpg"));
        list.add(new ImageList("file:///android_asset/cars/23.jpg"));
        list.add(new ImageList("file:///android_asset/cars/24.jpg"));
        list.add(new ImageList("file:///android_asset/cars/25.jpg"));
        list.add(new ImageList("file:///android_asset/cars/26.jpg"));
        list.add(new ImageList("file:///android_asset/cars/27.jpg"));
        list.add(new ImageList("file:///android_asset/cars/28.jpg"));
        list.add(new ImageList("file:///android_asset/cars/29.jpg"));
        list.add(new ImageList("file:///android_asset/cars/30.jpg"));
    }
}