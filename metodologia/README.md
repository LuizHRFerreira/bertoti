<div align="center">
  <img src="assets/Header.png" alt="Banner do Portfólio" style="width:100%; max-width:1000px;">
  <br>
  <br>
  
<p align="center">
  Olá! Meu nome é <b>Luiz</b> e atualmente curso o <b>5º semestre de Banco de Dados</b> na Fatec de São José dos Campos. Trabalho como Business Analyst I na <b>Your ID INC</b>.
  <br>
</p>
<!-- Links de Contato com Badges Estilizados -->
  <p>
    <a href="mailto:luixhferreira@gmail.com?subject=Assunto%20do%20E-mail&body=Olá,%20tudo%20bem?">
      <img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" alt="Gmail">
    </a>
    <a href="https://www.linkedin.com/in/luiz-henrique-rabello-ferreira-3600752ba/">
      <img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn">
    </a>
    <a href="https://github.com/LuizHRFerreira">
      <img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white" alt="GitHub">
    </a>
  </p>
</div>
  <div align="center">
    <img src="assets/Projects-Header.png">
  </div>
  <hr>

<!-- 1º Semestre -->
<hr>
<div align="center">
 <h1>1º Semestre • 1/2024</h1>
</div>

<div align="center">
  <h3><a href="https://github.com/Steam-Ducks/scientific-calculator/tree/main" target="_blank">Calculadora Científica</a></h3>
  <p><i>Aplicação em terminal desenvolvida para executar operações matemáticas, conversões numéricas e validações de entrada, evoluindo de VisualG para TypeScript ao longo das sprints.</i></p>
  <br>
  <img src="assets/1_semestre/calculadora-cientifica-demo.gif" alt="Demonstração da Calculadora Científica" style="width:80%; max-width:700px; border-radius: 8px; border: 1px solid #555;">
  <br>
  <p>
    <a href="https://github.com/Steam-Ducks/scientific-calculator/tree/main" target="_blank">
      <img src="https://img.shields.io/badge/Repositório%20no%20GitHub-100000?style=for-the-badge&logo=github&logoColor=white" alt="GitHub Repo">
    </a>
  </p>
</div>

