package com.maktaba;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.FirebaseApp;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class P11Activity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private AdView adview1;
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout a;
	private LinearLayout b;
	private LinearLayout linear6;
	private LinearLayout c;
	private LinearLayout d;
	private LinearLayout e;
	private LinearLayout linear10;
	private LinearLayout f;
	private LinearLayout g;
	private LinearLayout h;
	private LinearLayout linear14;
	private LinearLayout i;
	private LinearLayout j;
	private LinearLayout k;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private TextView textview4;
	private TextView textview5;
	private TextView textview6;
	private TextView textview7;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private TextView textview13;
	private TextView textview12;
	private TextView textview14;
	private TextView textview15;
	
	private Intent it = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.p11);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		MobileAds.initialize(this);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		adview1 = findViewById(R.id.adview1);
		linear1 = findViewById(R.id.linear1);
		vscroll1 = findViewById(R.id.vscroll1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		a = findViewById(R.id.a);
		b = findViewById(R.id.b);
		linear6 = findViewById(R.id.linear6);
		c = findViewById(R.id.c);
		d = findViewById(R.id.d);
		e = findViewById(R.id.e);
		linear10 = findViewById(R.id.linear10);
		f = findViewById(R.id.f);
		g = findViewById(R.id.g);
		h = findViewById(R.id.h);
		linear14 = findViewById(R.id.linear14);
		i = findViewById(R.id.i);
		j = findViewById(R.id.j);
		k = findViewById(R.id.k);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		textview13 = findViewById(R.id.textview13);
		textview12 = findViewById(R.id.textview12);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		
		a.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				it.setAction(Intent.ACTION_VIEW);
				it.setData(Uri.parse("https://drive.google.com/file/d/15PYAxkX-aSJkpQIU-DfyNBeQPuWKyS3D/view?usp=sharing"));
				startActivity(it);
			}
		});
		
		b.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				it.setAction(Intent.ACTION_VIEW);
				it.setData(Uri.parse("https://drive.google.com/file/d/1_HH5UsKQsndRygRgO_xqp8Oh85ofhQEk/view?usp=sharing"));
				startActivity(it);
			}
		});
		
		c.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				it.setAction(Intent.ACTION_VIEW);
				it.setData(Uri.parse("https://drive.google.com/file/d/1LdcdGaETvwpzv9UCTmc2Frb0SxCq-p8x/view?usp=sharing"));
				startActivity(it);
			}
		});
		
		d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				it.setAction(Intent.ACTION_VIEW);
				it.setData(Uri.parse("https://drive.google.com/file/d/1IiFoY2XiS0HnJgIXcN8xSl1NXH0KfwnY/view?usp=sharing"));
				startActivity(it);
			}
		});
		
		e.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				it.setAction(Intent.ACTION_VIEW);
				it.setData(Uri.parse("https://drive.google.com/file/d/1-vZtdaTDuNn-U5Gemc0o1SOWf3B5Bt56/view?usp=sharing"));
				startActivity(it);
			}
		});
		
		f.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				it.setAction(Intent.ACTION_VIEW);
				it.setData(Uri.parse("https://drive.google.com/file/d/10XFtJrSn4u4Ur5ghupXwwsgYXxq-qPyT/view?usp=sharing"));
				startActivity(it);
			}
		});
		
		g.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				it.setAction(Intent.ACTION_VIEW);
				it.setData(Uri.parse("https://drive.google.com/file/d/1X4STIPqIpZeRKbyrW6cG6zpWZmfwq7I-/view?usp=sharing"));
				startActivity(it);
			}
		});
		
		h.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				it.setAction(Intent.ACTION_VIEW);
				it.setData(Uri.parse("https://drive.google.com/file/d/1OdyK6poggfZJU7cPM52HDQrfS-dy1g2Q/view"));
				startActivity(it);
			}
		});
		
		i.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				it.setAction(Intent.ACTION_VIEW);
				it.setData(Uri.parse("https://drive.google.com/file/d/12eKGo2hmYjAQ51ChEpIYbAUbiYXHduLs/view?usp=sharing"));
				startActivity(it);
			}
		});
		
		j.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				it.setAction(Intent.ACTION_VIEW);
				it.setData(Uri.parse("https://drive.google.com/file/d/1kBzJVnLTReJMqZnVgK-pmsbGc6FtArO7/view"));
				startActivity(it);
			}
		});
		
		k.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				it.setAction(Intent.ACTION_VIEW);
				it.setData(Uri.parse("https://drive.google.com/file/d/1xbkOqdxIqT_rhmrN0stbnZ1vXoB492Zv/view"));
				startActivity(it);
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("Class 1");
		adview1.loadAd(new AdRequest.Builder().build());
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		if (adview1 != null) {
			adview1.destroy();
		}
	}
	
	@Override
	public void onPause() {
		super.onPause();
		if (adview1 != null) {
			adview1.pause();
		}
	}
	
	@Override
	public void onResume() {
		super.onResume();
		if (adview1 != null) {
			adview1.resume();
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}