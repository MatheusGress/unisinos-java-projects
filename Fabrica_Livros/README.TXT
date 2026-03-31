# 📚 Exercício 1 — Projeto Java (BlueJ)

## 📖 Descrição

Este projeto foi desenvolvido como exercício prático utilizando **Java** no ambiente **BlueJ**, com o objetivo de aplicar conceitos fundamentais de **Programação Orientada a Objetos (POO)**, como:

- criação de classes
- atributos e métodos
- construtores
- encapsulamento (getters e setters)
- interação com o usuário via teclado
- instanciação de objetos

O sistema simula um pequeno cadastro de **Livros** e **Clientes**, realizando cálculos e exibindo informações organizadas no console.

---

## 🧱 Estrutura do Projeto

O projeto é composto por três classes principais:

### 📘 Classe `Livro`

Representa um livro e possui os seguintes atributos:

- título
- autor
- ano de publicação
- preço
- quantidade de páginas

#### Métodos implementados:

- **Construtor** para inicialização dos atributos
- Métodos de acesso (*getters e setters*)
- `calcularPrecoPorPagina()`
  - Calcula o valor de cada página com base no preço do livro
- Método de impressão
  - Exibe as informações do livro de forma clara e organizada

---

### 👤 Classe `Cliente`

Representa um cliente do sistema.

#### Atributos:

- nome
- idade
- sexo
- email
- senha

#### Métodos implementados:

- Construtor
- Métodos de acesso (*getters e setters*)
- `imprimeInformacoes()`
  - Exibe os dados do cliente de forma legível no console

---

### ▶️ Classe `Principal`

Classe responsável pela execução do programa.

#### Funcionalidades:

- Contém o método `main`
- Solicita ao usuário, via teclado, todas as informações necessárias
- Cria:
  - 3 objetos `Livro`
  - 3 objetos `Cliente`
- Calcula e imprime:
  - o preço por página de cada livro
- Exibe:
  - todas as informações dos objetos criados

---

## ⌨️ Entrada de Dados

Todos os dados são informados pelo usuário através do teclado durante a execução do programa.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Construtores
- Instanciação de objetos
- Métodos de cálculo
- Entrada e saída de dados
- Organização de classes

---

## 🚀 Como Executar

1. Abra o **BlueJ**.
2. Abra a pasta do projeto.
3. Compile todas as classes.
4. Execute a classe `Principal`.
5. Insira os dados solicitados no terminal.

---

## 🎯 Objetivo Educacional

Este exercício tem como finalidade reforçar a modelagem de classes e a manipulação de objetos em Java, simulando um cenário simples de cadastro e processamento de informações.

---

## 👨‍💻 Autor

Projeto desenvolvido como atividade acadêmica para prática de Java e Programação Orientada a Objetos.