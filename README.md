Sistema de Cadastro de Alunos e Cursos
Este é um sistema simples de cadastro de alunos e cursos, desenvolvido em Java com a biblioteca Swing para a interface gráfica (GUI). O objetivo deste sistema é permitir que o usuário adicione, edite e remova registros de alunos e cursos, além de visualizar os dados em tabelas organizadas.

Funcionalidades
Tela Principal
A Tela Principal oferece acesso rápido às funcionalidades de gestão de alunos e cursos, com dois botões principais:

Alunos: Direciona o usuário para a tela de cadastro e gestão de alunos.
Cursos: Direciona o usuário para a tela de cadastro e gestão de cursos.

Tela de Alunos
A Tela de Alunos permite:

Adicionar novos alunos com nome, matrícula e cursos matriculados.
Editar os dados de um aluno existente.
Remover alunos da lista.
A tabela ao lado exibe os alunos cadastrados, permitindo a visualização dos dados de nome, matrícula e cursos.


Tela de Cursos
A Tela de Cursos possibilita:

Adicionar novos cursos com nome, código e professores.
Editar as informações de um curso existente.
Remover cursos do sistema.
A tabela ao lado lista os cursos cadastrados, exibindo os campos de nome, código e professores.


Tecnologias Utilizadas
Java
Swing para a criação da interface gráfica.
SQLite como banco de dados local para armazenamento das informações de alunos e cursos.
JDBC para a integração com o banco de dados.

Estrutura do Projeto
TelaPrincipal.java: Responsável pela interface inicial do sistema, onde o usuário pode escolher entre acessar a tela de alunos ou a tela de cursos.
TelaAlunos.java: Contém a lógica e os componentes gráficos para a gestão de alunos.
TelaCursos.java: Contém a lógica e os componentes gráficos para a gestão de cursos.
AlunoDAO.java: Classe responsável pela interação com o banco de dados para os registros de alunos.
CursoDAO.java: Classe responsável pela interação com o banco de dados para os registros de cursos.
Contribuições
Sinta-se à vontade para fazer um fork do projeto, abrir issues ou enviar pull requests para contribuir com melhorias!
