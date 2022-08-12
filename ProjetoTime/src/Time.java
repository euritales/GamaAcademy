
public class Time {


	private int hora;
	private int minuto;
	private int segundo;
	
	public Time(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public void SetTime(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public String ExibirHoraUniversal() {
		return FormatarNumero(this.hora)+ ":" + FormatarNumero(this.minuto) + ";" + FormatarNumero(this.segundo);
	}
	
	public String ExibirHoraPadrao() {
		String sufixo;
		String horaPadrao;
		
		if(this.hora == 0) {
			horaPadrao= "12";
			sufixo = "AM";
		}	else if(this.hora == 12) {
			horaPadrao= "12";
			sufixo = "PM";
		}	else if(this.hora >= 0 && this.hora <= 12 ) {
			horaPadrao= String.valueOf(FormatarNumero(this.hora));
			sufixo = "AM";
		}else {
			horaPadrao = String.valueOf(FormatarNumero(this.hora-12));
			sufixo = "PM";
		}
		return horaPadrao + ":" + FormatarNumero(this.minuto) + ":" + FormatarNumero(this.segundo) + sufixo;
		
	}
	
	private String FormatarNumero(int num) {
		
		if(num < 10) {
			return "0"+num;
		}
			return String.valueOf(num);
	}
}
