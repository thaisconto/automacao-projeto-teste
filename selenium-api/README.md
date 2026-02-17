# 🚀 Projeto de Automação de Testes de API: Estudo e Prática

Este repositório contém a automação de testes para uma API de cadastro de usuários, desenvolvida com o objetivo de consolidar conhecimentos em testes de integração e arquitetura de software para QA.

# 🛠️ Tecnologias Utilizadas

* **Java 17:** Linguagem base do projeto.

* **Maven:** Gerenciador de dependências e automação de build.

* **RestAssured:** Biblioteca para validação de serviços REST.

* **Cucumber (BDD):** Escrita de cenários em linguagem natural (Gherkin).

* **JUnit:** Runner para execução e orquestração dos testes.

# 🔗 API Utilizada

Para este projeto, utilizamos a **ServeRest**, uma API aberta para estudos de testes de API.

* **Documentação (Swagger):** [https://serverest.dev/](https://serverest.dev/)

# 📂 Estrutura do Projeto

Para facilitar a manutenção e escalabilidade, o projeto foi estruturado da seguinte forma:

* **src/main/java:** Onde reside o "motor" da automação.

* **entidades/request:** Contém os modelos de dados (POJOs) usados para enviar informações à API.

* **rest:** Classes responsáveis por configurar e realizar as chamadas HTTP (POST, GET, etc).

* **utils:** Classes auxiliares, como o gerenciamento de URLs e constantes do projeto.

* **src/test:** Focada na inteligência e execução dos testes.

* **java/.../stepdefinitions:** Contém a tradução do Gherkin para código Java, onde as asserções são feitas.

* **resources/features:** Arquivos .feature escritos em BDD que descrevem o comportamento esperado do sistema.

* **target:** Pasta gerada automaticamente pelo Maven que contém os relatórios de execução (cucumber-report.html).

# 📊 Relatório de Execução
 Ao final de cada execução, o projeto gera um relatório visual que detalha o sucesso de cada cenário testado.

# ⚙️ Como Executar o Projeto

Pré-requisitos:

* Ter o Java 17 instalado e configurado no PATH.

* Ter o Maven instalado.

* Clonar o repositório

* Entrar na pasta: cd automation-test-api

* Executar os testes via terminal: mvn clean test
  * Este comando limpa a pasta target, baixa as dependências necessárias e executa todos os cenários de teste.

* Visualizando o relatório:

  * Após a execução, abra o arquivo target/cucumber-report.html em qualquer navegador para ver os resultados detalhados.

# 📝 Notas de Estudo

Este projeto faz parte do meu portfólio de QA Automation. Além da prática com Java e RestAssured, apliquei conceitos de:

* **Clean Code:** Organização clara de classes e métodos.

* **Gherkin/BDD:** Escrita de testes focada no comportamento do negócio.

* **Gestão de Dependências:** Configuração e resolução de conflitos via pom.xml.