<details>
  <summary style="font-size: 1.2em; font-weight: bold;">Detalhes do Projeto</summary>

  <div align="center">
    <img src="assets/Introduction-Header.png">
  </div>

  <p align="justify">
    No primeiro semestre de 2024, desenvolvemos o projeto <b>Calculadora Científica</b>, uma aplicação em terminal criada para executar operações matemáticas, conversões entre bases numéricas e outros cálculos complementares. O projeto foi desenvolvido em contexto acadêmico, com foco no aprendizado prático de programação e organização de software, atendendo a um <b>cliente interno</b>.
  </p>

  <p align="justify">
    O desenvolvimento foi dividido em sprints, com as primeiras entregas sendo realizadas em <b>VisualG</b> e a evolução posterior para <b>TypeScript</b>. Essa transição foi importante para consolidar a lógica de programação e também para introduzir o time a práticas mais próximas do desenvolvimento real, como modularização, versionamento e integração entre funcionalidades.
  </p>

  <p align="justify">
    Entre as funcionalidades implementadas estavam operações aritméticas, divisão, fatorial, cálculo de juros, concatenação de strings e conversões entre diferentes bases numéricas. Além da construção funcional da calculadora, o projeto também exigiu cuidado com a experiência de uso no terminal, organização dos menus e tratamento de entradas inválidas.
  </p>

  <div align="center">
    <img src="assets/1_semestre/tecnologias.png" style="border-radius: 20px">
  </div>
  <div align="center">
    <img src="assets/Contribuition-Header.png">
  </div>

  <br>

  <details>
    <summary>🛠️ Implementação e integração de funcionalidades no menu principal</summary>
    <hr>
    <p align="justify">
      Uma das minhas contribuições foi participar da organização do fluxo principal da calculadora, conectando operações ao menu e ajudando a estruturar a navegação do sistema em terminal. Esse tipo de contribuição foi importante para garantir que as funções desenvolvidas pela equipe pudessem ser acessadas de forma clara e organizada pelo usuário.
    </p>

    <p align="justify">
      O menu principal centralizava operações como soma, subtração, multiplicação, divisão, fatorial, função de segundo grau, cálculo de juros, conversões e concatenação de strings. Além disso, a aplicação também contava com submenus específicos, como o de conversão de base, o que ajudava a manter a experiência de uso mais intuitiva.
    </p>

    <p align="justify"><b>Trecho do código:</b></p>
    <pre><code class="language-js">console.log("║ [1] SOMA                                           ║");
      console.log("║ [2] SUBTRAÇÃO                                      ║");
      console.log("║ [3] MULTIPLICAÇÃO                                  ║");
      console.log("║ [4] DIVISÃO                                        ║");
      console.log("║ [5] FATORIAL                                       ║");
      console.log("║ [6] FUNÇÃO DE SEGUNDO GRAU                         ║");
      console.log("║ [7] CÁLCULO DE JUROS                               ║");
      console.log("║ [8] CONVERSÃO DE BASE                              ║");
      console.log("║ [9] CONCATENAÇÃO DE STRINGS                        ║");

    switch (opcao) {
      case "4":
        do {
          divisao();
        } while (repetirOperacao());
        break;
      case "8":
        selecionarConversao();
        break;
    }</code></pre>

  <div align="center">
    <p align="justify"><b>Exemplo visual:</b></p>
    <img src="assets/1_semestre/calculadora-cientifica-menu-principal.png" alt="Menu principal da calculadora">
  </div>
  </details>

  <br>

  <details>
    <summary>🛠️ Validação de entrada e tratamento de erros na divisão</summary>
    <hr>
    <p align="justify">
      Uma parte importante da minha atuação no projeto esteve relacionada ao tratamento de entradas inválidas, especialmente na operação de divisão. Em uma aplicação de terminal, onde o usuário interage apenas digitando valores, garantir a validação correta dos dados é essencial para evitar falhas e tornar o sistema mais seguro.
    </p>

    <p align="justify">
      Trabalhei em melhorias como a validação da quantidade mínima de números, verificação de entrada numérica válida, prevenção de divisão por zero e cuidado com a exibição do resultado. Essas correções ajudaram a tornar a operação mais robusta e melhoraram a experiência do usuário ao utilizar a calculadora.
    </p>

    <p align="justify"><b>Trecho do código:</b></p>
    <pre><code class="language-js">do {
    num = prompt("Quantos números deseja dividir? ");
    validInput = /^\d+$/.test(num);
    quantidade = parseInt(num);

      if (!validInput || isNaN(quantidade) || quantidade &lt;= 1) {
        console.log("Por favor, insira um número válido.");
      }
    } while (!validInput || isNaN(quantidade) || quantidade &lt;= 1);

    if (divisor === 0) {
      console.log("Não é possível dividir por zero. Tente novamente.");
      return;
    }</code></pre>

  <div align="center">
    <p align="justify"><b>Exemplo visual:</b></p>
    <img src="assets/1_semestre/calculadora-cientifica-validacao-divisao.png" alt="Validação de entrada na operação de divisão">
  </div>
  </details>

  <br>

  <details>
    <summary>🛠️ Desenvolvimento de conversões numéricas</summary>
    <hr>
    <p align="justify">
      Também contribuí no desenvolvimento de funcionalidades ligadas às conversões numéricas, como a conversão de binário para octal. Esse tipo de implementação exigiu atenção à lógica de programação, validação da entrada do usuário e transformação correta dos valores entre diferentes representações numéricas.
    </p>

    <p align="justify">
      Além da lógica principal da conversão, também trabalhei com a validação da entrada binária, evitando que valores inválidos fossem processados. Essa contribuição foi importante para ampliar o conjunto de funcionalidades da calculadora e reforçar meu aprendizado em estruturas condicionais, repetição e manipulação de dados.
    </p>

    <p align="justify"><b>Trecho do código:</b></p>
    <pre><code class="language-js">for (let index = 0; index &lt; binario.length; index++) {
      let letraAtual = binario[index];

      if (letraAtual !== "1" && letraAtual !== "0") {
        valido = "Invalido";
      }
    }

    for (let index = binario.length - 1; index &gt;= 0; index--) {
      if (binario[index] === "1") {
        decimal += 2 ** potencia;
      }
      potencia++;
    }

    do {
      octal = Math.floor(decimal % 8);
      decimal /= 8;
      Resul += octal.toString();
    } while (decimal &gt; 1);</code></pre>

  <div align="center">
    <p align="justify"><b>Exemplo visual:</b></p>
    <img src="assets/1_semestre/calculadora-cientifica-conversao-binario-octal.png" alt="Conversão entre bases numéricas na calculadora">
  </div>
  </details>

  <br>

  <div align="center">
    <img src="assets/Learn-Header.png">
  </div>

  <h2> 💻 Hard Skills </h2>

  <details>
    <summary>🛠️ Lógica de Programação</summary>
    <ul>
      <li>Desenvolvi minha base em lógica de programação ao implementar funções matemáticas, menus e estruturas condicionais.</li>
      <li>Aprendi a organizar melhor entradas, processamento e saída de dados em uma aplicação de terminal.</li>
      <li>Esse aprendizado foi essencial para compreender como transformar regras de negócio em código funcional.</li>
    </ul>
  </details>

  <details>
    <summary>🛠️ TypeScript Básico</summary>
    <ul>
      <li>Tive meus primeiros contatos com TypeScript durante a evolução do projeto.</li>
      <li>Aprendi noções de tipagem, organização modular e estruturação de funções em uma linguagem mais próxima do mercado.</li>
      <li>Isso me ajudou a entender melhor boas práticas de desenvolvimento e legibilidade do código.</li>
    </ul>
  </details>

  <details>
    <summary>🛠️ Git e GitHub</summary>
    <ul>
      <li>Aprendi a utilizar versionamento de código para registrar e integrar minhas alterações no projeto.</li>
      <li>Pratiquei o uso de commits, merges e acompanhamento da evolução do repositório em equipe.</li>
      <li>Esse contato foi importante para entender fluxos de colaboração no desenvolvimento de software.</li>
    </ul>
  </details>

  <h2> 🤝 Soft Skills </h2>

  <details>
    <summary>🌱 Trabalho em Equipe</summary>
    <ul>
      <li>Aprendi a colaborar com os integrantes do grupo durante a divisão e integração das funcionalidades.</li>
      <li>Essa convivência me ajudou a entender melhor a importância da comunicação e da responsabilidade compartilhada.</li>
      <li>O projeto mostrou que mesmo tarefas pequenas impactam diretamente no resultado coletivo.</li>
    </ul>
  </details>

  <details>
    <summary>🌱 Adaptação ao Scrum</summary>
    <ul>
      <li>Tive contato com a organização do trabalho em sprints, backlog e entregas incrementais.</li>
      <li>Aprendi a acompanhar a evolução do projeto em etapas e a me adaptar a prioridades definidas pelo time.</li>
      <li>Isso me ajudou a desenvolver uma visão mais estruturada sobre gestão de desenvolvimento.</li>
    </ul>
  </details>

  <details>
    <summary>🌱 Padronização e Disciplina no Desenvolvimento</summary>
    <ul>
      <li>Aprendi a importância de seguir padrões de organização, nomenclatura e versionamento.</li>
      <li>Esse cuidado contribuiu para deixar o código mais compreensível e facilitar a manutenção do projeto.</li>
      <li>Também foi uma experiência importante para criar disciplina nas minhas primeiras práticas de programação.</li>
    </ul>
  </details>
