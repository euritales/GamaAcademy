package app;
import core.Time;

public class TimeTeste {

	public static void main(String[] args) {

		Time t = new Time(9,05,31);
		System.out.println(t.ExibirHoraUniversal());
		System.out.println(t.ExibirHoraPadrao());
	}

}
