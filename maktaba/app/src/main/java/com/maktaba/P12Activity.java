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

public class P12Activity extends AppCompatActivity {
	
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
	private LinearLayout e6no;
	private LinearLayout e7;
	private LinearLayout e8;
	private LinearLayout e9;
	private LinearLayout e10no;
	private LinearLayout e11;
	private LinearLayout e12;
	private LinearLayout e13;
	private LinearLayout e14;
	private LinearLayout e15;
	private LinearLayout e16;
	private LinearLayout e17;
	private LinearLayout e18;
	private LinearLayout e19;
	private LinearLayout e20;
	private LinearLayout e21;
	private LinearLayout linear6;
	private LinearLayout h1;
	private LinearLayout linear10;
	private LinearLayout m1;
	private LinearLayout m2;
	private LinearLayout m3;
	private LinearLayout m4;
	private LinearLayout m0;
	private LinearLayout m5;
	private LinearLayout m6;
	private LinearLayout m7;
	private LinearLayout m8;
	private LinearLayout m9;
	private LinearLayout linear14;
	private LinearLayout u1;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private TextView textview31;
	private TextView textview32;
	private TextView textview34;
	private TextView textview36;
	private TextView textview22;
	private TextView textview37;
	private TextView textview76;
	private TextView textview80;
	private TextView textview77;
	private TextView textview83;
	private TextView textview81;
	private TextView textview82;
	private TextView textview84;
	private TextView textview87;
	private TextView textview86;
	private TextView textview89;
	private TextView textview94;
	private TextView textview4;
	private TextView textview73;
	private TextView textview8;
	private TextView textview9;
	private TextView textview17;
	private TextView textview26;
	private TextView textview59;
	private TextView textview101;
	private TextView textview61;
	private TextView textview62;
	private TextView textview95;
	private TextView textview98;
	private TextView textview100;
	private TextView textview13;
	private TextView textview30;
	
