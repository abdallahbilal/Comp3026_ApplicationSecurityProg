

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String country = request.getParameter("country");
		String zipcode = request.getParameter("zipcode");
		String email = request.getParameter("email");
		String sex = request.getParameter("sex");
		String language = request.getParameter("language");
		String about = request.getParameter("about");
		
		
		Register r = new Register();
		r.setUserId(userId);
		r.setPassword(password);
		r.setName(name);
		r.setAddress(address);
		r.setCountry(country);
		r.setZipcode(zipcode);
		r.setEmail(email);
		r.setSex(sex);
		r.setLanguage(language);
		r.setLanguage(about);
		
		System.out.println(userId);
		System.out.println(password);
		System.out.println(name);
		System.out.println(address);
		System.out.println(country);
		System.out.println(zipcode);
		System.out.println(email);
		System.out.println(sex);
		System.out.println(language);
		System.out.println(about);



		
	}

}
