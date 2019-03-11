package com.andy.recyclerviewx;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {//extends Fragment
    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> lstContact;

    public FragmentContact(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.contact_fragment,container,false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Andy Darmawan"," 082145724716", R.drawable.circle));
        lstContact.add(new Contact("Andy Darmawan"," 082145724716", R.drawable.ando));
        lstContact.add(new Contact("Andy Darmawan"," 082145724716", R.drawable.ayu));
        lstContact.add(new Contact("Andy Darmawan"," 082145724716", R.drawable.bima));
        lstContact.add(new Contact("Andy Darmawan"," 082145724716", R.drawable.hai));
        lstContact.add(new Contact("Andy Darmawan"," 082145724716", R.drawable.hji));
        lstContact.add(new Contact("Andy Darmawan"," 082145724716", R.drawable.circle));
        lstContact.add(new Contact("Andy Darmawan"," 082145724716", R.drawable.ando));
        lstContact.add(new Contact("Andy Darmawan"," 082145724716", R.drawable.ayu));
        lstContact.add(new Contact("Andy Darmawan"," 082145724716", R.drawable.bima));
        lstContact.add(new Contact("Andy Darmawan"," 082145724716", R.drawable.hai));
        lstContact.add(new Contact("Andy Darmawan"," 082145724716", R.drawable.hji));
        lstContact.add(new Contact("Andy Darmawan"," 082145724716", R.drawable.circle));
        lstContact.add(new Contact("Andy Darmawan"," 082145724716", R.drawable.ando));
        lstContact.add(new Contact("Andy Darmawan"," 082145724716", R.drawable.ayu));
        lstContact.add(new Contact("Andy Darmawan"," 082145724716", R.drawable.bima));
        lstContact.add(new Contact("Andy Darmawan"," 082145724716", R.drawable.hai));
        lstContact.add(new Contact("Andy Darmawan"," 082145724716", R.drawable.hji));




    }
}


