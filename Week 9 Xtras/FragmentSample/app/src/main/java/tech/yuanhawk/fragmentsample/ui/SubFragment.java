package tech.yuanhawk.fragmentsample.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;

import tech.yuanhawk.fragmentsample.R;
import tech.yuanhawk.fragmentsample.databinding.FragmentSubBinding;
import tech.yuanhawk.fragmentsample.models.ExchangeRate;

public class SubFragment extends BaseFragment implements View.OnClickListener {

    private FragmentSubBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sub, container, false);
        binding.goBack.setOnClickListener(this);
        ExchangeRate er = new ExchangeRate("", "");
        binding.setRate(er);
        return binding.getRoot();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == binding.goBack.getId()) {
            getNavController().popBackStack(R.id.mainFragment, false);
        }
    }
}