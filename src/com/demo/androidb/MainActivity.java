package com.demo.androidb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
/**
 * 主活动,Activity的生命周期演示
 * @author Cherry
 * @date  2019年6月5日
 */
public class MainActivity extends Activity {
	private static final String TAG = "MainActivity";
	/*
	 * 初始化活动
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate");
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		if(null != savedInstanceState){
			savedInstanceState.get("key");
		}
		Button a = (Button) findViewById(R.id.A);
		Button b = (Button) findViewById(R.id.B);
		
		a.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent ints = new Intent(MainActivity.this,NormalActivity.class);
				startActivity(ints);
			}
		});
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent ints = new Intent(MainActivity.this,DialogActivity.class);
				startActivity(ints);
			}
		});
	}
	
	/*
	 * 开始活动
	 */
	@Override
	protected void onStart() {
		super.onStart();
		Log.d(TAG, "onStart");
	}
	
	/*
	 * 重置活动
	 */
	@Override
	protected void onResume() {
		super.onResume();
		Log.d(TAG, "onResume");
	}
	
	/*
	 * 暂停活动
	 */
	@Override
	protected void onPause() {
		super.onPause();
		Log.d(TAG, "onPause");
	}
	
	/*
	 * 停止活动
	 */
	@Override
	protected void onStop() {
		super.onStop();
		Log.d(TAG, "onStop");
	}
	
	/*
	 * 销毁活动
	 */
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "onDestroy");
	}
	
	/*
	 * 重启活动
	 */
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(TAG, "onRestart");
	}
	
	/*
	 * 活动被系统回收后可以保存数据到Bundle中，
	 * 用户返回时在取出数据。
	 */
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putString("key", "保存的数据");
	}
}
