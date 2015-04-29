import java.util.HashMap;
import java.util.Map;

//em java as classes nao podem ser static ,excepto se dentro de outras classes
// contudo os membros os podem ser


//se a classe nao tive o construtor por defeito privado
//podemos instanciar , neste caso os membros static em java
//sao partilhados por todos
//ou seja se um atributo inteiro contiver o valor 10, todos os objetos dessa classe acedem ao mesmo valor
//se a classe tiver um construtor de pagina, nao pode ser innstanciada
public class Global {

	private  Global() {
	}
	
	
	public static Map<Integer , String> lista = new HashMap<Integer, String>();
}
