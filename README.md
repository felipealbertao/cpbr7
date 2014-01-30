# Exemplos de Selenium, Geb, Grails e Cucumber

Exemplos demonstrados na palestra ["Promovendo a Colaboração entre Desenvolvedores e Testers"] (http://campuse.ro/social/resource/41088/view.cp) no Campus Party Brasil 2014.

* Obviamente antes de tudo você precisa instalar o Java JDK do site da Oracle.
* Instale o [gvm](http://gvmtool.net), que facilita a instalação de outros aplicativos em Groovy:
  `curl -s get.gvmtool.net | bash`
* Reinicie o seu terminal para que as mudanças do gvm sejam reconhecidas.
* Instale o Groovy: `gvm install groovy`
* Instale o Grails: `gvm install grails 2.2.4`

## Como executar o exemplo de Geb / Selenium

Primeiro execute a aplicação web que será testada:
```
cd exemplo-grails 
grails run-app
```   

* A aplicação deve estar disponível no endereço http://localhost:8080/exemplo-grails/exemplo/login
* Então rode o teste pelo Groovy Console: `groovyConsole ExemploGebTeste.groovy`
* ou diretamente pela linha de comando: `groovy ExemploGebTeste.groovy`

## Como executar o exemplo completo

Este é o exemplo em [Grails]("http://grails.org/") que utiliza o Cucumber para definição de testes BDD, e o Geb / Selenium para execução dos passos no browser.

O teste se encontra no diretório `exemplo-grails`. Para executá-lo, primeiramente cancele a instância do Grails que ainda está provavelmente rodando se você executou o teste acima. Então, simplesmente use o seguinte comando:

```
grails test-app :cucumber
```

Note que o comando acima irá executar automaticamente a aplicação web antes dos testes. Esta é uma funcionalidade do próprio Grails. O relatório com os resultados dos testes estará no diretório `target/test-results`

Arquivos de interesse:
* Teste BDD (Cucumber): https://github.com/felipealbertao/cpbr7/blob/master/exemplo-grails/test/cucumber/Login.feature
* Passos: https://github.com/felipealbertao/cpbr7/blob/master/exemplo-grails/test/cucumber/steps/Login_steps.groovy
* Testes Geb / Selenium usando o Page Objects pattern: https://github.com/felipealbertao/cpbr7/tree/master/exemplo-grails/test/functional/pages/exemplo 
