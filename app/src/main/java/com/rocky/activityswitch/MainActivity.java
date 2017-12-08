package com.rocky.activityswitch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * @author Created by Andy.Ren on 2017/12/7.
 */
public class MainActivity extends AppCompatActivity {

	private RecyclerView mRecyclerView;
	private ArrayList<String> mList = new ArrayList<>();
	private MainAdapter mAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		initData();
	}

	private void initData() {
		String[] animArray = getResources().getStringArray(R.array.anim_type);
		for (int i = 0; i < animArray.length; i++) {
			mList.add(animArray[i]);
		}
		mAdapter = new MainAdapter(this,mList);
		mRecyclerView.setAdapter(mAdapter);
	}

	private void initView() {
		mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
		mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
	}
}


