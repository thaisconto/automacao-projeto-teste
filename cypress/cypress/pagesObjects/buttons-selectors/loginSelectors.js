class LoginSelectors {
    // Tire o objeto "elements" do meio para o caminho ficar curto
    usernameInput = () => cy.get('[data-test="username"]')
    passwordInput = () => cy.get('[data-test="password"]')
    loginButton   = () => cy.get('[data-test="login-button"]')
    titleSpan     = () => cy.get('.title')
    errorMessage  = () => cy.get('[data-test="error"]') 
}

export default new LoginSelectors();