package truyencuoi.huynhlx.com.truyenoffline.topic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import truyencuoi.huynhlx.com.truyenoffline.R;

public class TopicAdapter extends BaseAdapter {
    private List<ItemTopic> itemTopics;
    private  ITopicAdapter inter;

    public TopicAdapter(List<ItemTopic> itemTopics, ITopicAdapter inter) {
        this.itemTopics = itemTopics;
        this.inter = inter;
    }

    @Override
    public int getCount() {
        if( itemTopics == null ){
            return 0;
        }
        return itemTopics.size();
    }

    @Override
    public Object getItem(int position) {
        return itemTopics.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View contentView, ViewGroup viewGroup) {
        if ( contentView == null ) {
            LayoutInflater inflater =
                    LayoutInflater.from(viewGroup.getContext());
            contentView = inflater.inflate(R.layout.item_topic, viewGroup, false);
        }
        ImageView ivImage = (ImageView)
                contentView.findViewById(R.id.iv_img);
        TextView tvName = (TextView)
                contentView.findViewById(R.id.tv_content);
        ItemTopic itemTopic = itemTopics.get(position);
        ivImage.setImageResource(itemTopic.getImageId());
        tvName.setText(itemTopic.getName());

        contentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //
                inter.openStore(position);
            }
        });
        return contentView;
    }

    public interface ITopicAdapter {
        void openStore(int position);
    }
}
