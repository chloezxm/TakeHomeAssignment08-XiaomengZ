package com.android.mycontacts;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PersonViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private ImageView photo;
    private TextView name;
    private TextView phoneNumber;
    private Button callButton;
    private Button messageButton;

    public PersonViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = itemView.findViewById(R.id.contact_card);
        photo = itemView.findViewById(R.id.photo_image_view);
        name = itemView.findViewById(R.id.name_text_view);
        phoneNumber = itemView.findViewById(R.id.phone_number_text_view);
        callButton = itemView.findViewById(R.id.call_button);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "A future version will make a phone call", Toast.LENGTH_SHORT).show();
            }
        });

        messageButton = itemView.findViewById(R.id.message_button);
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "A future version will send a text message", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public CardView getCardView() {
        return cardView;
    }

    public void setCardView(CardView cardView) {
        this.cardView = cardView;
    }

    public ImageView getPhoto() {
        return photo;
    }

    public void setPhoto(ImageView photo) {
        this.photo = photo;
    }

    public TextView getName() {
        return name;
    }

    public void setName(TextView name) {
        this.name = name;
    }

    public TextView getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(TextView phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Button getCallButton() {
        return callButton;
    }

    public void setCallButton(Button callButton) {
        this.callButton = callButton;
    }

    public Button getMessageButton() {
        return messageButton;
    }

    public void setMessageButton(Button messageButton) {
        this.messageButton = messageButton;
    }
}
