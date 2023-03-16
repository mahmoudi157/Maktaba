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

public class P66Activity extends AppCompatActivity {
	
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
	private LinearLayout e7;
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
	private LinearLayout h7;
	private LinearLayout h8;
	private LinearLayout linear10;
	private LinearLayout m1;
	private LinearLayout m2;
	private LinearLayout m3;
	private LinearLayout m4;
	private LinearLayout m5;
	private LinearLayout m6;
	private LinearLayout m7;
	private LinearLayout m8;
	private LinearLayout m9;
	private LinearLayout linear14;
	private LinearLayout u1;
	private LinearLayout u2;
	private LinearLayout u3;
	private LinearLayout u4;
	private LinearLayout u5;
	private LinearLayout u6;
	private LinearLayout u7;
	private LinearLayout u8;
	private LinearLayout u9;
	private LinearLayout u10;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private TextView textview19;
	private TextView textview21;
	private TextView textview31;
	private TextView textview32;
	private TextView textview33;
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
	private TextView textview41;
	private TextView textview24;
	private TextView textview42;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private TextView textview16;
	private TextView textview17;
	private TextView textview25;
	private TextView textview40;
	private TextView textview26;
	private TextView textview46;
	private TextView textview13;
	private TextView textview12;
	private TextView textview14;
	private TextView textview15;
	private TextView textview27;
	private TextView textview28;
	private TextView textview29;
	private TextView textview44;
	private TextView textview43;
	private TextView textview45;
	private TextView textview30;
	
