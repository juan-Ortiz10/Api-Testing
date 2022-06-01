package tasks;

import interactions.ConsumeService;
import model.ModelCreateUserRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class CreateUserRest implements Task {
    private List<ModelCreateUserRest> modelCreateUserRests;

    public CreateUserRest(List<ModelCreateUserRest> modelCreateUserRests) {
        this.modelCreateUserRests = modelCreateUserRests;
    }

    public static CreateUserRest with(List<ModelCreateUserRest> modelCreateUserRests) {
        return Tasks.instrumented(CreateUserRest.class, modelCreateUserRests);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.withPost(modelCreateUserRests.get(0).toString()));
    }
}
