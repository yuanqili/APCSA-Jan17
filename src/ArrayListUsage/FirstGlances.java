package ArrayListUsage;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstGlances {

    public static void main(String[] args) {

        String[] messages = {"Hello", "World", "Trump", "Biden"};
        String newMessage = "Clinton";
        System.out.println(Arrays.toString(messages));

        String[] messagesExtended = new String[messages.length + 1];
        for (int i = 0; i < messages.length; i++) {
            messagesExtended[i] = messages[i];
        }
        messagesExtended[messagesExtended.length - 1] = newMessage;
        System.out.println(Arrays.toString(messagesExtended));

        // ArrayList (generics)
        // ArrayList<TypeOfContent> variableName = new ArrayList<>();
        ArrayList<String> messageList = new ArrayList<String>();
        messageList.add("Hello");
        messageList.add("World");
        messageList.add("Trump");
        messageList.add("Biden");
        messageList.add("Clinton");
        for (int i = 0; i < messageList.size(); i++) {
            System.out.println(messageList.get(i));
        }
    }

}
