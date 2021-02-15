package com.company;

import java.util.*;

class Chatroom{
    private String name;
    private Set<String> username;
    private List<String> messages;

    {
        name = "";
        username = new HashSet<String>();
        messages = new ArrayList<String>();
    }

    public boolean removeUser(String username) {
        if(this.username.contains(username)){
            this.username.remove(username);
            return true;
        }
        return false;
    }

    public void addUsername(String username) {
        this.username.add(username);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getUsername() {
        return username;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void addMessage(String message) {
        this.messages.add(message);
    }
}

class User{

    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public User(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}


class ChatApplication{

    private Map<String, Chatroom> chatrooms = new HashMap<String, Chatroom>();
    private Map<String, User> users = new HashMap<String, User>();
    private Set<String> loggedInUsers = new HashSet<String>();

    Set<Map.Entry<String, User>> ue = users.entrySet();
    Set<Map.Entry<String, Chatroom>> ce = chatrooms.entrySet();

    public boolean isChatroomNameValid(String name) {
        for (Map.Entry<String, Chatroom> obj : ce) {
            Chatroom str = obj.getValue();
            if(str.getName().equals(name)) {
                return true;
            }
        }
        return true;
    }

    public boolean isUsernameExists(String username) {
        for (Map.Entry<String, Chatroom> obj : ce) {
            Chatroom str = obj.getValue();
            if(str.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public boolean authenticateUser(String username, String password) {
        for (Map.Entry<String, User> obj : ue) {
            User str = obj.getValue();
            if(str.getUsername().equals(username) && str.getUsername().equals(password)){
                return true;
            }
        }
        return false;
    }

    //UI Methods Below
    public void createChatroom() {
        Chatroom c1 = new Chatroom();
        c1.addUsername("user1");
        chatrooms.put("c1",c1);
    }

    public void addNewUser() {
        User u1 = new User("User1","1","User","One");
        users.put("U1",u1);
    }

    public boolean login() {
        String l1 = "User1";
        String l2 = "1";
        for (Map.Entry<String, User> user : ue) {
            User str = user.getValue();
            return str.getUsername().equals(l1) && str.getUsername().equals(l2);
        }
        return false;
    }

    public void sendMessage() {
        String m1 = "Message Received.";
        for (Map.Entry<String, Chatroom> obj : ce) {
            Chatroom str = obj.getValue();
            str.addMessage(m1);
        }
    }

    public void printMessages() {
        for (Map.Entry<String, Chatroom> obj : ce) {
            Chatroom str = obj.getValue();
            System.out.println(str.getMessages());
        }
    }

    public void deleteUser(){
        users.remove("User1");
    }

}

public class Assignment3Q6{
    public static void main(String[] args){}
}


