package gerenciador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditarEmpresa
 */
@WebServlet("/editarEmpresa")
public class EditarEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramID = request.getParameter("id");
		Integer id = Integer.valueOf(paramID);

		Banco banco = new Banco();

		Empresa empresa = banco.buscaIdEmpresa(id);

		System.out.println(empresa.getNome());

		request.setAttribute("empresa", empresa);
		
		RequestDispatcher rd = request.getRequestDispatcher("*/formEditEmpresa.jsp");
		rd.forward(request, response);
	}
}