</details>

<!-- 2º Semestre -->
<hr>
<div align="center">
 <h1>2º Semestre • 2/2024</h1>
</div>

<div align="center">
  <h3><a href="https://github.com/Steam-Ducks/pacer-assessment-system" target="_blank">PACER Assessment System</a></h3>
  <p><i>Sistema desktop desenvolvido para apoiar a avaliação de integrantes de equipe com base em critérios definidos pelo administrador, incluindo autenticação, gestão de grupos, critérios e relatórios.</i></p>
  <br>
  <img src="assets/2_semestre/pacer-tela-principal.png" alt="Tela principal do PACER Assessment System" style="width:80%; max-width:700px; border-radius: 8px; border: 1px solid #555;">
  <br>
  <p>
    <a href="https://github.com/Steam-Ducks/pacer-assessment-system" target="_blank">
      <img src="https://img.shields.io/badge/Repositório%20no%20GitHub-100000?style=for-the-badge&logo=github&logoColor=white" alt="GitHub Repo">
    </a>
  </p>
</div>

<details>
  <summary style="font-size: 1.2em; font-weight: bold;">Detalhes do Projeto</summary>

  <div align="center">
    <img src="assets/Introduction-Header.png">
  </div>

  <p align="justify">
    No segundo semestre de 2024, desenvolvemos o <b>PACER Assessment System</b>, um sistema desktop criado para permitir a avaliação de integrantes de grupo com base em critérios previamente definidos. O projeto foi construído em contexto acadêmico e tinha como objetivo tornar o processo de avaliação mais estruturado, transparente e organizado.
  </p>

  <p align="justify">
    A aplicação contemplava funcionalidades como autenticação de usuários, gerenciamento de grupos, definição de critérios de avaliação, cadastro de sprints e geração de relatórios. Além disso, o projeto também envolveu uma etapa importante de modelagem de dados e documentação, garantindo que a solução estivesse bem definida tanto do ponto de vista funcional quanto estrutural.
  </p>

  <p align="justify">
    Neste projeto, atuei como <b>Product Owner</b>, sendo responsável por apoiar a organização do produto e por manter a documentação atualizada ao longo do desenvolvimento. Minha atuação esteve mais concentrada na definição e acompanhamento dos artefatos do projeto do que na implementação em código, contribuindo para que o time tivesse clareza sobre a evolução das entregas e sobre a visão geral do sistema.
  </p>

  <div align="center">
    <img src="assets/2_semestre/tecnologias.png" style="border-radius: 20px">
  </div>
  <div align="center">
    <img src="assets/Contribuition-Header.png">
  </div>

  <br>

  <details>
    <summary>🛠️ Atuação como Product Owner na organização do produto</summary>
    <hr>
    <p align="justify">
      Minha principal contribuição neste projeto foi atuar como Product Owner, ajudando a organizar a visão do produto ao longo do semestre. Essa atuação envolveu acompanhar a estrutura geral do sistema, apoiar a definição das entregas e manter coerência entre o que estava sendo desenvolvido e o que o projeto precisava entregar.
    </p>

  <p align="justify">
    Como o sistema possuía diferentes módulos — como autenticação, grupos, critérios, sprints e relatórios — foi importante garantir que a evolução das funcionalidades estivesse alinhada ao objetivo central da aplicação. Essa experiência me ajudou a entender melhor a responsabilidade de organizar o produto para o time e acompanhar sua construção de forma mais estratégica.
  </p>

  <div align="center">
    <p align="justify"><b>Exemplo visual:</b></p>
    <img src="assets/2_semestre/pacer-tela-principal.png" alt="Tela principal do sistema">
  </div>
  </details>

  <br>

  <details>
    <summary>🛠️ Documentação contínua do projeto</summary>
    <hr>
    <p align="justify">
      Outra contribuição importante foi a manutenção da documentação do projeto ao longo do desenvolvimento. Pelo histórico do repositório, minha participação esteve fortemente ligada à atualização do README, organização de arquivos e publicação de artefatos importantes para apresentação e entendimento do sistema.
    </p>

  <p align="justify">
    Esse trabalho foi relevante porque ajudou a consolidar a visão do projeto, registrar sua evolução e tornar mais fácil a comunicação das funcionalidades e requisitos para quem fosse consultar o repositório. Além disso, a documentação também teve papel importante na apresentação acadêmica do sistema e na formalização dos resultados da equipe.
  </p>

  <div align="center">
    <p align="justify"><b>Exemplo visual:</b></p>
    <img src="assets/2_semestre/pacer-documentacao.png" alt="Documentação do projeto PACER">
  </div>
  </details>

  <br>

  <details>
    <summary>🛠️ Organização de artefatos de acompanhamento e planejamento</summary>
    <hr>
    <p align="justify">
      Também contribuí com a organização de artefatos que apoiavam o acompanhamento do projeto, como gráficos de burndown, wireframes e outros materiais visuais e estruturais. Esses elementos eram importantes para acompanhar a evolução das entregas e comunicar melhor o planejamento e a proposta da solução.
    </p>

  <p align="justify">
    O wireframe ajudava a representar visualmente a estrutura esperada do sistema, enquanto o burndown funcionava como evidência do acompanhamento do progresso das sprints. Esse tipo de contribuição reforçou minha atuação mais voltada à organização do produto, planejamento e acompanhamento do time.
  </p>

  <div align="center">
    <p align="justify"><b>Exemplos visuais:</b></p>
    <img src="assets/2_semestre/pacer-burndown.png" alt="Burndown do projeto PACER">
  </div>
  </details>
  
  <br>

  <div align="center">
    <img src="assets/Learn-Header.png">
  </div>

  <h2> 💻 Hard Skills </h2>

  <details>
    <summary>🛠️ Documentação de Software</summary>
    <ul>
      <li>Desenvolvi maior familiaridade com a organização e manutenção de documentação de software ao longo do projeto.</li>
      <li>Aprendi a estruturar informações importantes no README e em outros artefatos para registrar a evolução do produto.</li>
      <li>Esse aprendizado foi importante para entender como a documentação contribui para comunicação, apresentação e continuidade do projeto.</li>
    </ul>
  </details>

  <details>
    <summary>🛠️ Modelagem e visão estrutural de sistemas</summary>
    <ul>
      <li>Acompanhei artefatos como DER, wireframes e estrutura funcional do sistema.</li>
      <li>Esse contato me ajudou a desenvolver uma visão mais ampla sobre como os requisitos do produto se conectam com a modelagem e a solução implementada.</li>
      <li>Foi uma experiência importante para fortalecer minha leitura de artefatos técnicos mesmo sem atuar diretamente na codificação.</li>
    </ul>
  </details>

  <details>
    <summary>🛠️ Gestão de Produto em contexto ágil</summary>
    <ul>
      <li>Aprendi melhor como acompanhar a evolução de um produto em sprints, organizando artefatos e apoiando a priorização das entregas.</li>
      <li>Esse contato ampliou minha compreensão sobre o papel do Product Owner dentro de um time.</li>
      <li>Também me ajudou a entender melhor a importância de clareza, organização e acompanhamento contínuo no desenvolvimento.</li>
    </ul>
  </details>

  <h2> 🤝 Soft Skills </h2>

  <details>
    <summary>🌱 Organização</summary>
    <ul>
      <li>Desenvolvi mais organização ao lidar com documentação, artefatos e acompanhamento do produto.</li>
      <li>Essa habilidade foi essencial para manter a visão do projeto clara ao longo do semestre.</li>
      <li>Também contribuiu para que a comunicação com a equipe fosse mais objetiva e estruturada.</li>
    </ul>
  </details>

  <details>
    <summary>🌱 Comunicação com a equipe</summary>
    <ul>
      <li>Atuar como Product Owner exigiu comunicação constante para alinhar entendimento sobre o produto e suas entregas.</li>
      <li>Aprendi a traduzir melhor a necessidade do sistema em informações úteis para o time.</li>
      <li>Essa experiência fortaleceu minha capacidade de mediação e alinhamento em grupo.</li>
    </ul>
  </details>

  <details>
    <summary>🌱 Visão de produto</summary>
    <ul>
      <li>Aprendi a observar o projeto de uma perspectiva mais ampla, indo além da implementação técnica.</li>
      <li>Essa vivência me ajudou a entender melhor a importância de pensar no sistema como produto, com propósito, organização e coerência entre suas partes.</li>
      <li>Foi um passo importante para desenvolver mais senso de prioridade e direção dentro do projeto.</li>
    </ul>
  </details>

