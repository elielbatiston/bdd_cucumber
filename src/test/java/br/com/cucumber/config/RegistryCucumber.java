package br.com.cucumber.config;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import io.cucumber.java.ParameterType;

public class RegistryCucumber  {
	@ParameterType(".*")
    public Date date(String date) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date retorno = format.parse(date);
			return retorno;
		} catch(ParseException ex) {
			ex.printStackTrace();
			return null;
		}        
    }
}
