package day44.sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {


    int adminId ;

    public static void sendAtChannelMessage () {
        System.out.println("Video has been uploaded on Zoom");
    }

    public static void deleteMessage () {
        System.out.println("this message should be deleted");
    }

    public static void addChannle () {
        System.out.println("lets add horse release channel");
    }

    public SlackAdminUser (String name, int adminId, String status) {
        System.out.println("this is constructor with 3 args ");
    }

    public static void main(String[] args) {


        ///TODO here use above methods
    }


}
