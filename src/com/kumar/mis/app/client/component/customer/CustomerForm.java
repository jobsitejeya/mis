package com.kumar.mis.app.client.component.customer;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class CustomerForm implements IsWidget {

	interface CustomerUiBinder extends UiBinder<VerticalPanel, CustomerForm> {
	};

	private static CustomerUiBinder uiBinder = GWT
			.create(CustomerUiBinder.class);
	
	
	 private VerticalPanel vp;

	@Override
	public Widget asWidget() {
		
		if (vp == null) {
			vp = uiBinder.createAndBindUi(this);
		}
		// TODO Auto-generated method stub
		return vp;
	}

}
