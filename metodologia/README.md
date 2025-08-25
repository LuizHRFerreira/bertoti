<div align="center">
  <!-- Banner (opcional, mas adiciona um toque profissional) -->
  <!-- Substitua 'LINK_PARA_SEU_BANNER' pela URL da sua imagem de banner, se tiver uma. -->
  <img src="assets/header.png" alt="Banner do Portfólio" style="width:100%; max-width:1000px;">
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

  ## Contribuições Pessoais

<details>
  <summary>📌 Estruturação do projeto em Vue.js</summary>

  - Organizei as pastas, defini rotas e criei padrões de código para garantir consistência no projeto.  
  - Estruturei os layouts principais e componentes reutilizáveis.  
  - Configurei guardas de rota para lidar com autenticação.  
  - Padronizei o uso de props e eventos entre componentes.  

  **Trecho do arquivo de rotas:**
  ```js
  {
    path: '/dashboard',
    name: 'Dashboard',
    meta: { requiresAuth: true },
    component: AdminLayout,
    children: [
      { path: 'users', component: UserPage },
      { path: 'positions', component: PositionPage }
    ]
  }
  ```

  **Organização de pastas:**
  
  ![Organização de Pastas](https://github.com/user-attachments/assets/2a019ee0-b8f1-48fc-8f33-299a00ed62a6)

  <img src="assets/navegacao.gif">
</details>

---

<details>
  <summary>📌 Integração do frontend com o backend</summary>

  - Implementei a comunicação com a API, consumindo endpoints para exibição e manipulação de dados.  
  - Configurei interceptadores de requisição/resposta para lidar com autenticação e erros.  
  - Implementei feedback visual (loading/spinners e mensagens de erro).  
  - Gerenciei estado global com Vuex/Pinia (quando necessário).  

  **Exemplo de interceptador:**
  ```js
  api.interceptors.response.use(
    response => response,
    error => {
      if (error.response.status === 401) {
        router.push('/login')
      }
      return Promise.reject(error)
    }
  )
  ```

   <div align="center">
    <img src="assets/datatable.png" style="border-radius: 20px">
  </div>
</details>

---

<details>
  <summary>📌 Contribuições no backend</summary>

  - Criação de classes e services.  
  - Integração com banco online **Supabase**.  
  - Implementação de endpoints REST seguros e bem estruturados.  
  - Upload de arquivos para storage e retorno de URL pública.  

  **Trecho da classe `EmployeeController`:**
  ```java
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
  ```

  ⚡ *Sugestão:* adicionar um **print ou GIF do upload de foto funcionando** no frontend (antes/depois da imagem aparecer).
</details>

---

<details>
  <summary>📌 Criação da folha de ponto</summary>

  - Desenvolvi a lógica de cálculo automático de horas trabalhadas.  
  - Criei visualização com totalizadores (horas do dia e horas acumuladas).  
  - Implementei controles dinâmicos (campos extras aparecem somente quando usados).  
  - Adicionei exportação dos registros em formato visual.  

  **Exemplo de cálculo total:**
  ```js
  totalWorkedPeriod() {
    const totalMinutes = this.processedTimeRecords.reduce((sum, record) => {
      const [hours, minutes] = record.totalTrabalhadoDia.split(':').map(Number);
      return sum + (hours * 60) + minutes;
    }, 0);

    const hours = Math.floor(totalMinutes / 60);
    const minutes = totalMinutes % 60;
    return `${String(hours).padStart(2, '0')}:${String(minutes).padStart(2, '0')}`;
  }
  ```

  ⚡ *Sugestão:* inserir um **GIF mostrando a folha de ponto em ação** (seleção de funcionário → registros → cálculo automático).
</details>

---

## Aprendizados

Habilidades e conhecimentos que adquiri e aprimorei:

- **Vue.js em projetos reais:** organização e escalabilidade de frontend em produção.  
  ```js
  const routes = [{ path: '/login', component: Login }]
  ```

- **Integração de frontend e backend:** consumo de APIs com autenticação e dados reais.  
  ```js
  const res = await api.get('/auth/user')
  ```

- **Controle de versão colaborativo (Git/GitHub):** branches organizadas e pull requests sem conflitos.  
  ```bash
  git checkout -b feature/nova-funcionalidade
  git commit -m "feat: adiciona nova funcionalidade"
  ```

- **Modelagem e consultas SQL no PostgreSQL:** criação de queries otimizadas e com foco em performance.  
  ```sql
  SELECT * FROM vendas WHERE data >= NOW() - INTERVAL '7 days';
  ```

---

⚡ **Dica geral para o portfólio:**  
- Use **prints fixos** para organização/estruturas.  
- Use **GIFs curtos (5–10s)** para interações (login, upload, cálculo dinâmico).  
- Combine código + resultado visual sempre que possível.  
