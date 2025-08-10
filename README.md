# Formulário de Cadastro de Usuário - Objetos de interface

## Descrição
Este projeto é um **formulário gráfico** feito em **Java Swing** para cadastro de usuários.  
O programa permite inserir **Nome**, **E-mail**, **Idade** e **Sexo** (Masculino/Feminino), com validação (espaços vazios e email), e botões de ação (cadastrar e limpar dados).

## Funcionalidades
- **Cadastro de usuário** com campos:
  - Nome
  - E-mail
  - Idade
  - Sexo (botões de rádio)
- **Validação**:
  - Campos obrigatórios não podem estar vazios.
  - E-mail precisa ter formato válido (conter `@` e `.`).
- **Botão "Cadastrar"**:
  - Exibe os dados digitados em uma janela `JOptionPane`.
- **Botão "Limpar"**:
  - Apaga todos os campos e desmarca o sexo.

## 🎯 Desafios Implementados
✅ **Validação de e-mail (conter '@' e '.')**  
✅ **Seleção de sexo com JRadioButton**  
✅ **Botão "Limpar" para resetar o formulário**  

## Tecnologias Utilizadas
- **Java**
- **Swing** (`javax.swing.*`)
- **AWT** (`java.awt.*`, `java.awt.event.*`)
