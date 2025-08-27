<div align="center">
  <!-- Banner (opcional, mas adiciona um toque profissional) -->
  <!-- Substitua 'LINK_PARA_SEU_BANNER' pela URL da sua imagem de banner, se tiver uma. -->
  <img src="assets/Header.png" alt="Banner do Portfólio" style="width:100%; max-width:1000px;">
  <br>
  <br>
  
<p align="center">
  Olá! Meu nome é <b>Luiz</b> e atualmente curso o <b>4º semestre de Banco de Dados</b> na Fatec de São José dos Campos. Trabalho como desenvolvedor na empresa <b>Pandô</b>.
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

<div align="center">
 <h1>3º Semestre • 1/2025</h1>
</div>

<div align="center">
  <h3><a href="https://github.com/Steam-Ducks/point-system" target="_blank">Pontual - Sistema de Ponto</a></h3>
  <p><i>Aplicação web para monitorar horas trabalhadas de funcionários de empresas terceirizadas, desenvolvida para a empresa Altave.</i></p>
  <br>
  <img src="assets/pontual.gif" alt="Captura de tela do projeto Pontual" style="width:80%; max-width:700px; border-radius: 8px; border: 1px solid #555;">
  <br>
  <p>
    <a href="https://github.com/Steam-Ducks/point-system" target="_blank">
      <img src="https://img.shields.io/badge/Repositório%20no%20GitHub-100000?style=for-the-badge&logo=github&logoColor=white" alt="GitHub Repo">
    </a>
  </p>
</div>

<details>
  <summary style="font-size: 1.2em; font-weight: bold;">Detalhes do Projeto</summary>
  <h2>Introdução</h2>
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
    <img src="assets/tecnologias.png" style="border-radius: 20px">
  </div>

  <h2>Contribuições Pessoais</h2>
  <details>
    <summary>📌 Estruturação do projeto em Vue.js</summary>
    
  <p align="justify">
    - Organizei as pastas, defini rotas e criei padrões de código para garantir consistência no projeto.
    - Estruturei os layouts principais e componentes reutilizáveis.
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
      <img src="assets/navegacao.gif" alt="Organização de Pastas">
  </div>
  <hr>
  </details>
  <details>
    <summary>📌 Integração do frontend com o backend</summary>

  <p align="justify">
    - Implementei a comunicação com a API, consumindo endpoints para exibição e manipulação de dados.
    - Configurei interceptadores de requisição/resposta para lidar com autenticação e erros.
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
    <img src="assets/folha_de_ponto.gif" alt="Organização de Pastas">
  </div>
  <hr>
  </details>
  <details>
    <summary>📌 Contribuições no backend</summary>
  
  <p align="justify">
    - Criação de classes e services.
    - Integração com banco online <b>Supabase</b>.
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
      <img src="assets/cadastro_empregado.gif" alt="Organização de Pastas">
    </div>
  </details>
  <details>
        <summary>📌 Criação da folha de ponto</summary>
    
  <p align="justify">
    - Criação da lógica por calculo e impressão dos pontos em telas
  </p>
  <p align="justify"><b>Trecho de TimeReconrdIndex.vue</b></p>

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
    <img src="assets/registro_de_ponto.gif" alt="Organização de Pastas">
  </div>
</details>
  
  ---
  
## Aprendizados

<details>
  <summary>📌 <b>Vue.js em projetos reais:</b></summary>
  <p align="justify">
    Aprendi a lidar com a organização e escalabilidade de um frontend em produção, pois precisei estruturar rotas, layouts e componentes reutilizáveis.
  </p>
  <p align="justify"><b>Exemplo de rotas:</b></p>
  <pre><code class="language-js">
    // exemplo de rotas
    const routes = [{ path: '/login', component: Login }]
  </code></pre>
</details>

<details>
  <summary>📌 <b>Integração de frontend e backend:</b></summary>
  <p align="justify">
    Antes eu sabia consumir APIs em exemplos isolados, mas agora aprendi a integrar uma aplicação completa com autenticação e manipulação de dados reais.
  </p>
  <p align="justify"><b>Exemplo de consumo da API:</b></p>
  <pre><code class="language-js">
    // exemplo de consumo da API
    const res = await api.get('/auth/user')
  </code></pre>
</details>

<details>
  <summary>📌 <b>Controle de versão colaborativo (Git/GitHub):</b></summary>
  <p align="justify">
    Aprendi a criar branches organizadas e usar pull requests para integrar código sem conflitos, experiência prática que não tinha antes.
  </p>
  <p align="justify"><b>Exemplo de comandos Git:</b></p>
  <pre><code class="language-bash">
    git checkout -b feature/nova-funcionalidade
    git commit -m "feat: adiciona nova funcionalidade"
  </code></pre>
</details>

<details>
  <summary>📌 <b>Modelagem e consultas SQL no PostgreSQL:</b></summary>
  <p align="justify">
    Ganhei prática em criar queries otimizadas e pensar em performance, diferente de quando só usava queries simples em estudos.
  </p>
  <p align="justify"><b>Exemplo de consulta SQL:</b></p>
  <pre><code class="language-sql">
    SELECT * FROM vendas WHERE data >= NOW() - INTERVAL '7 days';
  </code></pre>
</details>
