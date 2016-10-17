package text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
	
	private static FactoriaCaracter factory=null;
	
	private final Map<Character,Caracter> map = new HashMap<Character,Caracter>();
	
	public Caracter get(char caracter)
	{
		if (map.containsKey(caracter)) {
            return map.get(caracter);
        } else {
            Caracter c1 = new Caracter(caracter);
            map.put(caracter, c1);
            return c1;
        }
	}
	
	public static FactoriaCaracter getFactoria()
	{
		if(FactoriaCaracter.factory==null)
		{
			FactoriaCaracter.factory = new FactoriaCaracter();
		}
		return factory;
	}

}
