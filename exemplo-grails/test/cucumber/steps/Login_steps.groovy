import cucumber.api.PendingException
import pages.exemplo.LoginPage
import pages.exemplo.ProfilePage

this.metaClass.mixin (cucumber.api.groovy.PT)

Dado(~'^que eu abra o sistema na página de login$') { ->

    to LoginPage
    at LoginPage

}


Quando(~'^eu efetuo o login com o usuário "([^"]*)" e senha "([^"]*)"$') { String usuario, String senha ->

    page.login(usuario, senha)

}


Entao(~'^eu vejo "([^"]*)" na página$') { String statusAluguel ->

    at ProfilePage
    page.checarStatusPagamentoAluguel(statusAluguel)

}
