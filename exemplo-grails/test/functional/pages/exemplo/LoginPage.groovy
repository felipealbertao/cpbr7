package pages.exemplo

import geb.Page


class LoginPage extends Page {

    static url = "exemplo/login"

    static at = {
        title ==~ /Pagina de Login/
    }

    def login(String usuario, String senha) {

        $("form.form-signin").with {
            username = usuario
            password = senha
            login().click()
        }

    }
}