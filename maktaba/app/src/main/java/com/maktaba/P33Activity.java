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
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.FirebaseApp;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class P33Activity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linea1;
	private LinearLayout linea2;
	private LinearLayout linea3;
	private LinearLayout linear6;
	private LinearLayout linea4;
	private LinearLayout linea5;
	private LinearLayout linea6;
	private LinearLayout linea7;
	private LinearLayout linear10;
	private LinearLayout linea8;
	private LinearLayout linea9;
	private LinearLayout linea10;
	private LinearLayout linea11;
	private LinearLayout linea12;
	private LinearLayout linea13;
	private LinearLayout linear14;
	private LinearLayout linea14;
	private LinearLayout linea15;
	private LinearLayout linea16;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private TextView textview19;
	private TextView textview4;
	private TextView textview5;
	private TextView textview6;
	private TextView textview7;
	private TextView textview20;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private TextView textview16;
	private TextView textview17;
	private TextView textview18;
	private TextView textview13;
	private TextView textview12;
	private TextView textview14;
	private TextView textview15;
	
	private Intent i3 = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.p33);
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
		linear1 = findViewById(R.id.linear1);
		vscroll1 = findViewById(R.id.vscroll1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		linea1 = findViewById(R.id.linea1);
		linea2 = findViewById(R.id.linea2);
		linea3 = findViewById(R.id.linea3);
		linear6 = findViewById(R.id.linear6);
		linea4 = findViewById(R.id.linea4);
		linea5 = findViewById(R.id.linea5);
		linea6 = findViewById(R.id.linea6);
		linea7 = findViewById(R.id.linea7);
		linear10 = findViewById(R.id.linear10);
		linea8 = findViewById(R.id.linea8);
		linea9 = findViewById(R.id.linea9);
		linea10 = findViewById(R.id.linea10);
		linea11 = findViewById(R.id.linea11);
		linea12 = findViewById(R.id.linea12);
		linea13 = findViewById(R.id.linea13);
		linear14 = findViewById(R.id.linear14);
		linea14 = findViewById(R.id.linea14);
		linea15 = findViewById(R.id.linea15);
		linea16 = findViewById(R.id.linea16);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		textview19 = findViewById(R.id.textview19);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
		textview20 = findViewById(R.id.textview20);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		textview16 = findViewById(R.id.textview16);
		textview17 = findViewById(R.id.textview17);
		textview18 = findViewById(R.id.textview18);
		textview13 = findViewById(R.id.textview13);
		textview12 = findViewById(R.id.textview12);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		
		linea1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i3.setAction(Intent.ACTION_VIEW);
				i3.setData(Uri.parse("https://drive.google.com/file/d/1qxR6YbRT9B0eWHRk7efiXmjrLDsovoK7/view?usp=sharing"));
				startActivity(i3);
			}
		});
		
		linea2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i3.setAction(Intent.ACTION_VIEW);
				i3.setData(Uri.parse("https://drive.google.com/file/d/1Nohfauw5nqlk8nPgKCVEM5p9OAzWor96/view"));
				startActivity(i3);
			}
		});
		
		linea3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i3.setAction(Intent.ACTION_VIEW);
				i3.setData(Uri.parse("https://drive.google.com/file/d/1Grdc07vWPY95tlkt9QrfYpqUlayxw18J/view"));
				startActivity(i3);
			}
		});
		
		linea4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i3.setAction(Intent.ACTION_VIEW);
				i3.setData(Uri.parse("https://drive.google.com/file/d/1rc2tJ5mL32GM92FBKn44rYoMJQmEcYe6/view?usp=sharing"));
				startActivity(i3);
			}
		});
		
		linea5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i3.setAction(Intent.ACTION_VIEW);
				i3.setData(Uri.parse("https://drive.google.com/file/d/1sM-71SeEHkyXZpJ3DPFXEoailu6cGPVB/view?usp=sharing"));
				startActivity(i3);
			}
		});
		
		linea6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i3.setAction(Intent.ACTION_VIEW);
				i3.setData(Uri.parse("https://drive.google.com/file/d/1LbHi9r64gtU-w8kDZ8Cds6kV1mlxOQ0T/view"));
				startActivity(i3);
			}
		});
		
		linea7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i3.setAction(Intent.ACTION_VIEW);
				i3.setData(Uri.parse("https://drive.google.com/file/d/1LGLJ1hUg-Dl1Nzthz00DUxywVbSL4-ce/view"));
				startActivity(i3);
			}
		});
		
		linea8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i3.setAction(Intent.ACTION_VIEW);
				i3.setData(Uri.parse("https://drive.google.com/file/d/1cfrAnZlHHZealUMWqfJmqMKbcTQ1bXds/view?usp=sharing"));
				startActivity(i3);
			}
		});
		
		linea9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i3.setAction(Intent.ACTION_VIEW);
				i3.setData(Uri.parse("https://drive.google.com/file/d/15RxLgZPsnKbapoQUe1PlMgsIXbQctowQ/view"));
				startActivity(i3);
			}
		});
		
		linea10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i3.setAction(Intent.ACTION_VIEW);
				i3.setData(Uri.parse("https://drive.google.com/file/d/10kS88kFgYV3sHaN15K_JwdaZtvL7uv6a/view"));
				startActivity(i3);
			}
		});
		
		linea11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i3.setAction(Intent.ACTION_VIEW);
				i3.setData(Uri.parse("https://drive.google.com/file/d/1OkGk9e7sLCsJTNHhB-J4PhmDfBADKISu/view"));
				startActivity(i3);
			}
		});
		
		linea12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i3.setAction(Intent.ACTION_VIEW);
				i3.setData(Uri.parse("https://drive.google.com/file/d/1vmZT8itJdvfrNqAZLLPOJEVrr-bOFHZx/view"));
				startActivity(i3);
			}
		});
		
		linea13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i3.setAction(Intent.ACTION_VIEW);
				i3.setData(Uri.parse("https://drive.google.com/file/d/1BHMhDX_UG4DijWmelZ_R3SO7-nlgt0BN/view"));
				startActivity(i3);
			}
		});
		
		linea14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i3.setAction(Intent.ACTION_VIEW);
				i3.setData(Uri.parse("https://drive.google.com/file/d/1WbfYI0OLpFM8c_XOM__Ih3RxdgdjXIRe/view"));
				startActivity(i3);
			}
		});
		
		linea15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i3.setAction(Intent.ACTION_VIEW);
				i3.setData(Uri.parse("https://drive.google.com/file/d/1OG6irWlx_dHEVbTnmUN3qjCapjQZie1E/view"));
				startActivity(i3);
			}
		});
		
		linea16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i3.setAction(Intent.ACTION_VIEW);
				i3.setData(Uri.parse("https://drive.google.com/file/d/18uul8iKefgJ9mvC9Si1xea2VQsJ-RE9P/view"));
				startActivity(i3);
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("Class 3");
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