package com.example.lesson_002;

import java.util.ArrayList;

class ElementsBuilder {

    static final int BUTTON_ID = 0;
    private static final String BUTTON_NAME = "Button";

    static final int TEXT_VIEW_ID = 1;
    private static final String TEXT_VIEW_NAME = "Text View";

    static final int EDIT_TEXT_ID = 2;
    private static final String EDIT_TEXT_NAME = "Edit Text";

    static final int CHECK_BOX_ID = 3;
    private static final String CHECK_BOX_NAME = "Check Box";

    static final int RADIO_GROUP_ID = 4;
    private static final String RADIO_GROUP_NAME = "Radio Group";

    static final int SWITCH_ID = 5;
    private static final String SWITCH_NAME = "Switch";

    static final int IMAGE_VIEW_ID = 6;
    private static final String IMAGE_VIEW_NAME = "Image View";

    static final int PROGRESS_BAR_ID = 7;
    private static final String PROGRESS_BAR_NAME = "Progress Bar";

    static final int RATING_BAR_ID = 8;
    private static final String RATING_BAR_NAME = "Rating Bar";

    static ArrayList<Element> buildElements() {
        ArrayList<Element> elements = new ArrayList<>();
        elements.add(new Element(BUTTON_ID, BUTTON_NAME));
        elements.add(new Element(TEXT_VIEW_ID, TEXT_VIEW_NAME));
        elements.add(new Element(EDIT_TEXT_ID, EDIT_TEXT_NAME));
        elements.add(new Element(CHECK_BOX_ID, CHECK_BOX_NAME));
        elements.add(new Element(RADIO_GROUP_ID, RADIO_GROUP_NAME));
        elements.add(new Element(SWITCH_ID, SWITCH_NAME));
        elements.add(new Element(IMAGE_VIEW_ID, IMAGE_VIEW_NAME));
        elements.add(new Element(PROGRESS_BAR_ID, PROGRESS_BAR_NAME));
        elements.add(new Element(RATING_BAR_ID, RATING_BAR_NAME));
        return elements;
    }
}
