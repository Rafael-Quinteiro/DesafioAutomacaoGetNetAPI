package desafiotecnicoapi.runners;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import desafiotecnicoapi.tests.cadastro.tests.PostCadastraUsuarioTest;

@RunWith(Categories.class)
@Categories.IncludeCategory(desafiotecnicoapi.suites.TesteDeFuncionalidade.class)
@Suite.SuiteClasses({
       PostCadastraUsuarioTest.class
})

/*Classe responsável por armazenar a categoria de testes de funcionalidade. */
public class TesteDeFuncionalidade {
    
}
