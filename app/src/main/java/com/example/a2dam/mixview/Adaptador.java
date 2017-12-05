package com.example.a2dam.mixview;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 2dam on 28/11/2017.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.ElementHolder> {

    private ArrayList<Element> listaHotels;
    private LinearLayout layoutRecycler;



    public Adaptador(ArrayList<Element> listaHotels) {
        this.listaHotels = listaHotels;
    }


    @Override
    public ElementHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview,parent,false);

        layoutRecycler = (LinearLayout) v.findViewById(R.id.reciclerlayout);
        return new ElementHolder(v);

    }



    @Override
    public void onBindViewHolder(ElementHolder holder, int position) {
        final int pos=position;


        holder.nombre.setText(listaHotels.get(position).getNombre());
        holder.ratingBar.setRating(listaHotels.get(position).getPuntiacio());
        holder.direccion.setText(listaHotels.get(position).getDireccion());
        holder.precio.setText(""+listaHotels.get(position).getPrecio());
        holder.imagen.setImageResource(listaHotels.get(position).getImagen());

        holder.v.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                confirmarBorrar(v,pos);

                return true;
            }


        });
    }

    private void confirmarBorrar(View v, final int posicion) {

        AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
        String nomComplet = "<b>"+listaHotels.get(posicion).getNombre()+
        listaHotels.get(posicion).getNombre();
        String msg = "Estas segur que vols eliminar el client " + nomComplet+"?";
        builder.setMessage(Html.fromHtml(msg));
        builder.setTitle("Eliminar Client");

        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                listaHotels.remove(posicion);
                notifyItemRemoved(posicion);
                notifyItemRangeChanged(posicion, getItemCount());
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
// Es cancel-la el diàleg
            }
        });
// 4. Creem l'AlertDialog
        AlertDialog dialog = builder.create();
// 5.- Mostrem el dialeg
        dialog.show();
    }


    @Override
    public int getItemCount() {
        return listaHotels.size();
    }

    public static class ElementHolder extends RecyclerView.ViewHolder implements  AdapterView.OnClickListener {

        public View v;
        TextView nombre,precio,direccion;
        RatingBar ratingBar;
        ImageView imagen;




        ElementHolder(View v){
            super (v);
            this.v=v;
            nombre = (TextView) v.findViewById(R.id.nombre);
            direccion = (TextView) v.findViewById(R.id.direccion);
            precio = (TextView) v.findViewById(R.id.precio);
            ratingBar = (RatingBar) v.findViewById(R.id.ratingBar);
            imagen = (ImageView) v.findViewById(R.id.imagen);

        }

        @Override
        public void onClick(View v) {

        }
    }
}
