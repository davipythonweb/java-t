# 1. Inicialize o Git localmente
git init

# 2. Adicione todos os arquivos do projeto
git add .

# 3. Faça o primeiro commit local
git commit -m "Initial commit"

# 4. Ajuste o nome da branch para 'main'
git branch -M main

# 5. Crie o repositório público DIRETAMENTE no GitHub e já faça o push
# (Substitua 'nome-do-seu-projeto' pelo nome que você deseja)
gh repo create nome-do-seu-projeto --public --source=. --remote=origin --push