</details>

---
<!-- 3º Semestre -->
<div align="center">
 <h1>3º Semestre • 1/2025</h1>
</div>
<div align="center">
  <h3><a href="https://github.com/Steam-Ducks/point-system" target="_blank">Pontual - Sistema de Ponto</a></h3>
  <p><i>Aplicação web para monitorar horas trabalhadas de funcionários de empresas terceirizadas, desenvolvida para a empresa Altave.</i></p>
  <br>
  <img src="assets/3_semestre/pontual.gif" alt="Captura de tela do projeto Pontual" style="width:80%; max-width:700px; border-radius: 8px; border: 1px solid #555;">
  <br>
  <p>
    <a href="https://github.com/Steam-Ducks/point-system" target="_blank">
      <img src="https://img.shields.io/badge/Repositório%20no%20GitHub-100000?style=for-the-badge&logo=github&logoColor=white" alt="GitHub Repo">
    </a>
  </p>
</div>
<details>
  <summary style="font-size: 1.2em; font-weight: bold;">Detalhes do Projeto</summary>
 
  <div align="center">
    <img src="assets/Introduction-Header.png">
  </div>
  <p align="justify">
    No terceiro semestre, desenvolvemos um sistema de ponto que batisamos de Pontual, uma aplicação web para monitorar horas trabalhadas de funcionários de empresas terceirizadas. Nosso cliente, a Altave, é uma empresa que atua com coleta de imagens e reconhecimento facial, começaram com balões meteorológicos e hoje trabalham com segurança, por exemplo, em plataformas petrolíferas.
  </p>
  <p align="justify">
    O caso que o cliente nos apresentou envolvia um estaleiro, onde empresas terceiras fazem manutenção em navios. As câmeras da Altave identificam os colaboradores e enviam essas informações para o sistema, que registra os pontos, calcula horas trabalhadas e gera o valor do salário individualmente.
  </p>
  
  <p align="justify">
    No projeto, desenvolvemos uma interface para cadastro de empresas e profissionais, filtros de dados, extração de relatórios e dashboards interativos. Um dos desafios foi lidar com funcionários em escalas noturnas e permitir a edição de pontos.
  </p>

  <div align="center">
    <img src="assets/3_semestre/tecnologias.png" style="border-radius: 20px">
  </div>
  
  <div align="center">
    <img src="assets/Contribuition-Header.png">
  </div><br>
  🛠️ Estruturação do projeto em Vue.js
  <details>
  <summary>
      Organizei a estrutura do projeto, defini padrões de código e criei layouts e componentes reutilizáveis para garantir consistência e manutenção eficiente.
  </summary>
    <hr>
  <p align="justify">
    - Organizei as pastas, defini rotas e criei padrões de código para garantir consistência no projeto.
    - Estruturei os layouts principais e componentes reutilizáveis.
  </p>
    Estruturei a arquitetura das pastas e defini rotas claras para facilitar a navegação e a manutenção do código. Além disso, estabeleci padrões de desenvolvimento para garantir consistência entre os módulos e maior legibilidade do código. Também desenvolvi os layouts principais e componentes reutilizáveis, promovendo uma interface coerente e otimizando o tempo de desenvolvimento em futuras implementações.
  </p> 
  <p align="justify"><b>Trecho do arquivo de rotas:</b></p>

    <pre><code class="language-js">
    import UserPage from '@/views/users/UserIndex.vue';
    import Test from '@/components/Test.vue';
    import LoginPage from '@/views/auth/AuthIndex.vue';
    import admintLayout from "@/layout/AdmintLayout.vue";
    import PositionPage from '@/views/position/PositionIndex.vue';
    const routes = [
      {
        path: '/',
        name: 'Login',
        component: LoginPage,
      },
      {
        path: '/home',
        name: 'Home',
        meta: { requiresAuth: true },
        component: admintLayout,
        children: [
          {
            path: '',
            component: HomePage
          }
        ]
      },
      {
        path: '/user',
        component: AdminLayout,
        meta: { requiresAuth: true },
        children: [
          {
            path: '',
            component: UserPage,
          },
        ],
      }
      ...
    ];
  </code></pre>
  <div align="center">
      <p align="justify"><b>Navegação entre as páginas:</b></p>
      <img src="assets/3_semestre/navegacao.gif" alt="Organização de Pastas">
  </div>
  <hr>
  </details>
  ⚙️ Integração do frontend com o backend
  <details>
    <summary>
    Implementei a integração com a API, configurando interceptadores para autenticação e tratamento de erros durante o consumo e manipulação de dados
  </summary>
    <hr>
      <p align="justify">
        Implementei a comunicação entre o frontend e a API, garantindo o consumo eficiente dos endpoints responsáveis pela exibição e manipulação dos dados da aplicação. Configurei interceptadores de requisição          e resposta para gerenciar automaticamente tokens de autenticação, lidar com erros de forma centralizada e melhorar a segurança e a confiabilidade das operações. Essa abordagem tornou o fluxo de dados             mais robusto, padronizado e fácil de manter ao longo do desenvolvimento.
      </p>
  <p align="justify"><b>Trecho do arquivo `TimeRecordService`:</b></p>
  <pre>

    <code class="language-js">
    import axios from 'axios';
    import UserService from './UserService';
    const API_URL = 'http://localhost:8080/api/timerecords';
    const formatToLocalDateTimeString = (dateInput) => {
      let date;
      if (dateInput instanceof Date) {
        date = dateInput;
      } else if (typeof dateInput === 'string') {
        if (/^\d{4}-\d{2}-\d{2}$/.test(dateInput)) {
          return `${dateInput}`;
        }
        date = new Date(dateInput);
      } else {
        console.warn("Tipo de data inválido recebido:", dateInput);
        return null;
      }
      if (!date || isNaN(date.getTime())) {
        console.warn("Não foi possível parsear a data:", dateInput);
        return null;
      }
    };
 </code></pre>
  <div align="center">
      <p align="justify"><b>Consumo de end point para listar marcações de ponto:</b></p>
    <img src="assets/3_semestre/folha_de_ponto.gif" alt="Organização de Pastas">
  </div>
  <hr>
  </details>
  🖥️ Contribuições no backend
  <details>
    <summary>
      Desenvolvimento de classes e services para estruturar a lógica da aplicação e integrei o projeto ao banco de dados online Supabase
    </summary>
      <hr>
    <p align="justify">
      - Criação de classes e services.
      - Integração com banco online <b>Supabase</b>.
      Desenvolvimento classes e serviços responsáveis por organizar a lógica de negócio e facilitar a comunicação entre os diferentes módulos da aplicação. Estruturei os services de forma modular, promovendo           reutilização de código e separação de responsabilidades. Além disso, integrei o projeto ao banco de dados online **Supabase**, configurando a conexão e implementando operações de leitura, escrita e               atualização de dados de maneira segura e performática. Essa integração garantiu maior escalabilidade e eficiência no gerenciamento das informações.
    </p>

    <p align="justify"><b>Trecho da classe `EmployeeController`:</b></p>

      <pre><code class="language-java">
      public class EmployeeController {
          @Autowired
          private final EmployeeService employeeService;
          private final SupabaseStorageService supabaseStorageService;
          public EmployeeController(EmployeeService employeeService, SupabaseStorageService supabaseStorageService) {
              this.employeeService = employeeService;
              this.supabaseStorageService = supabaseStorageService;
          }
          @PostMapping
          public ResponseEntity<?> createEmployee(@RequestBody EmployeeDto employeeDto) {
              try {
                  int employeeId = employeeService.createEmployee(employeeDto);
                  return ResponseEntity.status(HttpStatus.CREATED)
                          .body(Map.of("id", employeeId));
              } catch (IllegalArgumentException e) {
                  return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                          .body(Map.of("message", e.getMessage()));
              } catch (ResponseStatusException e) {
                  return ResponseEntity.status(HttpStatus.NOT_FOUND)
                          .body(Map.of("message", e.getReason()));
              } catch (Exception e) {
                  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                          .body(Map.of("message", "Erro ao criar um novo funcionário. Tente novamente."));
              }
          }
          @PostMapping("/uploadPhoto")
          public ResponseEntity<?> uploadEmployeePhoto(@RequestParam("file") MultipartFile file) {
              try {
                  String photoUrl = supabaseStorageService.uploadEmployeePhoto(file);
                  return ResponseEntity.ok(Map.of("photoUrl", photoUrl));
              } catch (Exception e) {
                  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                          .body(Map.of("message", "Erro no upload de foto"));
              }
          }
      }
      
    </code></pre>
          
    <p align="justify"><b>Trecho do `application.properties`:</b></p>
      <pre><code class="language-properties">
      spring.jpa.database=postgresql
      spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
      spring.jpa.hibernate.ddl-auto=none
      spring.jpa.show-sql=true
      supabase.auth.token=Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...
      spring.datasource.url=jdbc:postgresql://aws-0-sa-east-1.pooler.supa...
      spring.datasource.username=postgres...
      spring.datasource.password=********
      spring.datasource.driver-class-name=org.postgresql.Driver
    </code></pre>
      <div align="center">
        <p align="justify"><b>Consumo de end point para listar marcações de ponto:</b></p>
        <img src="assets/3_semestre/cadastro_empregado.gif" alt="Organização de Pastas">
      </div>
    </details>
          🚀 Criação da folha de ponto
    <details>
    <summary>
      Criação da lógica por calculo e impressão dos pontos em telas
    </summary>
      <hr>
    <p align="justify">
      - Criação da lógica por calculo e impressão dos pontos em telas
    </p>
    <p align="justify"><b>Trecho de TimeReconrdIndex.vue</b></p>
        Desenvolvi toda a lógica responsável pelo cálculo e exibição dos pontos na interface. Implementei funções para processar os dados de entrada, realizar os cálculos necessários e gerar resultados precisos em       tempo real. Além disso, estruturei o código para garantir que os pontos fossem renderizados corretamente nas telas, mantendo coerência visual e desempenho otimizado. Essa implementação permitiu uma               experiência dinâmica e interativa para o usuário, com atualização automática das informações conforme as ações realizadas
      </p>
    <b>Trecho de TimeReconrdIndex.vue</b></p>

      <pre><code class="language-js">
      computed: {
      // Lista os funcionarios no select
      employeeslist() {
        return this.employees.map((employee) => ({
          id: employee.id,
          name: employee.name,
        }));
      },
      hasAnyEntrada2() {
          return this.processedTimeRecords.some(record => record.entrada2);
      },
      hasAnyEntrada3() {
          return this.processedTimeRecords.some(record => record.entrada3);
      },
      totalWorkedPeriod() {
      if (!this.processedTimeRecords || this.processedTimeRecords.length === 0) {
        return '00:00';
      }
      const totalMinutes = this.processedTimeRecords.reduce((sum, record) => {
        const [hours, minutes] = record.totalTrabalhadoDia.split(':').map(Number);
        return sum + (hours * 60) + minutes;
      }, 0);
      const hours = Math.floor(totalMinutes / 60);
      const minutes = totalMinutes % 60;
      return `${String(hours).padStart(2, '0')}:${String(minutes).padStart(2, '0')}`;
      },
    </code></pre>
    <div align="center">
        <p align="justify"><b>Exemplo de inclusão de ponto:</b></p>
      <img src="assets/3_semestre/registro_de_ponto.gif" alt="Organização de Pastas">
    </div>
    <br>
  </details>
  <div align="center">
    <img src="assets/Learn-Header.png">
  </div>
  <h2> 💻 Hard Skills </h2>
  <details>
    <summary>🛠️ Vue.js e arquitetura de frontend</summary>
    <ul>
      <li>Aprendi a organizar rotas, layouts e componentes reutilizáveis em um projeto de médio porte.</li>
      <li>Esse aprendizado veio da necessidade de manter a aplicação escalável, já que várias telas compartilhavam elementos comuns.</li>
      <li>Isso ajudou o time a padronizar o código e reduzir retrabalho no desenvolvimento do frontend.</li>
    </ul>
  </details>
  <details>
    <summary>🛠️ Integração de frontend e backend</summary>
    <ul>
      <li>Desenvolvi a habilidade de consumir APIs reais e lidar com autenticação, erros e tratamento de dados.</li>
      <li>Essa experiência veio principalmente da criação dos serviços de comunicação com a API no Vue.js.</li>
      <li>No projeto, isso foi essencial para garantir que as telas exibissem informações atualizadas e funcionais para o cliente.</li>
    </ul>
  </details>
  <details>
    <summary>🛠️ Java Spring Boot e integração com banco de dados</summary>
    <ul>
      <li>Ganhei prática com a criação de controllers, services e integração com o Supabase.</li>
      <li>Aprendi a lidar com persistência de dados em PostgreSQL e tratamento de exceções no backend.</li>
      <li>Esse aprendizado foi crucial para estruturar o backend de forma confiável e segura, suportando as regras de negócio.</li>
    </ul>
  </details>
  <details>
    <summary>🛠️ SQL e consultas otimizadas</summary>
    <ul>
      <li>Melhorei minha escrita de queries no PostgreSQL, incluindo consultas com filtros de data e agregações.</li>
      <li>Esse conhecimento veio da necessidade de gerar relatórios de horas trabalhadas e cálculos de folha de ponto.</li>
      <li>Isso permitiu que o sistema apresentasse informações corretas e em tempo hábil para o cliente.</li>
    </ul>
  </details>
  <h2> 🤝 Soft Skills </h2>
  <details>
    <summary>🌱 Colaboração em equipe</summary>
    <ul>
      <li>Auxiliei meus colegas de grupo no desenvolvimento de suas partes do projeto, oferecendo suporte técnico e sugestões.</li>
      <li>Essa colaboração ajudou o time a manter o ritmo de trabalho e reduzir retrabalho.</li>
      <li>Contribuiu para um ambiente mais coeso e eficiente durante todo o desenvolvimento.</li>
    </ul>
  </details>
  <details>
    <summary>🌱 Brainstorm e planejamento</summary>
    <ul>
      <li>Participei de sessões de brainstorming para definir quais telas e funcionalidades o sistema precisaria ter.</li>
      <li>Ajudei a identificar soluções para fluxos complexos, como marcações de ponto que atravessam a meia-noite.</li>
      <li>Essas decisões antecipadas facilitaram o desenvolvimento e reduziram possíveis retrabalhos.</li>
    </ul>
  </details>
  <details>
    <summary>🌱 Resolução de problemas complexos</summary>
    <ul>
      <li>Contribuí para encontrar soluções técnicas para situações desafiadoras, como horários noturnos e cálculos de ponto específicos.</li>
      <li>Isso exigiu análise lógica e criatividade, garantindo que a aplicação funcionasse corretamente em todos os cenários.</li>
      <li>Minimizou erros e melhorou a confiabilidade do sistema.</li>
    </ul>
  </details>
  <details>
    <summary>🌱 Organização e revisão de tarefas</summary>
    <ul>
      <li>Auxiliei na revisão e organização do código de colegas, mantendo padrões consistentes.</li>
      <li>Isso ajudou a evitar conflitos e problemas de integração entre diferentes partes do sistema.</li>
      <li>Contribuiu para a qualidade geral do projeto e facilitou o desenvolvimento colaborativo.</li>
    </ul>
  </details>
</details>

<hr>
<div align="center">
 <h1>4º Semestre • 2/2025</h1>
</div>

<div align="center">
  <h3><a href="https://github.com/Steam-Ducks/traffic-monitoring-system" target="_blank">Tráfegou! - Monitoramento de Tráfego Inteligente</a></h3>
  <p><i>Aplicação web full stack desenvolvida para monitorar indicadores de mobilidade urbana, classificar regiões por níveis de tráfego e apoiar a gestão de alertas e protocolos de ação.</i></p>
  <br>
  <img src="assets/4_semestre/trafegou-dashboard-principal.png" alt="Dashboard principal do projeto Tráfegou!" style="width:80%; max-width:700px; border-radius: 8px; border: 1px solid #555;">
  <br>
  <p>
    <a href="https://github.com/Steam-Ducks/traffic-monitoring-system" target="_blank">
      <img src="https://img.shields.io/badge/Repositório%20no%20GitHub-100000?style=for-the-badge&logo=github&logoColor=white" alt="GitHub Repo">
    </a>
  </p>
</div>

<details>
  <summary style="font-size: 1.2em; font-weight: bold;">Detalhes do Projeto</summary>

  <div align="center">
    <img src="assets/Introduction-Header.png">
  </div>

  <p align="justify">
    No quarto semestre de 2025, desenvolvemos o projeto <b>Tráfegou! - Monitoramento de Tráfego Inteligente</b>, uma aplicação web criada para apoiar o monitoramento contínuo da mobilidade urbana. O sistema foi pensado para consolidar indicadores de tráfego por região, atribuir níveis de monitoramento, gerar alertas automáticos e registrar protocolos de ação para apoio à tomada de decisão.
  </p>

  <p align="justify">
    A solução foi construída com arquitetura full stack, utilizando <b>Vue.js 3 com TypeScript</b> no frontend, <b>Spring Boot com Java 17</b> no backend e integração com banco de dados relacional. Além disso, o projeto também contou com mapas interativos, dashboards, autenticação e processamento contínuo de dados.
  </p>

  <p align="justify">
    Atuei como <b>desenvolvedor full stack</b>, contribuindo tanto na construção de telas e fluxos do frontend quanto na implementação de autenticação, segurança, controllers, integrações e persistência no backend. Minha participação se concentrou principalmente em autenticação de usuários, dashboard administrativo, CRUD de usuários e cargos, configuração de segurança da API, ingestão e tratamento de dados e integração entre camadas do sistema.
  </p>

  <div align="center">
    <img src="assets/4_semestre/tecnologias.png" style="border-radius: 20px">
  </div>
  <div align="center">
    <img src="assets/Contribuition-Header.png">
  </div>

  <br>

  <details>
    <summary>🛠️ Implementação da autenticação e fluxo de acesso</summary>
    <hr>
    <p align="justify">
      Uma das minhas principais contribuições no projeto foi a implementação da autenticação e do fluxo de acesso ao sistema. No frontend, atuei na criação da página de login, na lógica de autenticação e no fluxo de logout. No backend, trabalhei na configuração de autenticação, proteção de endpoints e resolução de conflitos relacionados ao acesso.
    </p>

  <p align="justify"><b>Trecho do código:</b></p>
  <pre><code class="language-ts">// Cole aqui um trecho real do login/logout ou autenticação do frontend</code></pre>

  <p align="justify"><b>Trecho do código backend:</b></p>
  <pre><code class="language-java">// Cole aqui um trecho real da configuração de autenticação / security</code></pre>

  <div align="center">
    <p align="justify"><b>Exemplo visual:</b></p>
    <img src="assets/4_semestre/trafegou-login.png" alt="Tela de login do Tráfegou!">
  </div>
  </details>

  <br>

  <details>
    <summary>🛠️ Criação do dashboard administrativo e gerenciamento de usuários e cargos</summary>
    <hr>
    <p align="justify">
      Também atuei no desenvolvimento da área administrativa do sistema. No frontend, contribuí com a criação da página de administração, configuração do grid do dashboard e desenvolvimento de componentes ligados à gestão de usuários, cargos e mensagens. No backend, essa entrega foi complementada pela criação de recursos para listagem, edição e organização de usuários e papéis.
    </p>

  <p align="justify"><b>Trecho do código:</b></p>
  <pre><code class="language-ts">// Cole aqui um trecho real da tela admin, grid ou CRUD de usuários</code></pre>

  <p align="justify"><b>Trecho do código backend:</b></p>
  <pre><code class="language-java">// Cole aqui um trecho real do controller/service de usuários ou roles</code></pre>

  <div align="center">
    <p align="justify"><b>Exemplo visual:</b></p>
    <img src="assets/4_semestre/trafegou-admin-usuarios.png" alt="Tela administrativa de usuários e cargos">
  </div>
  </details>

  <br>

  <details>
    <summary>🛠️ Integração full stack para indicadores de tráfego</summary>
    <hr>
    <p align="justify">
      Outra contribuição importante foi a integração entre frontend e backend para consumo e apresentação dos indicadores de tráfego. No frontend, trabalhei com serviços para buscar os níveis das zonas monitoradas e ajustar a interface para refletir corretamente os dados processados. No backend, contribuí com a configuração dos endpoints e com a lógica de cálculo e persistência dos indicadores regionais.
    </p>

  <p align="justify"><b>Trecho do código:</b></p>
  <pre><code class="language-ts">// Cole aqui um trecho real do service que consome níveis por zona</code></pre>

  <p align="justify"><b>Trecho do código backend:</b></p>
  <pre><code class="language-java">// Cole aqui um trecho real do cálculo ou endpoint dos indicadores</code></pre>

  <div align="center">
    <p align="justify"><b>Exemplo visual:</b></p>
    <img src="assets/4_semestre/trafegou-indicadores.png" alt="Indicadores e níveis de tráfego por região">
  </div>
  </details>

  <br>

  <details>
    <summary>🛠️ Persistência, tratamento e otimização de dados</summary>
    <hr>
    <p align="justify">
      Também contribuí com partes relacionadas à persistência e ao tratamento dos dados recebidos pelo sistema. Entre essas entregas, estiveram o salvamento dos registros, o suporte à atualização periódica dos dados, a organização das tabelas e ajustes em estruturas usadas pelos indicadores e alertas.
    </p>

  <p align="justify"><b>Trecho do código:</b></p>
  <pre><code class="language-java">// Cole aqui um trecho real do salvamento dos registros, scheduler ou SpeedData</code></pre>

  <div align="center">
    <p align="justify"><b>Exemplo visual:</b></p>
    <img src="assets/4_semestre/trafegou-alertas.png" alt="Tela de alertas e protocolos do Tráfegou!">
  </div>
  </details>

  <br>

  <div align="center">
    <img src="assets/Learn-Header.png">
  </div>

  <h2> 💻 Hard Skills </h2>

  <details>
    <summary>🛠️ Integração entre frontend e backend</summary>
    <ul>
      <li>Desenvolvi mais segurança na comunicação entre interface e API, conectando telas, serviços e endpoints reais.</li>
      <li>Essa experiência veio da implementação de autenticação, consumo de indicadores e integração de funcionalidades administrativas.</li>
      <li>No projeto, isso foi essencial para garantir consistência entre o que o usuário via na interface e o que era processado no backend.</li>
    </ul>
  </details>

  <details>
    <summary>🛠️ Segurança e autenticação</summary>
    <ul>
      <li>Aprofundei meu contato com autenticação e controle de acesso em aplicações full stack.</li>
      <li>Aprendi a trabalhar com login, logout, proteção de rotas, configuração de permissões e comunicação segura com a API.</li>
      <li>Esse aprendizado foi importante para construir uma aplicação mais robusta e mais próxima de um cenário real.</li>
    </ul>
  </details>

  <details>
    <summary>🛠️ Integração com banco de dados</summary>
    <ul>
      <li>Ganhei mais prática com persistência de dados, modelagem de tabelas e organização do fluxo de armazenamento no backend.</li>
      <li>Esse aprendizado apareceu principalmente no salvamento dos registros recebidos e no suporte aos indicadores e alertas.</li>
      <li>Isso fortaleceu minha visão sobre como o banco sustenta a confiabilidade e a continuidade da aplicação.</li>
    </ul>
  </details>

  <details>
    <summary>🛠️ Otimização e tratamento de dados</summary>
    <ul>
      <li>Aprendi a olhar com mais cuidado para fluxo de dados, atualização periódica e enriquecimento das informações no backend.</li>
      <li>Essa experiência veio da implementação de rotinas de persistência, ajustes de estruturas e processamento dos indicadores.</li>
      <li>No sistema, isso contribuiu para manter os dados mais úteis, consistentes e preparados para exibição em dashboards.</li>
    </ul>
  </details>

  <h2> 🤝 Soft Skills </h2>

  <details>
    <summary>🌱 Visão sistêmica</summary>
    <ul>
      <li>Atuar no frontend e no backend me ajudou a enxergar o sistema de forma mais completa.</li>
      <li>Aprendi a considerar o impacto de cada decisão na interface, na API, na segurança e no armazenamento dos dados.</li>
      <li>Essa visão mais ampla contribuiu para entregas mais consistentes e melhor integração com o restante do time.</li>
    </ul>
  </details>

  <details>
    <summary>🌱 Resolução de problemas</summary>
    <ul>
      <li>Ao lidar com autenticação, integração de endpoints e fluxo de dados, desenvolvi mais capacidade de investigar e resolver problemas complexos.</li>
      <li>Essa habilidade foi importante para reduzir bloqueios durante a implementação das funcionalidades.</li>
      <li>Também me ajudou a trabalhar de forma mais autônoma em tarefas técnicas com várias camadas envolvidas.</li>
    </ul>
  </details>

  <details>
    <summary>🌱 Colaboração técnica</summary>
    <ul>
      <li>Como trabalhei em diferentes partes da aplicação, precisei me comunicar bem com o time para alinhar contratos, comportamento das telas e estrutura dos dados.</li>
      <li>Essa colaboração ajudou a manter o desenvolvimento mais fluido e a reduzir retrabalho.</li>
      <li>Foi uma experiência importante para fortalecer meu papel em projetos com arquitetura full stack.</li>
    </ul>
  </details>

</details>