package desafiotecnicoapi.runners;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import desafiotecnicoapi.tests.cadastro.tests.PostCadastraUsuarioTest;

@RunWith(Categories.class)
@Categories.IncludeCategory(desafiotecnicoapi.suites.AllTests.class)
@Suite.SuiteClasses({
       PostCadastraUsuarioTest.class
})

/*Classe responsável por armazenar todos as categorias de testes. */
public class AllTests {
    
}
