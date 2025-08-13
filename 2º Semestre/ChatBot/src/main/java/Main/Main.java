package Main; // Define o pacote onde esta classe está localizada

// Importa a classe TelegramBotsLongPollingApplication, que é usada para iniciar o bot com long polling
import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication;

public class Main {
    public static void main(String[] args) {
        // Define o token do bot, que é necessário para autenticar o bot com a API do Telegram
        String botToken = "6859729387:AAHINJOnFhB1bSw6R32Z56DmXkNZpiZ6KqM";
        
        try (TelegramBotsLongPollingApplication botsApplication = new TelegramBotsLongPollingApplication()) {
            // Registra o bot com a aplicação de long polling
            // O método registerBot registra o bot com o token fornecido e instancia a classe MyChatBot
            botsApplication.registerBot(botToken, new MyChatBot(botToken));
            
            // Exibe uma mensagem indicando que o bot foi iniciado com sucesso
            System.out.println("MyAmazingBot successfully started!");
            
            // Faz o thread principal aguardar indefinidamente
            // Isso mantém a aplicação em execução para que o bot continue funcionando
            Thread.currentThread().join();
        } catch (Exception e) {
            // Captura e imprime qualquer exceção que ocorra durante a execução do código
            e.printStackTrace();
        }
    }
}