	private Intent i6 = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.p66);
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
		e7 = findViewById(R.id.e7);
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
		h7 = findViewById(R.id.h7);
		h8 = findViewById(R.id.h8);
		linear10 = findViewById(R.id.linear10);
		m1 = findViewById(R.id.m1);
		m2 = findViewById(R.id.m2);
		m3 = findViewById(R.id.m3);
		m4 = findViewById(R.id.m4);
		m5 = findViewById(R.id.m5);
		m6 = findViewById(R.id.m6);
		m7 = findViewById(R.id.m7);
		m8 = findViewById(R.id.m8);
		m9 = findViewById(R.id.m9);
		linear14 = findViewById(R.id.linear14);
		u1 = findViewById(R.id.u1);
		u2 = findViewById(R.id.u2);
		u3 = findViewById(R.id.u3);
		u4 = findViewById(R.id.u4);
		u5 = findViewById(R.id.u5);
		u6 = findViewById(R.id.u6);
		u7 = findViewById(R.id.u7);
		u8 = findViewById(R.id.u8);
		u9 = findViewById(R.id.u9);
		u10 = findViewById(R.id.u10);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		textview19 = findViewById(R.id.textview19);
		textview21 = findViewById(R.id.textview21);
		textview31 = findViewById(R.id.textview31);
		textview32 = findViewById(R.id.textview32);
		textview33 = findViewById(R.id.textview33);
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
		textview41 = findViewById(R.id.textview41);
		textview24 = findViewById(R.id.textview24);
		textview42 = findViewById(R.id.textview42);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		textview16 = findViewById(R.id.textview16);
		textview17 = findViewById(R.id.textview17);
		textview25 = findViewById(R.id.textview25);
		textview40 = findViewById(R.id.textview40);
		textview26 = findViewById(R.id.textview26);
		textview46 = findViewById(R.id.textview46);
		textview13 = findViewById(R.id.textview13);
		textview12 = findViewById(R.id.textview12);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		textview27 = findViewById(R.id.textview27);
		textview28 = findViewById(R.id.textview28);
		textview29 = findViewById(R.id.textview29);
		textview44 = findViewById(R.id.textview44);
		textview43 = findViewById(R.id.textview43);
		textview45 = findViewById(R.id.textview45);
		textview30 = findViewById(R.id.textview30);
		
		e1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1-VCw9ave3zBroLDjyGwWoNEbwtIsteVb/view"));
				startActivity(i6);
			}
		});
		
		e2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1W-ZYePoDL8aSqYCxl7ZL2trzFOYvsc09/view"));
				startActivity(i6);
			}
		});
		
		e3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1xAeC6kYuFBP94x0Ahu_fwWhPm8EWdVie/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		e4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1jcwQwDcfX57FrQCA2JBmfkUaiMU5unNR/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		e5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/15pV6OqP28RhjDlaU_o-lGi_m6xotrFWB/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		e6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1tYXGMNrP5OnHv9mNSeAk5GMtsGJA-bhU/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		e7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1mBT5f3eCh-VTU__pb4wPo_4E8RRIEHo4/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		e8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1gRLQMboU4FzePQfetagf2RyM2nInEL1X/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		e9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1lfGWCuBrU1y1WqAtdJVSB_KMc_KK7A7A/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		e10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1eMCTpje0uDom9LXZ1lRlJthcIdRBg2OC/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		e11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/175ei5lkXHpyGV2C8VA7-P2Husyt2LX8f/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		e12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/12wmgORHfFDs5tkWvrm5h2xuxA7dV23Ed/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		h1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1S2u35kXCBXC3ASXx8L6uw8_6FiqJeqyh/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		h2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1bJGxUYEs_xYk-Hq0Ky6hVGhJkqODeO8T/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		h3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1ktWC0XpINpDQZNn8Up5VnqXTJ3a9DMJr/view"));
				startActivity(i6);
			}
		});
		
		h4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1CJmuEBUCWo_yJfOAXU68xieEE8ilwGJl/view"));
				startActivity(i6);
			}
		});
		
		h5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1MdeEDWHFHJzwlgqglNtQigp5N4U6Jt9Y/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		h6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1-jcTsm4q6X4HrcsdYlNSpe2bgEgtimFe/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		h7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1X7JZTvZkIi8uMA0PziN0U6VYc07ftmX7/view"));
				startActivity(i6);
			}
		});
		
		h8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1X7JZTvZkIi8uMA0PziN0U6VYc07ftmX7/view"));
				startActivity(i6);
			}
		});
		
		m1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1IdhVOJEiM2EOJ4I7cRH6hqNEcsca6eCB/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		m2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1gF-hbBBQ7Jy1sTZwny0P2C-Zzybu4UhE/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		m3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1d8VemuMZBWbDP3rTWnfPUc6h8mjHZGUP/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		m4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1FK5wwfLFLp1ABbePpV_fU0Kla3ffcYtw/view"));
				startActivity(i6);
			}
		});
		
		m5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1exzPtAqKSDRVA1cUCctlIt1buYNhaVE3/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		m6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/14WHf2kTA7hBppjF3xsIslZDdf1NAflw0/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		m7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1AYCdUFBtaRuvdh7fNPrt2mgMmTKh5Q72/view"));
				startActivity(i6);
			}
		});
		
		m8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1cHqhXy5OWPeaBYD0MYSvdZdEtSMHQG-1/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		m9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1mfw4VZBizecoSG5TZCEmu9ffQ7BVpXQy/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		u1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1eVSCGiCqszdK2UFpIdCtkVjZDJUa2jFy/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		u2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1YUor-RgAU-jmDLSaygc4Vko2T0khdrg8/view"));
				startActivity(i6);
			}
		});
		
		u3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1AQ7IUVZtsUKO3T-ek2mIyK9n8nIOQpgM/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		u4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1euylFreWzMXbBpHTIq0zdtKSYs-jXaRx/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		u5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/18id2Y5ZcjDKMXUKPzTRs62FuSjct-yK4/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		u6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1bNt3p6NBsTEPuJRelqZaq_SE2rkpvoFa/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		u7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1toq3QwWFhLoTCq5L25I3uv9tG3BmTH6G/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		u8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1tTVVkX5NE9fIU-a_yHLPFnA02GEJuXLj/view"));
				startActivity(i6);
			}
		});
		
		u9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1xDnJ2mf5xG2B3mxLUabql3Qoi5Oh9iLL/view?usp=sharing"));
				startActivity(i6);
			}
		});
		
		u10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i6.setAction(Intent.ACTION_VIEW);
				i6.setData(Uri.parse("https://drive.google.com/file/d/1-e5bfEMmuXxpcMeVwqYW4UChjOcYuGtq/view"));
				startActivity(i6);
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("Class 6");
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