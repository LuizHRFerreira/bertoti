# Luiz Henrique Rabello Ferreira

## Introdução
Olá! Meu nome é **Luiz Henrique** e atualmente curso o **4º semestre de Banco de Dados** na Fatec de São José dos Campos. Trabalho como desenvolvedor na empresa **Pandô**, onde aplico e aprimoro meus conhecimentos em programação, banco de dados e desenvolvimento de soluções web.

---

## Meus Principais Conhecimentos
Meus projetos na Fatec têm sido desenvolvidos principalmente com **Java** no backend e **Vue.js** no frontend, integrando bancos de dados relacionais e aplicando conceitos de arquitetura e boas práticas de desenvolvimento.

---

## Meus Projetos

### 2025-1 — Projeto *Pontual*
No terceiro semestre, desenvolvemos o **Pontual**, um aplicativo voltado para o **controle de pontos** de empresas parceiras.  
A empresa parceira foi a **Altave**, referência em tecnologias de câmeras e sistemas de controle. Ela começou como uma startup no Parque Tecnológico de São José dos Campos, utilizando balões meteorológicos para monitoramento do clima, e atualmente atua em projetos de segurança de grande porte, como vigilância de plataformas petrolíferas.

O caso de uso proposto envolvia a manutenção de um grande navio em um hangar. A Altave forneceu câmeras com **reconhecimento facial** e uma API para integração, cabendo à nossa equipe registrar e gerenciar os pontos.  
O sistema permite cadastrar empresas, colaboradores e contabilizar o tempo de trabalho de cada um. Além disso, implementamos diferenciais como:
- Cálculo de salário com base nas horas trabalhadas;
- Alteração e ajuste de pontos;
- Tratamento de escalas e turnos noturnos.

[Repositório no GitHub](https://github.com/Steam-Ducks/point-system)

---

#### Tecnologias Utilizadas
[![My Skills](https://skillicons.dev/icons?i=java,figma,git,github,idea,postgres,spring,vue,supabase,vscode&theme=light)](https://skillicons.dev)

---

### 🔹 Contribuições Pessoais
Atuei tanto no **frontend** quanto no **backend**, com maior foco no **frontend**.  
Minhas principais contribuições podem ser vistas abaixo:

<details>
  <summary>📌 Estruturação do projeto em Vue.js</summary>

- Organizei as pastas, defini rotas e criei padrões de código para garantir consistência no projeto.
- Estruturei os layouts principais e componentes reutilizáveis.  

**Trecho do arquivo de rotas:**  

```js
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
```

**Captura de organização de pastas:**  
<img width="388" height="742" alt="image" src="https://github.com/user-attachments/assets/2a019ee0-b8f1-48fc-8f33-299a00ed62a6" />

</details>

---

<details>
  <summary>📌 Integração do frontend com o backend</summary>

- Implementei a comunicação com a API, consumindo endpoints para exibição e manipulação de dados.
- Configurei interceptadores de requisição/resposta para lidar com autenticação e erros.  

**Trecho do arquivo `TimeRecordService`:**

```js
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
```

</details>

---

<details>
  <summary>📌 Contribuições no backend</summary>

- Criação de classes e services.  
- Integração com banco online **Supabase**.  

**Trecho da classe `EmployeeController`:**

```java
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
```

**Trecho do `application.properties`:**

```properties
spring.jpa.database=postgresql
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true

supabase.auth.token=Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...
spring.datasource.url=jdbc:postgresql://aws-0-sa-east-1.pooler.supa...
spring.datasource.username=postgres...
spring.datasource.password=********
spring.datasource.driver-class-name=org.postgresql.Driver
```

</details>

---

<details>
  <summary>📌 Criação da folha de ponto</summary>
  - Criação da lógica por calculo e impressão dos pontos em telas
  
  **Trecho de TimeReconrdIndex.vue**
  
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

</details>
---

### 🔹 Aprendizados
Além de aplicar conhecimentos prévios, também desenvolvi novas habilidades ao longo do projeto:  

- **Vue.js em projetos reais**  
  *Justificativa:* Aprendi a lidar com a organização e escalabilidade de um frontend em produção, pois precisei estruturar rotas, layouts e componentes reutilizáveis.  
  ```js
  // exemplo de rotas
  const routes = [{ path: '/login', component: Login }]
  ```

- **Integração de frontend e backend**  
  *Justificativa:* Antes eu sabia consumir APIs em exemplos isolados, mas agora aprendi a integrar uma aplicação completa com autenticação e manipulação de dados reais.  
  ```js
  // exemplo de consumo da API
  const res = await api.get('/auth/user')
  ```

- **Controle de versão colaborativo (Git/GitHub)**  
  *Justificativa:* Aprendi a criar branches organizadas e usar pull requests para integrar código sem conflitos, experiência prática que não tinha antes.  
  ```bash
  git checkout -b feature/nova-funcionalidade
  git commit -m "feat: adiciona nova funcionalidade"
  ```

- **Modelagem e consultas SQL no PostgreSQL**  
  *Justificativa:* Ganhei prática em criar queries otimizadas e pensar em performance, diferente de quando só usava queries simples em estudos.  
  ```sql
  SELECT * FROM vendas WHERE data >= NOW() - INTERVAL '7 days';
  ```
