package com.zhengyi.library;

import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象的Adapter.
 */
public abstract class PulmBaseAdapter<T> extends BaseAdapter {
    protected List<T> items;

    public PulmBaseAdapter() {
        this.items = new ArrayList<>();
    }

    public PulmBaseAdapter(List<T> items) {
        this.items = items;
    }

    public void addMoreItems(List<T> newItems, boolean isFirstLoad) {
        if (isFirstLoad) {
            this.items.clear();
        }
        this.items.addAll(newItems);
        notifyDataSetChanged();
    }

    public void addMoreItems(int location, List<T> newItems) {
        this.items.addAll(location, newItems);
        notifyDataSetChanged();
    }

    public void removeAllItems() {
        this.items.clear();
        notifyDataSetChanged();
    }
}
