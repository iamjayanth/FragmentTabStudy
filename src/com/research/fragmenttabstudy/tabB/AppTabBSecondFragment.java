package com.research.fragmenttabstudy.tabB;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.research.fragmenttabstudy.R;
import com.research.fragmenttabstudy.base.BaseFragment;

public class AppTabBSecondFragment extends BaseFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
        View view       =   inflater.inflate(R.layout.app_tab_b_second_screen, container, false);
        return view;
	}
}
