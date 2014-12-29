package com.techandsolve.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AlejoBean {
	
	public String nombre = "KAATHEEEEEE" ;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMensaje(){
		return "Alejosd";
	}
//#{msg.welcomeHeading}
	//<f:loadBundle basename="resources.application" var="msg"/>
}
