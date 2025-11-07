# Padrões de Projetos de Sistemas

Bem-vindo ao repositório dedicado à disciplina **Padrões de Projetos de Sistemas** do professor Juliano Bertoti.  
Este projeto tem como objetivo demonstrar a aplicação prática dos principais padrões de projeto de software, com exemplos de código e seus antipadrões correspondentes.

## Estrutura do Repositório

A organização das pastas reflete os padrões abordados em aula, cada uma contendo exemplos de implementação e seus respectivos antipadrões:

- `estrategia`
  - `antipadrao`: Exemplo de antipadrão relacionado ao padrão Estratégia.
  - `padrao`: Implementação do padrão Estratégia.
- `observador`
  - `antipadrao`: Exemplo de antipadrão relacionado ao padrão Observador.
  - `padrao`: Implementação do padrão Observador.
- `composto`
  - `antipadrao`: Exemplo de antipadrão relacionado ao padrão Composto.
  - `padrao`: Implementação do padrão Composto.
- `adaptador`
  - `antipadrao`: Exemplo de antipadrão relacionado ao padrão Adaptador.
  - `padrao`: Implementação do padrão Adaptador.

---

## Comparativo entre Padrões

|              | **Estratégia** | **Observador** | **Composto** | **Adaptador** | **Soma (Estratégia + Observador + Composto)** |
|--------------|----------------|----------------|---------------|----------------|-----------------------------------------------|
| **Descrição** | Encapsula famílias de algoritmos e permite trocá-los em tempo de execução. | Um sujeito notifica automaticamente vários observadores sobre mudanças. | Permite tratar objetos individuais e agregações por uma interface uniforme. | Converte a interface de uma classe para outra esperada pelo cliente, sem alterar o código existente. | Todos favorecem **baixo acoplamento** e **alta coesão** via interfaces/composição. |
| **Técnicas de OO** | Polimorfismo, composição, encapsulamento de comportamento. | Interface + composição (lista de observers), inversão de dependência. | Interface comum, composição recursiva (árvore), polimorfismo. | Interface-alvo, classe Adaptador, composição para delegar à classe adaptada. | Uso intensivo de **interfaces** e **delegação**; evitam herança rígida para variar comportamento. |
| **Antipadrões** | Herança para cada variação de regra (árvore de subclasses rígida). | Acoplamento direto a concretos (subject chamando `SiteNoticias`/`AppMobile`/`EmailNoticias` diretamente). | Classes que misturam responsabilidades e não expõem interface comum (listas paralelas no `Time`). | Reescrever ou duplicar código legado ao invés de adaptá-lo; múltiplas condicionais espalhadas para “traduzir” chamadas. | “God classes” e **condicionais gigantes** aparecem quando não se aplica os três corretamente. |
| **Aplicação** | Quando regras variam e precisam ser trocadas/estendidas (ex.: aprovação de empréstimo/contratação). | Quando há dependência 1-para-N e assinantes precisam ser atualizados (ex.: publicação de manchete). | Quando há hierarquia parte-todo (ex.: times e jogadores/subtimes). | Quando cliente espera uma interface diferente da oferecida por um serviço/legado (ex.: integrar API antiga a um consumidor novo). | Combinar: Strategy define “como”, Observer propaga mudanças, Composite organiza “o quê” em árvore. |
| **Participantes** | `Context` (`Conta` / classe de contratação), `Strategy` (`Emprestimo`/`ContratacaoStrategy`), `ConcreteStrategy` (`Permitido`, `Proibido`, `ContratacaoPorTeto`, `ContratacaoSemRestricao`). | `Subject` (`AgenciaNoticias`), `Observer` (`ObservadorNoticia`), `ConcreteObserver` (`SiteNoticias`, `AppMobile`, `EmailNoticias`). | `Component` (`MembroTime`), `Composite` (`Time`), `Leaf` (`Jogador`). | **Alvo/Target** (interface esperada), **Adaptador/Adapter** (converte), **Adaptado/Adaptee** (classe existente), **Cliente**. | Padrões podem coexistir: p.ex., `AgenciaNoticias` (Observer) notificando mudanças de estratégias (Strategy) em uma estrutura em árvore (Composite). |
| **Métodos-chave** | `setStrategy(...)`, `executar(...)`/`verificarEmprestimo(...)`. | `attach(...)`, `detach(...)`, `notify()`, `update(...)`. | `add(...)`, `remove(...)`, operações uniformes (`mostrar()`). | Métodos do **Target** implementados pelo **Adapter** que **delegam** ao **Adaptee** (mapeando parâmetros/retornos). | Integrações limpas via **interfaces** + **delegação**; testes focados em contratos, não em classes concretas. |
| **Vantagens** | Troca de regra sem `if/else`; facilita extensão/testes A/B. | Desacopla emissor e assinantes; adiciona canais sem impacto. | Operações uniformes em estruturas complexas; fácil adicionar nós. | Reuso de código legado/terceiro; integração incremental sem mexer na fonte. | Arquitetura mais flexível, evolução com baixo impacto e melhor testabilidade. |
| **Desvantagens** | Muitas classes pequenas; quem escolhe a estratégia precisa de lógica. | Ordem/consistência de notificação pode exigir coordenação; risco de loops. | Operações que não fazem sentido para folhas precisam ser tratadas. | Pode introduzir indireção extra; múltiplos adapters para muitos alvos. | Complexidade aumenta se usados sem critério; documentar papéis evita confusão. |
| **Exemplos no repositório** | `Conta` + `Emprestimo`/`ContratacaoStrategy` + `Permitido`/`Proibido`/`ContratacaoPorTeto`/`ContratacaoSemRestricao`. | `AgenciaNoticias` + `ObservadorNoticia` + `SiteNoticias`/`AppMobile`/`EmailNoticias` + `Manchete`. | `MembroTime` + `Time` (Composite) + `Jogador` (Leaf). | *(Adicionar ao subir o código do Adaptador)* | Todos os padrões podem ser combinados em um mesmo sistema para promover flexibilidade e reutilização. |
| **UML (gerados)** | [PUML Estratégia](sandbox:/mnt/data/uml-emprestimo-conta.puml) | [PUML Observador](sandbox:/mnt/data/uml-agencia-noticias-observer.puml) | [PUML Composto](sandbox:/mnt/data/uml-final-patterns-project.puml) | *(gerar após subir código)* | [PUML Geral](sandbox:/mnt/data/uml-final-patterns-project.puml) |

---

## Créditos
Projeto desenvolvido pelos alunos da disciplina **Padrões de Projetos de Sistemas**, sob orientação do **Prof. Juliano Bertoti**.  
Os exemplos aqui apresentados ilustram boas práticas e comparações com antipadrões em código Java.

