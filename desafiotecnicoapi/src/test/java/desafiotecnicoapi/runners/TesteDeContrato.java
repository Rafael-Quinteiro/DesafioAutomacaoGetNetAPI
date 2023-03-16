package desafiotecnicoapi.runners;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import desafiotecnicoapi.tests.cadastro.tests.PostCadastraUsuarioTest;

@RunWith(Categories.class)
@Categories.IncludeCategory(desafiotecnicoapi.suites.TesteDeContrato.class)
@Suite.SuiteClasses({
       PostCadastraUsuarioTest.class
})

/*Classe responsável por armazenar a categoria de teste de contrato. */
public class TesteDeContrato {
    
}
