import java.util.HashMap;

public class CamposRegistro {
	public static void main(String[] args) {
		HashMap<String,String> nomeEmail = new HashMap<String,String>();
		nomeEmail.put("Ricardo", "ricardo@gamaacademy.com");
		nomeEmail.put("Will", "will@gamaadedemy.com");
	

		System.out.println(nomeEmail);
		System.out.println(nomeEmail.get("Will"));
	
	}
	
	
}
