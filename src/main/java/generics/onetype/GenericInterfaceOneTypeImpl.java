package generics.onetype;

public class GenericInterfaceOneTypeImpl<T>
    implements GenericInterfaceOneType<T>{
  @Override
  public void perform(T value) {
    System.out.println(value);
  }
}
