package com.packtpub.vaadin;

import com.packtpub.vaadin.dragndrop.DragAndDropUploader;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

/**
 * Main UI class
 */
@SuppressWarnings("serial")
public class Demo extends UI {
	@Override
	protected void init(VaadinRequest request) {		
		setContent(new DragAndDropUploader());
	}
}