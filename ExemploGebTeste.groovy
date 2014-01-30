@Grapes([
    @Grab("org.gebish:geb-core:0.9.2"),
    @Grab("org.seleniumhq.selenium:selenium-firefox-driver:2.37.1"),
    @Grab("org.seleniumhq.selenium:selenium-support:2.37.1")
])
import geb.Browser

Browser.drive {
    go "http://localhost:8080/exemplo-grails/exemplo/login"
    assert title == "Pagina de Login"
    
    $("form.form-signin").with {
        username = "seu-madruga"
        password = "don-ramon"
        login().click()
    }
    assert title == "Pagina de Perfil de Usuario"
}