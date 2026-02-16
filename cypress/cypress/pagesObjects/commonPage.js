class CommonPage {
    acessarSite() {
        // Importe o commonSelectors aqui ou passe a URL por parâmetro
        cy.visit('https://www.saucedemo.com')
    }

    preencherCampoTexto(elemento, texto) {
        // Adicionamos () para executar a função cy.get() que vem do seletor
        elemento().should('be.visible').type(texto)
    }

    clicarBotao(elemento) {
        elemento().should('be.visible').click()
    }

    validarRedirecionamentoUrl(urlEsperada) {
        cy.url().should('contain', urlEsperada)
    }

    validarTextoElemento(elemento, mensagemEsperada) {
        elemento().should('be.visible').and('have.text', mensagemEsperada)
    }
}

export default new CommonPage();