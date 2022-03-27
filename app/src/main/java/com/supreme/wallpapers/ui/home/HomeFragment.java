package com.supreme.wallpapers.ui.home;

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

public class HomeFragment extends Fragment {

    ArrayList<ImageList> list;

    @SuppressLint("SetTextI18n")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        View customToast = getLayoutInflater().inflate(R.layout.thanks_toast, (ViewGroup) root.findViewById(R.id.thanks_layout));
        TextView toastThanks = customToast.findViewById(R.id.thanksText);
        toastThanks.setText("Special thanks are given to the content developers at Pexer");
        Toast thanks = new Toast(getContext());
        thanks.setDuration(Toast.LENGTH_SHORT);
        thanks.setView(customToast);
        thanks.show();
        GridView grid = root.findViewById(R.id.natureGrid);
        images();
        ImageAdapter adapter = new ImageAdapter(root.getContext(), list, 1);
        grid.setAdapter(adapter);
        return root;
    }
    public void images() {
        list = new ArrayList<>();
        list.add(new ImageList("file:///android_asset/nature/1.jpg"));
        list.add(new ImageList("file:///android_asset/nature/2.jpg"));
        list.add(new ImageList("file:///android_asset/nature/3.jpg"));
        list.add(new ImageList("file:///android_asset/nature/4.jpg"));
        list.add(new ImageList("file:///android_asset/nature/5.jpg"));
        list.add(new ImageList("file:///android_asset/nature/6.jpg"));
        list.add(new ImageList("file:///android_asset/nature/7.jpg"));
        list.add(new ImageList("file:///android_asset/nature/8.jpg"));
        list.add(new ImageList("file:///android_asset/nature/9.jpg"));
        list.add(new ImageList("file:///android_asset/nature/10.jpg"));
        list.add(new ImageList("file:///android_asset/nature/11.jpg"));
        list.add(new ImageList("file:///android_asset/nature/12.jpg"));
        list.add(new ImageList("file:///android_asset/nature/13.jpg"));
        list.add(new ImageList("file:///android_asset/nature/14.jpg"));
        list.add(new ImageList("file:///android_asset/nature/15.jpg"));
        list.add(new ImageList("file:///android_asset/nature/16.jpg"));
        list.add(new ImageList("file:///android_asset/nature/17.jpg"));
        list.add(new ImageList("file:///android_asset/nature/18.jpg"));
        list.add(new ImageList("file:///android_asset/nature/19.jpg"));
        list.add(new ImageList("file:///android_asset/nature/20.jpg"));
        list.add(new ImageList("file:///android_asset/nature/21.jpg"));
        list.add(new ImageList("file:///android_asset/nature/22.jpg"));
        list.add(new ImageList("file:///android_asset/nature/23.jpg"));
        list.add(new ImageList("file:///android_asset/nature/24.jpg"));
        list.add(new ImageList("file:///android_asset/nature/25.jpg"));
        list.add(new ImageList("file:///android_asset/nature/26.jpg"));
        list.add(new ImageList("file:///android_asset/nature/27.jpg"));
        list.add(new ImageList("file:///android_asset/nature/28.jpg"));
        list.add(new ImageList("file:///android_asset/nature/29.jpg"));
        list.add(new ImageList("file:///android_asset/nature/30.jpg"));
    }
}