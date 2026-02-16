import loginSelectors from '../../pagesObjects/buttons-selectors/loginSelectors'
import commonPage from '../../pagesObjects/commonPage'
import loginMessages from '../../pagesObjects/messages/loginMessages'

describe('Funcionalidade: Login', () => {
  context('Login com sucesso', () => {
    beforeEach(() => {
      commonPage.acessarSite()
    })
      it('Realizar login com sucesso', () => {
        commonPage.preencherCampoTexto(loginSelectors.usernameInput, 'standard_user')
        commonPage.preencherCampoTexto(loginSelectors.passwordInput, 'secret_sauce')
        commonPage.clicarBotao(loginSelectors.loginButton)            
        commonPage.validarRedirecionamentoUrl('/inventory.html')
        commonPage.validarTextoElemento(loginSelectors.titleSpan, 'Products')
        })
    })

  context('Login sem sucesso', () => {
    beforeEach(() => {
      commonPage.acessarSite()
    })
      it('Tentativa de login com usuário bloqueado', () => {
        commonPage.preencherCampoTexto(loginSelectors.usernameInput, 'locked_out_user')
        commonPage.preencherCampoTexto(loginSelectors.passwordInput, 'secret_sauce')
        commonPage.clicarBotao(loginSelectors.loginButton)
        commonPage.validarTextoElemento(loginSelectors.errorMessage, loginMessages.usuarioBloqueado)
          })

      it('Tentativa de login com senha incorreta', () => {
        commonPage.preencherCampoTexto(loginSelectors.usernameInput, 'standard_user')
        commonPage.preencherCampoTexto(loginSelectors.passwordInput, 'senha_errada')
        commonPage.clicarBotao(loginSelectors.loginButton)            
        commonPage.validarTextoElemento(loginSelectors.errorMessage, loginMessages.senhaIncorreta)
        })
    })
})