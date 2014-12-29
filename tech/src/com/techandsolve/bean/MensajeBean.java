package com.techandsolve.bean;

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class MensajeBean {

	
	public String cambiarIdioma(){
		FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.ENGLISH);
		FacesContext.getCurrentInstance().getApplication().setDefaultLocale(Locale.ENGLISH);
		return "";
	}
}
