package com.android.mycontacts;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonViewHolder> {

    private List<Person> people;
    private Context context;

    public PersonAdapter(List<Person> people, Context context) {
        this.people = people;
        this.context = context;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_card, parent, false);
        return new PersonViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        final Person person = people.get(position);
        holder.getPhoto().setImageResource(person.getPhotoId());
        holder.getName().setText(person.getNameId());
        holder.getPhoneNumber().setText(person.getPhoneNumberId());
    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
