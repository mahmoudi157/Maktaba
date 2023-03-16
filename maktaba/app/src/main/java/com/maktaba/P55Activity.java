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

public class P55Activity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private AdView adview1;
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout e1;
	private LinearLayout e2;
	private LinearLayout e3;
	private LinearLayout e4;
	private LinearLayout e5;
	private LinearLayout e6;
	private LinearLayout e8;
	private LinearLayout e9;
	private LinearLayout e10;
	private LinearLayout e11;
	private LinearLayout e12;
	private LinearLayout linear6;
	private LinearLayout h1;
	private LinearLayout h2;
	private LinearLayout h3;
	private LinearLayout h4;
	private LinearLayout h5;
	private LinearLayout h6;
	private LinearLayout linear10;
	private LinearLayout m1;
	private LinearLayout m2;
	private LinearLayout m3;
	private LinearLayout m4;
	private LinearLayout m5;
	private LinearLayout m6;
	private LinearLayout m7;
	private LinearLayout linear14;
	private LinearLayout u1;
	private LinearLayout u2;
	private LinearLayout u3;
	private LinearLayout u4;
	private LinearLayout u5;
	private LinearLayout u6;
	private LinearLayout u7;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private TextView textview19;
	private TextView textview21;
	private TextView textview31;
	private TextView textview32;
	private TextView textview34;
	private TextView textview35;
	private TextView textview36;
	private TextView textview22;
	private TextView textview37;
	private TextView textview4;
	private TextView textview5;
	private TextView textview6;
	private TextView textview7;
	private TextView textview20;
	private TextView textview23;
	private TextView textview24;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private TextView textview16;
	private TextView textview17;
	private TextView textview25;
	private TextView textview26;
	private TextView textview13;
	private TextView textview12;
	private TextView textview14;
	private TextView textview15;
	private TextView textview27;
	private TextView textview28;
	private TextView textview29;
	private TextView textview30;
	
	private Intent i5 = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.p55);
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
		e1 = findViewById(R.id.e1);
		e2 = findViewById(R.id.e2);
		e3 = findViewById(R.id.e3);
		e4 = findViewById(R.id.e4);
		e5 = findViewById(R.id.e5);
		e6 = findViewById(R.id.e6);
		e8 = findViewById(R.id.e8);
		e9 = findViewById(R.id.e9);
		e10 = findViewById(R.id.e10);
		e11 = findViewById(R.id.e11);
		e12 = findViewById(R.id.e12);
		linear6 = findViewById(R.id.linear6);
		h1 = findViewById(R.id.h1);
		h2 = findViewById(R.id.h2);
		h3 = findViewById(R.id.h3);
		h4 = findViewById(R.id.h4);
		h5 = findViewById(R.id.h5);
		h6 = findViewById(R.id.h6);
		linear10 = findViewById(R.id.linear10);
		m1 = findViewById(R.id.m1);
		m2 = findViewById(R.id.m2);
		m3 = findViewById(R.id.m3);
		m4 = findViewById(R.id.m4);
		m5 = findViewById(R.id.m5);
		m6 = findViewById(R.id.m6);
		m7 = findViewById(R.id.m7);
		linear14 = findViewById(R.id.linear14);
		u1 = findViewById(R.id.u1);
		u2 = findViewById(R.id.u2);
		u3 = findViewById(R.id.u3);
		u4 = findViewById(R.id.u4);
		u5 = findViewById(R.id.u5);
		u6 = findViewById(R.id.u6);
		u7 = findViewById(R.id.u7);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		textview19 = findViewById(R.id.textview19);
		textview21 = findViewById(R.id.textview21);
		textview31 = findViewById(R.id.textview31);
		textview32 = findViewById(R.id.textview32);
		textview34 = findViewById(R.id.textview34);
		textview35 = findViewById(R.id.textview35);
		textview36 = findViewById(R.id.textview36);
		textview22 = findViewById(R.id.textview22);
		textview37 = findViewById(R.id.textview37);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
		textview20 = findViewById(R.id.textview20);
		textview23 = findViewById(R.id.textview23);
		textview24 = findViewById(R.id.textview24);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		textview16 = findViewById(R.id.textview16);
		textview17 = findViewById(R.id.textview17);
		textview25 = findViewById(R.id.textview25);
		textview26 = findViewById(R.id.textview26);
		textview13 = findViewById(R.id.textview13);
		textview12 = findViewById(R.id.textview12);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		textview27 = findViewById(R.id.textview27);
		textview28 = findViewById(R.id.textview28);
		textview29 = findViewById(R.id.textview29);
		textview30 = findViewById(R.id.textview30);
		
		e1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/13datyXoA_NMoUmnFgnf3-wycSer-fS21/view"));
				startActivity(i5);
			}
		});
		
		e2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1rtyZn0gkyG5TJ_plCTqU391RxD9CnZLv/view"));
				startActivity(i5);
			}
		});
		
		e3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1-ulxFRNPaYPwVjbGp6ua6X8d162W2K9v/view"));
				startActivity(i5);
			}
		});
		
		e4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/10LF28UXZSAaVBUeHPJsg_eIkCt4Pcxpb/view"));
				startActivity(i5);
			}
		});
		
		e5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1npuV2jqTrJh3oTEGC29BiDaCqu8jh1j4/view"));
				startActivity(i5);
			}
		});
		
		e6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1XFSRC7aORVZvFqKaCClvlTiWVioKhQLn/view?usp=sharing"));
				startActivity(i5);
			}
		});
		
		e8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1sk4Bm3nH-YVEEsSY9z8vmM3faN20-Fuq/view"));
				startActivity(i5);
			}
		});
		
		e9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1-aeE6r8jx1zgZsG4w7uJKwhqWg2aX5jq/view"));
				startActivity(i5);
			}
		});
		
		e10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1_57Vrb6koZYSLbEqObih2DVP9px5JsYP/view"));
				startActivity(i5);
			}
		});
		
		e11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1hLCMFGwFPC3QSHFYfpP9n_iqXpegCvxN/view"));
				startActivity(i5);
			}
		});
		
		e12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1jc5gVLq7lUDOKbOUmyxzs74qA8-A8QS5/view"));
				startActivity(i5);
			}
		});
		
		h1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/172hnarADqUK7IG0xJMKuNuDT0NQYw-06/view"));
				startActivity(i5);
			}
		});
		
		h2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1uo0RtXVpU0IDGoq4qXMuezC7p0ncOxkd/view"));
				startActivity(i5);
			}
		});
		
		h3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/19V66OEa0-7rEJC4LTh-vztUc-jkVRisk/view"));
				startActivity(i5);
			}
		});
		
		h4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1e_4_iT02u9Igd78GLYsnXzL8WanlJocz/view"));
				startActivity(i5);
			}
		});
		
		h5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1_pePLEB-Vrm_QKAjjL0r6NUbYRxOHwRh/view"));
				startActivity(i5);
			}
		});
		
		h6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1l3ZLRc_SztxlBArmXGYj3JMp_4-uqM6H/view"));
				startActivity(i5);
			}
		});
		
		m1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1XKJq_UulS2qsgpxsw7a500kWTgs9KvlP/view"));
				startActivity(i5);
			}
		});
		
		m2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1tzt1V9OfnbVivzMAJ4avk9e12ihoTmiL/view"));
				startActivity(i5);
			}
		});
		
		m3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1G8cSvCl3kyse1jqmKoi_XUS9t4nnITIm/view"));
				startActivity(i5);
			}
		});
		
		m4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1qY7wS8PHg4yEr2RLtnxQZOiVZvAsn1gM/view"));
				startActivity(i5);
			}
		});
		
		m5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1rYJrWGHcBhf9Mdn_ey7OmqRG1JdQ5tjD/view"));
				startActivity(i5);
			}
		});
		
		m6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/14VQqbK6fdSyUzAA7Sd4m7nmCaDgU3Nf7/view"));
				startActivity(i5);
			}
		});
		
		m7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1h3rjhnP-bfT5y5uxnHoodrtJ62VY6ihs/view"));
				startActivity(i5);
			}
		});
		
		u1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1bLk6tnOAObgq48rvprrFZwTA0XPuLcYd/view"));
				startActivity(i5);
			}
		});
		
		u2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1E015ibJ73oglvdnq7X8dtOkk7jx7nsGv/view"));
				startActivity(i5);
			}
		});
		
		u3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1XKb3acieaLlAY8FSfC8CJ6iXEX2GS7Ss/view"));
				startActivity(i5);
			}
		});
		
		u4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1pf8nZ1i-f8p71A0xvh7smfjViqEQoaYE/view"));
				startActivity(i5);
			}
		});
		
		u5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1mzWbznS-gQO1JQ9ZKzhhceJWaQIoNlmk/view"));
				startActivity(i5);
			}
		});
		
		u6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/16P0CAG-xbjj1-kOF0Z6UjgXQuRkyjkzJ/view"));
				startActivity(i5);
			}
		});
		
		u7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i5.setAction(Intent.ACTION_VIEW);
				i5.setData(Uri.parse("https://drive.google.com/file/d/1GVhCo0n1SIok2BpSGOZur7DeqiBJXzgl/view"));
				startActivity(i5);
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("Class 5");
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