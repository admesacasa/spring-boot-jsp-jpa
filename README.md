# Teste Programador Java
Teste para programador Java Desbravador


Abaixo segue o que será necessário para a realização do teste, possibilitando que você deixe tudo preparado para o dia marcado:
<br/> <br/>
<b>Ferramentas</b>:
<li>JDK 8</li>
<li>Eclipse for Java EE</li> 
<li>Wildfly Java EE7 Full & Web</li> 
<br/>
<b>Frameworks</b>:
<li>Spring 4.0 / MVC / Data </li> 
<li>Hibernate </li> 
<li>Interface web com Bootstrap </li> 
<br/>
<b>Banco de Dados</b>:
<li>Postgres</li> 
<li>O script das tabelas será enviado juntamente com a prova</li> 
<br/>
<b>Entrega</b>:
 <li>O teste deverá ser enviado em um e-mail contento o link para o repositório deste projeto em sua conta pessoal no GitHub.</li>
 
Outras informações serão enviadas no e-mail juntamente com o teste.

# Script do banco de dados:

* Este script criará o schema "testedsl" no usuário/banco corrente e em seguida criará as tabelas necessárias.
* A estrutura criada não deve ser alterada!

`CREATE SCHEMA testedsl;`

`CREATE TABLE testedsl.livro `<br/>
`( idlivro bigserial NOT NULL,`<br/>
`nome character varying(100),`<br/>
`escritor character varying(100),`<br/>
`anoedicao smallint,`<br/>
`classificacao smallint,`<br/>
`CONSTRAINT pk_livro PRIMARY KEY (idlivro));`<br/>


`CREATE TABLE testedsl.pessoa`<br/>
`( idpessoa bigserial NOT NULL,`<br/>
 ` nome character varying(100) NOT NULL,`<br/>
 ` datanascimento date,`<br/>
`  cpf character varying(14),`<br/>
 ` CONSTRAINT pk_pessoa PRIMARY KEY (idpessoa));  `<br/>
  
`CREATE TABLE testedsl.emprestimo`<br/>
 `( idemprestimo bigserial NOT NULL,`<br/>
 `  dataemprestimo date NOT NULL,`<br/>
  ` idpessoa bigint NOT NULL,`<br/>
   `idlivro bigint NOT NULL,`<br/>
   `datahoradevolucao time without time zone,`<br/>
  ` CONSTRAINT pk_emprestimo PRIMARY KEY (idemprestimo),`<br/>
   `CONSTRAINT fk_livro FOREIGN KEY (idlivro)`<br/>
    `   REFERENCES testedsl.livro (idlivro) MATCH SIMPLE`<br/>
     `  ON UPDATE NO ACTION ON DELETE NO ACTION,`<br/>
   `CONSTRAINT fk_pessoa FOREIGN KEY (idpessoa)`<br/>
    `   REFERENCES testedsl.pessoa (idpessoa) MATCH SIMPLE`<br/>
     `  ON UPDATE NO ACTION ON DELETE NO ACTION);`
