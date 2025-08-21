<div align="center">
  <!-- Banner (opcional, mas adiciona um toque profissional) -->
  <!-- Substitua 'LINK_PARA_SEU_BANNER' pela URL da sua imagem de banner, se tiver uma. -->
  <img src="https://via.placeholder.com/1000x200.png?text=Seu+Banner+Personalizado" alt="Banner do Portfólio" style="width:100%; max-width:1000px;">
  <br>
  <!-- Sua imagem de perfil -->
  <!-- Substitua '#' pela URL da sua imagem de perfil. -->
  <img src="assets/Luiz.png" alt="Foto de perfil" style="border-radius: 50%; width: 180px; height: 180px; border: 4px solid #333; margin-top: -90px; display: block; margin-left: auto; margin-right: auto;">
  <br>
  <h1>Portfólio — Luiz Henrique</h1>
  <h4>Desenvolvimento de Banco de Dados — FATEC prof. Jessen Vidal (São josé dos campos).</h4>
  <br>
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
<br>

## Sobre Mim

<p align="justify">
  Olá! Meu nome é <b>Luiz Henrique</b> e atualmente curso o <b>4º semestre de Banco de Dados</b> na Fatec de São José dos Campos. Trabalho como desenvolvedor na empresa <b>Pandô</b>, onde aplico e aprimoro meus conhecimentos em programação, banco de dados e desenvolvimento de soluções web.
</p>



  <div align="center" style="border-radius: 10%;margin-bottom:68px ; margin-top:60px; border: 4px solid #ffffffff; margin-left: auto;">

  <p style="font-size: 23px"> Tecnologias e ferramentas que utilizo em meus projetos </p>

  <img src="assets/tecnologias.svg">
  </div>



## Projetos

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
      <img src="https://img.shields.io/badge/Repositório%20no%20GitHub-100000?style=for-the-badge&logo=github&logoColor=white" alt="GitHub Repo" style="width:40%">
    </a>
  </p>
</div>

<details>
  <summary style="font-size: 1.2em; font-weight: bold;">Detalhes do Projeto</summary>

  <p align="justify">
    No terceiro semestre, desenvolvemos um sistema de ponto chamado Pontual, uma aplicação web para monitorar horas trabalhadas de funcionários de empresas terceirizadas. Nosso cliente, a Altave, é uma empresa que atua com coleta de imagens e reconhecimento facial, começaram com balões meteorológicos e hoje trabalham com segurança, por exemplo, em plataformas petrolíferas.
  </p>
  <p align="justify">
    O caso que o cliente nos apresentou envolvia um estaleiro, onde empresas terceiras fazem manutenção em navios. As câmeras da Altave identificam os colaboradores e enviam essas informações para o sistema, que registra os pontos, calcula horas trabalhadas e gera o valor do salário individualmente.
  </p>
  <p align="justify">
    No projeto, desenvolvemos uma interface para cadastro de empresas e profissionais, filtros de dados, extração de relatórios e dashboards interativos. Um dos desafios foi lidar com funcionários em escalas noturnas e permitir a edição de pontos.
  </p>

  <h4>Tecnologias Utilizadas</h4>
  <div align="center">
    [![My Skills](https://skillicons.dev/icons?i=java,figma,git,github,idea,postgres,spring,vue,supabase,vscode&theme=light)](https://skillicons.dev)
  </div>

  <h4>Contribuições Pessoais</h4>
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
    <p align="justify"><b>Captura de organização de pastas:</b></p>
    <!-- Substitua 'LINK_DA_IMAGEM_ORGANIZACAO_PASTAS' pela URL da imagem de organização de pastas. -->
    <img src="https://github.com/user-attachments/assets/2a019ee0-b8f1-48fc-8f33-299a00ed62a6" alt="Organização de Pastas" style="width:100%; max-width:388px;">
  </details>

  <details>
    <summary>📌 Integração do frontend com o backend</summary>
    <p align="justify">
      - Implementei a comunicação com a API, consumindo endpoints para exibição e manipulação de dados.
      - Configurei interceptadores de requisição/resposta para lidar com autenticação e erros.
    </p>
    <p align="justify"><b>Trecho do arquivo `TimeRecordService`:</b></p>
    <pre><code class="language-js">
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
  const parts = record.totalTrabalhadoDia.split(':');
  const hours = parseInt(parts[0], 10);
  const minutes = parseInt(parts[1], 10);
  if (!isNaN(hours) && !isNaN(minutes)) {
      return sum + (hours * 60) + minutes;
  }
  return sum;
}, 0); // Valor inicial da soma é 0

// Converte o total de minutos de volta para HH:MM
const hours = Math.floor(totalMinutes / 60);
const minutes = totalMinutes % 60;
return `${String(hours).padStart(2, '0')}:${String(minutes).padStart(2, '0')}`;
},
</code></pre>
  </details>

</details>

---




## Aprendizados

<div align="center">
  <p>Habilidades e conhecimentos que adquiri e aprimorei:</p>
</div>

<p align="justify">
  Além de aplicar conhecimentos prévios, também desenvolvi novas habilidades ao longo dos projetos:
</p>

<ul>
  <li>
    <b><span style="color:#28A745;">Vue.js em projetos reais:</span></b> Aprendi a lidar com a organização e escalabilidade de um frontend em produção, pois precisei estruturar rotas, layouts e componentes reutilizáveis.
    <br>
    <pre><code class="language-js">
// exemplo de rotas
const routes = [{ path: '/login', component: Login }]
</code></pre>
  </li>
  <li>
    <b><span style="color:#0077B5;">Integração de frontend e backend:</span></b> Antes eu sabia consumir APIs em exemplos isolados, mas agora aprendi a integrar uma aplicação completa com autenticação e manipulação de dados reais.
    <br>
    <pre><code class="language-js">
// exemplo de consumo da API
const res = await api.get('/auth/user')
</code></pre>
  </li>
  <li>
    <b><span style="color:#6f42c1;">Controle de versão colaborativo (Git/GitHub):</span></b> Aprendi a criar branches organizadas e usar pull requests para integrar código sem conflitos, experiência prática que não tinha antes.
    <br>
    <pre><code class="language-bash">
git checkout -b feature/nova-funcionalidade
git commit -m "feat: adiciona nova funcionalidade"
</code></pre>
  </li>
  <li>
    <b><span style="color:#e34c26;">Modelagem e consultas SQL no PostgreSQL:</span></b> Ganhei prática em criar queries otimizadas e pensar em performance, diferente de quando só usava queries simples em estudos.
    <br>
    <pre><code class="language-sql">
SELECT * FROM vendas WHERE data >= NOW() - INTERVAL '7 days';
</code></pre>
  </li>
</ul>

---



