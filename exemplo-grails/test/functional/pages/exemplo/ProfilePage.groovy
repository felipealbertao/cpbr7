package pages.exemplo

import geb.Page


class ProfilePage extends Page {

    static url = "exemplo/profile"

    static at = {
        title ==~ /Pagina de Perfil de Usuario/
    }

    static content = {

        statusPagamentoAluguel { $("#status-aluguel").text() }

    }

    def checarStatusPagamentoAluguel(String statusEsperado) {

        assert statusPagamentoAluguel == statusEsperado

    }
}