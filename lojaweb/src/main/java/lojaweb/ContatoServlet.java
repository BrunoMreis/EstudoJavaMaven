package lojaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.maven.Produto;
import br.com.caelum.stella.tinytype.CPF;

@WebServlet(urlPatterns = { "/contato" })
public class ContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 6359609820023276288L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Produto p = new Produto("Bala", 0.15);
		PrintWriter wireter = resp.getWriter();
		new CPF("12345678911").getNumeroFormatado();
		wireter.print("<html><h2>Converse com a gente!</h2></html>");
		wireter.close();
	}

}