	private Intent i12 = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.p12);
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
		e6no = findViewById(R.id.e6no);
		e7 = findViewById(R.id.e7);
		e8 = findViewById(R.id.e8);
		e9 = findViewById(R.id.e9);
		e10no = findViewById(R.id.e10no);
		e11 = findViewById(R.id.e11);
		e12 = findViewById(R.id.e12);
		e13 = findViewById(R.id.e13);
		e14 = findViewById(R.id.e14);
		e15 = findViewById(R.id.e15);
		e16 = findViewById(R.id.e16);
		e17 = findViewById(R.id.e17);
		e18 = findViewById(R.id.e18);
		e19 = findViewById(R.id.e19);
		e20 = findViewById(R.id.e20);
		e21 = findViewById(R.id.e21);
		linear6 = findViewById(R.id.linear6);
		h1 = findViewById(R.id.h1);
		linear10 = findViewById(R.id.linear10);
		m1 = findViewById(R.id.m1);
		m2 = findViewById(R.id.m2);
		m3 = findViewById(R.id.m3);
		m4 = findViewById(R.id.m4);
		m0 = findViewById(R.id.m0);
		m5 = findViewById(R.id.m5);
		m6 = findViewById(R.id.m6);
		m7 = findViewById(R.id.m7);
		m8 = findViewById(R.id.m8);
		m9 = findViewById(R.id.m9);
		linear14 = findViewById(R.id.linear14);
		u1 = findViewById(R.id.u1);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		textview31 = findViewById(R.id.textview31);
		textview32 = findViewById(R.id.textview32);
		textview34 = findViewById(R.id.textview34);
		textview36 = findViewById(R.id.textview36);
		textview22 = findViewById(R.id.textview22);
		textview37 = findViewById(R.id.textview37);
		textview76 = findViewById(R.id.textview76);
		textview80 = findViewById(R.id.textview80);
		textview77 = findViewById(R.id.textview77);
		textview83 = findViewById(R.id.textview83);
		textview81 = findViewById(R.id.textview81);
		textview82 = findViewById(R.id.textview82);
		textview84 = findViewById(R.id.textview84);
		textview87 = findViewById(R.id.textview87);
		textview86 = findViewById(R.id.textview86);
		textview89 = findViewById(R.id.textview89);
		textview94 = findViewById(R.id.textview94);
		textview4 = findViewById(R.id.textview4);
		textview73 = findViewById(R.id.textview73);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview17 = findViewById(R.id.textview17);
		textview26 = findViewById(R.id.textview26);
		textview59 = findViewById(R.id.textview59);
		textview101 = findViewById(R.id.textview101);
		textview61 = findViewById(R.id.textview61);
		textview62 = findViewById(R.id.textview62);
		textview95 = findViewById(R.id.textview95);
		textview98 = findViewById(R.id.textview98);
		textview100 = findViewById(R.id.textview100);
		textview13 = findViewById(R.id.textview13);
		textview30 = findViewById(R.id.textview30);
		
		e1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1H_jpAYnJB1GF5dDXp2I3rp_e3tSXCFcM/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		e2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1UG1wHCD_cEuueW2thvqUhH02m-47GNPW/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		e3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1RiSQotfYBtTC78itsL8Snb7ijeC_IbRD/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		e4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1quQpEGkz-ys5qkQELx_n1PIwhdxpCaPe/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		e5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1quQpEGkz-ys5qkQELx_n1PIwhdxpCaPe/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		e7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1nTxxA7_oF0pcFjC_2JDU8rMgFCXZYhax/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		e8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1H3zmFNBsb0UlxJTDqtMIMdaFhfuNsTzP/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		e9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1NdKK96KOj7Lp8_Am12dk0Xs7SMxpp9kS/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		e11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1awQavTJrGpXRa2bIWo0A0AR0DIv_9uyi/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		e12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1d8GyILAPO7ap45jbnkHVvHVE1jnSc29x/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		e13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1t5egyYDXzaK37ijm7inqJp0anja0xxq1/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		e14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1zdFfSGKfDEOVJmsdQx4FSentB5qmIMQw/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		e15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1YUHMhPovRcybsCXiTstEI3w9RMYVKLaH/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		e16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1g16qCIUSNxO6a-X-gI_mSuazt7Dc7HtD/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		e17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1x2bsJ3eYlcFd6qlXajYVv1HZnp-x9n9t/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		e18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1Uo-YVj4cbfGNWWGNggijOdkrFx6Emz7Y/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		e19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1ku3RNYkRhWJNOTUxNhMeoQFS5C6y1g9f/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		e20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1YmfmLgpxBASqRy-YfS1INwgmttvGMEmm/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		e21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1SuBKDhMsikVopfsbfusk0i2qUPBMmL7L/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		h1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1xlouJGBxUWKfnd7Q4iEzFArJU6jL-7p8/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		m1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1IMk7CdL8CyoaF6nFGN4WGmFjWUuPwSSg/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		m2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1ETczo_G_hI52ye6bdhnoqqhQPaw-mqgZ/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		m3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1A4DvVvJO0fQhhptsK7Yj9d0tCCm3z4AR/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		m4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1ABxYltzewFvoxc8RPCPHMVwLOvw3lybD/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		m0.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/15uvOcz8Irx3DJ7TnOLRaaLBPasU4LdnH/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		m5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/14k95Z1xiLv3WOTd0NEsnI-vO97ZSxRt5/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		m6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1eT4mHyaMx-OERKuULSE58P_UxT1iLaqL/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		m7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1eT4mHyaMx-OERKuULSE58P_UxT1iLaqL/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		m8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1d1pJR7d9HPHUxmLO11FbEXwbwRbDEz2D/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		m9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/15xEXqpYuL3j8lRiTy0D2n3QVVNLNoonb/view?usp=sharing"));
				startActivity(i12);
			}
		});
		
		u1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i12.setAction(Intent.ACTION_VIEW);
				i12.setData(Uri.parse("https://drive.google.com/file/d/1BbqU8_j37MGbUFMukDDTLjzH7P4bV4KL/view?usp=sharing"));
				startActivity(i12);
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("Class 12");
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