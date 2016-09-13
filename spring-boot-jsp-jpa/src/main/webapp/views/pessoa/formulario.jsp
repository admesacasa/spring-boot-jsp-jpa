<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
  <body>
    <h3>Adicionar Pessoa</h3>
    <form action="adicionaPessoa" method="post">
      Nome: <br />
      <input name="nome" size=100></input><br />
      
      CPF: <br />
      <input name="cpf" size=100></input><br />
      
      Data de finalização: <br />
    <input type="text" name="dataFinalizacao" 
      value="<fmt:formatDate 
      value="${pessoa.datanascimento.time}" 
      pattern="dd/MM/yyyy" />"/> 
    <br />
      <input type="submit" value="Adicionar">
    </form>
  </body>
</html>