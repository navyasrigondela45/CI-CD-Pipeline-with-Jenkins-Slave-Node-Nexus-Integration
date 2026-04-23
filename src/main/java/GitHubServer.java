import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/")
public class GitHubServer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // IMPORTANT for emojis
        response.setContentType("text/html; charset=UTF-8");

        String html = "<html>"
                + "<head>"
                + "<meta charset='UTF-8'>"
                + "<title>DevOps WAR Project</title>"
                + "<style>"
                + "body {"
                + "  text-align: center;"
                + "  margin-top: 100px;"
                + "  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;"
                + "  background: linear-gradient(to right, #667eea, #764ba2);"
                + "  color: white;"
                + "}"
                + "h1 {"
                + "  font-size: 42px;"
                + "  margin-bottom: 20px;"
                + "}"
                + "p {"
                + "  font-size: 20px;"
                + "  margin-bottom: 30px;"
                + "}"
                + "a {"
                + "  display: inline-block;"
                + "  margin: 10px;"
                + "  padding: 12px 25px;"
                + "  font-size: 20px;"
                + "  color: white;"
                + "  background-color: #ff7eb3;"
                + "  text-decoration: none;"
                + "  border-radius: 10px;"
                + "  transition: 0.3s;"
                + "}"
                + "a:hover {"
                + "  background-color: #ff4f91;"
                + "  transform: scale(1.05);"
                + "}"
                + "</style>"
                + "</head>"
                + "<body>"
                + "<h1>🚀 --- Welcome to My DevOps WAR Deployment Project --- 🚀</h1>"
                + "<p>✨ Automated using Jenkins | Built with Java + Maven + Tomcat + Sonatype Nexus + webhook ✨</p>"
                + "<a href='https://github.com/navyasrigondela45' target='_blank'>👉 GitHub</a><br><br>"
                + "<a href='https://www.linkedin.com/in/navya-sri-gondela-a60091258' target='_blank'>👉 LinkedIn</a>"
                + "</body>"
                + "</html>";

        response.getWriter().write(html);
    }
}
