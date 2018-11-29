/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.controller;

import java.util.ArrayList;
import java.util.List;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardRemove;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 *
 * @author Daniel Garro
 */
public class SocialBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {

        //Id usuario
        Long id = update.getMessage().getChatId();
        //Mensaje del usuario
        String mensajeRecibido = update.getMessage().getText();
        
        String command = update.getMessage().getText();
        
        SendMessage message = new SendMessage().setChatId(id)
                ;
        message.setChatId(update.getMessage().getChatId());

        if (mensajeRecibido.equals("/empezar")) {
            System.out.println(update.getMessage().getFrom().getFirstName());
            message.setText("Hola" + " " + update.getMessage().getFrom().getFirstName() + ", comandos dispnibles \n"
                    + "/FAQ \n"
                    + "/enviarPregunta --------- envía tu pregunta con el siguiente formato : /enviarPregunta su pregunta");

        }

        if (mensajeRecibido.equals("/FAQ")) {
            System.out.println(update.getMessage().getFrom().getFirstName());
            message.setText("Estas son nuestras preguntas más frecuentes");

            ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
            // Create the keyboard (list of keyboard rows)
            List<KeyboardRow> keyboard = new ArrayList<>();
            // Crear keyboard.
            KeyboardRow row = new KeyboardRow();
            // botones
            row.add("Como puedo mandar un mensaje a mis usuarios");
            row.add("-----------");

            keyboard.add(row);
            // crear otro keyboar row
            row = new KeyboardRow();
            // agregar datos 
            row.add("-------------");
            row.add("-------------");

            // agrega el segundo row
            keyboard.add(row);
            row = new KeyboardRow();
            row.add("-----------");
            keyboard.add(row);
            keyboardMarkup.setKeyboard(keyboard);

            message.setReplyMarkup(keyboardMarkup);
        }

        if (mensajeRecibido.equals("/enviarPregunta")) {
               System.out.println(update.getMessage().getFrom().getFirstName());
            message.setText("Envía tu pregunta");
                  InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
                List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
                List<InlineKeyboardButton> rowInline = new ArrayList<>();
                rowInline.add(new InlineKeyboardButton().setText("--------t").setCallbackData("-------"));
                // Set the keyboard to the markup
                rowsInline.add(rowInline);
                // Add it to the message
                markupInline.setKeyboard(rowsInline);
                message.setReplyMarkup(markupInline);
        }
        if (mensajeRecibido.equals("/esconder")) {
            message.setChatId(id).setText("Teclado oculto...");
            ReplyKeyboardRemove keyboardMarkup = new ReplyKeyboardRemove();
            message.setReplyMarkup(keyboardMarkup);

        }

        try {
            sendMessage(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getBotToken() {
        return "786169873:AAEMbo8sY_9O9EC58KMF_3sZv0Uh5mRUro8";
    }

    @Override
    public String getBotUsername() {
        return "@SocialUBot";
    }

}
