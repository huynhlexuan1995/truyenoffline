package truyencuoi.huynhlx.com.truyenoffline.topic;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import truyencuoi.huynhlx.com.truyenoffline.R;

public class TopicFragment extends Fragment implements TopicAdapter.ITopicAdapter {
    private List<ItemTopic> itemTopics;
    private ListView lvStore;
    private TopicAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_topic,
                container, false);
        inits(view);
        return view;
    }
    private void inits(View view) {
        itemTopics = new ArrayList<>();
        itemTopics.add(new ItemTopic(R.drawable.im_1,
                "Vova"));
        itemTopics.add(new ItemTopic(R.drawable.im_2,
                "Dân gian"));
        itemTopics.add(new ItemTopic(R.drawable.im_3,
                "Gia đình"));
        itemTopics.add(new ItemTopic(R.drawable.im_4,
                "Tình yêu"));
        itemTopics.add(new ItemTopic(R.drawable.im_5,
                "Tiếu lâm"));

        lvStore = (ListView) view.findViewById(R.id.lv_store);
        adapter = new TopicAdapter(itemTopics, this);
        lvStore.setAdapter(adapter);
    }
    public void openStore(int position){

    }
}
