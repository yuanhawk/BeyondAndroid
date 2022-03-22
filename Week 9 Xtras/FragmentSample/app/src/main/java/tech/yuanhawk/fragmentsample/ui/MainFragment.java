package tech.yuanhawk.fragmentsample.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;

import tech.yuanhawk.fragmentsample.R;
import tech.yuanhawk.fragmentsample.databinding.FragmentMainBinding;

public class MainFragment extends BaseFragment implements View.OnClickListener {

    private FragmentMainBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        binding.buttonSetExchangeRate.setOnClickListener(this);
        return binding.getRoot();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == binding.buttonSetExchangeRate.getId()) {
            getNavController().navigate(R.id.action_mainFragment_to_subFragment);
        }
    }
}