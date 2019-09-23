package com.kyleanderson;

public class Button {
    private String title;
    private onClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
