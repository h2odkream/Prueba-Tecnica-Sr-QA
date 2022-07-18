package com.weel.interaction;

import com.weel.util.automationpractice.Path;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.io.File;

public class DeterminePath implements Interaction {

    public static DeterminePath ofImage(){
        return Tasks.instrumented(DeterminePath.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String rutaFile =System.getProperty("user.dir");
        rutaFile+= "{0}src{0}test{0}resources{0}images{0}";
        rutaFile=rutaFile.replace("{0}", File.separator);

        actor.remember(Path.RUTA.returnValue(), rutaFile);

    }
}
