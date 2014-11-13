/**
 * 
 */
package org.pj.androidlab.widget;

import org.pj.androidlab.R;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * @author pingjiang
 *
 */
public class PosterImageView extends RelativeLayout {

	private Drawable poster;
	private String title;
	
	public PosterImageView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		
		TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.PosterImageView, defStyle, 0);
		this.poster = a.getDrawable(R.styleable.PosterImageView_poster);
		this.title = a.getString(R.styleable.PosterImageView_title);
		
		a.recycle();
		
		initView(context, (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE));
	}
	
	private void initView(Context context, LayoutInflater inflater) {
		inflater.inflate(R.layout.layout_poster_image_view, this);
		ImageView imageView = (ImageView)findViewById(R.id.poster_image);
		imageView.setImageDrawable(this.poster);
		TextView textView = (TextView)findViewById(R.id.poster_title);
		textView.setText(this.title);
	}
}
