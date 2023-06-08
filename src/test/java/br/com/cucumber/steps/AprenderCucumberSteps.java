package br.com.cucumber.steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.junit.Assert;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AprenderCucumberSteps {
	@Dado("que criei o arquivo corretamente")
	public void queCrieiOArquivoCorretamente() {
	    
	}

	@Quando("executá-lo")
	public void executáLo() {
	    
	}

	@Então("a especificação deve finalizar com sucesso")
	public void aEspecificaçãoDeveFinalizarComSucesso() {	    
	}
	
	private Integer contador = 0;
	
	@Dado("que o valor do contador é {int}")
	public void queOValorDoContadorÉ(Integer int1) {
		contador = int1;
	}

	@Quando("eu incrementar em {int}")
	public void euIncrementarEm(Integer int1) {
	    contador += int1;
	}

	@Então("o valor do contador será {int}")
	public void oValorDoContadorSerá(Integer int1) {	    
	    //Assert.assertTrue(int1 == contador);
		Assert.assertEquals(int1, contador);
	}
	
	Date entrega = new Date();
	
	@Dado("que a entrega é dia {date}")
	public void queAEntregaÉDia(Date data) {
		System.out.println(data.toString());
		entrega = data;
	}

	@Quando("a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
	public void aEntregaAtrasarEmDias(Integer dias, String tempo) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if (tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, dias);
		}
		if (tempo.equals("meses")) {
			cal.add(Calendar.MONTH, dias);
		}
		entrega = cal.getTime();
	}

	@Então("a entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeráEfetuadaEm(String data) {
	    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	    String dataFormatada = format.format(entrega);
	    Assert.assertEquals(data, dataFormatada);
	}
	
	@Dado("que o ticket( especial)? é (A.\\d{3})$")
	public void queOTicketÉAF(String tipo, String ticket) {
	    
	}

	@Dado("que o valor da passagem é R\\$ (.*)$")
	public void queOValorDaPassagemÉR$(Double valor) {
	    
	}

	@Dado("que o nome do passageiro é \"(.{5,20})\"$")
	public void queONomeDoPassageiroÉ(String nome) {
	    
	}

	@Dado("que o telefone do passageiro é (9\\d{3}-\\d{4})$")
	public void queOTelefoneDoPassageiroÉ(String telefone) {
	    
	}

	@Quando("criar os steps")
	public void criarOsSteps() {
	    
	}

	@Então("o teste vai funcionar")
	public void oTesteVaiFuncionar() {
	    
	}	
}
