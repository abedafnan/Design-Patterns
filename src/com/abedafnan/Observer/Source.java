package com.abedafnan.Observer;

import java.util.ArrayList;
import java.util.List;

public class Source {

    String date;
    List<SourceListener> listeners = new ArrayList<>();

    public void setDate(String data) {
        this.date = data;
        for (SourceListener l: listeners) {
            l.update(data);
        }
    }

    public void setSourceListener(SourceListener listener) {
        if (!listeners.contains(listener)) {
            listeners.add(listener);
        }
    }

    public void removeSourceListener(SourceListener listener) {
        listeners.remove(listener);
    }

    public interface SourceListener {

        void update(String data);
    }
}
