🎬 LetMovie - Web Server

LetMovie é um projeto de web server full-stack desenvolvido com Python puro (módulo http.server) no backend e HTML, CSS e JavaScript no frontend.
O sistema permite cadastrar, listar e excluir filmes armazenados em um banco de dados MySQL, sem o uso de frameworks de backend — para explorar os fundamentos do protocolo HTTP e manipulação manual de requisições.

✨ Funcionalidades

Backend 100% Python Nativo
Construído apenas com as bibliotecas padrão: http.server, json, os e re.

Servidor de API RESTful

GET /api/filmes → Lista todos os filmes do banco (com atores, diretores, etc.)

GET /api/filme/{id} → Retorna os detalhes de um filme específico (usado na tela de sucesso)

POST /cadastro → Cadastra um novo filme

POST /delete → Exclui um filme existente (com tratamento de chaves estrangeiras)

Servidor de Arquivos Estáticos
Serve automaticamente os diretórios html/, css/ e js/ para o navegador.

Validação de Backend

Verifica campos obrigatórios antes de salvar.

Impede títulos duplicados no banco.

Frontend Dinâmico (Fetch API)
A comunicação com o servidor ocorre via fetch, atualizando dados sem recarregar a página.

🛠️ Tecnologias Utilizadas
Camada	Tecnologia
Backend	Python 3 (http.server)
Database	MySQL
Driver	mysql-connector-python
Frontend	HTML5, CSS3, JavaScript (ES6+)
📁 Estrutura do Projeto
WEB-SERVER/
├── bd/
│   └── webserver.sql         # Script de criação do banco
├── css/
│   └── style.css             # Estilos gerais
├── html/
│   ├── cadastro.html         # Página de cadastro de filmes
│   ├── index.html            # Página inicial
│   ├── listar_filmes.html    # Página de listagem
│   ├── login.html            # Página de login (não funcional)
│   └── sucesso.html          # Tela de sucesso pós-cadastro
├── img/
│   └── wallpaper-netflix.jpg # Imagem de fundo
├── js/
│   └── script.js             # Lógica do frontend
└── server/
    └── server.py             # Servidor backend

🚀 Instalação e Execução
1️⃣ Pré-requisitos

Python 3.x instalado

MySQL Server em execução

2️⃣ Configuração do Banco de Dados

Abra seu cliente MySQL (Workbench, terminal, etc.) e execute:

CREATE DATABASE LetMovie;
USE LetMovie;


Depois, rode o script bd/webserver.sql para criar as tabelas e popular o banco.

3️⃣ Instalação das Dependências

O projeto usa apenas uma dependência Python:

pip install mysql-connector-python

4️⃣ Configuração da Conexão com o Banco

Edite o arquivo server/server.py e ajuste o trecho:

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="root",  # <-- altere aqui conforme sua configuração
    database="LetMovie"
)

5️⃣ Executando o Servidor

No terminal, dentro da pasta raiz do projeto:

python server/server.py


Se tudo estiver correto, você verá algo como:

✅ Conectado ao banco de dados!
🚀 Servidor rodando em http://localhost:8000
Servindo arquivos do diretório: C:\Caminho\Para\WEB-SERVER

🖥️ Como Usar

Abra o navegador e acesse:

http://localhost:8000


A página inicial (index.html) será carregada.

Use o menu para:

Adicionar Filmes → acessar o formulário de cadastro

Filmes → listar, visualizar detalhes e excluir registros

📌 Objetivo

Este projeto foi desenvolvido para reforçar os fundamentos de:

Estrutura de um servidor HTTP em Python nativo

Requisições e respostas REST sem frameworks

Integração entre frontend e backend

Manipulação de banco de dados MySQL diretamente com mysql.connector

🤝 Contribuições

O repositório é de caráter educacional, mas feedbacks e sugestões são sempre bem-vindos!
Sinta-se à vontade para abrir issues ou enviar pull requests.

📄 Licença

Este projeto está sob a licença MIT.
Consulte o arquivo LICENSE para mais detalhes.
