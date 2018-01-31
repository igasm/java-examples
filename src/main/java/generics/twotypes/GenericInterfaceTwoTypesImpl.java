package generics.twotypes;

public class GenericInterfaceTwoTypesImpl<T, R>
    implements GenericInterfaceTwoTypes<T, R>{
  @Override
  public R perform(T value) {
    return (R) value;
  }
}
