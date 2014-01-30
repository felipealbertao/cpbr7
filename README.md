# Exemplos de Selenium, Geb, Grails e Cucumber

Exemplos demonstrados na palestra ["Promovendo a Colaboração entre Desenvolvedores e Testers"] (http://campuse.ro/social/resource/41088/view.cp) no Campus Party Brasil 2014.

* Obviamente antes de tudo você precisa instalar o Java JDK do site da Oracle.
* Instale o [gvm](http://gvmtool.net), que facilita a instalação de outros aplicativos em Groovy:
  `curl -s get.gvmtool.net | bash`
* Reinicie o seu terminal para que as mudanças do gvm sejam reconhecidas.
* Instale o Groovy: `gvm install groovy`
* Instale o Grails: `gvm install grails 2.2.4`

## Como executar o exemplo de Geb

Primeiro execute a aplicação web que será testada:
```
cd exemplo-grails 
grails run-app
```   

* Então rode pelo Groovy Console: `groovyConsole ExemploGebTeste.groovy`
* ou diretamente pela linha de comando: `groovy ExemploGebTeste.groovy`

