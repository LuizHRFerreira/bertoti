# Padrões de Projetos de Sistemas

Bem-vindo ao repositório dedicado à disciplina **Padrões de Projetos de Sistemas** do professor Juliano Bertoti. Este projeto tem como objetivo demonstrar a aplicação prática dos principais padrões de projeto de software, com exemplos de código e antipadrões correspondentes.

## Estrutura do Repositório

A organização das pastas reflete os padrões abordados na aula, cada uma contendo exemplos de implementação e seus respectivos antipadrões:

- `estrategia`
  - `antipadrao`: Exemplo de antipadrão relacionado ao padrão Estratégia.
  - `padrao`: Implementação do padrão Estratégia.
- `observador`
  - `antipadrao`: Exemplo de antipadrão relacionado ao padrão Observador.
  - `padrao`: Implementação do padrão Observador.
- `composto`
  - `antipadrao`: Exemplo de antipadrão relacionado ao padrão Composto.
  - `padrao`: Implementação do padrão Composto.
  
## Sobre o Projeto

Este repositório foi criado para servir como um recurso de aprendizado e referência, ilustrando como os padrões de projeto podem ser aplicados para resolver problemas comuns em desenvolvimento de software, bem como os pitfalls a evitar com antipadrões. Cada pasta contém código-fonte comentado que demonstra:

|              | Estratégia                                                                 | Observador                                                                 | Composto                                                                 |
|--------------|----------------------------------------------------------------------------|----------------------------------------------------------------------------|--------------------------------------------------------------------------|
| **Descrição**   | Encapsula uma família de algoritmos e os torna intercambiáveis             | Permite que um objeto notifique outros sobre mudanças em seu estado        | Permite tratar objetos individuais e composições com uma interface comum  |
| **Técnicas de OO** | Polimorfismo e encapsulamento                                           | Interface, composição, polimorfismo                                        | Interface, composição, polimorfismo                                      |
| **Antipatterns** | Herança (ex: subclasses como ContaEstudante, ContaEmpresa para regras de empréstimo, criando hierarquia rígida) | Acoplamento apertado (ex: AgenciaNoticias chamando diretamente métodos específicos de SiteNoticias, AppMobile e EmailNoticias) | Classes que misturam responsabilidades (ex: Time com listas separadas para jogadores e setores, sem abstração comum) |
| **Aplicação**   | Onde há variação de comportamento. Ex: `Conta` usa `setEmprestimo()` e `verificarEmprestiomo()` com `Permitido` ou `Proibido` para regras de empréstimo dinâmicas. | Onde há dependência um-para-muitos. Ex: `AgenciaNoticias` usa `adicionarObservador()` e `publicarManchete()` para notificar `SiteNoticias`, `AppMobile` e `EmailNoticias` via interface `ObservadorNoticia`. | Onde há estruturas hierárquicas. Ex: `Time` usa `add()` e `mostrar()` para tratar `Jogador` e subtimes uniformemente via interface `MembroTime`. |