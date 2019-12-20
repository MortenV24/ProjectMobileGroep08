package com.example.amazighapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

 public class Oefen extends AppCompatActivity {

    private RecyclerView categorieList;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefen);
        mDatabase= FirebaseDatabase.getInstance().getReference().child("categorieën");
        mDatabase.keepSynced(true);

       categorieList=(RecyclerView)findViewById(R.id.recycleview);
       categorieList.setHasFixedSize(true);
       categorieList.setLayoutManager(new LinearLayoutManager(this));
<<<<<<< HEAD

       onClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               NaarOefenItem(v);
           }
        };
=======
>>>>>>> master
    }

     @Override
     protected void onStart() {
         super.onStart();
         final Intent intNext = new Intent(this, OefenItem.class);

         FirebaseRecyclerAdapter<Categorie,CategorieViewHolder>firebaseRecyclerAdapter= new FirebaseRecyclerAdapter<Categorie, CategorieViewHolder>
                 (Categorie.class,R.layout.oefen_row,CategorieViewHolder.class,mDatabase) {
             @Override
             protected void populateViewHolder(CategorieViewHolder viewHolder, Categorie model, int position){
                 viewHolder.setTitle(model.getTitle());
                 viewHolder.setDesc(model.getDesc());
                 viewHolder.setImage(getApplicationContext(),model.getImage());
                 viewHolder.itemView.setTag(model.getTitle());

                 viewHolder.itemView.setOnClickListener(
                         new View.OnClickListener() {
                             @Override
                             public void onClick(View v) {
                                 intNext.putExtra("categorie", v.getTag().toString());
                                 startActivity(intNext);
                             }
                         }
                 );
             }
         };
         categorieList.setAdapter(firebaseRecyclerAdapter);
     }

     public static class CategorieViewHolder extends RecyclerView.ViewHolder {
        View mView;

        public CategorieViewHolder(View itemView){
            super(itemView);
            mView=itemView;
        }

        public void setTitle(String title){
            TextView categorie_title=(TextView)mView.findViewById(R.id.categorie_title);
            categorie_title.setText(title);
        }

        public void setDesc(String desc){
            TextView categorie_desc=(TextView)mView.findViewById(R.id.categorie_desc);
            categorie_desc.setText(desc);
        }
        public void setImage(Context ctx,String image){
            ImageView categorie_image=(ImageView)mView.findViewById(R.id.categorie_image);
            Picasso.with(ctx).load(image).into(categorie_image);
        }
     }
 }


//github