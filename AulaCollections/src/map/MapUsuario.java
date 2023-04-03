package map;
import objetos.User;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;



public class MapUsuario {
  public static void main(String[] args) {
	  User igor = new User(1, "Igor", "root");
	  User maria = new User(2, "maria", "admin");
	  User joao = new User(3, "Jo�o", "root");
	  User lucas = new User(4, "Lucas", "admin");
	  User jose = new User(3, "Jose", "root");
	  
	  List<User> listaUser = new ArrayList<User>();
	  
	  listaUser.add(igor);
	  listaUser.add(maria);
	  listaUser.add(joao);
	  listaUser.add(lucas);
	  listaUser.add(jose);
	  
	  for(User usuario: listaUser){
		  System.out.println(usuario.getNome());
	  }
	  Collections.sort(listaUser);
	  System.out.println("--Lista ordenada--");
	  for(User usuario: listaUser){
		  System.out.println(usuario.getNome());
	  }
	  Map mapa = new HashMap();
	  mapa.put(1, igor);
	  mapa.put(2, maria);
	  mapa.put(3,joao);
	  mapa.put(4, lucas);
      mapa.put(5, jose);
      
      for(int i = 1; i < mapa.size() + 1; i++ ){
    	  User user = (User)mapa.get(i);
    	  System.out.println(user.getNome());
      }
      
    
	  
	  
}
	
}
