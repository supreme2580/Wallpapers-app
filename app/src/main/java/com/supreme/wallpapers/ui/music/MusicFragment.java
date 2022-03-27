package com.supreme.wallpapers.ui.music;

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

public class MusicFragment extends Fragment {

    ArrayList<ImageList> list;

    @SuppressLint("SetTextI18n")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_music, container, false);
        View customToast = getLayoutInflater().inflate(R.layout.thanks_toast, (ViewGroup) root.findViewById(R.id.thanks_layout));
        TextView toastThanks = customToast.findViewById(R.id.thanksText);
        toastThanks.setText("Special thanks are given to the content developers at Pexer");
        Toast thanks = new Toast(getContext());
        thanks.setDuration(Toast.LENGTH_SHORT);
        thanks.setView(customToast);
        thanks.show();
        GridView grid = root.findViewById(R.id.musicGrid);
        images();
        ImageAdapter adapter = new ImageAdapter(root.getContext(), list, 3);
        grid.setAdapter(adapter);
        return root;
    }
    public void images() {
        list = new ArrayList<>();
        list.add(new ImageList("file:///android_asset/music/1.jpg"));
        list.add(new ImageList("file:///android_asset/music/2.jpg"));
        list.add(new ImageList("file:///android_asset/music/3.jpg"));
        list.add(new ImageList("file:///android_asset/music/4.jpg"));
        list.add(new ImageList("file:///android_asset/music/5.jpg"));
        list.add(new ImageList("file:///android_asset/music/6.jpg"));
        list.add(new ImageList("file:///android_asset/music/7.jpg"));
        list.add(new ImageList("file:///android_asset/music/8.jpg"));
        list.add(new ImageList("file:///android_asset/music/9.jpg"));
        list.add(new ImageList("file:///android_asset/music/10.jpg"));
        list.add(new ImageList("file:///android_asset/music/11.jpg"));
        list.add(new ImageList("file:///android_asset/music/12.jpg"));
        list.add(new ImageList("file:///android_asset/music/13.jpg"));
        list.add(new ImageList("file:///android_asset/music/14.jpg"));
        list.add(new ImageList("file:///android_asset/music/15.jpg"));
        list.add(new ImageList("file:///android_asset/music/16.jpg"));
        list.add(new ImageList("file:///android_asset/music/17.jpg"));
        list.add(new ImageList("file:///android_asset/music/18.jpg"));
        list.add(new ImageList("file:///android_asset/music/19.jpg"));
        list.add(new ImageList("file:///android_asset/music/20.jpg"));
        list.add(new ImageList("file:///android_asset/music/21.jpg"));
        list.add(new ImageList("file:///android_asset/music/22.jpg"));
        list.add(new ImageList("file:///android_asset/music/23.jpg"));
        list.add(new ImageList("file:///android_asset/music/24.jpg"));
        list.add(new ImageList("file:///android_asset/music/25.jpg"));
        list.add(new ImageList("file:///android_asset/music/26.jpg"));
        list.add(new ImageList("file:///android_asset/music/27.jpg"));
        list.add(new ImageList("file:///android_asset/music/28.jpg"));
        list.add(new ImageList("file:///android_asset/music/29.jpg"));
        list.add(new ImageList("file:///android_asset/music/30.jpg"));
        list.add(new ImageList("file:///android_asset/music/31.jpg"));
        list.add(new ImageList("file:///android_asset/music/32.jpg"));
        list.add(new ImageList("file:///android_asset/music/33.jpg"));
        list.add(new ImageList("file:///android_asset/music/34.jpg"));
        list.add(new ImageList("file:///android_asset/music/35.jpg"));
        list.add(new ImageList("file:///android_asset/music/36.jpg"));
    }
}