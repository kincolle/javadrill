import org.springframework.stereotype.Component;

@Component
public class Message implements MessageService{
    @Override
    public String getMessage() {
        return "1";
    }
}
