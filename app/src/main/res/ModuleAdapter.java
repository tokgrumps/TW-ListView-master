import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter {
    public class ModuleAdapter extends ArrayAdapter<Modules> {

        private ArrayList<Modules> modules;
        private Context context;
        private TextView tvModules;
        private ImageView ivStar;

        public ModuleAdapter(Context context, int resource, ArrayList<Modules> objects){
            super(context, resource, objects);
            // Store the food that is passed to this adapter
            modules = objects;
            // Store Context object as we would need to use it later
            this.context = context;
        }
        // getView() is the method ListView will call to get the
        //  View object every time ListView needs a row

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // The usual way to get the LayoutInflater object to
            //  "inflate" the XML file into a View object
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            // "Inflate" the row.xml as the layout for the View object
            View rowView = inflater.inflate(R.layout.row, parent, false);

            // Get the TextView object
            tvModules = (TextView) rowView.findViewById(R.id.tvModules);
            // Get the ImageView object
            ivStar = (ImageView) rowView.findViewById(R.id.ivStar);


            // The parameter "position" is the index of the
            //  row ListView is requesting.
            //  We get back the food at the same index.
            Modules currentModules = modules.get(position);
            // Set the TextView to show the food

            tvModules.setText(currentModules.getName());
            // Set the image to star or no star accordingly
            if(currentModules.isStar()) {
                ivStar.setImageResource(R.drawable.prog);
            }
            else {
                ivStar.setImageResource(R.drawable.nonprog);
            }
            // Return the nicely done up View to the ListView
            return rowView;

        }

    }
