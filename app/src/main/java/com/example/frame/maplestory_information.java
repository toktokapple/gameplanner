package com.example.frame;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class maplestory_information extends Fragment {

    public maplestory_information(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.maplestory_information,container,false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // 프래그먼트1로 돌아갈 때 뒤로가기 버튼 처리
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                // 프래그먼트1로 이동하는 코드를 여기에 작성합니다.
                // 예시: 프래그먼트1로 교체하려면 아래 코드를 사용합니다.
                maplestory_notice maplestory_notice = new maplestory_notice();
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, maplestory_notice)
                        .commit();
            }
        });
    }
}
