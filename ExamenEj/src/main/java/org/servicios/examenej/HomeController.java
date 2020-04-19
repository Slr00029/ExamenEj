package org.servicios.examenej;


import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@Autowired
	private DAOArticulos DAO;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
		public String home (HttpServletRequest request, Model model){
		
		
		return "home";
	}
	
	@RequestMapping(value = "/ApartadoA", method = RequestMethod.GET)
	public String ApartadoA (HttpServletRequest request, Model model){
	
	
	return "ApartadoA";
	}
	
	@RequestMapping(value = "/ApartadoB", method = RequestMethod.GET)
	public String ApartadoB (HttpServletRequest request, Model model){
	
	
	return "ApartadoB";
	}
	
	
	@RequestMapping(value = "/Ej1", method = RequestMethod.POST)
	public String Ej1 (HttpServletRequest request, Model model){
		
		int tipo = Integer.parseInt(request.getParameter("tipo"));
		String url = "articulos";
		List<DTOArticulos> lista = DAO.buscarArticulos(tipo);
		model.addAttribute("lista", lista);
		
		
		return url;
	}
	
	@RequestMapping(value = "/Ej2", method = RequestMethod.POST)
	public String Ej2 (HttpServletRequest request, HttpServletResponse response, Model model){
		
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		
		Cookie c = new Cookie("ultarticulo", request.getParameter("id"));
		c.setMaxAge(60*60);
		c.setPath("/");
		response.addCookie(c);
		
		String url = "articulo";
		DTOArticulos articulo = DAO.buscarArticuloUnico(id);
		model.addAttribute("articulo",articulo);
		
		return url;
	}
	
	@RequestMapping(value = "/historico", method = RequestMethod.GET)
	public String historico (HttpServletRequest request, Model model){
		
		String Cookiename = "ultarticulo";
		String id = "";
		String url = "";
		
        Cookie[] cookies = request.getCookies();
        if (cookies!=null) {
            for(Cookie cookie:cookies) {
                if(Cookiename.equals(cookie.getName())) { //Si coincide el nombre de la cookie con el de la cookie del email
                    id = cookie.getValue(); //Cogemos el correo que esta guardado en la cookie 
                    DTOArticulos articulo = DAO.buscarArticuloUnico(Integer.parseInt(id));
                    model.addAttribute("articulo",articulo);
                    url = "articulo";
                }
                else url = "home";
            }
        }
        else url = "home";
        
	
		return url;
	}
	
	
}
	

