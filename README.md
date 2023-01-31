# UNIMED

## Sobre o projeto

O projeto consiste em um formulario para cadastrar os dados do cliente e enviar estes dados por e-mail.

## Tecnologias

- Front-End:

  * HTML5
  * JavaScript
  * Bootstrap
  * Fetch API
  
- Back-End:
 
   * Java com Spring Boot
   * Spring Data JPA
   * Lombok para produtividade e redução de código
   * Gerenciamento de projeto com Maven
   * Banco de dados MySQL usando o SGDB DBeaver
   * Documentação com Swagger
   * Postman para documentação e teste
   * SendGrid API para envio de e-mails
   
 ## Visao do formulario
 
![img](https://user-images.githubusercontent.com/88942381/215893002-9496ee6a-1938-4be1-bf4c-752a8d090045.png)

## Como utilizar

* Para utilizar este projeto voce deve baixar o arquivo zipado ou clonar este repositorio.
* Seu ambiente deve ter Java 17 instaladoe um editor de codigo como VS code ou Intellij.
* Crie o banco de dados MySQL com o nome responses.
* Configure a variavel de ambiente do SendGrid com a chave SENDGRID_API_KEY e o valor deve ser gerado dentro da plataforma da SendGrid.
* Instale o pacote de Spring Boot Tools caso esteja utilizando o VS code.
* Instale o Postman e importe o arquivo na raiz do projeto de nome postman.
* Execute o projeto e utilize o postman ou acesso http://localhost:8080/api/responses.
* Para executar o formulario na pasta front end, abra o VS code, instale o Live Server.
* Execute o Live Server ou abra o caminho: http://localhost:5500

## Consideracoes

Apesar de enviar os dados do cliente para o cliente corretamente, o SendGrid necessita de um email personalizado e portanto ele nao faz o redirecionamento correto para o usuario.

