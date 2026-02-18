# 🚀 Projeto de Automação Cypress - SauceDemo

Este repositório contém um projeto de automação de testes para o front-end do site SauceDemo, utilizando Cypress com uma arquitetura avançada de Page Objects (POM) dividida em camadas de abstração.

## 🏗️ Arquitetura do Projeto

Para garantir a manutenção e escalabilidade do código, o projeto foi estruturado da seguinte forma:

* **Selectors** (/pagesObjects/buttons-selectors): Camada responsável apenas por mapear os elementos da página usando funções (() => cy.get()). Isso garante a re-tentativa automática do Cypress e evita elementos "stale".

* **Common Page** (/pagesObjects/page/commonPage.js): Contém os métodos genéricos (DSL) que podem ser usados em qualquer parte do sistema, como preencher campos, clicar em botões e validar URLs.

* **Messages** (/pagesObjects/messages): Centraliza todas as strings e mensagens de erro do sistema, facilitando futuras manutenções ou internacionalização (i18n).

* **E2E Tests** (/e2e): Arquivos de teste que descrevem os cenários de negócio de forma legível (Human Readable), utilizando os métodos genéricos e os seletores.

## 🛠️ Tecnologias Utilizadas

* Cypress

* Node.js

* JavaScript

# 🔗 Aplicação Testada

Os testes foram executados no site **SauceDemo**, uma plataforma padrão para demonstração de ferramentas de automação UI.

* **URL:** [https://www.saucedemo.com/](https://www.saucedemo.com/)

## 🏃 Como rodar o projeto

* Clone o repositório
* Instale as dependências: npm install
* Abra o Cypress: npx cypress open
* Ou rode no terminal: npx cypress run
