package design_patterns.mediator;

public class MediatorDemo {

  public static void main(String[] args) {
    Mediator chat = new MediatorImpl();
    UserImpl john = new UserImpl("John", chat);
    UserImpl mark = new UserImpl("Mark", chat);
    UserImpl tony = new UserImpl("Tony", chat);

    chat.addUser(john);
    chat.addUser(mark);
    chat.addUser(tony);

    john.send("Hello, everyone");
  }

}
