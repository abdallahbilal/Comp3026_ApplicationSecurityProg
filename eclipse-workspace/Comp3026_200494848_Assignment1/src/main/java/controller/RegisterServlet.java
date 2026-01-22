
package controller;

import java.io.IOException;

import dao.RegisterDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Register;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	System.out.println("=== RegisterServlet doPost HIT ===");

        // 1️⃣ Read request
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        // 2️⃣ Basic validation
        if (userId == null || userId.isEmpty() ||
            password == null || password.isEmpty() ||
            email == null || email.isEmpty()) {

            response.sendRedirect("register.jsp?error=empty");
            return;
        }
        System.out.println("Validation passed");

        // 3️⃣ Populate model
        Register r = new Register();
        r.setUserId(userId);
        r.setPassword(password);
        r.setName(request.getParameter("name"));
        r.setAddress(request.getParameter("address"));
        r.setCountry(request.getParameter("country"));
        r.setZipcode(request.getParameter("zipcode"));
        r.setEmail(email);
        r.setSex(request.getParameter("sex"));
        String[] languages = request.getParameterValues("language");
        if (languages != null) {
            r.setLanguage(String.join(", ", languages));
        }

        r.setAbout(request.getParameter("about"));

        RegisterDao dao = new RegisterDao();
        
        System.out.println("Checking DB for existing user...");

        // 4️⃣ Database validation
        if (dao.userExists(userId, email)) {
            response.sendRedirect("register.jsp?error=exists");
            return;
        }

        System.out.println("User exists result: " + dao.userExists(userId, email));

        // 5️⃣ Save
        if (dao.registerUser(r)) {
            response.sendRedirect("success.jsp");
            System.out.println("Inserting user into database: " + r.getUserId());
        } else {
            response.sendRedirect("register.jsp?error=server");
        }
        
        System.out.println("=== REGISTER FORM DATA ===");
        System.out.println("UserId: " + userId);
        System.out.println("Email: " + email);
    }
}
