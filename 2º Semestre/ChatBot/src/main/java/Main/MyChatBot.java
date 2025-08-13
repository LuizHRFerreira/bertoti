package Main; // Define o pacote onde esta classe está localizada

// Importa a classe OkHttpTelegramClient, que é usada para interagir com a API do Telegram
import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
// Importa a interface LongPollingSingleThreadUpdateConsumer para lidar com atualizações via long polling
import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
// Importa a classe SendMessage para construir e enviar mensagens através da API do Telegram
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
// Importa a classe Update que representa uma atualização recebida do Telegram
import org.telegram.telegrambots.meta.api.objects.Update;
// Importa a exceção TelegramApiException que pode ser lançada ao interagir com a API do Telegram
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
// Importa a interface TelegramClient que define métodos para interagir com a API do Telegram
import org.telegram.telegrambots.meta.generics.TelegramClient;

// Define a classe MyChatBot que implementa a interface LongPollingSingleThreadUpdateConsumer
public class MyChatBot implements LongPollingSingleThreadUpdateConsumer {
    
    // Define um cliente do Telegram para enviar mensagens
    private final TelegramClient telegramClient;

    // Construtor da classe que inicializa o cliente do Telegram com o token do bot
    public MyChatBot(String botToken) {
        // Cria uma instância do OkHttpTelegramClient com o token fornecido
        telegramClient = new OkHttpTelegramClient(botToken);
    }

    // Implementa o método consume para processar atualizações recebidas do Telegram
    @Override
    public void consume(Update update) {
        // Verifica se a atualização contém uma mensagem e se a mensagem tem texto
        if (update.hasMessage() && update.getMessage().hasText()) {
            // Obtém o texto da mensagem e o ID do chat
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();
            
            // Cria um objeto SendMessage para construir a mensagem a ser enviada
            SendMessage message = SendMessage // Cria uma instância de SendMessage
                    .builder() // Usa o builder para configurar o objeto SendMessage
                    .chatId(chat_id) // Define o ID do chat para o qual a mensagem será enviada
                    .text(message_text) // Define o texto da mensagem
                    .build(); // Constrói o objeto SendMessage final

            try {
                // Envia a mensagem para o chat usando o cliente do Telegram
                telegramClient.execute(message); 
            } catch (TelegramApiException e) {
                // Captura e imprime qualquer exceção que ocorra ao enviar a mensagem
                e.printStackTrace();
            }
        }
    }
}