package tasks;

import interactions.ConsumeService;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Map;

public class CreateUserRest implements Task {
    private Map<String, String> request;

    public CreateUserRest(Map<String, String> request) {
        this.request = request;
    }

    public static CreateUserRest with(Map<String, String> request) {
        return Tasks.instrumented(CreateUserRest.class, request);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.withPost("{" +
                "\"name\":" + '\"' + request.get("name") + '\"' +
                ", \"job\":" + '\"' + request.get("job") + '\"' +
                '}'));
    }
}
