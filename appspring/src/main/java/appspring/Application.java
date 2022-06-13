//Centro da aplicação (main: método principal)
package appspring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //porta de entrada ("comece por aqui")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}