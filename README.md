# <a href="https://imgbb.com/"><img src="https://i.ibb.co/51bfmLv/image-2024-07-01-T11-45-10-371-Z.png" alt="image-2024-07-01-T11-45-10-371-Z" border="0" width="300"></a> Java Spring Professional - Desafio 03

#### Desenvolvido na linguagem Java por:
- [Maicon Santos Nascimento](https://github.com/MaiconSN)
## Módulo: Back end
<b>Capítulo: API REST, camadas, CRUD, exceções, validações</b>

## DESAFIO: CRUD de clientes

Você deverá entregar um projeto Spring Boot contendo um CRUD completo de web services REST para
acessar um recurso de clientes, contendo as cinco operações básicas aprendidas no capítulo:
- Busca paginada de recursos
- Busca de recurso por id
- Inserir novo recurso
- Atualizar recurso
- Deletar recurso

O projeto deverá estar com um ambiente de testes configurado acessando o banco de dados H2, deverá usar
Maven como gerenciador de dependência, e Java como linguagem.<br><br>
Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da
entidade Client é mostrada a seguir (você deve seguir à risca os nomes de classe e atributos mostrados no
diagrama):  <br><br>
<a href="https://imgbb.com/"><img src="https://i.ibb.co/k3gzBTw/image-2024-07-12-T00-12-28-278-Z.png" alt="image-2024-07-12-T00-12-28-278-Z" border="0"></a>
<br><br>

<b>Seu projeto deverá fazer um seed de pelo menos 10 clientes </b>com dados SIGNIFICATIVOS (não é para
usar dados sem significado como “Nome 1”, “Nome 2”, etc.).<br><br>
<b>Seu projeto deverá tratar as seguintes exceções:</b>
- Id não encontrado (para GET por id, PUT e DELETE), retornando código 404.
- Erro de validação, retornando código 422 e mensagens customizada para cada campo inválido. As
regras de validação são:
  - Nome: não pode ser vazio
  - Data de nascimento: não pode ser data futura (dica: use @PastOrPresent)
<br><br>
- <i>Atenção:</i> crie um <b>novo projeto</b> para este trabalho. Não é para simplesmente acrescentar a classe
- <i>Atenção:</i> lembre-se de que por padrão a JPA transforma nomes de atributos em camelCase para
snake_case, como foi o caso do campo imgUrl das aulas, que no banco de dados tinha o nome
img_url. Assim, o campo <b>birthDate acima será criado no banco de dados como birth_date, então
seu script SQL deverá seguir este padrão.</b>
- <i>Atenção:</i> cuidado para não salvar no seu projeto arquivos e pastas que não devem ser salvas no Git,
tais como a pasta .metadata do Eclipse ou .idea do Intellij.

## Como o trabalho será corrigido?
<b>1) Importação do projeto</b><br>
O professor deverá ser capaz de fazer um simples clone do projeto Github, e importar e executar o mesmo na
IDE sem necessidade de qualquer configuração especial diferente daquelas das aulas.<br><br>
<b>2) Testes manuais no Postman</b><br>
O professor já terá preparado em seu computador as requisições Postman abaixo. Todas elas deverão
funcionar corretamente:<br><br>
Busca de cliente por id<br>
<b>GET /clients/1</b><br><br>
Busca paginada de clientes<br>
<b>GET /clients?page=0&size=6&sort=name</b><br><br>
Inserção de novo cliente<br>
<b>POST /clients</b>
```
{
"name": "Maria Silva",
"cpf": "12345678901",
"income": 6500.0,
"birthDate": "1994-07-20",
"children": 2
}
```


Atualização de cliente<br>

<b>PUT /clients/1</b>
```
{
"name": "Maria Silvaaa",
"cpf": "12345678901",
"income": 6500.0,
"birthDate": "1994-07-20",
"children": 2
}
```
<br>
Deleção de cliente<br>
<b>DELETE /clients/1</b><br><br>
<b>CHECKLIST:</b>


1. Busca por id retorna cliente existente<br>
2. Busca por id retorna 404 para cliente inexistente<br>
3. Busca paginada retorna listagem paginada corretamente<br>
4. Inserção de cliente insere cliente com dados válidos<br>
5. Inserção de cliente retorna 422 e mensagens customizadas com dados inválidos<br>
6. Atualização de cliente atualiza cliente com dados válidos<br>
7. Atualização de cliente retorna 404 para cliente inexistente<br>
8. Atualização de cliente retorna 422 e mensagens customizadas com dados inválidos<br>
9. Deleção de cliente deleta cliente existente<br>
10. Deleção de cliente retorna 404 para cliente inexistente<br>
Text to speech button
