package com.webbed.rankit.newbie.Adapters;


import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.webbed.rankit.newbie.Getters.Coding;
import com.webbed.rankit.newbie.R;



public class FragmentAadapter extends BaseAdapter {

	private Context con;
    private String title[];
    private int images[];


	public FragmentAadapter(Context context) {

		this.con = context;
        title=Coding.getEventName();
        images=Coding.getEventImage();

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return title.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
    
		
		View view = null;
		ViewsHolder holder = null;

		if (convertView == null) {

			LayoutInflater inflater = (LayoutInflater) con
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = inflater.inflate(R.layout.single_event_ui, parent, false);

			holder = new ViewsHolder();

			holder.imageView = (ImageView) view.findViewById(R.id.image);
            holder.postText= (RelativeLayout) view.findViewById(R.id.postText);
			holder.title = (TextView) view.findViewById(R.id.title);

			view.setTag(holder);
			

		} else {
			view = convertView;
			holder = (ViewsHolder) view.getTag();
		}




		   
		   Typeface tfSlab = Typeface.createFromAsset(con.getAssets(),
					"fonts/RobotoSlab-Regular.ttf");
		   
		   
		holder.title.setTypeface(tfSlab);
			

		holder.title.setText(title[position]);




        holder.imageView.setImageResource(images[position]);

        /*Bitmap bitmap = BitmapFactory.decodeResource(con.getResources(),images[position]);

        Palette p = Palette.generate(bitmap);

        final ViewsHolder mHolder=holder;

        Palette.generateAsync(bitmap, new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {

                // Here's your generated palette

               Palette.Swatch swatch= palette.getVibrantSwatch();


                if(swatch!=null) {

                    int color =swatch.getBodyTextColor();

                    mHolder.postText.setBackgroundColor(swatch.getRgb());
                    mHolder.title.setTextColor(color);
                    mHolder.postText.setAlpha(0.8f);

                }


            }
        });*/





		return view;
	}

	static class ViewsHolder {

		private ImageView imageView;
		private TextView title;
        private RelativeLayout postText;
	}

}