package com.supreme.wallpapers;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;

import com.bumptech.glide.Glide;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class ImageAdapter extends BaseAdapter {

    Context context;
    ArrayList<ImageList> imageList;
    int state;

    public ImageAdapter(Context context, ArrayList<ImageList> imageList, int state)  {
        this.context = context;
        this.imageList = imageList;
        this.state = state;
    }

    @Override
    public int getCount() {
        return imageList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        view = LayoutInflater.from(context).inflate(R.layout.grid, parent, false);
        ImageView imageView = view.findViewById(R.id.grid_image);
        Glide.with(context).load(Uri.parse(imageList.get(position).getImage())).into(imageView);
        final View finalView = view;
        imageView.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(v.getContext());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.preview_layout);
                dialog.setCancelable(false);
                ImageView image = dialog.findViewById(R.id.preview);
                Glide.with(dialog.getContext()).load(Uri.parse(imageList.get(position).getImage())).into(image);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(Objects.requireNonNull(dialog.getWindow()).getAttributes());
                layoutParams.width = WindowManager.LayoutParams.WRAP_CONTENT;
                layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
                dialog.findViewById(R.id.dismiss).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.findViewById(R.id.use).setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onClick(View v) {
                        WallpaperManager wallpaperManager = WallpaperManager.getInstance(v.getContext());
                        Drawable drawable = null;
                        try {
                            drawable = Drawable.createFromStream(v.getContext().getAssets()
                                    .open(imageList.get(position).getImage().substring(22)), null);
                            Intent i = new Intent(Intent.ACTION_MAIN);
                            i.addCategory(Intent.CATEGORY_HOME);
                            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            finalView.getContext().startActivity(i);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        assert drawable != null;
                        Bitmap image = ((BitmapDrawable) drawable).getBitmap();
                        try {
                            wallpaperManager.setBitmap(image);
                        }
                        catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
                dialog.show();
                dialog.getWindow().setAttributes(layoutParams);
            }
        });
        return view;
    }
}
