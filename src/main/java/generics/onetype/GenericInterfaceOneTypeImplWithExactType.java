package generics.onetype;

public class GenericInterfaceOneTypeImplWithExactType
    implements GenericInterfaceOneType<String>{
  @Override
  public void perform(String value) {
    System.out.println(value);
  }
}
