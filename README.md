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



Este script criará o schema "testedsl" no usuário/banco corrente e em seguida criará as tabelas necessárias.
A estrutura criada não deve ser alterada!
CREATE SCHEMA testedsl;

CREATE TABLE testedsl.livro
( idlivro bigserial NOT NULL,
nome character varying(100),
escritor character varying(100),
anoedicao smallint,
classificacao smallint,
CONSTRAINT pk_livro PRIMARY KEY (idlivro));

CREATE TABLE testedsl.pessoa
( idpessoa bigserial NOT NULL,
nome character varying(100) NOT NULL,
datanascimento date,
cpf character varying(14),
CONSTRAINT pk_pessoa PRIMARY KEY (idpessoa));

CREATE TABLE testedsl.emprestimo
( idemprestimo bigserial NOT NULL,
dataemprestimo date NOT NULL,
idpessoa bigint NOT NULL,
idlivro bigint NOT NULL,
datahoradevolucao time without time zone,
CONSTRAINT pk_emprestimo PRIMARY KEY (idemprestimo),
CONSTRAINT fk_livro FOREIGN KEY (idlivro)
REFERENCES testedsl.livro (idlivro) MATCH SIMPLE
ON UPDATE NO ACTION ON DELETE NO ACTION,
CONSTRAINT fk_pessoa FOREIGN KEY (idpessoa)
REFERENCES testedsl.pessoa (idpessoa) MATCH SIMPLE
ON UPDATE NO ACTION ON DELETE NO ACTION);
