import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/")
public class GitHubServer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");

        String html = "<html>"
                + "<head>"
                + "<meta charset='UTF-8'>"
                + "<title>DevOps WAR Project</title>"

                // Google Font
                + "<link href='https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;700&display=swap' rel='stylesheet'>"

                + "<style>"

                + "body {"
                + "  margin: 0;"
                + "  padding: 0;"
                + "  font-family: 'Poppins', sans-serif;"
                + "  background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);"
                + "  color: #ffffff;"
                + "  text-align: center;"
                + "}"

                + ".container {"
                + "  margin-top: 100px;"
                + "}"

                + "h1 {"
                + "  font-size: 42px;"
                + "  color: #00f7ff;"
                + "  text-shadow: 0 0 15px rgba(0,247,255,0.7);"
                + "}"

                + ".typing {"
                + "  font-size: 20px;"
                + "  margin-top: 20px;"
                + "  color: #dcdcdc;"
                + "  height: 30px;"
                + "}"

                + ".badge {"
                + "  display: inline-block;"
                + "  margin-top: 20px;"
                + "  padding: 8px 16px;"
                + "  background-color: #28a745;"
                + "  border-radius: 20px;"
                + "  font-size: 16px;"
                + "  box-shadow: 0 0 10px rgba(40,167,69,0.7);"
                + "}"

                + ".buttons {"
                + "  margin-top: 40px;"
                + "}"

                + "a {"
                + "  display: inline-block;"
                + "  margin: 10px;"
                + "  padding: 12px 25px;"
                + "  font-size: 18px;"
                + "  color: white;"
                + "  background: linear-gradient(45deg, #ff416c, #ff4b2b);"
                + "  text-decoration: none;"
                + "  border-radius: 25px;"
                + "  transition: 0.3s ease;"
                + "  box-shadow: 0 4px 15px rgba(0,0,0,0.3);"
                + "}"

                + "a:hover {"
                + "  transform: translateY(-3px) scale(1.05);"
                + "  box-shadow: 0 8px 25px rgba(255,75,43,0.6);"
                + "}"

                + "</style>"

                + "</head>"

                + "<body>"

                + "<div class='container'>"

                + "<h1>🚀 DevOps CI/CD Pipeline Project 🚀</h1>"

                + "<div class='typing' id='typing'></div>"

                + "<div class='badge'>✅ Build Status: SUCCESS</div>"

                + "<div class='buttons'>"
                + "<a href='https://github.com/navyasrigondela45' target='_blank'>👉 GitHub</a>"
                + "<a href='https://www.linkedin.com/in/navya-sri-gondela-a60091258' target='_blank'>👉 LinkedIn</a>"
                + "</div>"

                + "</div>"

                // Typing Animation Script
                + "<script>"
                + "const text = 'Built with Jenkins • Maven • Tomcat • Nexus • CI/CD Automation';"
                + "let i = 0;"
                + "function typingEffect() {"
                + "  if (i < text.length) {"
                + "    document.getElementById('typing').innerHTML += text.charAt(i);"
                + "    i++;"
                + "    setTimeout(typingEffect, 50);"
                + "  }"
                + "}"
                + "typingEffect();"
                + "</script>"

                + "</body>"
                + "</html>";

        response.getWriter().write(html);
    }
}
