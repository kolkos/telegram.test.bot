package nl.kolkos.telegram.test.bot.bot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

@Component
public class TestBot extends TelegramLongPollingBot {

    pr

    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public void onUpdatesReceived(List<Update> updates) {

    }

    @Override
    public String getBotUsername() {
        return null;
    }

    @Override
    public String getBotToken() {
        return null;
    }
}
