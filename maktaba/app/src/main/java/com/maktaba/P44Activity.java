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

public class P44Activity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout E1;
	private LinearLayout e2;
	private LinearLayout e3;
	private LinearLayout e4;
	private LinearLayout e5;
	private LinearLayout linear6;
	private LinearLayout h1;
	private LinearLayout h2;
	private LinearLayout h3;
	private LinearLayout h4;
	private LinearLayout linear10;
	private LinearLayout M1;
	private LinearLayout m2;
	private LinearLayout m3;
	private LinearLayout m4;
	private LinearLayout m5;
	private LinearLayout linear14;
	private LinearLayout u1;
	private LinearLayout u2;
	private LinearLayout u3;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private TextView textview19;
	private TextView textview21;
	private TextView textview22;
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
	private TextView textview13;
	private TextView textview12;
	private TextView textview14;
	private TextView textview15;
	
	private Intent i4 = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.p44);
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
		E1 = findViewById(R.id.E1);
		e2 = findViewById(R.id.e2);
		e3 = findViewById(R.id.e3);
		e4 = findViewById(R.id.e4);
		e5 = findViewById(R.id.e5);
		linear6 = findViewById(R.id.linear6);
		h1 = findViewById(R.id.h1);
		h2 = findViewById(R.id.h2);
		h3 = findViewById(R.id.h3);
		h4 = findViewById(R.id.h4);
		linear10 = findViewById(R.id.linear10);
		M1 = findViewById(R.id.M1);
		m2 = findViewById(R.id.m2);
		m3 = findViewById(R.id.m3);
		m4 = findViewById(R.id.m4);
		m5 = findViewById(R.id.m5);
		linear14 = findViewById(R.id.linear14);
		u1 = findViewById(R.id.u1);
		u2 = findViewById(R.id.u2);
		u3 = findViewById(R.id.u3);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		textview19 = findViewById(R.id.textview19);
		textview21 = findViewById(R.id.textview21);
		textview22 = findViewById(R.id.textview22);
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
		textview13 = findViewById(R.id.textview13);
		textview12 = findViewById(R.id.textview12);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		
		E1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i4.setAction(Intent.ACTION_VIEW);
				i4.setData(Uri.parse("https://drive.google.com/file/d/1PxA65MjsPtO0uGGGUmbxOyPC1tYIcFyn/view"));
				startActivity(i4);
			}
		});
		
		e2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i4.setAction(Intent.ACTION_VIEW);
				i4.setData(Uri.parse("https://drive.google.com/file/d/1XpZ6UCJjpcgLdI2GfRPY1pBHyOxVCitN/view"));
				startActivity(i4);
			}
		});
		
		e3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i4.setAction(Intent.ACTION_VIEW);
				i4.setData(Uri.parse("https://drive.google.com/file/d/1sjmu69amFiPA_PImDRW1wmdqxdN8lkEx/view"));
				startActivity(i4);
			}
		});
		
		e4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i4.setAction(Intent.ACTION_VIEW);
				i4.setData(Uri.parse("https://drive.google.com/file/d/1c5DggVZVXGIhI6dSvtu84Ci6wgyOdR8z/view"));
				startActivity(i4);
			}
		});
		
		e5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i4.setAction(Intent.ACTION_VIEW);
				i4.setData(Uri.parse("https://drive.google.com/file/d/1K0I0ybbO9ZG87G4mFxy562q7yFIrnvWl/view"));
				startActivity(i4);
			}
		});
		
		h1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i4.setAction(Intent.ACTION_VIEW);
				i4.setData(Uri.parse("https://drive.google.com/file/d/1GZwk_0sBO-Qb_VwqVgijAdQEJlTfEoTH/view"));
				startActivity(i4);
			}
		});
		
		h2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i4.setAction(Intent.ACTION_VIEW);
				i4.setData(Uri.parse("https://drive.google.com/file/d/1NZgdbMasYll8rzGbzPH83DTCf8Xpou_T/view"));
				startActivity(i4);
			}
		});
		
		h3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i4.setAction(Intent.ACTION_VIEW);
				i4.setData(Uri.parse("https://drive.google.com/file/d/1Xm0qxUCbo2x7xf_EbCycRets7P47KIEv/view"));
				startActivity(i4);
			}
		});
		
		h4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i4.setAction(Intent.ACTION_VIEW);
				i4.setData(Uri.parse("https://drive.google.com/file/d/1JdL3PfuFEpbC0wV0aPgcwPk1TsgbbsFn/view"));
				startActivity(i4);
			}
		});
		
		M1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i4.setAction(Intent.ACTION_VIEW);
				i4.setData(Uri.parse("https://drive.google.com/file/d/1NPdx6maH0DtJGhJCZ13JvNkDydXptaaz/view"));
				startActivity(i4);
			}
		});
		
		m2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i4.setAction(Intent.ACTION_VIEW);
				i4.setData(Uri.parse("https://drive.google.com/file/d/1tz6r2qzAJiFOzaatDYMOpLHI12Zl3AyE/view"));
				startActivity(i4);
			}
		});
		
		m3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i4.setAction(Intent.ACTION_VIEW);
				i4.setData(Uri.parse("https://drive.google.com/file/d/1WBIo9ALsh4WpnaqSqipBU3LUuvaIQSg7/view"));
				startActivity(i4);
			}
		});
		
		m4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i4.setAction(Intent.ACTION_VIEW);
				i4.setData(Uri.parse("https://drive.google.com/file/d/15jSWepcITt1RYTruEiI2p6xGCHGLJT-C/view"));
				startActivity(i4);
			}
		});
		
		m5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i4.setAction(Intent.ACTION_VIEW);
				i4.setData(Uri.parse("https://drive.google.com/file/d/1DXZOKR5F56ctxkJ3jJIC4sbxuyfI6H1f/view"));
				startActivity(i4);
			}
		});
		
		u1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i4.setAction(Intent.ACTION_VIEW);
				i4.setData(Uri.parse("https://drive.google.com/file/d/1LtXXcm6DhhYgxDq02tIJVsU431z0z3_R/view"));
				startActivity(i4);
			}
		});
		
		u2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i4.setAction(Intent.ACTION_VIEW);
				i4.setData(Uri.parse("https://drive.google.com/file/d/1Hsh9TZPBaBKatv37IKfwn95qIg-ElAoW/view"));
				startActivity(i4);
			}
		});
		
		u3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i4.setAction(Intent.ACTION_VIEW);
				i4.setData(Uri.parse("https://drive.google.com/file/d/1Jcf-yKaXnjlh6ElUHYTWEXnnB5Zs7J8T/view"));
				startActivity(i4);
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("Class 4");
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